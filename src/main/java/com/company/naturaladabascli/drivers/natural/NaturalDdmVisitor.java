package com.company.naturaladabascli.drivers.natural;

import com.company.naturaladabascli.antlr.NaturalDdmParser;
import com.company.naturaladabascli.antlr.NaturalDdmParserBaseVisitor;
import com.company.naturaladabascli.model.LegacyEntity;
import com.company.naturaladabascli.model.LegacyField;

import java.util.Locale;

/**
 * Extracts entity and field definitions from a DDM parse tree.
 */
public class NaturalDdmVisitor extends NaturalDdmParserBaseVisitor<Void> {

    private final LegacyEntity entity;

    public NaturalDdmVisitor(LegacyEntity entity) {
        this.entity = entity;
    }

    @Override
    public Void visitDdmHeader(NaturalDdmParser.DdmHeaderContext ctx) {
        if (ctx.ID() != null) {
            entity.setName(ctx.ID().getText().toUpperCase(Locale.ROOT));
            entity.setPhysicalName(ctx.ID().getText());
        }
        return null;
    }

    @Override
    public Void visitMetaLine(NaturalDdmParser.MetaLineContext ctx) {
        if (ctx.DBID() != null && ctx.INT() != null) {
            entity.setDbid(ctx.INT().getText());
        }
        if (ctx.FNR() != null && ctx.INT() != null) {
            entity.setFnr(ctx.INT().getText());
        }
        return null;
    }

    @Override
    public Void visitFieldLine(NaturalDdmParser.FieldLineContext ctx) {
        if (ctx.FIELD() == null || ctx.ID() == null || ctx.typeSpec() == null) {
            return null;
        }
        LegacyField f = new LegacyField();
        f.setName(ctx.ID().getText());
        NaturalDdmParser.TypeSpecContext ts = ctx.typeSpec();
        f.setType(ts.TYPE_CHAR().getText());
        if (ts.INT().size() == 1) {
            f.setLength(Integer.valueOf(ts.INT(0).getText()));
        } else if (ts.INT().size() >= 2) {
            f.setLength(Integer.valueOf(ts.INT(0).getText()));
            f.setDecimals(Integer.valueOf(ts.INT(1).getText()));
        }
        if (ctx.descriptor() != null) {
            f.setDescriptor(ctx.descriptor().getText());
        }
        entity.getFields().add(f);
        return null;
    }
}
