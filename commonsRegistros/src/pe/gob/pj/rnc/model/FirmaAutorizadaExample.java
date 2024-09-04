// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FirmaAutorizadaExample.java

package pe.gob.pj.rnc.model;

import java.util.*;

public class FirmaAutorizadaExample
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
        public Criteria andCODG_USU_FIRMAIsNull()
        {
            criteriaWithoutValue.add("CODG_USU_FIRMA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_USU_FIRMAIsNotNull()
        {
            criteriaWithoutValue.add("CODG_USU_FIRMA is not null");
            return this;
        }

        public Criteria andCODG_USU_FIRMAEqualTo(String value)
        {
            addCriterion("CODG_USU_FIRMA =", value, "CODG_USU_FIRMA");
            return this;
        }

        public Criteria andCODG_USU_FIRMANotEqualTo(String value)
        {
            addCriterion("CODG_USU_FIRMA <>", value, "CODG_USU_FIRMA");
            return this;
        }

        public Criteria andCODG_USU_FIRMAGreaterThan(String value)
        {
            addCriterion("CODG_USU_FIRMA >", value, "CODG_USU_FIRMA");
            return this;
        }

        public Criteria andCODG_USU_FIRMAGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_USU_FIRMA >=", value, "CODG_USU_FIRMA");
            return this;
        }

        public Criteria andCODG_USU_FIRMALessThan(String value)
        {
            addCriterion("CODG_USU_FIRMA <", value, "CODG_USU_FIRMA");
            return this;
        }

        public Criteria andCODG_USU_FIRMALessThanOrEqualTo(String value)
        {
            addCriterion("CODG_USU_FIRMA <=", value, "CODG_USU_FIRMA");
            return this;
        }

        public Criteria andCODG_USU_FIRMALike(String value)
        {
            addCriterion("CODG_USU_FIRMA like", value, "CODG_USU_FIRMA");
            return this;
        }

        public Criteria andCODG_USU_FIRMANotLike(String value)
        {
            addCriterion("CODG_USU_FIRMA not like", value, "CODG_USU_FIRMA");
            return this;
        }

        public Criteria andCODG_USU_FIRMAIn(List values)
        {
            addCriterion("CODG_USU_FIRMA in", values, "CODG_USU_FIRMA");
            return this;
        }

        public Criteria andCODG_USU_FIRMANotIn(List values)
        {
            addCriterion("CODG_USU_FIRMA not in", values, "CODG_USU_FIRMA");
            return this;
        }

        public Criteria andCODG_USU_FIRMABetween(String value1, String value2)
        {
            addCriterion("CODG_USU_FIRMA between", value1, value2, "CODG_USU_FIRMA");
            return this;
        }

        public Criteria andCODG_USU_FIRMANotBetween(String value1, String value2)
        {
            addCriterion("CODG_USU_FIRMA not between", value1, value2, "CODG_USU_FIRMA");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_NOMBREIsNull()
        {
            criteriaWithoutValue.add("DESC_NOMBRE is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_NOMBREIsNotNull()
        {
            criteriaWithoutValue.add("DESC_NOMBRE is not null");
            return this;
        }

        public Criteria andDESC_NOMBREEqualTo(String value)
        {
            addCriterion("DESC_NOMBRE =", value, "DESC_NOMBRE");
            return this;
        }

        public Criteria andDESC_NOMBRENotEqualTo(String value)
        {
            addCriterion("DESC_NOMBRE <>", value, "DESC_NOMBRE");
            return this;
        }

        public Criteria andDESC_NOMBREGreaterThan(String value)
        {
            addCriterion("DESC_NOMBRE >", value, "DESC_NOMBRE");
            return this;
        }

        public Criteria andDESC_NOMBREGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_NOMBRE >=", value, "DESC_NOMBRE");
            return this;
        }

        public Criteria andDESC_NOMBRELessThan(String value)
        {
            addCriterion("DESC_NOMBRE <", value, "DESC_NOMBRE");
            return this;
        }

        public Criteria andDESC_NOMBRELessThanOrEqualTo(String value)
        {
            addCriterion("DESC_NOMBRE <=", value, "DESC_NOMBRE");
            return this;
        }

        public Criteria andDESC_NOMBRELike(String value)
        {
            addCriterion("DESC_NOMBRE like", value, "DESC_NOMBRE");
            return this;
        }

        public Criteria andDESC_NOMBRENotLike(String value)
        {
            addCriterion("DESC_NOMBRE not like", value, "DESC_NOMBRE");
            return this;
        }

        public Criteria andDESC_NOMBREIn(List values)
        {
            addCriterion("DESC_NOMBRE in", values, "DESC_NOMBRE");
            return this;
        }

        public Criteria andDESC_NOMBRENotIn(List values)
        {
            addCriterion("DESC_NOMBRE not in", values, "DESC_NOMBRE");
            return this;
        }

        public Criteria andDESC_NOMBREBetween(String value1, String value2)
        {
            addCriterion("DESC_NOMBRE between", value1, value2, "DESC_NOMBRE");
            return this;
        }

        public Criteria andDESC_NOMBRENotBetween(String value1, String value2)
        {
            addCriterion("DESC_NOMBRE not between", value1, value2, "DESC_NOMBRE");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_SUMILLAIsNull()
        {
            criteriaWithoutValue.add("DESC_SUMILLA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_SUMILLAIsNotNull()
        {
            criteriaWithoutValue.add("DESC_SUMILLA is not null");
            return this;
        }

        public Criteria andDESC_SUMILLAEqualTo(String value)
        {
            addCriterion("DESC_SUMILLA =", value, "DESC_SUMILLA");
            return this;
        }

        public Criteria andDESC_SUMILLANotEqualTo(String value)
        {
            addCriterion("DESC_SUMILLA <>", value, "DESC_SUMILLA");
            return this;
        }

        public Criteria andDESC_SUMILLAGreaterThan(String value)
        {
            addCriterion("DESC_SUMILLA >", value, "DESC_SUMILLA");
            return this;
        }

        public Criteria andDESC_SUMILLAGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_SUMILLA >=", value, "DESC_SUMILLA");
            return this;
        }

        public Criteria andDESC_SUMILLALessThan(String value)
        {
            addCriterion("DESC_SUMILLA <", value, "DESC_SUMILLA");
            return this;
        }

        public Criteria andDESC_SUMILLALessThanOrEqualTo(String value)
        {
            addCriterion("DESC_SUMILLA <=", value, "DESC_SUMILLA");
            return this;
        }

        public Criteria andDESC_SUMILLALike(String value)
        {
            addCriterion("DESC_SUMILLA like", value, "DESC_SUMILLA");
            return this;
        }

        public Criteria andDESC_SUMILLANotLike(String value)
        {
            addCriterion("DESC_SUMILLA not like", value, "DESC_SUMILLA");
            return this;
        }

        public Criteria andDESC_SUMILLAIn(List values)
        {
            addCriterion("DESC_SUMILLA in", values, "DESC_SUMILLA");
            return this;
        }

        public Criteria andDESC_SUMILLANotIn(List values)
        {
            addCriterion("DESC_SUMILLA not in", values, "DESC_SUMILLA");
            return this;
        }

        public Criteria andDESC_SUMILLABetween(String value1, String value2)
        {
            addCriterion("DESC_SUMILLA between", value1, value2, "DESC_SUMILLA");
            return this;
        }

        public Criteria andDESC_SUMILLANotBetween(String value1, String value2)
        {
            addCriterion("DESC_SUMILLA not between", value1, value2, "DESC_SUMILLA");
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
        public Criteria andNUMR_ORDENIsNull()
        {
            criteriaWithoutValue.add("NUMR_ORDEN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_ORDENIsNotNull()
        {
            criteriaWithoutValue.add("NUMR_ORDEN is not null");
            return this;
        }

        public Criteria andNUMR_ORDENEqualTo(Short value)
        {
            addCriterion("NUMR_ORDEN =", value, "NUMR_ORDEN");
            return this;
        }

        public Criteria andNUMR_ORDENNotEqualTo(Short value)
        {
            addCriterion("NUMR_ORDEN <>", value, "NUMR_ORDEN");
            return this;
        }

        public Criteria andNUMR_ORDENGreaterThan(Short value)
        {
            addCriterion("NUMR_ORDEN >", value, "NUMR_ORDEN");
            return this;
        }

        public Criteria andNUMR_ORDENGreaterThanOrEqualTo(Short value)
        {
            addCriterion("NUMR_ORDEN >=", value, "NUMR_ORDEN");
            return this;
        }

        public Criteria andNUMR_ORDENLessThan(Short value)
        {
            addCriterion("NUMR_ORDEN <", value, "NUMR_ORDEN");
            return this;
        }

        public Criteria andNUMR_ORDENLessThanOrEqualTo(Short value)
        {
            addCriterion("NUMR_ORDEN <=", value, "NUMR_ORDEN");
            return this;
        }

        public Criteria andNUMR_ORDENIn(List values)
        {
            addCriterion("NUMR_ORDEN in", values, "NUMR_ORDEN");
            return this;
        }

        public Criteria andNUMR_ORDENNotIn(List values)
        {
            addCriterion("NUMR_ORDEN not in", values, "NUMR_ORDEN");
            return this;
        }

        public Criteria andNUMR_ORDENBetween(Short value1, Short value2)
        {
            addCriterion("NUMR_ORDEN between", value1, value2, "NUMR_ORDEN");
            return this;
        }

        public Criteria andNUMR_ORDENNotBetween(Short value1, Short value2)
        {
            addCriterion("NUMR_ORDEN not between", value1, value2, "NUMR_ORDEN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_OBSERVACIONESIsNull()
        {
            criteriaWithoutValue.add("DESC_OBSERVACIONES is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_OBSERVACIONESIsNotNull()
        {
            criteriaWithoutValue.add("DESC_OBSERVACIONES is not null");
            return this;
        }

        public Criteria andDESC_OBSERVACIONESEqualTo(String value)
        {
            addCriterion("DESC_OBSERVACIONES =", value, "DESC_OBSERVACIONES");
            return this;
        }

        public Criteria andDESC_OBSERVACIONESNotEqualTo(String value)
        {
            addCriterion("DESC_OBSERVACIONES <>", value, "DESC_OBSERVACIONES");
            return this;
        }

        public Criteria andDESC_OBSERVACIONESGreaterThan(String value)
        {
            addCriterion("DESC_OBSERVACIONES >", value, "DESC_OBSERVACIONES");
            return this;
        }

        public Criteria andDESC_OBSERVACIONESGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_OBSERVACIONES >=", value, "DESC_OBSERVACIONES");
            return this;
        }

        public Criteria andDESC_OBSERVACIONESLessThan(String value)
        {
            addCriterion("DESC_OBSERVACIONES <", value, "DESC_OBSERVACIONES");
            return this;
        }

        public Criteria andDESC_OBSERVACIONESLessThanOrEqualTo(String value)
        {
            addCriterion("DESC_OBSERVACIONES <=", value, "DESC_OBSERVACIONES");
            return this;
        }

        public Criteria andDESC_OBSERVACIONESLike(String value)
        {
            addCriterion("DESC_OBSERVACIONES like", value, "DESC_OBSERVACIONES");
            return this;
        }

        public Criteria andDESC_OBSERVACIONESNotLike(String value)
        {
            addCriterion("DESC_OBSERVACIONES not like", value, "DESC_OBSERVACIONES");
            return this;
        }

        public Criteria andDESC_OBSERVACIONESIn(List values)
        {
            addCriterion("DESC_OBSERVACIONES in", values, "DESC_OBSERVACIONES");
            return this;
        }

        public Criteria andDESC_OBSERVACIONESNotIn(List values)
        {
            addCriterion("DESC_OBSERVACIONES not in", values, "DESC_OBSERVACIONES");
            return this;
        }

        public Criteria andDESC_OBSERVACIONESBetween(String value1, String value2)
        {
            addCriterion("DESC_OBSERVACIONES between", value1, value2, "DESC_OBSERVACIONES");
            return this;
        }

        public Criteria andDESC_OBSERVACIONESNotBetween(String value1, String value2)
        {
            addCriterion("DESC_OBSERVACIONES not between", value1, value2, "DESC_OBSERVACIONES");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_JEFE_RNCIsNull()
        {
            criteriaWithoutValue.add("INDC_JEFE_RNC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_JEFE_RNCIsNotNull()
        {
            criteriaWithoutValue.add("INDC_JEFE_RNC is not null");
            return this;
        }

        public Criteria andINDC_JEFE_RNCEqualTo(String value)
        {
            addCriterion("INDC_JEFE_RNC =", value, "INDC_JEFE_RNC");
            return this;
        }

        public Criteria andINDC_JEFE_RNCNotEqualTo(String value)
        {
            addCriterion("INDC_JEFE_RNC <>", value, "INDC_JEFE_RNC");
            return this;
        }

        public Criteria andINDC_JEFE_RNCGreaterThan(String value)
        {
            addCriterion("INDC_JEFE_RNC >", value, "INDC_JEFE_RNC");
            return this;
        }

        public Criteria andINDC_JEFE_RNCGreaterThanOrEqualTo(String value)
        {
            addCriterion("INDC_JEFE_RNC >=", value, "INDC_JEFE_RNC");
            return this;
        }

        public Criteria andINDC_JEFE_RNCLessThan(String value)
        {
            addCriterion("INDC_JEFE_RNC <", value, "INDC_JEFE_RNC");
            return this;
        }

        public Criteria andINDC_JEFE_RNCLessThanOrEqualTo(String value)
        {
            addCriterion("INDC_JEFE_RNC <=", value, "INDC_JEFE_RNC");
            return this;
        }

        public Criteria andINDC_JEFE_RNCLike(String value)
        {
            addCriterion("INDC_JEFE_RNC like", value, "INDC_JEFE_RNC");
            return this;
        }

        public Criteria andINDC_JEFE_RNCNotLike(String value)
        {
            addCriterion("INDC_JEFE_RNC not like", value, "INDC_JEFE_RNC");
            return this;
        }

        public Criteria andINDC_JEFE_RNCIn(List values)
        {
            addCriterion("INDC_JEFE_RNC in", values, "INDC_JEFE_RNC");
            return this;
        }

        public Criteria andINDC_JEFE_RNCNotIn(List values)
        {
            addCriterion("INDC_JEFE_RNC not in", values, "INDC_JEFE_RNC");
            return this;
        }

        public Criteria andINDC_JEFE_RNCBetween(String value1, String value2)
        {
            addCriterion("INDC_JEFE_RNC between", value1, value2, "INDC_JEFE_RNC");
            return this;
        }

        public Criteria andINDC_JEFE_RNCNotBetween(String value1, String value2)
        {
            addCriterion("INDC_JEFE_RNC not between", value1, value2, "INDC_JEFE_RNC");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andTIPO_FIRMAIsNull()
        {
            criteriaWithoutValue.add("TIPO_FIRMA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andTIPO_FIRMAIsNotNull()
        {
            criteriaWithoutValue.add("TIPO_FIRMA is not null");
            return this;
        }

        public Criteria andTIPO_FIRMAEqualTo(String value)
        {
            addCriterion("TIPO_FIRMA =", value, "TIPO_FIRMA");
            return this;
        }

        public Criteria andTIPO_FIRMANotEqualTo(String value)
        {
            addCriterion("TIPO_FIRMA <>", value, "TIPO_FIRMA");
            return this;
        }

        public Criteria andTIPO_FIRMAGreaterThan(String value)
        {
            addCriterion("TIPO_FIRMA >", value, "TIPO_FIRMA");
            return this;
        }

        public Criteria andTIPO_FIRMAGreaterThanOrEqualTo(String value)
        {
            addCriterion("TIPO_FIRMA >=", value, "TIPO_FIRMA");
            return this;
        }

        public Criteria andTIPO_FIRMALessThan(String value)
        {
            addCriterion("TIPO_FIRMA <", value, "TIPO_FIRMA");
            return this;
        }

        public Criteria andTIPO_FIRMALessThanOrEqualTo(String value)
        {
            addCriterion("TIPO_FIRMA <=", value, "TIPO_FIRMA");
            return this;
        }

        public Criteria andTIPO_FIRMALike(String value)
        {
            addCriterion("TIPO_FIRMA like", value, "TIPO_FIRMA");
            return this;
        }

        public Criteria andTIPO_FIRMANotLike(String value)
        {
            addCriterion("TIPO_FIRMA not like", value, "TIPO_FIRMA");
            return this;
        }

        public Criteria andTIPO_FIRMAIn(List values)
        {
            addCriterion("TIPO_FIRMA in", values, "TIPO_FIRMA");
            return this;
        }

        public Criteria andTIPO_FIRMANotIn(List values)
        {
            addCriterion("TIPO_FIRMA not in", values, "TIPO_FIRMA");
            return this;
        }

        public Criteria andTIPO_FIRMABetween(String value1, String value2)
        {
            addCriterion("TIPO_FIRMA between", value1, value2, "TIPO_FIRMA");
            return this;
        }

        public Criteria andTIPO_FIRMANotBetween(String value1, String value2)
        {
            addCriterion("TIPO_FIRMA not between", value1, value2, "TIPO_FIRMA");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_USU_REGISTROIsNull()
        {
            criteriaWithoutValue.add("CODG_USU_REGISTRO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_USU_REGISTROIsNotNull()
        {
            criteriaWithoutValue.add("CODG_USU_REGISTRO is not null");
            return this;
        }

        public Criteria andCODG_USU_REGISTROEqualTo(String value)
        {
            addCriterion("CODG_USU_REGISTRO =", value, "CODG_USU_REGISTRO");
            return this;
        }

        public Criteria andCODG_USU_REGISTRONotEqualTo(String value)
        {
            addCriterion("CODG_USU_REGISTRO <>", value, "CODG_USU_REGISTRO");
            return this;
        }

        public Criteria andCODG_USU_REGISTROGreaterThan(String value)
        {
            addCriterion("CODG_USU_REGISTRO >", value, "CODG_USU_REGISTRO");
            return this;
        }

        public Criteria andCODG_USU_REGISTROGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_USU_REGISTRO >=", value, "CODG_USU_REGISTRO");
            return this;
        }

        public Criteria andCODG_USU_REGISTROLessThan(String value)
        {
            addCriterion("CODG_USU_REGISTRO <", value, "CODG_USU_REGISTRO");
            return this;
        }

        public Criteria andCODG_USU_REGISTROLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_USU_REGISTRO <=", value, "CODG_USU_REGISTRO");
            return this;
        }

        public Criteria andCODG_USU_REGISTROLike(String value)
        {
            addCriterion("CODG_USU_REGISTRO like", value, "CODG_USU_REGISTRO");
            return this;
        }

        public Criteria andCODG_USU_REGISTRONotLike(String value)
        {
            addCriterion("CODG_USU_REGISTRO not like", value, "CODG_USU_REGISTRO");
            return this;
        }

        public Criteria andCODG_USU_REGISTROIn(List values)
        {
            addCriterion("CODG_USU_REGISTRO in", values, "CODG_USU_REGISTRO");
            return this;
        }

        public Criteria andCODG_USU_REGISTRONotIn(List values)
        {
            addCriterion("CODG_USU_REGISTRO not in", values, "CODG_USU_REGISTRO");
            return this;
        }

        public Criteria andCODG_USU_REGISTROBetween(String value1, String value2)
        {
            addCriterion("CODG_USU_REGISTRO between", value1, value2, "CODG_USU_REGISTRO");
            return this;
        }

        public Criteria andCODG_USU_REGISTRONotBetween(String value1, String value2)
        {
            addCriterion("CODG_USU_REGISTRO not between", value1, value2, "CODG_USU_REGISTRO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_REGISTROIsNull()
        {
            criteriaWithoutValue.add("FECH_REGISTRO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_REGISTROIsNotNull()
        {
            criteriaWithoutValue.add("FECH_REGISTRO is not null");
            return this;
        }

        public Criteria andFECH_REGISTROEqualTo(Date value)
        {
            addCriterion("FECH_REGISTRO =", value, "FECH_REGISTRO");
            return this;
        }

        public Criteria andFECH_REGISTRONotEqualTo(Date value)
        {
            addCriterion("FECH_REGISTRO <>", value, "FECH_REGISTRO");
            return this;
        }

        public Criteria andFECH_REGISTROGreaterThan(Date value)
        {
            addCriterion("FECH_REGISTRO >", value, "FECH_REGISTRO");
            return this;
        }

        public Criteria andFECH_REGISTROGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FECH_REGISTRO >=", value, "FECH_REGISTRO");
            return this;
        }

        public Criteria andFECH_REGISTROLessThan(Date value)
        {
            addCriterion("FECH_REGISTRO <", value, "FECH_REGISTRO");
            return this;
        }

        public Criteria andFECH_REGISTROLessThanOrEqualTo(Date value)
        {
            addCriterion("FECH_REGISTRO <=", value, "FECH_REGISTRO");
            return this;
        }

        public Criteria andFECH_REGISTROIn(List values)
        {
            addCriterion("FECH_REGISTRO in", values, "FECH_REGISTRO");
            return this;
        }

        public Criteria andFECH_REGISTRONotIn(List values)
        {
            addCriterion("FECH_REGISTRO not in", values, "FECH_REGISTRO");
            return this;
        }

        public Criteria andFECH_REGISTROBetween(Date value1, Date value2)
        {
            addCriterion("FECH_REGISTRO between", value1, value2, "FECH_REGISTRO");
            return this;
        }

        public Criteria andFECH_REGISTRONotBetween(Date value1, Date value2)
        {
            addCriterion("FECH_REGISTRO not between", value1, value2, "FECH_REGISTRO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_USU_ULT_MODIIsNull()
        {
            criteriaWithoutValue.add("CODG_USU_ULT_MODI is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_USU_ULT_MODIIsNotNull()
        {
            criteriaWithoutValue.add("CODG_USU_ULT_MODI is not null");
            return this;
        }

        public Criteria andCODG_USU_ULT_MODIEqualTo(String value)
        {
            addCriterion("CODG_USU_ULT_MODI =", value, "CODG_USU_ULT_MODI");
            return this;
        }

        public Criteria andCODG_USU_ULT_MODINotEqualTo(String value)
        {
            addCriterion("CODG_USU_ULT_MODI <>", value, "CODG_USU_ULT_MODI");
            return this;
        }

        public Criteria andCODG_USU_ULT_MODIGreaterThan(String value)
        {
            addCriterion("CODG_USU_ULT_MODI >", value, "CODG_USU_ULT_MODI");
            return this;
        }

        public Criteria andCODG_USU_ULT_MODIGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_USU_ULT_MODI >=", value, "CODG_USU_ULT_MODI");
            return this;
        }

        public Criteria andCODG_USU_ULT_MODILessThan(String value)
        {
            addCriterion("CODG_USU_ULT_MODI <", value, "CODG_USU_ULT_MODI");
            return this;
        }

        public Criteria andCODG_USU_ULT_MODILessThanOrEqualTo(String value)
        {
            addCriterion("CODG_USU_ULT_MODI <=", value, "CODG_USU_ULT_MODI");
            return this;
        }

        public Criteria andCODG_USU_ULT_MODILike(String value)
        {
            addCriterion("CODG_USU_ULT_MODI like", value, "CODG_USU_ULT_MODI");
            return this;
        }

        public Criteria andCODG_USU_ULT_MODINotLike(String value)
        {
            addCriterion("CODG_USU_ULT_MODI not like", value, "CODG_USU_ULT_MODI");
            return this;
        }

        public Criteria andCODG_USU_ULT_MODIIn(List values)
        {
            addCriterion("CODG_USU_ULT_MODI in", values, "CODG_USU_ULT_MODI");
            return this;
        }

        public Criteria andCODG_USU_ULT_MODINotIn(List values)
        {
            addCriterion("CODG_USU_ULT_MODI not in", values, "CODG_USU_ULT_MODI");
            return this;
        }

        public Criteria andCODG_USU_ULT_MODIBetween(String value1, String value2)
        {
            addCriterion("CODG_USU_ULT_MODI between", value1, value2, "CODG_USU_ULT_MODI");
            return this;
        }

        public Criteria andCODG_USU_ULT_MODINotBetween(String value1, String value2)
        {
            addCriterion("CODG_USU_ULT_MODI not between", value1, value2, "CODG_USU_ULT_MODI");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_ULT_MODIIsNull()
        {
            criteriaWithoutValue.add("FECH_ULT_MODI is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_ULT_MODIIsNotNull()
        {
            criteriaWithoutValue.add("FECH_ULT_MODI is not null");
            return this;
        }

        public Criteria andFECH_ULT_MODIEqualTo(Date value)
        {
            addCriterion("FECH_ULT_MODI =", value, "FECH_ULT_MODI");
            return this;
        }

        public Criteria andFECH_ULT_MODINotEqualTo(Date value)
        {
            addCriterion("FECH_ULT_MODI <>", value, "FECH_ULT_MODI");
            return this;
        }

        public Criteria andFECH_ULT_MODIGreaterThan(Date value)
        {
            addCriterion("FECH_ULT_MODI >", value, "FECH_ULT_MODI");
            return this;
        }

        public Criteria andFECH_ULT_MODIGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FECH_ULT_MODI >=", value, "FECH_ULT_MODI");
            return this;
        }

        public Criteria andFECH_ULT_MODILessThan(Date value)
        {
            addCriterion("FECH_ULT_MODI <", value, "FECH_ULT_MODI");
            return this;
        }

        public Criteria andFECH_ULT_MODILessThanOrEqualTo(Date value)
        {
            addCriterion("FECH_ULT_MODI <=", value, "FECH_ULT_MODI");
            return this;
        }

        public Criteria andFECH_ULT_MODIIn(List values)
        {
            addCriterion("FECH_ULT_MODI in", values, "FECH_ULT_MODI");
            return this;
        }

        public Criteria andFECH_ULT_MODINotIn(List values)
        {
            addCriterion("FECH_ULT_MODI not in", values, "FECH_ULT_MODI");
            return this;
        }

        public Criteria andFECH_ULT_MODIBetween(Date value1, Date value2)
        {
            addCriterion("FECH_ULT_MODI between", value1, value2, "FECH_ULT_MODI");
            return this;
        }

        public Criteria andFECH_ULT_MODINotBetween(Date value1, Date value2)
        {
            addCriterion("FECH_ULT_MODI not between", value1, value2, "FECH_ULT_MODI");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_FEC_USU_MODIIsNull()
        {
            criteriaWithoutValue.add("DESC_FEC_USU_MODI is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_FEC_USU_MODIIsNotNull()
        {
            criteriaWithoutValue.add("DESC_FEC_USU_MODI is not null");
            return this;
        }

        public Criteria andDESC_FEC_USU_MODIEqualTo(String value)
        {
            addCriterion("DESC_FEC_USU_MODI =", value, "DESC_FEC_USU_MODI");
            return this;
        }

        public Criteria andDESC_FEC_USU_MODINotEqualTo(String value)
        {
            addCriterion("DESC_FEC_USU_MODI <>", value, "DESC_FEC_USU_MODI");
            return this;
        }

        public Criteria andDESC_FEC_USU_MODIGreaterThan(String value)
        {
            addCriterion("DESC_FEC_USU_MODI >", value, "DESC_FEC_USU_MODI");
            return this;
        }

        public Criteria andDESC_FEC_USU_MODIGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_FEC_USU_MODI >=", value, "DESC_FEC_USU_MODI");
            return this;
        }

        public Criteria andDESC_FEC_USU_MODILessThan(String value)
        {
            addCriterion("DESC_FEC_USU_MODI <", value, "DESC_FEC_USU_MODI");
            return this;
        }

        public Criteria andDESC_FEC_USU_MODILessThanOrEqualTo(String value)
        {
            addCriterion("DESC_FEC_USU_MODI <=", value, "DESC_FEC_USU_MODI");
            return this;
        }

        public Criteria andDESC_FEC_USU_MODILike(String value)
        {
            addCriterion("DESC_FEC_USU_MODI like", value, "DESC_FEC_USU_MODI");
            return this;
        }

        public Criteria andDESC_FEC_USU_MODINotLike(String value)
        {
            addCriterion("DESC_FEC_USU_MODI not like", value, "DESC_FEC_USU_MODI");
            return this;
        }

        public Criteria andDESC_FEC_USU_MODIIn(List values)
        {
            addCriterion("DESC_FEC_USU_MODI in", values, "DESC_FEC_USU_MODI");
            return this;
        }

        public Criteria andDESC_FEC_USU_MODINotIn(List values)
        {
            addCriterion("DESC_FEC_USU_MODI not in", values, "DESC_FEC_USU_MODI");
            return this;
        }

        public Criteria andDESC_FEC_USU_MODIBetween(String value1, String value2)
        {
            addCriterion("DESC_FEC_USU_MODI between", value1, value2, "DESC_FEC_USU_MODI");
            return this;
        }

        public Criteria andDESC_FEC_USU_MODINotBetween(String value1, String value2)
        {
            addCriterion("DESC_FEC_USU_MODI not between", value1, value2, "DESC_FEC_USU_MODI");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andF_audIsNull()
        {
            criteriaWithoutValue.add("f_aud is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andF_audIsNotNull()
        {
            criteriaWithoutValue.add("f_aud is not null");
            return this;
        }

        public Criteria andF_audEqualTo(Date value)
        {
            addCriterion("f_aud =", value, "f_aud");
            return this;
        }

        public Criteria andF_audNotEqualTo(Date value)
        {
            addCriterion("f_aud <>", value, "f_aud");
            return this;
        }

        public Criteria andF_audGreaterThan(Date value)
        {
            addCriterion("f_aud >", value, "f_aud");
            return this;
        }

        public Criteria andF_audGreaterThanOrEqualTo(Date value)
        {
            addCriterion("f_aud >=", value, "f_aud");
            return this;
        }

        public Criteria andF_audLessThan(Date value)
        {
            addCriterion("f_aud <", value, "f_aud");
            return this;
        }

        public Criteria andF_audLessThanOrEqualTo(Date value)
        {
            addCriterion("f_aud <=", value, "f_aud");
            return this;
        }

        public Criteria andF_audIn(List values)
        {
            addCriterion("f_aud in", values, "f_aud");
            return this;
        }

        public Criteria andF_audNotIn(List values)
        {
            addCriterion("f_aud not in", values, "f_aud");
            return this;
        }

        public Criteria andF_audBetween(Date value1, Date value2)
        {
            addCriterion("f_aud between", value1, value2, "f_aud");
            return this;
        }

        public Criteria andF_audNotBetween(Date value1, Date value2)
        {
            addCriterion("f_aud not between", value1, value2, "f_aud");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_aud_uidIsNull()
        {
            criteriaWithoutValue.add("c_aud_uid is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_aud_uidIsNotNull()
        {
            criteriaWithoutValue.add("c_aud_uid is not null");
            return this;
        }

        public Criteria andC_aud_uidEqualTo(String value)
        {
            addCriterion("c_aud_uid =", value, "c_aud_uid");
            return this;
        }

        public Criteria andC_aud_uidNotEqualTo(String value)
        {
            addCriterion("c_aud_uid <>", value, "c_aud_uid");
            return this;
        }

        public Criteria andC_aud_uidGreaterThan(String value)
        {
            addCriterion("c_aud_uid >", value, "c_aud_uid");
            return this;
        }

        public Criteria andC_aud_uidGreaterThanOrEqualTo(String value)
        {
            addCriterion("c_aud_uid >=", value, "c_aud_uid");
            return this;
        }

        public Criteria andC_aud_uidLessThan(String value)
        {
            addCriterion("c_aud_uid <", value, "c_aud_uid");
            return this;
        }

        public Criteria andC_aud_uidLessThanOrEqualTo(String value)
        {
            addCriterion("c_aud_uid <=", value, "c_aud_uid");
            return this;
        }

        public Criteria andC_aud_uidLike(String value)
        {
            addCriterion("c_aud_uid like", value, "c_aud_uid");
            return this;
        }

        public Criteria andC_aud_uidNotLike(String value)
        {
            addCriterion("c_aud_uid not like", value, "c_aud_uid");
            return this;
        }

        public Criteria andC_aud_uidIn(List values)
        {
            addCriterion("c_aud_uid in", values, "c_aud_uid");
            return this;
        }

        public Criteria andC_aud_uidNotIn(List values)
        {
            addCriterion("c_aud_uid not in", values, "c_aud_uid");
            return this;
        }

        public Criteria andC_aud_uidBetween(String value1, String value2)
        {
            addCriterion("c_aud_uid between", value1, value2, "c_aud_uid");
            return this;
        }

        public Criteria andC_aud_uidNotBetween(String value1, String value2)
        {
            addCriterion("c_aud_uid not between", value1, value2, "c_aud_uid");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_aud_pcIsNull()
        {
            criteriaWithoutValue.add("c_aud_pc is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_aud_pcIsNotNull()
        {
            criteriaWithoutValue.add("c_aud_pc is not null");
            return this;
        }

        public Criteria andC_aud_pcEqualTo(String value)
        {
            addCriterion("c_aud_pc =", value, "c_aud_pc");
            return this;
        }

        public Criteria andC_aud_pcNotEqualTo(String value)
        {
            addCriterion("c_aud_pc <>", value, "c_aud_pc");
            return this;
        }

        public Criteria andC_aud_pcGreaterThan(String value)
        {
            addCriterion("c_aud_pc >", value, "c_aud_pc");
            return this;
        }

        public Criteria andC_aud_pcGreaterThanOrEqualTo(String value)
        {
            addCriterion("c_aud_pc >=", value, "c_aud_pc");
            return this;
        }

        public Criteria andC_aud_pcLessThan(String value)
        {
            addCriterion("c_aud_pc <", value, "c_aud_pc");
            return this;
        }

        public Criteria andC_aud_pcLessThanOrEqualTo(String value)
        {
            addCriterion("c_aud_pc <=", value, "c_aud_pc");
            return this;
        }

        public Criteria andC_aud_pcLike(String value)
        {
            addCriterion("c_aud_pc like", value, "c_aud_pc");
            return this;
        }

        public Criteria andC_aud_pcNotLike(String value)
        {
            addCriterion("c_aud_pc not like", value, "c_aud_pc");
            return this;
        }

        public Criteria andC_aud_pcIn(List values)
        {
            addCriterion("c_aud_pc in", values, "c_aud_pc");
            return this;
        }

        public Criteria andC_aud_pcNotIn(List values)
        {
            addCriterion("c_aud_pc not in", values, "c_aud_pc");
            return this;
        }

        public Criteria andC_aud_pcBetween(String value1, String value2)
        {
            addCriterion("c_aud_pc between", value1, value2, "c_aud_pc");
            return this;
        }

        public Criteria andC_aud_pcNotBetween(String value1, String value2)
        {
            addCriterion("c_aud_pc not between", value1, value2, "c_aud_pc");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andN_aud_ipIsNull()
        {
            criteriaWithoutValue.add("n_aud_ip is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andN_aud_ipIsNotNull()
        {
            criteriaWithoutValue.add("n_aud_ip is not null");
            return this;
        }

        public Criteria andN_aud_ipEqualTo(String value)
        {
            addCriterion("n_aud_ip =", value, "n_aud_ip");
            return this;
        }

        public Criteria andN_aud_ipNotEqualTo(String value)
        {
            addCriterion("n_aud_ip <>", value, "n_aud_ip");
            return this;
        }

        public Criteria andN_aud_ipGreaterThan(String value)
        {
            addCriterion("n_aud_ip >", value, "n_aud_ip");
            return this;
        }

        public Criteria andN_aud_ipGreaterThanOrEqualTo(String value)
        {
            addCriterion("n_aud_ip >=", value, "n_aud_ip");
            return this;
        }

        public Criteria andN_aud_ipLessThan(String value)
        {
            addCriterion("n_aud_ip <", value, "n_aud_ip");
            return this;
        }

        public Criteria andN_aud_ipLessThanOrEqualTo(String value)
        {
            addCriterion("n_aud_ip <=", value, "n_aud_ip");
            return this;
        }

        public Criteria andN_aud_ipLike(String value)
        {
            addCriterion("n_aud_ip like", value, "n_aud_ip");
            return this;
        }

        public Criteria andN_aud_ipNotLike(String value)
        {
            addCriterion("n_aud_ip not like", value, "n_aud_ip");
            return this;
        }

        public Criteria andN_aud_ipIn(List values)
        {
            addCriterion("n_aud_ip in", values, "n_aud_ip");
            return this;
        }

        public Criteria andN_aud_ipNotIn(List values)
        {
            addCriterion("n_aud_ip not in", values, "n_aud_ip");
            return this;
        }

        public Criteria andN_aud_ipBetween(String value1, String value2)
        {
            addCriterion("n_aud_ip between", value1, value2, "n_aud_ip");
            return this;
        }

        public Criteria andN_aud_ipNotBetween(String value1, String value2)
        {
            addCriterion("n_aud_ip not between", value1, value2, "n_aud_ip");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_aud_mcaddrIsNull()
        {
            criteriaWithoutValue.add("c_aud_mcaddr is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_aud_mcaddrIsNotNull()
        {
            criteriaWithoutValue.add("c_aud_mcaddr is not null");
            return this;
        }

        public Criteria andC_aud_mcaddrEqualTo(String value)
        {
            addCriterion("c_aud_mcaddr =", value, "c_aud_mcaddr");
            return this;
        }

        public Criteria andC_aud_mcaddrNotEqualTo(String value)
        {
            addCriterion("c_aud_mcaddr <>", value, "c_aud_mcaddr");
            return this;
        }

        public Criteria andC_aud_mcaddrGreaterThan(String value)
        {
            addCriterion("c_aud_mcaddr >", value, "c_aud_mcaddr");
            return this;
        }

        public Criteria andC_aud_mcaddrGreaterThanOrEqualTo(String value)
        {
            addCriterion("c_aud_mcaddr >=", value, "c_aud_mcaddr");
            return this;
        }

        public Criteria andC_aud_mcaddrLessThan(String value)
        {
            addCriterion("c_aud_mcaddr <", value, "c_aud_mcaddr");
            return this;
        }

        public Criteria andC_aud_mcaddrLessThanOrEqualTo(String value)
        {
            addCriterion("c_aud_mcaddr <=", value, "c_aud_mcaddr");
            return this;
        }

        public Criteria andC_aud_mcaddrLike(String value)
        {
            addCriterion("c_aud_mcaddr like", value, "c_aud_mcaddr");
            return this;
        }

        public Criteria andC_aud_mcaddrNotLike(String value)
        {
            addCriterion("c_aud_mcaddr not like", value, "c_aud_mcaddr");
            return this;
        }

        public Criteria andC_aud_mcaddrIn(List values)
        {
            addCriterion("c_aud_mcaddr in", values, "c_aud_mcaddr");
            return this;
        }

        public Criteria andC_aud_mcaddrNotIn(List values)
        {
            addCriterion("c_aud_mcaddr not in", values, "c_aud_mcaddr");
            return this;
        }

        public Criteria andC_aud_mcaddrBetween(String value1, String value2)
        {
            addCriterion("c_aud_mcaddr between", value1, value2, "c_aud_mcaddr");
            return this;
        }

        public Criteria andC_aud_mcaddrNotBetween(String value1, String value2)
        {
            addCriterion("c_aud_mcaddr not between", value1, value2, "c_aud_mcaddr");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_aud_lgnredIsNull()
        {
            criteriaWithoutValue.add("c_aud_lgnred is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_aud_lgnredIsNotNull()
        {
            criteriaWithoutValue.add("c_aud_lgnred is not null");
            return this;
        }

        public Criteria andC_aud_lgnredEqualTo(String value)
        {
            addCriterion("c_aud_lgnred =", value, "c_aud_lgnred");
            return this;
        }

        public Criteria andC_aud_lgnredNotEqualTo(String value)
        {
            addCriterion("c_aud_lgnred <>", value, "c_aud_lgnred");
            return this;
        }

        public Criteria andC_aud_lgnredGreaterThan(String value)
        {
            addCriterion("c_aud_lgnred >", value, "c_aud_lgnred");
            return this;
        }

        public Criteria andC_aud_lgnredGreaterThanOrEqualTo(String value)
        {
            addCriterion("c_aud_lgnred >=", value, "c_aud_lgnred");
            return this;
        }

        public Criteria andC_aud_lgnredLessThan(String value)
        {
            addCriterion("c_aud_lgnred <", value, "c_aud_lgnred");
            return this;
        }

        public Criteria andC_aud_lgnredLessThanOrEqualTo(String value)
        {
            addCriterion("c_aud_lgnred <=", value, "c_aud_lgnred");
            return this;
        }

        public Criteria andC_aud_lgnredLike(String value)
        {
            addCriterion("c_aud_lgnred like", value, "c_aud_lgnred");
            return this;
        }

        public Criteria andC_aud_lgnredNotLike(String value)
        {
            addCriterion("c_aud_lgnred not like", value, "c_aud_lgnred");
            return this;
        }

        public Criteria andC_aud_lgnredIn(List values)
        {
            addCriterion("c_aud_lgnred in", values, "c_aud_lgnred");
            return this;
        }

        public Criteria andC_aud_lgnredNotIn(List values)
        {
            addCriterion("c_aud_lgnred not in", values, "c_aud_lgnred");
            return this;
        }

        public Criteria andC_aud_lgnredBetween(String value1, String value2)
        {
            addCriterion("c_aud_lgnred between", value1, value2, "c_aud_lgnred");
            return this;
        }

        public Criteria andC_aud_lgnredNotBetween(String value1, String value2)
        {
            addCriterion("c_aud_lgnred not between", value1, value2, "c_aud_lgnred");
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


    public FirmaAutorizadaExample()
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
