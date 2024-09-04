// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   EntidadExternaExample.java

package pe.gob.pj.rnc.model;

import java.util.*;

public class EntidadExternaExample
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
        public Criteria andCODG_ENTIDAD_EXTERNAIsNull()
        {
            criteriaWithoutValue.add("CODG_ENTIDAD_EXTERNA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_ENTIDAD_EXTERNAIsNotNull()
        {
            criteriaWithoutValue.add("CODG_ENTIDAD_EXTERNA is not null");
            return this;
        }

        public Criteria andCODG_ENTIDAD_EXTERNAEqualTo(Integer value)
        {
            addCriterion("CODG_ENTIDAD_EXTERNA =", value, "CODG_ENTIDAD_EXTERNA");
            return this;
        }

        public Criteria andCODG_ENTIDAD_EXTERNANotEqualTo(Integer value)
        {
            addCriterion("CODG_ENTIDAD_EXTERNA <>", value, "CODG_ENTIDAD_EXTERNA");
            return this;
        }

        public Criteria andCODG_ENTIDAD_EXTERNAGreaterThan(Integer value)
        {
            addCriterion("CODG_ENTIDAD_EXTERNA >", value, "CODG_ENTIDAD_EXTERNA");
            return this;
        }

        public Criteria andCODG_ENTIDAD_EXTERNAGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("CODG_ENTIDAD_EXTERNA >=", value, "CODG_ENTIDAD_EXTERNA");
            return this;
        }

        public Criteria andCODG_ENTIDAD_EXTERNALessThan(Integer value)
        {
            addCriterion("CODG_ENTIDAD_EXTERNA <", value, "CODG_ENTIDAD_EXTERNA");
            return this;
        }

        public Criteria andCODG_ENTIDAD_EXTERNALessThanOrEqualTo(Integer value)
        {
            addCriterion("CODG_ENTIDAD_EXTERNA <=", value, "CODG_ENTIDAD_EXTERNA");
            return this;
        }

        public Criteria andCODG_ENTIDAD_EXTERNAIn(List values)
        {
            addCriterion("CODG_ENTIDAD_EXTERNA in", values, "CODG_ENTIDAD_EXTERNA");
            return this;
        }

        public Criteria andCODG_ENTIDAD_EXTERNANotIn(List values)
        {
            addCriterion("CODG_ENTIDAD_EXTERNA not in", values, "CODG_ENTIDAD_EXTERNA");
            return this;
        }

        public Criteria andCODG_ENTIDAD_EXTERNABetween(Integer value1, Integer value2)
        {
            addCriterion("CODG_ENTIDAD_EXTERNA between", value1, value2, "CODG_ENTIDAD_EXTERNA");
            return this;
        }

        public Criteria andCODG_ENTIDAD_EXTERNANotBetween(Integer value1, Integer value2)
        {
            addCriterion("CODG_ENTIDAD_EXTERNA not between", value1, value2, "CODG_ENTIDAD_EXTERNA");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_ENTIDAD_EXTERNAIsNull()
        {
            criteriaWithoutValue.add("DESC_ENTIDAD_EXTERNA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_ENTIDAD_EXTERNAIsNotNull()
        {
            criteriaWithoutValue.add("DESC_ENTIDAD_EXTERNA is not null");
            return this;
        }

        public Criteria andDESC_ENTIDAD_EXTERNAEqualTo(String value)
        {
            addCriterion("DESC_ENTIDAD_EXTERNA =", value, "DESC_ENTIDAD_EXTERNA");
            return this;
        }

        public Criteria andDESC_ENTIDAD_EXTERNANotEqualTo(String value)
        {
            addCriterion("DESC_ENTIDAD_EXTERNA <>", value, "DESC_ENTIDAD_EXTERNA");
            return this;
        }

        public Criteria andDESC_ENTIDAD_EXTERNAGreaterThan(String value)
        {
            addCriterion("DESC_ENTIDAD_EXTERNA >", value, "DESC_ENTIDAD_EXTERNA");
            return this;
        }

        public Criteria andDESC_ENTIDAD_EXTERNAGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_ENTIDAD_EXTERNA >=", value, "DESC_ENTIDAD_EXTERNA");
            return this;
        }

        public Criteria andDESC_ENTIDAD_EXTERNALessThan(String value)
        {
            addCriterion("DESC_ENTIDAD_EXTERNA <", value, "DESC_ENTIDAD_EXTERNA");
            return this;
        }

        public Criteria andDESC_ENTIDAD_EXTERNALessThanOrEqualTo(String value)
        {
            addCriterion("DESC_ENTIDAD_EXTERNA <=", value, "DESC_ENTIDAD_EXTERNA");
            return this;
        }

        public Criteria andDESC_ENTIDAD_EXTERNALike(String value)
        {
            addCriterion("DESC_ENTIDAD_EXTERNA like", value, "DESC_ENTIDAD_EXTERNA");
            return this;
        }

        public Criteria andDESC_ENTIDAD_EXTERNANotLike(String value)
        {
            addCriterion("DESC_ENTIDAD_EXTERNA not like", value, "DESC_ENTIDAD_EXTERNA");
            return this;
        }

        public Criteria andDESC_ENTIDAD_EXTERNAIn(List values)
        {
            addCriterion("DESC_ENTIDAD_EXTERNA in", values, "DESC_ENTIDAD_EXTERNA");
            return this;
        }

        public Criteria andDESC_ENTIDAD_EXTERNANotIn(List values)
        {
            addCriterion("DESC_ENTIDAD_EXTERNA not in", values, "DESC_ENTIDAD_EXTERNA");
            return this;
        }

        public Criteria andDESC_ENTIDAD_EXTERNABetween(String value1, String value2)
        {
            addCriterion("DESC_ENTIDAD_EXTERNA between", value1, value2, "DESC_ENTIDAD_EXTERNA");
            return this;
        }

        public Criteria andDESC_ENTIDAD_EXTERNANotBetween(String value1, String value2)
        {
            addCriterion("DESC_ENTIDAD_EXTERNA not between", value1, value2, "DESC_ENTIDAD_EXTERNA");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_SIGLASIsNull()
        {
            criteriaWithoutValue.add("DESC_SIGLAS is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_SIGLASIsNotNull()
        {
            criteriaWithoutValue.add("DESC_SIGLAS is not null");
            return this;
        }

        public Criteria andDESC_SIGLASEqualTo(String value)
        {
            addCriterion("DESC_SIGLAS =", value, "DESC_SIGLAS");
            return this;
        }

        public Criteria andDESC_SIGLASNotEqualTo(String value)
        {
            addCriterion("DESC_SIGLAS <>", value, "DESC_SIGLAS");
            return this;
        }

        public Criteria andDESC_SIGLASGreaterThan(String value)
        {
            addCriterion("DESC_SIGLAS >", value, "DESC_SIGLAS");
            return this;
        }

        public Criteria andDESC_SIGLASGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_SIGLAS >=", value, "DESC_SIGLAS");
            return this;
        }

        public Criteria andDESC_SIGLASLessThan(String value)
        {
            addCriterion("DESC_SIGLAS <", value, "DESC_SIGLAS");
            return this;
        }

        public Criteria andDESC_SIGLASLessThanOrEqualTo(String value)
        {
            addCriterion("DESC_SIGLAS <=", value, "DESC_SIGLAS");
            return this;
        }

        public Criteria andDESC_SIGLASLike(String value)
        {
            addCriterion("DESC_SIGLAS like", value, "DESC_SIGLAS");
            return this;
        }

        public Criteria andDESC_SIGLASNotLike(String value)
        {
            addCriterion("DESC_SIGLAS not like", value, "DESC_SIGLAS");
            return this;
        }

        public Criteria andDESC_SIGLASIn(List values)
        {
            addCriterion("DESC_SIGLAS in", values, "DESC_SIGLAS");
            return this;
        }

        public Criteria andDESC_SIGLASNotIn(List values)
        {
            addCriterion("DESC_SIGLAS not in", values, "DESC_SIGLAS");
            return this;
        }

        public Criteria andDESC_SIGLASBetween(String value1, String value2)
        {
            addCriterion("DESC_SIGLAS between", value1, value2, "DESC_SIGLAS");
            return this;
        }

        public Criteria andDESC_SIGLASNotBetween(String value1, String value2)
        {
            addCriterion("DESC_SIGLAS not between", value1, value2, "DESC_SIGLAS");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_ACTIVOIsNull()
        {
            criteriaWithoutValue.add("INDC_ACTIVO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_ACTIVOIsNotNull()
        {
            criteriaWithoutValue.add("INDC_ACTIVO is not null");
            return this;
        }

        public Criteria andINDC_ACTIVOEqualTo(String value)
        {
            addCriterion("INDC_ACTIVO =", value, "INDC_ACTIVO");
            return this;
        }

        public Criteria andINDC_ACTIVONotEqualTo(String value)
        {
            addCriterion("INDC_ACTIVO <>", value, "INDC_ACTIVO");
            return this;
        }

        public Criteria andINDC_ACTIVOGreaterThan(String value)
        {
            addCriterion("INDC_ACTIVO >", value, "INDC_ACTIVO");
            return this;
        }

        public Criteria andINDC_ACTIVOGreaterThanOrEqualTo(String value)
        {
            addCriterion("INDC_ACTIVO >=", value, "INDC_ACTIVO");
            return this;
        }

        public Criteria andINDC_ACTIVOLessThan(String value)
        {
            addCriterion("INDC_ACTIVO <", value, "INDC_ACTIVO");
            return this;
        }

        public Criteria andINDC_ACTIVOLessThanOrEqualTo(String value)
        {
            addCriterion("INDC_ACTIVO <=", value, "INDC_ACTIVO");
            return this;
        }

        public Criteria andINDC_ACTIVOLike(String value)
        {
            addCriterion("INDC_ACTIVO like", value, "INDC_ACTIVO");
            return this;
        }

        public Criteria andINDC_ACTIVONotLike(String value)
        {
            addCriterion("INDC_ACTIVO not like", value, "INDC_ACTIVO");
            return this;
        }

        public Criteria andINDC_ACTIVOIn(List values)
        {
            addCriterion("INDC_ACTIVO in", values, "INDC_ACTIVO");
            return this;
        }

        public Criteria andINDC_ACTIVONotIn(List values)
        {
            addCriterion("INDC_ACTIVO not in", values, "INDC_ACTIVO");
            return this;
        }

        public Criteria andINDC_ACTIVOBetween(String value1, String value2)
        {
            addCriterion("INDC_ACTIVO between", value1, value2, "INDC_ACTIVO");
            return this;
        }

        public Criteria andINDC_ACTIVONotBetween(String value1, String value2)
        {
            addCriterion("INDC_ACTIVO not between", value1, value2, "INDC_ACTIVO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFEC_REGISTROIsNull()
        {
            criteriaWithoutValue.add("FEC_REGISTRO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFEC_REGISTROIsNotNull()
        {
            criteriaWithoutValue.add("FEC_REGISTRO is not null");
            return this;
        }

        public Criteria andFEC_REGISTROEqualTo(Date value)
        {
            addCriterion("FEC_REGISTRO =", value, "FEC_REGISTRO");
            return this;
        }

        public Criteria andFEC_REGISTRONotEqualTo(Date value)
        {
            addCriterion("FEC_REGISTRO <>", value, "FEC_REGISTRO");
            return this;
        }

        public Criteria andFEC_REGISTROGreaterThan(Date value)
        {
            addCriterion("FEC_REGISTRO >", value, "FEC_REGISTRO");
            return this;
        }

        public Criteria andFEC_REGISTROGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FEC_REGISTRO >=", value, "FEC_REGISTRO");
            return this;
        }

        public Criteria andFEC_REGISTROLessThan(Date value)
        {
            addCriterion("FEC_REGISTRO <", value, "FEC_REGISTRO");
            return this;
        }

        public Criteria andFEC_REGISTROLessThanOrEqualTo(Date value)
        {
            addCriterion("FEC_REGISTRO <=", value, "FEC_REGISTRO");
            return this;
        }

        public Criteria andFEC_REGISTROIn(List values)
        {
            addCriterion("FEC_REGISTRO in", values, "FEC_REGISTRO");
            return this;
        }

        public Criteria andFEC_REGISTRONotIn(List values)
        {
            addCriterion("FEC_REGISTRO not in", values, "FEC_REGISTRO");
            return this;
        }

        public Criteria andFEC_REGISTROBetween(Date value1, Date value2)
        {
            addCriterion("FEC_REGISTRO between", value1, value2, "FEC_REGISTRO");
            return this;
        }

        public Criteria andFEC_REGISTRONotBetween(Date value1, Date value2)
        {
            addCriterion("FEC_REGISTRO not between", value1, value2, "FEC_REGISTRO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFEC_MODIFICACIONIsNull()
        {
            criteriaWithoutValue.add("FEC_MODIFICACION is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFEC_MODIFICACIONIsNotNull()
        {
            criteriaWithoutValue.add("FEC_MODIFICACION is not null");
            return this;
        }

        public Criteria andFEC_MODIFICACIONEqualTo(Date value)
        {
            addCriterion("FEC_MODIFICACION =", value, "FEC_MODIFICACION");
            return this;
        }

        public Criteria andFEC_MODIFICACIONNotEqualTo(Date value)
        {
            addCriterion("FEC_MODIFICACION <>", value, "FEC_MODIFICACION");
            return this;
        }

        public Criteria andFEC_MODIFICACIONGreaterThan(Date value)
        {
            addCriterion("FEC_MODIFICACION >", value, "FEC_MODIFICACION");
            return this;
        }

        public Criteria andFEC_MODIFICACIONGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FEC_MODIFICACION >=", value, "FEC_MODIFICACION");
            return this;
        }

        public Criteria andFEC_MODIFICACIONLessThan(Date value)
        {
            addCriterion("FEC_MODIFICACION <", value, "FEC_MODIFICACION");
            return this;
        }

        public Criteria andFEC_MODIFICACIONLessThanOrEqualTo(Date value)
        {
            addCriterion("FEC_MODIFICACION <=", value, "FEC_MODIFICACION");
            return this;
        }

        public Criteria andFEC_MODIFICACIONIn(List values)
        {
            addCriterion("FEC_MODIFICACION in", values, "FEC_MODIFICACION");
            return this;
        }

        public Criteria andFEC_MODIFICACIONNotIn(List values)
        {
            addCriterion("FEC_MODIFICACION not in", values, "FEC_MODIFICACION");
            return this;
        }

        public Criteria andFEC_MODIFICACIONBetween(Date value1, Date value2)
        {
            addCriterion("FEC_MODIFICACION between", value1, value2, "FEC_MODIFICACION");
            return this;
        }

        public Criteria andFEC_MODIFICACIONNotBetween(Date value1, Date value2)
        {
            addCriterion("FEC_MODIFICACION not between", value1, value2, "FEC_MODIFICACION");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_CONVENIOIsNull()
        {
            criteriaWithoutValue.add("DESC_CONVENIO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_CONVENIOIsNotNull()
        {
            criteriaWithoutValue.add("DESC_CONVENIO is not null");
            return this;
        }

        public Criteria andDESC_CONVENIOEqualTo(String value)
        {
            addCriterion("DESC_CONVENIO =", value, "DESC_CONVENIO");
            return this;
        }

        public Criteria andDESC_CONVENIONotEqualTo(String value)
        {
            addCriterion("DESC_CONVENIO <>", value, "DESC_CONVENIO");
            return this;
        }

        public Criteria andDESC_CONVENIOGreaterThan(String value)
        {
            addCriterion("DESC_CONVENIO >", value, "DESC_CONVENIO");
            return this;
        }

        public Criteria andDESC_CONVENIOGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_CONVENIO >=", value, "DESC_CONVENIO");
            return this;
        }

        public Criteria andDESC_CONVENIOLessThan(String value)
        {
            addCriterion("DESC_CONVENIO <", value, "DESC_CONVENIO");
            return this;
        }

        public Criteria andDESC_CONVENIOLessThanOrEqualTo(String value)
        {
            addCriterion("DESC_CONVENIO <=", value, "DESC_CONVENIO");
            return this;
        }

        public Criteria andDESC_CONVENIOLike(String value)
        {
            addCriterion("DESC_CONVENIO like", value, "DESC_CONVENIO");
            return this;
        }

        public Criteria andDESC_CONVENIONotLike(String value)
        {
            addCriterion("DESC_CONVENIO not like", value, "DESC_CONVENIO");
            return this;
        }

        public Criteria andDESC_CONVENIOIn(List values)
        {
            addCriterion("DESC_CONVENIO in", values, "DESC_CONVENIO");
            return this;
        }

        public Criteria andDESC_CONVENIONotIn(List values)
        {
            addCriterion("DESC_CONVENIO not in", values, "DESC_CONVENIO");
            return this;
        }

        public Criteria andDESC_CONVENIOBetween(String value1, String value2)
        {
            addCriterion("DESC_CONVENIO between", value1, value2, "DESC_CONVENIO");
            return this;
        }

        public Criteria andDESC_CONVENIONotBetween(String value1, String value2)
        {
            addCriterion("DESC_CONVENIO not between", value1, value2, "DESC_CONVENIO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_REFERENCIAIsNull()
        {
            criteriaWithoutValue.add("INDC_REFERENCIA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_REFERENCIAIsNotNull()
        {
            criteriaWithoutValue.add("INDC_REFERENCIA is not null");
            return this;
        }

        public Criteria andINDC_REFERENCIAEqualTo(String value)
        {
            addCriterion("INDC_REFERENCIA =", value, "INDC_REFERENCIA");
            return this;
        }

        public Criteria andINDC_REFERENCIANotEqualTo(String value)
        {
            addCriterion("INDC_REFERENCIA <>", value, "INDC_REFERENCIA");
            return this;
        }

        public Criteria andINDC_REFERENCIAGreaterThan(String value)
        {
            addCriterion("INDC_REFERENCIA >", value, "INDC_REFERENCIA");
            return this;
        }

        public Criteria andINDC_REFERENCIAGreaterThanOrEqualTo(String value)
        {
            addCriterion("INDC_REFERENCIA >=", value, "INDC_REFERENCIA");
            return this;
        }

        public Criteria andINDC_REFERENCIALessThan(String value)
        {
            addCriterion("INDC_REFERENCIA <", value, "INDC_REFERENCIA");
            return this;
        }

        public Criteria andINDC_REFERENCIALessThanOrEqualTo(String value)
        {
            addCriterion("INDC_REFERENCIA <=", value, "INDC_REFERENCIA");
            return this;
        }

        public Criteria andINDC_REFERENCIALike(String value)
        {
            addCriterion("INDC_REFERENCIA like", value, "INDC_REFERENCIA");
            return this;
        }

        public Criteria andINDC_REFERENCIANotLike(String value)
        {
            addCriterion("INDC_REFERENCIA not like", value, "INDC_REFERENCIA");
            return this;
        }

        public Criteria andINDC_REFERENCIAIn(List values)
        {
            addCriterion("INDC_REFERENCIA in", values, "INDC_REFERENCIA");
            return this;
        }

        public Criteria andINDC_REFERENCIANotIn(List values)
        {
            addCriterion("INDC_REFERENCIA not in", values, "INDC_REFERENCIA");
            return this;
        }

        public Criteria andINDC_REFERENCIABetween(String value1, String value2)
        {
            addCriterion("INDC_REFERENCIA between", value1, value2, "INDC_REFERENCIA");
            return this;
        }

        public Criteria andINDC_REFERENCIANotBetween(String value1, String value2)
        {
            addCriterion("INDC_REFERENCIA not between", value1, value2, "INDC_REFERENCIA");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_MOTIVO_DEFECTOIsNull()
        {
            criteriaWithoutValue.add("CODG_MOTIVO_DEFECTO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_MOTIVO_DEFECTOIsNotNull()
        {
            criteriaWithoutValue.add("CODG_MOTIVO_DEFECTO is not null");
            return this;
        }

        public Criteria andCODG_MOTIVO_DEFECTOEqualTo(String value)
        {
            addCriterion("CODG_MOTIVO_DEFECTO =", value, "CODG_MOTIVO_DEFECTO");
            return this;
        }

        public Criteria andCODG_MOTIVO_DEFECTONotEqualTo(String value)
        {
            addCriterion("CODG_MOTIVO_DEFECTO <>", value, "CODG_MOTIVO_DEFECTO");
            return this;
        }

        public Criteria andCODG_MOTIVO_DEFECTOGreaterThan(String value)
        {
            addCriterion("CODG_MOTIVO_DEFECTO >", value, "CODG_MOTIVO_DEFECTO");
            return this;
        }

        public Criteria andCODG_MOTIVO_DEFECTOGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_MOTIVO_DEFECTO >=", value, "CODG_MOTIVO_DEFECTO");
            return this;
        }

        public Criteria andCODG_MOTIVO_DEFECTOLessThan(String value)
        {
            addCriterion("CODG_MOTIVO_DEFECTO <", value, "CODG_MOTIVO_DEFECTO");
            return this;
        }

        public Criteria andCODG_MOTIVO_DEFECTOLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_MOTIVO_DEFECTO <=", value, "CODG_MOTIVO_DEFECTO");
            return this;
        }

        public Criteria andCODG_MOTIVO_DEFECTOLike(String value)
        {
            addCriterion("CODG_MOTIVO_DEFECTO like", value, "CODG_MOTIVO_DEFECTO");
            return this;
        }

        public Criteria andCODG_MOTIVO_DEFECTONotLike(String value)
        {
            addCriterion("CODG_MOTIVO_DEFECTO not like", value, "CODG_MOTIVO_DEFECTO");
            return this;
        }

        public Criteria andCODG_MOTIVO_DEFECTOIn(List values)
        {
            addCriterion("CODG_MOTIVO_DEFECTO in", values, "CODG_MOTIVO_DEFECTO");
            return this;
        }

        public Criteria andCODG_MOTIVO_DEFECTONotIn(List values)
        {
            addCriterion("CODG_MOTIVO_DEFECTO not in", values, "CODG_MOTIVO_DEFECTO");
            return this;
        }

        public Criteria andCODG_MOTIVO_DEFECTOBetween(String value1, String value2)
        {
            addCriterion("CODG_MOTIVO_DEFECTO between", value1, value2, "CODG_MOTIVO_DEFECTO");
            return this;
        }

        public Criteria andCODG_MOTIVO_DEFECTONotBetween(String value1, String value2)
        {
            addCriterion("CODG_MOTIVO_DEFECTO not between", value1, value2, "CODG_MOTIVO_DEFECTO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_ENTIDAD_EXTERNA_SUPIsNull()
        {
            criteriaWithoutValue.add("CODG_ENTIDAD_EXTERNA_SUP is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_ENTIDAD_EXTERNA_SUPIsNotNull()
        {
            criteriaWithoutValue.add("CODG_ENTIDAD_EXTERNA_SUP is not null");
            return this;
        }

        public Criteria andCODG_ENTIDAD_EXTERNA_SUPEqualTo(Integer value)
        {
            addCriterion("CODG_ENTIDAD_EXTERNA_SUP =", value, "CODG_ENTIDAD_EXTERNA_SUP");
            return this;
        }

        public Criteria andCODG_ENTIDAD_EXTERNA_SUPNotEqualTo(Integer value)
        {
            addCriterion("CODG_ENTIDAD_EXTERNA_SUP <>", value, "CODG_ENTIDAD_EXTERNA_SUP");
            return this;
        }

        public Criteria andCODG_ENTIDAD_EXTERNA_SUPGreaterThan(Integer value)
        {
            addCriterion("CODG_ENTIDAD_EXTERNA_SUP >", value, "CODG_ENTIDAD_EXTERNA_SUP");
            return this;
        }

        public Criteria andCODG_ENTIDAD_EXTERNA_SUPGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("CODG_ENTIDAD_EXTERNA_SUP >=", value, "CODG_ENTIDAD_EXTERNA_SUP");
            return this;
        }

        public Criteria andCODG_ENTIDAD_EXTERNA_SUPLessThan(Integer value)
        {
            addCriterion("CODG_ENTIDAD_EXTERNA_SUP <", value, "CODG_ENTIDAD_EXTERNA_SUP");
            return this;
        }

        public Criteria andCODG_ENTIDAD_EXTERNA_SUPLessThanOrEqualTo(Integer value)
        {
            addCriterion("CODG_ENTIDAD_EXTERNA_SUP <=", value, "CODG_ENTIDAD_EXTERNA_SUP");
            return this;
        }

        public Criteria andCODG_ENTIDAD_EXTERNA_SUPIn(List values)
        {
            addCriterion("CODG_ENTIDAD_EXTERNA_SUP in", values, "CODG_ENTIDAD_EXTERNA_SUP");
            return this;
        }

        public Criteria andCODG_ENTIDAD_EXTERNA_SUPNotIn(List values)
        {
            addCriterion("CODG_ENTIDAD_EXTERNA_SUP not in", values, "CODG_ENTIDAD_EXTERNA_SUP");
            return this;
        }

        public Criteria andCODG_ENTIDAD_EXTERNA_SUPBetween(Integer value1, Integer value2)
        {
            addCriterion("CODG_ENTIDAD_EXTERNA_SUP between", value1, value2, "CODG_ENTIDAD_EXTERNA_SUP");
            return this;
        }

        public Criteria andCODG_ENTIDAD_EXTERNA_SUPNotBetween(Integer value1, Integer value2)
        {
            addCriterion("CODG_ENTIDAD_EXTERNA_SUP not between", value1, value2, "CODG_ENTIDAD_EXTERNA_SUP");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALEqualTo(String value)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL =", value, "CODG_DISTRITO_JUDICIAL");
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


    public EntidadExternaExample()
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
