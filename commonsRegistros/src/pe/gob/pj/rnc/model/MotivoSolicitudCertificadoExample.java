// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   MotivoSolicitudCertificadoExample.java

package pe.gob.pj.rnc.model;

import java.util.*;

public class MotivoSolicitudCertificadoExample
{
    public static class Criteria
    {

        public List getCriteriaWithoutValue()
        {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue()
        {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue()
        {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue()
        {
            return criteriaWithBetweenValue;
        }
        @SuppressWarnings("unchecked")
        private void addCriterion(String condition, Object value, String property)
        {
            if(value == null)
            {
                throw new RuntimeException((new StringBuilder()).append("Value for ").append(property).append(" cannot be null").toString());
            } else
            {
                Map map = new HashMap();
                map.put("condition", condition);
                map.put("value", value);
                criteriaWithSingleValue.add(map);
                return;
            }
        }
        @SuppressWarnings("unchecked")
        private void addCriterion(String condition, List values, String property)
        {
            if(values == null || values.size() == 0)
            {
                throw new RuntimeException((new StringBuilder()).append("Value list for ").append(property).append(" cannot be null or empty").toString());
            } else
            {
                Map map = new HashMap();
                map.put("condition", condition);
                map.put("values", values);
                criteriaWithListValue.add(map);
                return;
            }
        }
        @SuppressWarnings("unchecked")
        private void addCriterion(String condition, Object value1, Object value2, String property)
        {
            if(value1 == null || value2 == null)
            {
                throw new RuntimeException((new StringBuilder()).append("Between values for ").append(property).append(" cannot be null").toString());
            } else
            {
                List list = new ArrayList();
                list.add(value1);
                list.add(value2);
                Map map = new HashMap();
                map.put("condition", condition);
                map.put("values", list);
                criteriaWithBetweenValue.add(map);
                return;
            }
        }
        @SuppressWarnings("unchecked")
        public Criteria andCodigo_del_motivoIsNull()
        {
            criteriaWithoutValue.add("codigo_del_motivo is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCodigo_del_motivoIsNotNull()
        {
            criteriaWithoutValue.add("codigo_del_motivo is not null");
            return this;
        }

        public Criteria andCodigo_del_motivoEqualTo(String value)
        {
            addCriterion("codigo_del_motivo =", value, "codigo_del_motivo");
            return this;
        }

        public Criteria andCodigo_del_motivoNotEqualTo(String value)
        {
            addCriterion("codigo_del_motivo <>", value, "codigo_del_motivo");
            return this;
        }

        public Criteria andCodigo_del_motivoGreaterThan(String value)
        {
            addCriterion("codigo_del_motivo >", value, "codigo_del_motivo");
            return this;
        }

        public Criteria andCodigo_del_motivoGreaterThanOrEqualTo(String value)
        {
            addCriterion("codigo_del_motivo >=", value, "codigo_del_motivo");
            return this;
        }

        public Criteria andCodigo_del_motivoLessThan(String value)
        {
            addCriterion("codigo_del_motivo <", value, "codigo_del_motivo");
            return this;
        }

        public Criteria andCodigo_del_motivoLessThanOrEqualTo(String value)
        {
            addCriterion("codigo_del_motivo <=", value, "codigo_del_motivo");
            return this;
        }

        public Criteria andCodigo_del_motivoLike(String value)
        {
            addCriterion("codigo_del_motivo like", value, "codigo_del_motivo");
            return this;
        }

        public Criteria andCodigo_del_motivoNotLike(String value)
        {
            addCriterion("codigo_del_motivo not like", value, "codigo_del_motivo");
            return this;
        }

        public Criteria andCodigo_del_motivoIn(List values)
        {
            addCriterion("codigo_del_motivo in", values, "codigo_del_motivo");
            return this;
        }

        public Criteria andCodigo_del_motivoNotIn(List values)
        {
            addCriterion("codigo_del_motivo not in", values, "codigo_del_motivo");
            return this;
        }

        public Criteria andCodigo_del_motivoBetween(String value1, String value2)
        {
            addCriterion("codigo_del_motivo between", value1, value2, "codigo_del_motivo");
            return this;
        }

        public Criteria andCodigo_del_motivoNotBetween(String value1, String value2)
        {
            addCriterion("codigo_del_motivo not between", value1, value2, "codigo_del_motivo");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCodigo_tipo_de_solicitudIsNull()
        {
            criteriaWithoutValue.add("codigo_tipo_de_solicitud is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andCodigo_tipo_de_solicitudIsNotNull()
        {
            criteriaWithoutValue.add("codigo_tipo_de_solicitud is not null");
            return this;
        }

        public Criteria andCodigo_tipo_de_solicitudEqualTo(String value)
        {
            addCriterion("codigo_tipo_de_solicitud =", value, "codigo_tipo_de_solicitud");
            return this;
        }

        public Criteria andCodigo_tipo_de_solicitudNotEqualTo(String value)
        {
            addCriterion("codigo_tipo_de_solicitud <>", value, "codigo_tipo_de_solicitud");
            return this;
        }

        public Criteria andCodigo_tipo_de_solicitudGreaterThan(String value)
        {
            addCriterion("codigo_tipo_de_solicitud >", value, "codigo_tipo_de_solicitud");
            return this;
        }

        public Criteria andCodigo_tipo_de_solicitudGreaterThanOrEqualTo(String value)
        {
            addCriterion("codigo_tipo_de_solicitud >=", value, "codigo_tipo_de_solicitud");
            return this;
        }

        public Criteria andCodigo_tipo_de_solicitudLessThan(String value)
        {
            addCriterion("codigo_tipo_de_solicitud <", value, "codigo_tipo_de_solicitud");
            return this;
        }

        public Criteria andCodigo_tipo_de_solicitudLessThanOrEqualTo(String value)
        {
            addCriterion("codigo_tipo_de_solicitud <=", value, "codigo_tipo_de_solicitud");
            return this;
        }

        public Criteria andCodigo_tipo_de_solicitudLike(String value)
        {
            addCriterion("codigo_tipo_de_solicitud like", value, "codigo_tipo_de_solicitud");
            return this;
        }

        public Criteria andCodigo_tipo_de_solicitudNotLike(String value)
        {
            addCriterion("codigo_tipo_de_solicitud not like", value, "codigo_tipo_de_solicitud");
            return this;
        }

        public Criteria andCodigo_tipo_de_solicitudIn(List values)
        {
            addCriterion("codigo_tipo_de_solicitud in", values, "codigo_tipo_de_solicitud");
            return this;
        }

        public Criteria andCodigo_tipo_de_solicitudNotIn(List values)
        {
            addCriterion("codigo_tipo_de_solicitud not in", values, "codigo_tipo_de_solicitud");
            return this;
        }

        public Criteria andCodigo_tipo_de_solicitudBetween(String value1, String value2)
        {
            addCriterion("codigo_tipo_de_solicitud between", value1, value2, "codigo_tipo_de_solicitud");
            return this;
        }

        public Criteria andCodigo_tipo_de_solicitudNotBetween(String value1, String value2)
        {
            addCriterion("codigo_tipo_de_solicitud not between", value1, value2, "codigo_tipo_de_solicitud");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDescripcionIsNull()
        {
            criteriaWithoutValue.add("descripcion is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDescripcionIsNotNull()
        {
            criteriaWithoutValue.add("descripcion is not null");
            return this;
        }

        public Criteria andDescripcionEqualTo(String value)
        {
            addCriterion("descripcion =", value, "descripcion");
            return this;
        }

        public Criteria andDescripcionNotEqualTo(String value)
        {
            addCriterion("descripcion <>", value, "descripcion");
            return this;
        }

        public Criteria andDescripcionGreaterThan(String value)
        {
            addCriterion("descripcion >", value, "descripcion");
            return this;
        }

        public Criteria andDescripcionGreaterThanOrEqualTo(String value)
        {
            addCriterion("descripcion >=", value, "descripcion");
            return this;
        }

        public Criteria andDescripcionLessThan(String value)
        {
            addCriterion("descripcion <", value, "descripcion");
            return this;
        }

        public Criteria andDescripcionLessThanOrEqualTo(String value)
        {
            addCriterion("descripcion <=", value, "descripcion");
            return this;
        }

        public Criteria andDescripcionLike(String value)
        {
            addCriterion("descripcion like", value, "descripcion");
            return this;
        }

        public Criteria andDescripcionNotLike(String value)
        {
            addCriterion("descripcion not like", value, "descripcion");
            return this;
        }

        public Criteria andDescripcionIn(List values)
        {
            addCriterion("descripcion in", values, "descripcion");
            return this;
        }

        public Criteria andDescripcionNotIn(List values)
        {
            addCriterion("descripcion not in", values, "descripcion");
            return this;
        }

        public Criteria andDescripcionBetween(String value1, String value2)
        {
            addCriterion("descripcion between", value1, value2, "descripcion");
            return this;
        }

        public Criteria andDescripcionNotBetween(String value1, String value2)
        {
            addCriterion("descripcion not between", value1, value2, "descripcion");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andSituacionIsNull()
        {
            criteriaWithoutValue.add("situacion is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andSituacionIsNotNull()
        {
            criteriaWithoutValue.add("situacion is not null");
            return this;
        }

        public Criteria andSituacionEqualTo(String value)
        {
            addCriterion("situacion =", value, "situacion");
            return this;
        }

        public Criteria andSituacionNotEqualTo(String value)
        {
            addCriterion("situacion <>", value, "situacion");
            return this;
        }

        public Criteria andSituacionGreaterThan(String value)
        {
            addCriterion("situacion >", value, "situacion");
            return this;
        }

        public Criteria andSituacionGreaterThanOrEqualTo(String value)
        {
            addCriterion("situacion >=", value, "situacion");
            return this;
        }

        public Criteria andSituacionLessThan(String value)
        {
            addCriterion("situacion <", value, "situacion");
            return this;
        }

        public Criteria andSituacionLessThanOrEqualTo(String value)
        {
            addCriterion("situacion <=", value, "situacion");
            return this;
        }

        public Criteria andSituacionLike(String value)
        {
            addCriterion("situacion like", value, "situacion");
            return this;
        }

        public Criteria andSituacionNotLike(String value)
        {
            addCriterion("situacion not like", value, "situacion");
            return this;
        }

        public Criteria andSituacionIn(List values)
        {
            addCriterion("situacion in", values, "situacion");
            return this;
        }

        public Criteria andSituacionNotIn(List values)
        {
            addCriterion("situacion not in", values, "situacion");
            return this;
        }

        public Criteria andSituacionBetween(String value1, String value2)
        {
            addCriterion("situacion between", value1, value2, "situacion");
            return this;
        }

        public Criteria andSituacionNotBetween(String value1, String value2)
        {
            addCriterion("situacion not between", value1, value2, "situacion");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andAbreviaturaIsNull()
        {
            criteriaWithoutValue.add("abreviatura is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andAbreviaturaIsNotNull()
        {
            criteriaWithoutValue.add("abreviatura is not null");
            return this;
        }

        public Criteria andAbreviaturaEqualTo(String value)
        {
            addCriterion("abreviatura =", value, "abreviatura");
            return this;
        }

        public Criteria andAbreviaturaNotEqualTo(String value)
        {
            addCriterion("abreviatura <>", value, "abreviatura");
            return this;
        }

        public Criteria andAbreviaturaGreaterThan(String value)
        {
            addCriterion("abreviatura >", value, "abreviatura");
            return this;
        }

        public Criteria andAbreviaturaGreaterThanOrEqualTo(String value)
        {
            addCriterion("abreviatura >=", value, "abreviatura");
            return this;
        }

        public Criteria andAbreviaturaLessThan(String value)
        {
            addCriterion("abreviatura <", value, "abreviatura");
            return this;
        }

        public Criteria andAbreviaturaLessThanOrEqualTo(String value)
        {
            addCriterion("abreviatura <=", value, "abreviatura");
            return this;
        }

        public Criteria andAbreviaturaLike(String value)
        {
            addCriterion("abreviatura like", value, "abreviatura");
            return this;
        }

        public Criteria andAbreviaturaNotLike(String value)
        {
            addCriterion("abreviatura not like", value, "abreviatura");
            return this;
        }

        public Criteria andAbreviaturaIn(List values)
        {
            addCriterion("abreviatura in", values, "abreviatura");
            return this;
        }

        public Criteria andAbreviaturaNotIn(List values)
        {
            addCriterion("abreviatura not in", values, "abreviatura");
            return this;
        }

        public Criteria andAbreviaturaBetween(String value1, String value2)
        {
            addCriterion("abreviatura between", value1, value2, "abreviatura");
            return this;
        }

        public Criteria andAbreviaturaNotBetween(String value1, String value2)
        {
            addCriterion("abreviatura not between", value1, value2, "abreviatura");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_ENTIDADES_EXTERNASIsNull()
        {
            criteriaWithoutValue.add("CODG_ENTIDADES_EXTERNAS is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_ENTIDADES_EXTERNASIsNotNull()
        {
            criteriaWithoutValue.add("CODG_ENTIDADES_EXTERNAS is not null");
            return this;
        }

        public Criteria andCODG_ENTIDADES_EXTERNASEqualTo(String value)
        {
            addCriterion("CODG_ENTIDADES_EXTERNAS =", value, "CODG_ENTIDADES_EXTERNAS");
            return this;
        }

        public Criteria andCODG_ENTIDADES_EXTERNASNotEqualTo(String value)
        {
            addCriterion("CODG_ENTIDADES_EXTERNAS <>", value, "CODG_ENTIDADES_EXTERNAS");
            return this;
        }

        public Criteria andCODG_ENTIDADES_EXTERNASGreaterThan(String value)
        {
            addCriterion("CODG_ENTIDADES_EXTERNAS >", value, "CODG_ENTIDADES_EXTERNAS");
            return this;
        }

        public Criteria andCODG_ENTIDADES_EXTERNASGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_ENTIDADES_EXTERNAS >=", value, "CODG_ENTIDADES_EXTERNAS");
            return this;
        }

        public Criteria andCODG_ENTIDADES_EXTERNASLessThan(String value)
        {
            addCriterion("CODG_ENTIDADES_EXTERNAS <", value, "CODG_ENTIDADES_EXTERNAS");
            return this;
        }

        public Criteria andCODG_ENTIDADES_EXTERNASLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_ENTIDADES_EXTERNAS <=", value, "CODG_ENTIDADES_EXTERNAS");
            return this;
        }

        public Criteria andCODG_ENTIDADES_EXTERNASLike(String value)
        {
            addCriterion("CODG_ENTIDADES_EXTERNAS like", value, "CODG_ENTIDADES_EXTERNAS");
            return this;
        }

        public Criteria andCODG_ENTIDADES_EXTERNASNotLike(String value)
        {
            addCriterion("CODG_ENTIDADES_EXTERNAS not like", value, "CODG_ENTIDADES_EXTERNAS");
            return this;
        }

        public Criteria andCODG_ENTIDADES_EXTERNASIn(List values)
        {
            addCriterion("CODG_ENTIDADES_EXTERNAS in", values, "CODG_ENTIDADES_EXTERNAS");
            return this;
        }

        public Criteria andCODG_ENTIDADES_EXTERNASNotIn(List values)
        {
            addCriterion("CODG_ENTIDADES_EXTERNAS not in", values, "CODG_ENTIDADES_EXTERNAS");
            return this;
        }

        public Criteria andCODG_ENTIDADES_EXTERNASBetween(String value1, String value2)
        {
            addCriterion("CODG_ENTIDADES_EXTERNAS between", value1, value2, "CODG_ENTIDADES_EXTERNAS");
            return this;
        }

        public Criteria andCODG_ENTIDADES_EXTERNASNotBetween(String value1, String value2)
        {
            addCriterion("CODG_ENTIDADES_EXTERNAS not between", value1, value2, "CODG_ENTIDADES_EXTERNAS");
            return this;
        }

        public Criteria andl_activo(String value)
        {
            addCriterion("l_activo =", value, "l_activo");
            return this;
        }

        private List criteriaWithoutValue;
        private List criteriaWithSingleValue;
        private List criteriaWithListValue;
        private List criteriaWithBetweenValue;

        private Criteria()
        {
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

    }


    public MotivoSolicitudCertificadoExample()
    {
        oredCriteria = new ArrayList();
    }

    public void setOrderByClause(String orderByClause)
    {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause()
    {
        return orderByClause;
    }

    public List getOredCriteria()
    {
        return oredCriteria;
    }
    @SuppressWarnings("unchecked")
    public void or(Criteria criteria)
    {
        oredCriteria.add(criteria);
    }
    @SuppressWarnings("unchecked")
    public Criteria createCriteria()
    {
        Criteria criteria = new Criteria();
        if(oredCriteria.size() == 0)
            oredCriteria.add(criteria);
        return criteria;
    }

    private String orderByClause;
    private List oredCriteria;
}
