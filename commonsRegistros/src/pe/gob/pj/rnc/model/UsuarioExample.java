// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   UsuarioExample.java

package pe.gob.pj.rnc.model;

import java.util.*;

public class UsuarioExample
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
        public Criteria andCODG_USUARIsNull()
        {
            criteriaWithoutValue.add("CODG_USUAR is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_USUARIsNotNull()
        {
            criteriaWithoutValue.add("CODG_USUAR is not null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_NUMDOCIDTEqualTo(String value)
        {
            addCriterion("C_NUMDOCIDT =", value, "C_NUMDOCIDT");
            return this;
        }
        public Criteria andCODG_USUAREqualTo(String value)
        {
            addCriterion("CODG_USUAR =", value, "CODG_USUAR");
            return this;
        }

        public Criteria andCODG_USUARNotEqualTo(String value)
        {
            addCriterion("CODG_USUAR <>", value, "CODG_USUAR");
            return this;
        }

        public Criteria andCODG_USUARGreaterThan(String value)
        {
            addCriterion("CODG_USUAR >", value, "CODG_USUAR");
            return this;
        }

        public Criteria andCODG_USUARGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_USUAR >=", value, "CODG_USUAR");
            return this;
        }

        public Criteria andCODG_USUARLessThan(String value)
        {
            addCriterion("CODG_USUAR <", value, "CODG_USUAR");
            return this;
        }

        public Criteria andCODG_USUARLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_USUAR <=", value, "CODG_USUAR");
            return this;
        }

        public Criteria andCODG_USUARLike(String value)
        {
            addCriterion("CODG_USUAR like", value, "CODG_USUAR");
            return this;
        }

        public Criteria andCODG_USUARNotLike(String value)
        {
            addCriterion("CODG_USUAR not like", value, "CODG_USUAR");
            return this;
        }

        public Criteria andCODG_USUARIn(List values)
        {
            addCriterion("CODG_USUAR in", values, "CODG_USUAR");
            return this;
        }

        public Criteria andCODG_USUARNotIn(List values)
        {
            addCriterion("CODG_USUAR not in", values, "CODG_USUAR");
            return this;
        }

        public Criteria andCODG_USUARBetween(String value1, String value2)
        {
            addCriterion("CODG_USUAR between", value1, value2, "CODG_USUAR");
            return this;
        }

        public Criteria andCODG_USUARNotBetween(String value1, String value2)
        {
            addCriterion("CODG_USUAR not between", value1, value2, "CODG_USUAR");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_TIPOIsNull()
        {
            criteriaWithoutValue.add("CODG_TIPO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_TIPOIsNotNull()
        {
            criteriaWithoutValue.add("CODG_TIPO is not null");
            return this;
        }

        public Criteria andCODG_TIPOEqualTo(String value)
        {
            addCriterion("CODG_TIPO =", value, "CODG_TIPO");
            return this;
        }

        public Criteria andCODG_TIPONotEqualTo(String value)
        {
            addCriterion("CODG_TIPO <>", value, "CODG_TIPO");
            return this;
        }

        public Criteria andCODG_TIPOGreaterThan(String value)
        {
            addCriterion("CODG_TIPO >", value, "CODG_TIPO");
            return this;
        }

        public Criteria andCODG_TIPOGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_TIPO >=", value, "CODG_TIPO");
            return this;
        }

        public Criteria andCODG_TIPOLessThan(String value)
        {
            addCriterion("CODG_TIPO <", value, "CODG_TIPO");
            return this;
        }

        public Criteria andCODG_TIPOLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_TIPO <=", value, "CODG_TIPO");
            return this;
        }

        public Criteria andCODG_TIPOLike(String value)
        {
            addCriterion("CODG_TIPO like", value, "CODG_TIPO");
            return this;
        }

        public Criteria andCODG_TIPONotLike(String value)
        {
            addCriterion("CODG_TIPO not like", value, "CODG_TIPO");
            return this;
        }

        public Criteria andCODG_TIPOIn(List values)
        {
            addCriterion("CODG_TIPO in", values, "CODG_TIPO");
            return this;
        }

        public Criteria andCODG_TIPONotIn(List values)
        {
            addCriterion("CODG_TIPO not in", values, "CODG_TIPO");
            return this;
        }

        public Criteria andCODG_TIPOBetween(String value1, String value2)
        {
            addCriterion("CODG_TIPO between", value1, value2, "CODG_TIPO");
            return this;
        }

        public Criteria andCODG_TIPONotBetween(String value1, String value2)
        {
            addCriterion("CODG_TIPO not between", value1, value2, "CODG_TIPO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNOMB_USUARIsNull()
        {
            criteriaWithoutValue.add("NOMB_USUAR is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNOMB_USUARIsNotNull()
        {
            criteriaWithoutValue.add("NOMB_USUAR is not null");
            return this;
        }

        public Criteria andNOMB_USUAREqualTo(String value)
        {
            addCriterion("NOMB_USUAR =", value, "NOMB_USUAR");
            return this;
        }

        public Criteria andNOMB_USUARNotEqualTo(String value)
        {
            addCriterion("NOMB_USUAR <>", value, "NOMB_USUAR");
            return this;
        }

        public Criteria andNOMB_USUARGreaterThan(String value)
        {
            addCriterion("NOMB_USUAR >", value, "NOMB_USUAR");
            return this;
        }

        public Criteria andNOMB_USUARGreaterThanOrEqualTo(String value)
        {
            addCriterion("NOMB_USUAR >=", value, "NOMB_USUAR");
            return this;
        }

        public Criteria andNOMB_USUARLessThan(String value)
        {
            addCriterion("NOMB_USUAR <", value, "NOMB_USUAR");
            return this;
        }

        public Criteria andNOMB_USUARLessThanOrEqualTo(String value)
        {
            addCriterion("NOMB_USUAR <=", value, "NOMB_USUAR");
            return this;
        }

        public Criteria andNOMB_USUARLike(String value)
        {
            addCriterion("NOMB_USUAR like", value, "NOMB_USUAR");
            return this;
        }

        public Criteria andNOMB_USUARNotLike(String value)
        {
            addCriterion("NOMB_USUAR not like", value, "NOMB_USUAR");
            return this;
        }

        public Criteria andNOMB_USUARIn(List values)
        {
            addCriterion("NOMB_USUAR in", values, "NOMB_USUAR");
            return this;
        }

        public Criteria andNOMB_USUARNotIn(List values)
        {
            addCriterion("NOMB_USUAR not in", values, "NOMB_USUAR");
            return this;
        }

        public Criteria andNOMB_USUARBetween(String value1, String value2)
        {
            addCriterion("NOMB_USUAR between", value1, value2, "NOMB_USUAR");
            return this;
        }

        public Criteria andNOMB_USUARNotBetween(String value1, String value2)
        {
            addCriterion("NOMB_USUAR not between", value1, value2, "NOMB_USUAR");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andAPLL_USUARIsNull()
        {
            criteriaWithoutValue.add("APLL_USUAR is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andAPLL_USUARIsNotNull()
        {
            criteriaWithoutValue.add("APLL_USUAR is not null");
            return this;
        }

        public Criteria andAPLL_USUAREqualTo(String value)
        {
            addCriterion("APLL_USUAR =", value, "APLL_USUAR");
            return this;
        }

        public Criteria andAPLL_USUARNotEqualTo(String value)
        {
            addCriterion("APLL_USUAR <>", value, "APLL_USUAR");
            return this;
        }

        public Criteria andAPLL_USUARGreaterThan(String value)
        {
            addCriterion("APLL_USUAR >", value, "APLL_USUAR");
            return this;
        }

        public Criteria andAPLL_USUARGreaterThanOrEqualTo(String value)
        {
            addCriterion("APLL_USUAR >=", value, "APLL_USUAR");
            return this;
        }

        public Criteria andAPLL_USUARLessThan(String value)
        {
            addCriterion("APLL_USUAR <", value, "APLL_USUAR");
            return this;
        }

        public Criteria andAPLL_USUARLessThanOrEqualTo(String value)
        {
            addCriterion("APLL_USUAR <=", value, "APLL_USUAR");
            return this;
        }

        public Criteria andAPLL_USUARLike(String value)
        {
            addCriterion("APLL_USUAR like", value, "APLL_USUAR");
            return this;
        }

        public Criteria andAPLL_USUARNotLike(String value)
        {
            addCriterion("APLL_USUAR not like", value, "APLL_USUAR");
            return this;
        }

        public Criteria andAPLL_USUARIn(List values)
        {
            addCriterion("APLL_USUAR in", values, "APLL_USUAR");
            return this;
        }

        public Criteria andAPLL_USUARNotIn(List values)
        {
            addCriterion("APLL_USUAR not in", values, "APLL_USUAR");
            return this;
        }

        public Criteria andAPLL_USUARBetween(String value1, String value2)
        {
            addCriterion("APLL_USUAR between", value1, value2, "APLL_USUAR");
            return this;
        }

        public Criteria andAPLL_USUARNotBetween(String value1, String value2)
        {
            addCriterion("APLL_USUAR not between", value1, value2, "APLL_USUAR");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andESTD_USUARIsNull()
        {
            criteriaWithoutValue.add("ESTD_USUAR is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andESTD_USUARIsNotNull()
        {
            criteriaWithoutValue.add("ESTD_USUAR is not null");
            return this;
        }

        public Criteria andESTD_USUAREqualTo(String value)
        {
            addCriterion("ESTD_USUAR =", value, "ESTD_USUAR");
            return this;
        }

        public Criteria andESTD_USUARNotEqualTo(String value)
        {
            addCriterion("ESTD_USUAR <>", value, "ESTD_USUAR");
            return this;
        }

        public Criteria andESTD_USUARGreaterThan(String value)
        {
            addCriterion("ESTD_USUAR >", value, "ESTD_USUAR");
            return this;
        }

        public Criteria andESTD_USUARGreaterThanOrEqualTo(String value)
        {
            addCriterion("ESTD_USUAR >=", value, "ESTD_USUAR");
            return this;
        }

        public Criteria andESTD_USUARLessThan(String value)
        {
            addCriterion("ESTD_USUAR <", value, "ESTD_USUAR");
            return this;
        }

        public Criteria andESTD_USUARLessThanOrEqualTo(String value)
        {
            addCriterion("ESTD_USUAR <=", value, "ESTD_USUAR");
            return this;
        }

        public Criteria andESTD_USUARLike(String value)
        {
            addCriterion("ESTD_USUAR like", value, "ESTD_USUAR");
            return this;
        }

        public Criteria andESTD_USUARNotLike(String value)
        {
            addCriterion("ESTD_USUAR not like", value, "ESTD_USUAR");
            return this;
        }

        public Criteria andESTD_USUARIn(List values)
        {
            addCriterion("ESTD_USUAR in", values, "ESTD_USUAR");
            return this;
        }

        public Criteria andESTD_USUARNotIn(List values)
        {
            addCriterion("ESTD_USUAR not in", values, "ESTD_USUAR");
            return this;
        }

        public Criteria andESTD_USUARBetween(String value1, String value2)
        {
            addCriterion("ESTD_USUAR between", value1, value2, "ESTD_USUAR");
            return this;
        }

        public Criteria andESTD_USUARNotBetween(String value1, String value2)
        {
            addCriterion("ESTD_USUAR not between", value1, value2, "ESTD_USUAR");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andPREF_USUARIsNull()
        {
            criteriaWithoutValue.add("PREF_USUAR is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andPREF_USUARIsNotNull()
        {
            criteriaWithoutValue.add("PREF_USUAR is not null");
            return this;
        }

        public Criteria andPREF_USUAREqualTo(String value)
        {
            addCriterion("PREF_USUAR =", value, "PREF_USUAR");
            return this;
        }

        public Criteria andPREF_USUARNotEqualTo(String value)
        {
            addCriterion("PREF_USUAR <>", value, "PREF_USUAR");
            return this;
        }

        public Criteria andPREF_USUARGreaterThan(String value)
        {
            addCriterion("PREF_USUAR >", value, "PREF_USUAR");
            return this;
        }

        public Criteria andPREF_USUARGreaterThanOrEqualTo(String value)
        {
            addCriterion("PREF_USUAR >=", value, "PREF_USUAR");
            return this;
        }

        public Criteria andPREF_USUARLessThan(String value)
        {
            addCriterion("PREF_USUAR <", value, "PREF_USUAR");
            return this;
        }

        public Criteria andPREF_USUARLessThanOrEqualTo(String value)
        {
            addCriterion("PREF_USUAR <=", value, "PREF_USUAR");
            return this;
        }

        public Criteria andPREF_USUARLike(String value)
        {
            addCriterion("PREF_USUAR like", value, "PREF_USUAR");
            return this;
        }

        public Criteria andPREF_USUARNotLike(String value)
        {
            addCriterion("PREF_USUAR not like", value, "PREF_USUAR");
            return this;
        }

        public Criteria andPREF_USUARIn(List values)
        {
            addCriterion("PREF_USUAR in", values, "PREF_USUAR");
            return this;
        }

        public Criteria andPREF_USUARNotIn(List values)
        {
            addCriterion("PREF_USUAR not in", values, "PREF_USUAR");
            return this;
        }

        public Criteria andPREF_USUARBetween(String value1, String value2)
        {
            addCriterion("PREF_USUAR between", value1, value2, "PREF_USUAR");
            return this;
        }

        public Criteria andPREF_USUARNotBetween(String value1, String value2)
        {
            addCriterion("PREF_USUAR not between", value1, value2, "PREF_USUAR");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCONE_USUARIsNull()
        {
            criteriaWithoutValue.add("CONE_USUAR is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCONE_USUARIsNotNull()
        {
            criteriaWithoutValue.add("CONE_USUAR is not null");
            return this;
        }

        public Criteria andCONE_USUAREqualTo(String value)
        {
            addCriterion("CONE_USUAR =", value, "CONE_USUAR");
            return this;
        }

        public Criteria andCONE_USUARNotEqualTo(String value)
        {
            addCriterion("CONE_USUAR <>", value, "CONE_USUAR");
            return this;
        }

        public Criteria andCONE_USUARGreaterThan(String value)
        {
            addCriterion("CONE_USUAR >", value, "CONE_USUAR");
            return this;
        }

        public Criteria andCONE_USUARGreaterThanOrEqualTo(String value)
        {
            addCriterion("CONE_USUAR >=", value, "CONE_USUAR");
            return this;
        }

        public Criteria andCONE_USUARLessThan(String value)
        {
            addCriterion("CONE_USUAR <", value, "CONE_USUAR");
            return this;
        }

        public Criteria andCONE_USUARLessThanOrEqualTo(String value)
        {
            addCriterion("CONE_USUAR <=", value, "CONE_USUAR");
            return this;
        }

        public Criteria andCONE_USUARLike(String value)
        {
            addCriterion("CONE_USUAR like", value, "CONE_USUAR");
            return this;
        }

        public Criteria andCONE_USUARNotLike(String value)
        {
            addCriterion("CONE_USUAR not like", value, "CONE_USUAR");
            return this;
        }

        public Criteria andCONE_USUARIn(List values)
        {
            addCriterion("CONE_USUAR in", values, "CONE_USUAR");
            return this;
        }

        public Criteria andCONE_USUARNotIn(List values)
        {
            addCriterion("CONE_USUAR not in", values, "CONE_USUAR");
            return this;
        }

        public Criteria andCONE_USUARBetween(String value1, String value2)
        {
            addCriterion("CONE_USUAR between", value1, value2, "CONE_USUAR");
            return this;
        }

        public Criteria andCONE_USUARNotBetween(String value1, String value2)
        {
            addCriterion("CONE_USUAR not between", value1, value2, "CONE_USUAR");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_PERFILIsNull()
        {
            criteriaWithoutValue.add("C_PERFIL is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_PERFILIsNotNull()
        {
            criteriaWithoutValue.add("C_PERFIL is not null");
            return this;
        }

        public Criteria andC_PERFILEqualTo(String value)
        {
            addCriterion("C_PERFIL =", value, "C_PERFIL");
            return this;
        }

        public Criteria andC_PERFILNotEqualTo(String value)
        {
            addCriterion("C_PERFIL <>", value, "C_PERFIL");
            return this;
        }

        public Criteria andC_PERFILGreaterThan(String value)
        {
            addCriterion("C_PERFIL >", value, "C_PERFIL");
            return this;
        }

        public Criteria andC_PERFILGreaterThanOrEqualTo(String value)
        {
            addCriterion("C_PERFIL >=", value, "C_PERFIL");
            return this;
        }

        public Criteria andC_PERFILLessThan(String value)
        {
            addCriterion("C_PERFIL <", value, "C_PERFIL");
            return this;
        }

        public Criteria andC_PERFILLessThanOrEqualTo(String value)
        {
            addCriterion("C_PERFIL <=", value, "C_PERFIL");
            return this;
        }

        public Criteria andC_PERFILLike(String value)
        {
            addCriterion("C_PERFIL like", value, "C_PERFIL");
            return this;
        }

        public Criteria andC_PERFILNotLike(String value)
        {
            addCriterion("C_PERFIL not like", value, "C_PERFIL");
            return this;
        }

        public Criteria andC_PERFILIn(List values)
        {
            addCriterion("C_PERFIL in", values, "C_PERFIL");
            return this;
        }

        public Criteria andC_PERFILNotIn(List values)
        {
            addCriterion("C_PERFIL not in", values, "C_PERFIL");
            return this;
        }

        public Criteria andC_PERFILBetween(String value1, String value2)
        {
            addCriterion("C_PERFIL between", value1, value2, "C_PERFIL");
            return this;
        }

        public Criteria andC_PERFILNotBetween(String value1, String value2)
        {
            addCriterion("C_PERFIL not between", value1, value2, "C_PERFIL");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_CLAVEIsNull()
        {
            criteriaWithoutValue.add("C_CLAVE is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_CLAVEIsNotNull()
        {
            criteriaWithoutValue.add("C_CLAVE is not null");
            return this;
        }

        public Criteria andC_CLAVEEqualTo(String value)
        {
            addCriterion("C_CLAVE =", value, "C_CLAVE");
            return this;
        }

        public Criteria andC_CLAVENotEqualTo(String value)
        {
            addCriterion("C_CLAVE <>", value, "C_CLAVE");
            return this;
        }

        public Criteria andC_CLAVEGreaterThan(String value)
        {
            addCriterion("C_CLAVE >", value, "C_CLAVE");
            return this;
        }

        public Criteria andC_CLAVEGreaterThanOrEqualTo(String value)
        {
            addCriterion("C_CLAVE >=", value, "C_CLAVE");
            return this;
        }

        public Criteria andC_CLAVELessThan(String value)
        {
            addCriterion("C_CLAVE <", value, "C_CLAVE");
            return this;
        }

        public Criteria andC_CLAVELessThanOrEqualTo(String value)
        {
            addCriterion("C_CLAVE <=", value, "C_CLAVE");
            return this;
        }

        public Criteria andC_CLAVELike(String value)
        {
            addCriterion("C_CLAVE like", value, "C_CLAVE");
            return this;
        }

        public Criteria andC_CLAVENotLike(String value)
        {
            addCriterion("C_CLAVE not like", value, "C_CLAVE");
            return this;
        }

        public Criteria andC_CLAVEIn(List values)
        {
            addCriterion("C_CLAVE in", values, "C_CLAVE");
            return this;
        }

        public Criteria andC_CLAVENotIn(List values)
        {
            addCriterion("C_CLAVE not in", values, "C_CLAVE");
            return this;
        }

        public Criteria andC_CLAVEBetween(String value1, String value2)
        {
            addCriterion("C_CLAVE between", value1, value2, "C_CLAVE");
            return this;
        }

        public Criteria andC_CLAVENotBetween(String value1, String value2)
        {
            addCriterion("C_CLAVE not between", value1, value2, "C_CLAVE");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andL_DENTRYIsNull()
        {
            criteriaWithoutValue.add("L_DENTRY is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andL_DENTRYIsNotNull()
        {
            criteriaWithoutValue.add("L_DENTRY is not null");
            return this;
        }

        public Criteria andL_DENTRYEqualTo(String value)
        {
            addCriterion("L_DENTRY =", value, "L_DENTRY");
            return this;
        }

        public Criteria andL_DENTRYNotEqualTo(String value)
        {
            addCriterion("L_DENTRY <>", value, "L_DENTRY");
            return this;
        }

        public Criteria andL_DENTRYGreaterThan(String value)
        {
            addCriterion("L_DENTRY >", value, "L_DENTRY");
            return this;
        }

        public Criteria andL_DENTRYGreaterThanOrEqualTo(String value)
        {
            addCriterion("L_DENTRY >=", value, "L_DENTRY");
            return this;
        }

        public Criteria andL_DENTRYLessThan(String value)
        {
            addCriterion("L_DENTRY <", value, "L_DENTRY");
            return this;
        }

        public Criteria andL_DENTRYLessThanOrEqualTo(String value)
        {
            addCriterion("L_DENTRY <=", value, "L_DENTRY");
            return this;
        }

        public Criteria andL_DENTRYLike(String value)
        {
            addCriterion("L_DENTRY like", value, "L_DENTRY");
            return this;
        }

        public Criteria andL_DENTRYNotLike(String value)
        {
            addCriterion("L_DENTRY not like", value, "L_DENTRY");
            return this;
        }

        public Criteria andL_DENTRYIn(List values)
        {
            addCriterion("L_DENTRY in", values, "L_DENTRY");
            return this;
        }

        public Criteria andL_DENTRYNotIn(List values)
        {
            addCriterion("L_DENTRY not in", values, "L_DENTRY");
            return this;
        }

        public Criteria andL_DENTRYBetween(String value1, String value2)
        {
            addCriterion("L_DENTRY between", value1, value2, "L_DENTRY");
            return this;
        }

        public Criteria andL_DENTRYNotBetween(String value1, String value2)
        {
            addCriterion("L_DENTRY not between", value1, value2, "L_DENTRY");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_DISTRITOIsNull()
        {
            criteriaWithoutValue.add("C_DISTRITO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_DISTRITOIsNotNull()
        {
            criteriaWithoutValue.add("C_DISTRITO is not null");
            return this;
        }

        public Criteria andC_DISTRITOEqualTo(String value)
        {
            addCriterion("C_DISTRITO =", value, "C_DISTRITO");
            return this;
        }

        public Criteria andC_DISTRITONotEqualTo(String value)
        {
            addCriterion("C_DISTRITO <>", value, "C_DISTRITO");
            return this;
        }

        public Criteria andC_DISTRITOGreaterThan(String value)
        {
            addCriterion("C_DISTRITO >", value, "C_DISTRITO");
            return this;
        }

        public Criteria andC_DISTRITOGreaterThanOrEqualTo(String value)
        {
            addCriterion("C_DISTRITO >=", value, "C_DISTRITO");
            return this;
        }

        public Criteria andC_DISTRITOLessThan(String value)
        {
            addCriterion("C_DISTRITO <", value, "C_DISTRITO");
            return this;
        }

        public Criteria andC_DISTRITOLessThanOrEqualTo(String value)
        {
            addCriterion("C_DISTRITO <=", value, "C_DISTRITO");
            return this;
        }

        public Criteria andC_DISTRITOLike(String value)
        {
            addCriterion("C_DISTRITO like", value, "C_DISTRITO");
            return this;
        }

        public Criteria andC_DISTRITONotLike(String value)
        {
            addCriterion("C_DISTRITO not like", value, "C_DISTRITO");
            return this;
        }

        public Criteria andC_DISTRITOIn(List values)
        {
            addCriterion("C_DISTRITO in", values, "C_DISTRITO");
            return this;
        }

        public Criteria andC_DISTRITONotIn(List values)
        {
            addCriterion("C_DISTRITO not in", values, "C_DISTRITO");
            return this;
        }

        public Criteria andC_DISTRITOBetween(String value1, String value2)
        {
            addCriterion("C_DISTRITO between", value1, value2, "C_DISTRITO");
            return this;
        }

        public Criteria andC_DISTRITONotBetween(String value1, String value2)
        {
            addCriterion("C_DISTRITO not between", value1, value2, "C_DISTRITO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andL_TIP_CERTIFIsNull()
        {
            criteriaWithoutValue.add("L_TIP_CERTIF is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andL_TIP_CERTIFIsNotNull()
        {
            criteriaWithoutValue.add("L_TIP_CERTIF is not null");
            return this;
        }

        public Criteria andL_TIP_CERTIFEqualTo(String value)
        {
            addCriterion("L_TIP_CERTIF =", value, "L_TIP_CERTIF");
            return this;
        }

        public Criteria andL_TIP_CERTIFNotEqualTo(String value)
        {
            addCriterion("L_TIP_CERTIF <>", value, "L_TIP_CERTIF");
            return this;
        }

        public Criteria andL_TIP_CERTIFGreaterThan(String value)
        {
            addCriterion("L_TIP_CERTIF >", value, "L_TIP_CERTIF");
            return this;
        }

        public Criteria andL_TIP_CERTIFGreaterThanOrEqualTo(String value)
        {
            addCriterion("L_TIP_CERTIF >=", value, "L_TIP_CERTIF");
            return this;
        }

        public Criteria andL_TIP_CERTIFLessThan(String value)
        {
            addCriterion("L_TIP_CERTIF <", value, "L_TIP_CERTIF");
            return this;
        }

        public Criteria andL_TIP_CERTIFLessThanOrEqualTo(String value)
        {
            addCriterion("L_TIP_CERTIF <=", value, "L_TIP_CERTIF");
            return this;
        }

        public Criteria andL_TIP_CERTIFLike(String value)
        {
            addCriterion("L_TIP_CERTIF like", value, "L_TIP_CERTIF");
            return this;
        }

        public Criteria andL_TIP_CERTIFNotLike(String value)
        {
            addCriterion("L_TIP_CERTIF not like", value, "L_TIP_CERTIF");
            return this;
        }

        public Criteria andL_TIP_CERTIFIn(List values)
        {
            addCriterion("L_TIP_CERTIF in", values, "L_TIP_CERTIF");
            return this;
        }

        public Criteria andL_TIP_CERTIFNotIn(List values)
        {
            addCriterion("L_TIP_CERTIF not in", values, "L_TIP_CERTIF");
            return this;
        }

        public Criteria andL_TIP_CERTIFBetween(String value1, String value2)
        {
            addCriterion("L_TIP_CERTIF between", value1, value2, "L_TIP_CERTIF");
            return this;
        }

        public Criteria andL_TIP_CERTIFNotBetween(String value1, String value2)
        {
            addCriterion("L_TIP_CERTIF not between", value1, value2, "L_TIP_CERTIF");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_DISTRITO_JUDICIALIsNull()
        {
            criteriaWithoutValue.add("CODG_DISTRITO_JUDICIAL is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_DISTRITO_JUDICIALIsNotNull()
        {
            criteriaWithoutValue.add("CODG_DISTRITO_JUDICIAL is not null");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALEqualTo(String value)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL =", value, "CODG_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALNotEqualTo(String value)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL <>", value, "CODG_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALGreaterThan(String value)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL >", value, "CODG_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL >=", value, "CODG_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALLessThan(String value)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL <", value, "CODG_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL <=", value, "CODG_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALLike(String value)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL like", value, "CODG_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALNotLike(String value)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL not like", value, "CODG_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALIn(List values)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL in", values, "CODG_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALNotIn(List values)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL not in", values, "CODG_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALBetween(String value1, String value2)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL between", value1, value2, "CODG_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andCODG_DISTRITO_JUDICIALNotBetween(String value1, String value2)
        {
            addCriterion("CODG_DISTRITO_JUDICIAL not between", value1, value2, "CODG_DISTRITO_JUDICIAL");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_NACIMIENTOIsNull()
        {
            criteriaWithoutValue.add("FECH_NACIMIENTO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_NACIMIENTOIsNotNull()
        {
            criteriaWithoutValue.add("FECH_NACIMIENTO is not null");
            return this;
        }

        public Criteria andFECH_NACIMIENTOEqualTo(Date value)
        {
            addCriterion("FECH_NACIMIENTO =", value, "FECH_NACIMIENTO");
            return this;
        }

        public Criteria andFECH_NACIMIENTONotEqualTo(Date value)
        {
            addCriterion("FECH_NACIMIENTO <>", value, "FECH_NACIMIENTO");
            return this;
        }

        public Criteria andFECH_NACIMIENTOGreaterThan(Date value)
        {
            addCriterion("FECH_NACIMIENTO >", value, "FECH_NACIMIENTO");
            return this;
        }

        public Criteria andFECH_NACIMIENTOGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FECH_NACIMIENTO >=", value, "FECH_NACIMIENTO");
            return this;
        }

        public Criteria andFECH_NACIMIENTOLessThan(Date value)
        {
            addCriterion("FECH_NACIMIENTO <", value, "FECH_NACIMIENTO");
            return this;
        }

        public Criteria andFECH_NACIMIENTOLessThanOrEqualTo(Date value)
        {
            addCriterion("FECH_NACIMIENTO <=", value, "FECH_NACIMIENTO");
            return this;
        }

        public Criteria andFECH_NACIMIENTOIn(List values)
        {
            addCriterion("FECH_NACIMIENTO in", values, "FECH_NACIMIENTO");
            return this;
        }

        public Criteria andFECH_NACIMIENTONotIn(List values)
        {
            addCriterion("FECH_NACIMIENTO not in", values, "FECH_NACIMIENTO");
            return this;
        }

        public Criteria andFECH_NACIMIENTOBetween(Date value1, Date value2)
        {
            addCriterion("FECH_NACIMIENTO between", value1, value2, "FECH_NACIMIENTO");
            return this;
        }

        public Criteria andFECH_NACIMIENTONotBetween(Date value1, Date value2)
        {
            addCriterion("FECH_NACIMIENTO not between", value1, value2, "FECH_NACIMIENTO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_DIRECCIONIsNull()
        {
            criteriaWithoutValue.add("DESC_DIRECCION is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_DIRECCIONIsNotNull()
        {
            criteriaWithoutValue.add("DESC_DIRECCION is not null");
            return this;
        }

        public Criteria andDESC_DIRECCIONEqualTo(String value)
        {
            addCriterion("DESC_DIRECCION =", value, "DESC_DIRECCION");
            return this;
        }

        public Criteria andDESC_DIRECCIONNotEqualTo(String value)
        {
            addCriterion("DESC_DIRECCION <>", value, "DESC_DIRECCION");
            return this;
        }

        public Criteria andDESC_DIRECCIONGreaterThan(String value)
        {
            addCriterion("DESC_DIRECCION >", value, "DESC_DIRECCION");
            return this;
        }

        public Criteria andDESC_DIRECCIONGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_DIRECCION >=", value, "DESC_DIRECCION");
            return this;
        }

        public Criteria andDESC_DIRECCIONLessThan(String value)
        {
            addCriterion("DESC_DIRECCION <", value, "DESC_DIRECCION");
            return this;
        }

        public Criteria andDESC_DIRECCIONLessThanOrEqualTo(String value)
        {
            addCriterion("DESC_DIRECCION <=", value, "DESC_DIRECCION");
            return this;
        }

        public Criteria andDESC_DIRECCIONLike(String value)
        {
            addCriterion("DESC_DIRECCION like", value, "DESC_DIRECCION");
            return this;
        }

        public Criteria andDESC_DIRECCIONNotLike(String value)
        {
            addCriterion("DESC_DIRECCION not like", value, "DESC_DIRECCION");
            return this;
        }

        public Criteria andDESC_DIRECCIONIn(List values)
        {
            addCriterion("DESC_DIRECCION in", values, "DESC_DIRECCION");
            return this;
        }

        public Criteria andDESC_DIRECCIONNotIn(List values)
        {
            addCriterion("DESC_DIRECCION not in", values, "DESC_DIRECCION");
            return this;
        }

        public Criteria andDESC_DIRECCIONBetween(String value1, String value2)
        {
            addCriterion("DESC_DIRECCION between", value1, value2, "DESC_DIRECCION");
            return this;
        }

        public Criteria andDESC_DIRECCIONNotBetween(String value1, String value2)
        {
            addCriterion("DESC_DIRECCION not between", value1, value2, "DESC_DIRECCION");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_TELEFONOIsNull()
        {
            criteriaWithoutValue.add("NUMR_TELEFONO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_TELEFONOIsNotNull()
        {
            criteriaWithoutValue.add("NUMR_TELEFONO is not null");
            return this;
        }

        public Criteria andNUMR_TELEFONOEqualTo(Integer value)
        {
            addCriterion("NUMR_TELEFONO =", value, "NUMR_TELEFONO");
            return this;
        }

        public Criteria andNUMR_TELEFONONotEqualTo(Integer value)
        {
            addCriterion("NUMR_TELEFONO <>", value, "NUMR_TELEFONO");
            return this;
        }

        public Criteria andNUMR_TELEFONOGreaterThan(Integer value)
        {
            addCriterion("NUMR_TELEFONO >", value, "NUMR_TELEFONO");
            return this;
        }

        public Criteria andNUMR_TELEFONOGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("NUMR_TELEFONO >=", value, "NUMR_TELEFONO");
            return this;
        }

        public Criteria andNUMR_TELEFONOLessThan(Integer value)
        {
            addCriterion("NUMR_TELEFONO <", value, "NUMR_TELEFONO");
            return this;
        }

        public Criteria andNUMR_TELEFONOLessThanOrEqualTo(Integer value)
        {
            addCriterion("NUMR_TELEFONO <=", value, "NUMR_TELEFONO");
            return this;
        }

        public Criteria andNUMR_TELEFONOIn(List values)
        {
            addCriterion("NUMR_TELEFONO in", values, "NUMR_TELEFONO");
            return this;
        }

        public Criteria andNUMR_TELEFONONotIn(List values)
        {
            addCriterion("NUMR_TELEFONO not in", values, "NUMR_TELEFONO");
            return this;
        }

        public Criteria andNUMR_TELEFONOBetween(Integer value1, Integer value2)
        {
            addCriterion("NUMR_TELEFONO between", value1, value2, "NUMR_TELEFONO");
            return this;
        }

        public Criteria andNUMR_TELEFONONotBetween(Integer value1, Integer value2)
        {
            addCriterion("NUMR_TELEFONO not between", value1, value2, "NUMR_TELEFONO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_CELULARIsNull()
        {
            criteriaWithoutValue.add("NUMR_CELULAR is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_CELULARIsNotNull()
        {
            criteriaWithoutValue.add("NUMR_CELULAR is not null");
            return this;
        }

        public Criteria andNUMR_CELULAREqualTo(Integer value)
        {
            addCriterion("NUMR_CELULAR =", value, "NUMR_CELULAR");
            return this;
        }

        public Criteria andNUMR_CELULARNotEqualTo(Integer value)
        {
            addCriterion("NUMR_CELULAR <>", value, "NUMR_CELULAR");
            return this;
        }

        public Criteria andNUMR_CELULARGreaterThan(Integer value)
        {
            addCriterion("NUMR_CELULAR >", value, "NUMR_CELULAR");
            return this;
        }

        public Criteria andNUMR_CELULARGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("NUMR_CELULAR >=", value, "NUMR_CELULAR");
            return this;
        }

        public Criteria andNUMR_CELULARLessThan(Integer value)
        {
            addCriterion("NUMR_CELULAR <", value, "NUMR_CELULAR");
            return this;
        }

        public Criteria andNUMR_CELULARLessThanOrEqualTo(Integer value)
        {
            addCriterion("NUMR_CELULAR <=", value, "NUMR_CELULAR");
            return this;
        }

        public Criteria andNUMR_CELULARIn(List values)
        {
            addCriterion("NUMR_CELULAR in", values, "NUMR_CELULAR");
            return this;
        }

        public Criteria andNUMR_CELULARNotIn(List values)
        {
            addCriterion("NUMR_CELULAR not in", values, "NUMR_CELULAR");
            return this;
        }

        public Criteria andNUMR_CELULARBetween(Integer value1, Integer value2)
        {
            addCriterion("NUMR_CELULAR between", value1, value2, "NUMR_CELULAR");
            return this;
        }

        public Criteria andNUMR_CELULARNotBetween(Integer value1, Integer value2)
        {
            addCriterion("NUMR_CELULAR not between", value1, value2, "NUMR_CELULAR");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_COREEOIsNull()
        {
            criteriaWithoutValue.add("DESC_COREEO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_COREEOIsNotNull()
        {
            criteriaWithoutValue.add("DESC_COREEO is not null");
            return this;
        }

        public Criteria andDESC_COREEOEqualTo(String value)
        {
            addCriterion("DESC_COREEO =", value, "DESC_COREEO");
            return this;
        }
        //Inicio erodriguezbu
        public Criteria andDESC_COREEOEqualToUpper(String value)
        {
            addCriterion("UPPER(DESC_COREEO) =", value.toUpperCase(), "DESC_COREEO");
            return this;
        }
        //Fin erodriguezbu
        public Criteria andDESC_COREEONotEqualTo(String value)
        {
            addCriterion("DESC_COREEO <>", value, "DESC_COREEO");
            return this;
        }

        public Criteria andDESC_COREEOGreaterThan(String value)
        {
            addCriterion("DESC_COREEO >", value, "DESC_COREEO");
            return this;
        }

        public Criteria andDESC_COREEOGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_COREEO >=", value, "DESC_COREEO");
            return this;
        }

        public Criteria andDESC_COREEOLessThan(String value)
        {
            addCriterion("DESC_COREEO <", value, "DESC_COREEO");
            return this;
        }

        public Criteria andDESC_COREEOLessThanOrEqualTo(String value)
        {
            addCriterion("DESC_COREEO <=", value, "DESC_COREEO");
            return this;
        }

        public Criteria andDESC_COREEOLike(String value)
        {
            addCriterion("DESC_COREEO like", value, "DESC_COREEO");
            return this;
        }

        public Criteria andDESC_COREEONotLike(String value)
        {
            addCriterion("DESC_COREEO not like", value, "DESC_COREEO");
            return this;
        }

        public Criteria andDESC_COREEOIn(List values)
        {
            addCriterion("DESC_COREEO in", values, "DESC_COREEO");
            return this;
        }

        public Criteria andDESC_COREEONotIn(List values)
        {
            addCriterion("DESC_COREEO not in", values, "DESC_COREEO");
            return this;
        }

        public Criteria andDESC_COREEOBetween(String value1, String value2)
        {
            addCriterion("DESC_COREEO between", value1, value2, "DESC_COREEO");
            return this;
        }

        public Criteria andDESC_COREEONotBetween(String value1, String value2)
        {
            addCriterion("DESC_COREEO not between", value1, value2, "DESC_COREEO");
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
        public Criteria andL_INGRESOIsNull()
        {
            criteriaWithoutValue.add("L_INGRESO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andL_INGRESOIsNotNull()
        {
            criteriaWithoutValue.add("L_INGRESO is not null");
            return this;
        }

        public Criteria andL_INGRESOEqualTo(String value)
        {
            addCriterion("L_INGRESO =", value, "L_INGRESO");
            return this;
        }

        public Criteria andL_INGRESONotEqualTo(String value)
        {
            addCriterion("L_INGRESO <>", value, "L_INGRESO");
            return this;
        }

        public Criteria andL_INGRESOGreaterThan(String value)
        {
            addCriterion("L_INGRESO >", value, "L_INGRESO");
            return this;
        }

        public Criteria andL_INGRESOGreaterThanOrEqualTo(String value)
        {
            addCriterion("L_INGRESO >=", value, "L_INGRESO");
            return this;
        }

        public Criteria andL_INGRESOLessThan(String value)
        {
            addCriterion("L_INGRESO <", value, "L_INGRESO");
            return this;
        }

        public Criteria andL_INGRESOLessThanOrEqualTo(String value)
        {
            addCriterion("L_INGRESO <=", value, "L_INGRESO");
            return this;
        }

        public Criteria andL_INGRESOLike(String value)
        {
            addCriterion("L_INGRESO like", value, "L_INGRESO");
            return this;
        }

        public Criteria andL_INGRESONotLike(String value)
        {
            addCriterion("L_INGRESO not like", value, "L_INGRESO");
            return this;
        }

        public Criteria andL_INGRESOIn(List values)
        {
            addCriterion("L_INGRESO in", values, "L_INGRESO");
            return this;
        }

        public Criteria andL_INGRESONotIn(List values)
        {
            addCriterion("L_INGRESO not in", values, "L_INGRESO");
            return this;
        }

        public Criteria andL_INGRESOBetween(String value1, String value2)
        {
            addCriterion("L_INGRESO between", value1, value2, "L_INGRESO");
            return this;
        }

        public Criteria andL_INGRESONotBetween(String value1, String value2)
        {
            addCriterion("L_INGRESO not between", value1, value2, "L_INGRESO");
            return this;
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
        public Criteria andDESC_TITULOIsNull()
        {
            criteriaWithoutValue.add("DESC_TITULO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_TITULOIsNotNull()
        {
            criteriaWithoutValue.add("DESC_TITULO is not null");
            return this;
        }

        public Criteria andDESC_TITULOEqualTo(String value)
        {
            addCriterion("DESC_TITULO =", value, "DESC_TITULO");
            return this;
        }

        public Criteria andDESC_TITULONotEqualTo(String value)
        {
            addCriterion("DESC_TITULO <>", value, "DESC_TITULO");
            return this;
        }

        public Criteria andDESC_TITULOGreaterThan(String value)
        {
            addCriterion("DESC_TITULO >", value, "DESC_TITULO");
            return this;
        }

        public Criteria andDESC_TITULOGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_TITULO >=", value, "DESC_TITULO");
            return this;
        }

        public Criteria andDESC_TITULOLessThan(String value)
        {
            addCriterion("DESC_TITULO <", value, "DESC_TITULO");
            return this;
        }

        public Criteria andDESC_TITULOLessThanOrEqualTo(String value)
        {
            addCriterion("DESC_TITULO <=", value, "DESC_TITULO");
            return this;
        }

        public Criteria andDESC_TITULOLike(String value)
        {
            addCriterion("DESC_TITULO like", value, "DESC_TITULO");
            return this;
        }

        public Criteria andDESC_TITULONotLike(String value)
        {
            addCriterion("DESC_TITULO not like", value, "DESC_TITULO");
            return this;
        }

        public Criteria andDESC_TITULOIn(List values)
        {
            addCriterion("DESC_TITULO in", values, "DESC_TITULO");
            return this;
        }

        public Criteria andDESC_TITULONotIn(List values)
        {
            addCriterion("DESC_TITULO not in", values, "DESC_TITULO");
            return this;
        }

        public Criteria andDESC_TITULOBetween(String value1, String value2)
        {
            addCriterion("DESC_TITULO between", value1, value2, "DESC_TITULO");
            return this;
        }

        public Criteria andDESC_TITULONotBetween(String value1, String value2)
        {
            addCriterion("DESC_TITULO not between", value1, value2, "DESC_TITULO");
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


    public UsuarioExample()
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
