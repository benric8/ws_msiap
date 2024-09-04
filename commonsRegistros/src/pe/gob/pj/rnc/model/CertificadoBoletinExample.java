// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CertificadoBoletinExample.java

package pe.gob.pj.rnc.model;

import java.util.*;

public class CertificadoBoletinExample
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
		public Criteria andCODG_CERTIIsNull()
        {
            criteriaWithoutValue.add("CODG_CERTI is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andCODG_CERTIIsNotNull()
        {
            criteriaWithoutValue.add("CODG_CERTI is not null");
            return this;
        }

        public Criteria andCODG_CERTIEqualTo(String value)
        {
            addCriterion("CODG_CERTI =", value, "CODG_CERTI");
            return this;
        }

        public Criteria andCODG_CERTINotEqualTo(String value)
        {
            addCriterion("CODG_CERTI <>", value, "CODG_CERTI");
            return this;
        }

        public Criteria andCODG_CERTIGreaterThan(String value)
        {
            addCriterion("CODG_CERTI >", value, "CODG_CERTI");
            return this;
        }

        public Criteria andCODG_CERTIGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_CERTI >=", value, "CODG_CERTI");
            return this;
        }

        public Criteria andCODG_CERTILessThan(String value)
        {
            addCriterion("CODG_CERTI <", value, "CODG_CERTI");
            return this;
        }

        public Criteria andCODG_CERTILessThanOrEqualTo(String value)
        {
            addCriterion("CODG_CERTI <=", value, "CODG_CERTI");
            return this;
        }

        public Criteria andCODG_CERTILike(String value)
        {
            addCriterion("CODG_CERTI like", value, "CODG_CERTI");
            return this;
        }

        public Criteria andCODG_CERTINotLike(String value)
        {
            addCriterion("CODG_CERTI not like", value, "CODG_CERTI");
            return this;
        }

        public Criteria andCODG_CERTIIn(List values)
        {
            addCriterion("CODG_CERTI in", values, "CODG_CERTI");
            return this;
        }

        public Criteria andCODG_CERTINotIn(List values)
        {
            addCriterion("CODG_CERTI not in", values, "CODG_CERTI");
            return this;
        }

        public Criteria andCODG_CERTIBetween(String value1, String value2)
        {
            addCriterion("CODG_CERTI between", value1, value2, "CODG_CERTI");
            return this;
        }

        public Criteria andCODG_CERTINotBetween(String value1, String value2)
        {
            addCriterion("CODG_CERTI not between", value1, value2, "CODG_CERTI");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andNUMR_BOLETNIsNull()
        {
            criteriaWithoutValue.add("NUMR_BOLETN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("NUMR_BOLETN is not null");
            return this;
        }

        public Criteria andNUMR_BOLETNEqualTo(Long value)
        {
            addCriterion("NUMR_BOLETN =", value, "NUMR_BOLETN");
            return this;
        }

        public Criteria andNUMR_BOLETNNotEqualTo(Long value)
        {
            addCriterion("NUMR_BOLETN <>", value, "NUMR_BOLETN");
            return this;
        }

        public Criteria andNUMR_BOLETNGreaterThan(Long value)
        {
            addCriterion("NUMR_BOLETN >", value, "NUMR_BOLETN");
            return this;
        }

        public Criteria andNUMR_BOLETNGreaterThanOrEqualTo(Long value)
        {
            addCriterion("NUMR_BOLETN >=", value, "NUMR_BOLETN");
            return this;
        }

        public Criteria andNUMR_BOLETNLessThan(Long value)
        {
            addCriterion("NUMR_BOLETN <", value, "NUMR_BOLETN");
            return this;
        }

        public Criteria andNUMR_BOLETNLessThanOrEqualTo(Long value)
        {
            addCriterion("NUMR_BOLETN <=", value, "NUMR_BOLETN");
            return this;
        }

        public Criteria andNUMR_BOLETNIn(List values)
        {
            addCriterion("NUMR_BOLETN in", values, "NUMR_BOLETN");
            return this;
        }

        public Criteria andNUMR_BOLETNNotIn(List values)
        {
            addCriterion("NUMR_BOLETN not in", values, "NUMR_BOLETN");
            return this;
        }

        public Criteria andNUMR_BOLETNBetween(Long value1, Long value2)
        {
            addCriterion("NUMR_BOLETN between", value1, value2, "NUMR_BOLETN");
            return this;
        }

        public Criteria andNUMR_BOLETNNotBetween(Long value1, Long value2)
        {
            addCriterion("NUMR_BOLETN not between", value1, value2, "NUMR_BOLETN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_BOLETINIsNull()
        {
            criteriaWithoutValue.add("FECH_BOLETIN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_BOLETINIsNotNull()
        {
            criteriaWithoutValue.add("FECH_BOLETIN is not null");
            return this;
        }

        public Criteria andFECH_BOLETINEqualTo(Date value)
        {
            addCriterion("FECH_BOLETIN =", value, "FECH_BOLETIN");
            return this;
        }

        public Criteria andFECH_BOLETINNotEqualTo(Date value)
        {
            addCriterion("FECH_BOLETIN <>", value, "FECH_BOLETIN");
            return this;
        }

        public Criteria andFECH_BOLETINGreaterThan(Date value)
        {
            addCriterion("FECH_BOLETIN >", value, "FECH_BOLETIN");
            return this;
        }

        public Criteria andFECH_BOLETINGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FECH_BOLETIN >=", value, "FECH_BOLETIN");
            return this;
        }

        public Criteria andFECH_BOLETINLessThan(Date value)
        {
            addCriterion("FECH_BOLETIN <", value, "FECH_BOLETIN");
            return this;
        }

        public Criteria andFECH_BOLETINLessThanOrEqualTo(Date value)
        {
            addCriterion("FECH_BOLETIN <=", value, "FECH_BOLETIN");
            return this;
        }

        public Criteria andFECH_BOLETINIn(List values)
        {
            addCriterion("FECH_BOLETIN in", values, "FECH_BOLETIN");
            return this;
        }

        public Criteria andFECH_BOLETINNotIn(List values)
        {
            addCriterion("FECH_BOLETIN not in", values, "FECH_BOLETIN");
            return this;
        }

        public Criteria andFECH_BOLETINBetween(Date value1, Date value2)
        {
            addCriterion("FECH_BOLETIN between", value1, value2, "FECH_BOLETIN");
            return this;
        }

        public Criteria andFECH_BOLETINNotBetween(Date value1, Date value2)
        {
            addCriterion("FECH_BOLETIN not between", value1, value2, "FECH_BOLETIN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_DELITIsNull()
        {
            criteriaWithoutValue.add("CODG_DELIT is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_DELITIsNotNull()
        {
            criteriaWithoutValue.add("CODG_DELIT is not null");
            return this;
        }

        public Criteria andCODG_DELITEqualTo(String value)
        {
            addCriterion("CODG_DELIT =", value, "CODG_DELIT");
            return this;
        }

        public Criteria andCODG_DELITNotEqualTo(String value)
        {
            addCriterion("CODG_DELIT <>", value, "CODG_DELIT");
            return this;
        }

        public Criteria andCODG_DELITGreaterThan(String value)
        {
            addCriterion("CODG_DELIT >", value, "CODG_DELIT");
            return this;
        }

        public Criteria andCODG_DELITGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_DELIT >=", value, "CODG_DELIT");
            return this;
        }

        public Criteria andCODG_DELITLessThan(String value)
        {
            addCriterion("CODG_DELIT <", value, "CODG_DELIT");
            return this;
        }

        public Criteria andCODG_DELITLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_DELIT <=", value, "CODG_DELIT");
            return this;
        }

        public Criteria andCODG_DELITLike(String value)
        {
            addCriterion("CODG_DELIT like", value, "CODG_DELIT");
            return this;
        }

        public Criteria andCODG_DELITNotLike(String value)
        {
            addCriterion("CODG_DELIT not like", value, "CODG_DELIT");
            return this;
        }

        public Criteria andCODG_DELITIn(List values)
        {
            addCriterion("CODG_DELIT in", values, "CODG_DELIT");
            return this;
        }

        public Criteria andCODG_DELITNotIn(List values)
        {
            addCriterion("CODG_DELIT not in", values, "CODG_DELIT");
            return this;
        }

        public Criteria andCODG_DELITBetween(String value1, String value2)
        {
            addCriterion("CODG_DELIT between", value1, value2, "CODG_DELIT");
            return this;
        }

        public Criteria andCODG_DELITNotBetween(String value1, String value2)
        {
            addCriterion("CODG_DELIT not between", value1, value2, "CODG_DELIT");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_CORRESP_BOLETINIsNull()
        {
            criteriaWithoutValue.add("CODG_CORRESP_BOLETIN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_CORRESP_BOLETINIsNotNull()
        {
            criteriaWithoutValue.add("CODG_CORRESP_BOLETIN is not null");
            return this;
        }

        public Criteria andCODG_CORRESP_BOLETINEqualTo(String value)
        {
            addCriterion("CODG_CORRESP_BOLETIN =", value, "CODG_CORRESP_BOLETIN");
            return this;
        }

        public Criteria andCODG_CORRESP_BOLETINNotEqualTo(String value)
        {
            addCriterion("CODG_CORRESP_BOLETIN <>", value, "CODG_CORRESP_BOLETIN");
            return this;
        }

        public Criteria andCODG_CORRESP_BOLETINGreaterThan(String value)
        {
            addCriterion("CODG_CORRESP_BOLETIN >", value, "CODG_CORRESP_BOLETIN");
            return this;
        }

        public Criteria andCODG_CORRESP_BOLETINGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_CORRESP_BOLETIN >=", value, "CODG_CORRESP_BOLETIN");
            return this;
        }

        public Criteria andCODG_CORRESP_BOLETINLessThan(String value)
        {
            addCriterion("CODG_CORRESP_BOLETIN <", value, "CODG_CORRESP_BOLETIN");
            return this;
        }

        public Criteria andCODG_CORRESP_BOLETINLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_CORRESP_BOLETIN <=", value, "CODG_CORRESP_BOLETIN");
            return this;
        }

        public Criteria andCODG_CORRESP_BOLETINLike(String value)
        {
            addCriterion("CODG_CORRESP_BOLETIN like", value, "CODG_CORRESP_BOLETIN");
            return this;
        }

        public Criteria andCODG_CORRESP_BOLETINNotLike(String value)
        {
            addCriterion("CODG_CORRESP_BOLETIN not like", value, "CODG_CORRESP_BOLETIN");
            return this;
        }

        public Criteria andCODG_CORRESP_BOLETINIn(List values)
        {
            addCriterion("CODG_CORRESP_BOLETIN in", values, "CODG_CORRESP_BOLETIN");
            return this;
        }

        public Criteria andCODG_CORRESP_BOLETINNotIn(List values)
        {
            addCriterion("CODG_CORRESP_BOLETIN not in", values, "CODG_CORRESP_BOLETIN");
            return this;
        }

        public Criteria andCODG_CORRESP_BOLETINBetween(String value1, String value2)
        {
            addCriterion("CODG_CORRESP_BOLETIN between", value1, value2, "CODG_CORRESP_BOLETIN");
            return this;
        }

        public Criteria andCODG_CORRESP_BOLETINNotBetween(String value1, String value2)
        {
            addCriterion("CODG_CORRESP_BOLETIN not between", value1, value2, "CODG_CORRESP_BOLETIN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_MOTIVO_NO_BOLETINIsNull()
        {
            criteriaWithoutValue.add("CODG_MOTIVO_NO_BOLETIN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_MOTIVO_NO_BOLETINIsNotNull()
        {
            criteriaWithoutValue.add("CODG_MOTIVO_NO_BOLETIN is not null");
            return this;
        }

        public Criteria andCODG_MOTIVO_NO_BOLETINEqualTo(String value)
        {
            addCriterion("CODG_MOTIVO_NO_BOLETIN =", value, "CODG_MOTIVO_NO_BOLETIN");
            return this;
        }

        public Criteria andCODG_MOTIVO_NO_BOLETINNotEqualTo(String value)
        {
            addCriterion("CODG_MOTIVO_NO_BOLETIN <>", value, "CODG_MOTIVO_NO_BOLETIN");
            return this;
        }

        public Criteria andCODG_MOTIVO_NO_BOLETINGreaterThan(String value)
        {
            addCriterion("CODG_MOTIVO_NO_BOLETIN >", value, "CODG_MOTIVO_NO_BOLETIN");
            return this;
        }

        public Criteria andCODG_MOTIVO_NO_BOLETINGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_MOTIVO_NO_BOLETIN >=", value, "CODG_MOTIVO_NO_BOLETIN");
            return this;
        }

        public Criteria andCODG_MOTIVO_NO_BOLETINLessThan(String value)
        {
            addCriterion("CODG_MOTIVO_NO_BOLETIN <", value, "CODG_MOTIVO_NO_BOLETIN");
            return this;
        }

        public Criteria andCODG_MOTIVO_NO_BOLETINLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_MOTIVO_NO_BOLETIN <=", value, "CODG_MOTIVO_NO_BOLETIN");
            return this;
        }

        public Criteria andCODG_MOTIVO_NO_BOLETINLike(String value)
        {
            addCriterion("CODG_MOTIVO_NO_BOLETIN like", value, "CODG_MOTIVO_NO_BOLETIN");
            return this;
        }

        public Criteria andCODG_MOTIVO_NO_BOLETINNotLike(String value)
        {
            addCriterion("CODG_MOTIVO_NO_BOLETIN not like", value, "CODG_MOTIVO_NO_BOLETIN");
            return this;
        }

        public Criteria andCODG_MOTIVO_NO_BOLETINIn(List values)
        {
            addCriterion("CODG_MOTIVO_NO_BOLETIN in", values, "CODG_MOTIVO_NO_BOLETIN");
            return this;
        }

        public Criteria andCODG_MOTIVO_NO_BOLETINNotIn(List values)
        {
            addCriterion("CODG_MOTIVO_NO_BOLETIN not in", values, "CODG_MOTIVO_NO_BOLETIN");
            return this;
        }

        public Criteria andCODG_MOTIVO_NO_BOLETINBetween(String value1, String value2)
        {
            addCriterion("CODG_MOTIVO_NO_BOLETIN between", value1, value2, "CODG_MOTIVO_NO_BOLETIN");
            return this;
        }

        public Criteria andCODG_MOTIVO_NO_BOLETINNotBetween(String value1, String value2)
        {
            addCriterion("CODG_MOTIVO_NO_BOLETIN not between", value1, value2, "CODG_MOTIVO_NO_BOLETIN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_MOTIVO_NO_BOLETINIsNull()
        {
            criteriaWithoutValue.add("DESC_MOTIVO_NO_BOLETIN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_MOTIVO_NO_BOLETINIsNotNull()
        {
            criteriaWithoutValue.add("DESC_MOTIVO_NO_BOLETIN is not null");
            return this;
        }

        public Criteria andDESC_MOTIVO_NO_BOLETINEqualTo(String value)
        {
            addCriterion("DESC_MOTIVO_NO_BOLETIN =", value, "DESC_MOTIVO_NO_BOLETIN");
            return this;
        }

        public Criteria andDESC_MOTIVO_NO_BOLETINNotEqualTo(String value)
        {
            addCriterion("DESC_MOTIVO_NO_BOLETIN <>", value, "DESC_MOTIVO_NO_BOLETIN");
            return this;
        }

        public Criteria andDESC_MOTIVO_NO_BOLETINGreaterThan(String value)
        {
            addCriterion("DESC_MOTIVO_NO_BOLETIN >", value, "DESC_MOTIVO_NO_BOLETIN");
            return this;
        }

        public Criteria andDESC_MOTIVO_NO_BOLETINGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_MOTIVO_NO_BOLETIN >=", value, "DESC_MOTIVO_NO_BOLETIN");
            return this;
        }

        public Criteria andDESC_MOTIVO_NO_BOLETINLessThan(String value)
        {
            addCriterion("DESC_MOTIVO_NO_BOLETIN <", value, "DESC_MOTIVO_NO_BOLETIN");
            return this;
        }

        public Criteria andDESC_MOTIVO_NO_BOLETINLessThanOrEqualTo(String value)
        {
            addCriterion("DESC_MOTIVO_NO_BOLETIN <=", value, "DESC_MOTIVO_NO_BOLETIN");
            return this;
        }

        public Criteria andDESC_MOTIVO_NO_BOLETINLike(String value)
        {
            addCriterion("DESC_MOTIVO_NO_BOLETIN like", value, "DESC_MOTIVO_NO_BOLETIN");
            return this;
        }

        public Criteria andDESC_MOTIVO_NO_BOLETINNotLike(String value)
        {
            addCriterion("DESC_MOTIVO_NO_BOLETIN not like", value, "DESC_MOTIVO_NO_BOLETIN");
            return this;
        }

        public Criteria andDESC_MOTIVO_NO_BOLETINIn(List values)
        {
            addCriterion("DESC_MOTIVO_NO_BOLETIN in", values, "DESC_MOTIVO_NO_BOLETIN");
            return this;
        }

        public Criteria andDESC_MOTIVO_NO_BOLETINNotIn(List values)
        {
            addCriterion("DESC_MOTIVO_NO_BOLETIN not in", values, "DESC_MOTIVO_NO_BOLETIN");
            return this;
        }

        public Criteria andDESC_MOTIVO_NO_BOLETINBetween(String value1, String value2)
        {
            addCriterion("DESC_MOTIVO_NO_BOLETIN between", value1, value2, "DESC_MOTIVO_NO_BOLETIN");
            return this;
        }

        public Criteria andDESC_MOTIVO_NO_BOLETINNotBetween(String value1, String value2)
        {
            addCriterion("DESC_MOTIVO_NO_BOLETIN not between", value1, value2, "DESC_MOTIVO_NO_BOLETIN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_ESTADO_CERT_BOLIsNull()
        {
            criteriaWithoutValue.add("CODG_ESTADO_CERT_BOL is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_ESTADO_CERT_BOLIsNotNull()
        {
            criteriaWithoutValue.add("CODG_ESTADO_CERT_BOL is not null");
            return this;
        }

        public Criteria andCODG_ESTADO_CERT_BOLEqualTo(String value)
        {
            addCriterion("CODG_ESTADO_CERT_BOL =", value, "CODG_ESTADO_CERT_BOL");
            return this;
        }

        public Criteria andCODG_ESTADO_CERT_BOLNotEqualTo(String value)
        {
            addCriterion("CODG_ESTADO_CERT_BOL <>", value, "CODG_ESTADO_CERT_BOL");
            return this;
        }

        public Criteria andCODG_ESTADO_CERT_BOLGreaterThan(String value)
        {
            addCriterion("CODG_ESTADO_CERT_BOL >", value, "CODG_ESTADO_CERT_BOL");
            return this;
        }

        public Criteria andCODG_ESTADO_CERT_BOLGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_ESTADO_CERT_BOL >=", value, "CODG_ESTADO_CERT_BOL");
            return this;
        }

        public Criteria andCODG_ESTADO_CERT_BOLLessThan(String value)
        {
            addCriterion("CODG_ESTADO_CERT_BOL <", value, "CODG_ESTADO_CERT_BOL");
            return this;
        }

        public Criteria andCODG_ESTADO_CERT_BOLLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_ESTADO_CERT_BOL <=", value, "CODG_ESTADO_CERT_BOL");
            return this;
        }

        public Criteria andCODG_ESTADO_CERT_BOLLike(String value)
        {
            addCriterion("CODG_ESTADO_CERT_BOL like", value, "CODG_ESTADO_CERT_BOL");
            return this;
        }

        public Criteria andCODG_ESTADO_CERT_BOLNotLike(String value)
        {
            addCriterion("CODG_ESTADO_CERT_BOL not like", value, "CODG_ESTADO_CERT_BOL");
            return this;
        }

        public Criteria andCODG_ESTADO_CERT_BOLIn(List values)
        {
            addCriterion("CODG_ESTADO_CERT_BOL in", values, "CODG_ESTADO_CERT_BOL");
            return this;
        }

        public Criteria andCODG_ESTADO_CERT_BOLNotIn(List values)
        {
            addCriterion("CODG_ESTADO_CERT_BOL not in", values, "CODG_ESTADO_CERT_BOL");
            return this;
        }

        public Criteria andCODG_ESTADO_CERT_BOLBetween(String value1, String value2)
        {
            addCriterion("CODG_ESTADO_CERT_BOL between", value1, value2, "CODG_ESTADO_CERT_BOL");
            return this;
        }

        public Criteria andCODG_ESTADO_CERT_BOLNotBetween(String value1, String value2)
        {
            addCriterion("CODG_ESTADO_CERT_BOL not between", value1, value2, "CODG_ESTADO_CERT_BOL");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_USU_CREACIONIsNull()
        {
            criteriaWithoutValue.add("CODG_USU_CREACION is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_USU_CREACIONIsNotNull()
        {
            criteriaWithoutValue.add("CODG_USU_CREACION is not null");
            return this;
        }

        public Criteria andCODG_USU_CREACIONEqualTo(String value)
        {
            addCriterion("CODG_USU_CREACION =", value, "CODG_USU_CREACION");
            return this;
        }

        public Criteria andCODG_USU_CREACIONNotEqualTo(String value)
        {
            addCriterion("CODG_USU_CREACION <>", value, "CODG_USU_CREACION");
            return this;
        }

        public Criteria andCODG_USU_CREACIONGreaterThan(String value)
        {
            addCriterion("CODG_USU_CREACION >", value, "CODG_USU_CREACION");
            return this;
        }

        public Criteria andCODG_USU_CREACIONGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_USU_CREACION >=", value, "CODG_USU_CREACION");
            return this;
        }

        public Criteria andCODG_USU_CREACIONLessThan(String value)
        {
            addCriterion("CODG_USU_CREACION <", value, "CODG_USU_CREACION");
            return this;
        }

        public Criteria andCODG_USU_CREACIONLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_USU_CREACION <=", value, "CODG_USU_CREACION");
            return this;
        }

        public Criteria andCODG_USU_CREACIONLike(String value)
        {
            addCriterion("CODG_USU_CREACION like", value, "CODG_USU_CREACION");
            return this;
        }

        public Criteria andCODG_USU_CREACIONNotLike(String value)
        {
            addCriterion("CODG_USU_CREACION not like", value, "CODG_USU_CREACION");
            return this;
        }

        public Criteria andCODG_USU_CREACIONIn(List values)
        {
            addCriterion("CODG_USU_CREACION in", values, "CODG_USU_CREACION");
            return this;
        }

        public Criteria andCODG_USU_CREACIONNotIn(List values)
        {
            addCriterion("CODG_USU_CREACION not in", values, "CODG_USU_CREACION");
            return this;
        }

        public Criteria andCODG_USU_CREACIONBetween(String value1, String value2)
        {
            addCriterion("CODG_USU_CREACION between", value1, value2, "CODG_USU_CREACION");
            return this;
        }

        public Criteria andCODG_USU_CREACIONNotBetween(String value1, String value2)
        {
            addCriterion("CODG_USU_CREACION not between", value1, value2, "CODG_USU_CREACION");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_CREACIONIsNull()
        {
            criteriaWithoutValue.add("FECH_CREACION is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_CREACIONIsNotNull()
        {
            criteriaWithoutValue.add("FECH_CREACION is not null");
            return this;
        }

        public Criteria andFECH_CREACIONEqualTo(Date value)
        {
            addCriterion("FECH_CREACION =", value, "FECH_CREACION");
            return this;
        }

        public Criteria andFECH_CREACIONNotEqualTo(Date value)
        {
            addCriterion("FECH_CREACION <>", value, "FECH_CREACION");
            return this;
        }

        public Criteria andFECH_CREACIONGreaterThan(Date value)
        {
            addCriterion("FECH_CREACION >", value, "FECH_CREACION");
            return this;
        }

        public Criteria andFECH_CREACIONGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FECH_CREACION >=", value, "FECH_CREACION");
            return this;
        }

        public Criteria andFECH_CREACIONLessThan(Date value)
        {
            addCriterion("FECH_CREACION <", value, "FECH_CREACION");
            return this;
        }

        public Criteria andFECH_CREACIONLessThanOrEqualTo(Date value)
        {
            addCriterion("FECH_CREACION <=", value, "FECH_CREACION");
            return this;
        }

        public Criteria andFECH_CREACIONIn(List values)
        {
            addCriterion("FECH_CREACION in", values, "FECH_CREACION");
            return this;
        }

        public Criteria andFECH_CREACIONNotIn(List values)
        {
            addCriterion("FECH_CREACION not in", values, "FECH_CREACION");
            return this;
        }

        public Criteria andFECH_CREACIONBetween(Date value1, Date value2)
        {
            addCriterion("FECH_CREACION between", value1, value2, "FECH_CREACION");
            return this;
        }

        public Criteria andFECH_CREACIONNotBetween(Date value1, Date value2)
        {
            addCriterion("FECH_CREACION not between", value1, value2, "FECH_CREACION");
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


    public CertificadoBoletinExample()
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
