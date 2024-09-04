// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BoletinExample.java

package pe.gob.pj.rnc.model;

import java.math.BigDecimal;
import java.util.*;

public class BoletinExample
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
		public Criteria andAPLL_PATER_BOLETNIsNull()
        {
            criteriaWithoutValue.add("APLL_PATER_BOLETN is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andAPLL_PATER_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("APLL_PATER_BOLETN is not null");
            return this;
        }

        public Criteria andAPLL_PATER_BOLETNEqualTo(String value)
        {
            addCriterion("APLL_PATER_BOLETN =", value, "APLL_PATER_BOLETN");
            return this;
        }

        public Criteria andAPLL_PATER_BOLETNNotEqualTo(String value)
        {
            addCriterion("APLL_PATER_BOLETN <>", value, "APLL_PATER_BOLETN");
            return this;
        }

        public Criteria andAPLL_PATER_BOLETNGreaterThan(String value)
        {
            addCriterion("APLL_PATER_BOLETN >", value, "APLL_PATER_BOLETN");
            return this;
        }

        public Criteria andAPLL_PATER_BOLETNGreaterThanOrEqualTo(String value)
        {
            addCriterion("APLL_PATER_BOLETN >=", value, "APLL_PATER_BOLETN");
            return this;
        }

        public Criteria andAPLL_PATER_BOLETNLessThan(String value)
        {
            addCriterion("APLL_PATER_BOLETN <", value, "APLL_PATER_BOLETN");
            return this;
        }

        public Criteria andAPLL_PATER_BOLETNLessThanOrEqualTo(String value)
        {
            addCriterion("APLL_PATER_BOLETN <=", value, "APLL_PATER_BOLETN");
            return this;
        }

        public Criteria andAPLL_PATER_BOLETNLike(String value)
        {
            addCriterion("APLL_PATER_BOLETN like", value, "APLL_PATER_BOLETN");
            return this;
        }

        public Criteria andAPLL_PATER_BOLETNNotLike(String value)
        {
            addCriterion("APLL_PATER_BOLETN not like", value, "APLL_PATER_BOLETN");
            return this;
        }

        public Criteria andAPLL_PATER_BOLETNIn(List values)
        {
            addCriterion("APLL_PATER_BOLETN in", values, "APLL_PATER_BOLETN");
            return this;
        }

        public Criteria andAPLL_PATER_BOLETNNotIn(List values)
        {
            addCriterion("APLL_PATER_BOLETN not in", values, "APLL_PATER_BOLETN");
            return this;
        }

        public Criteria andAPLL_PATER_BOLETNBetween(String value1, String value2)
        {
            addCriterion("APLL_PATER_BOLETN between", value1, value2, "APLL_PATER_BOLETN");
            return this;
        }

        public Criteria andAPLL_PATER_BOLETNNotBetween(String value1, String value2)
        {
            addCriterion("APLL_PATER_BOLETN not between", value1, value2, "APLL_PATER_BOLETN");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andAPLL_MATER_BOLETNIsNull()
        {
            criteriaWithoutValue.add("APLL_MATER_BOLETN is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andAPLL_MATER_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("APLL_MATER_BOLETN is not null");
            return this;
        }

        public Criteria andAPLL_MATER_BOLETNEqualTo(String value)
        {
            addCriterion("APLL_MATER_BOLETN =", value, "APLL_MATER_BOLETN");
            return this;
        }

        public Criteria andAPLL_MATER_BOLETNNotEqualTo(String value)
        {
            addCriterion("APLL_MATER_BOLETN <>", value, "APLL_MATER_BOLETN");
            return this;
        }

        public Criteria andAPLL_MATER_BOLETNGreaterThan(String value)
        {
            addCriterion("APLL_MATER_BOLETN >", value, "APLL_MATER_BOLETN");
            return this;
        }

        public Criteria andAPLL_MATER_BOLETNGreaterThanOrEqualTo(String value)
        {
            addCriterion("APLL_MATER_BOLETN >=", value, "APLL_MATER_BOLETN");
            return this;
        }

        public Criteria andAPLL_MATER_BOLETNLessThan(String value)
        {
            addCriterion("APLL_MATER_BOLETN <", value, "APLL_MATER_BOLETN");
            return this;
        }

        public Criteria andAPLL_MATER_BOLETNLessThanOrEqualTo(String value)
        {
            addCriterion("APLL_MATER_BOLETN <=", value, "APLL_MATER_BOLETN");
            return this;
        }

        public Criteria andAPLL_MATER_BOLETNLike(String value)
        {
            addCriterion("APLL_MATER_BOLETN like", value, "APLL_MATER_BOLETN");
            return this;
        }

        public Criteria andAPLL_MATER_BOLETNNotLike(String value)
        {
            addCriterion("APLL_MATER_BOLETN not like", value, "APLL_MATER_BOLETN");
            return this;
        }

        public Criteria andAPLL_MATER_BOLETNIn(List values)
        {
            addCriterion("APLL_MATER_BOLETN in", values, "APLL_MATER_BOLETN");
            return this;
        }

        public Criteria andAPLL_MATER_BOLETNNotIn(List values)
        {
            addCriterion("APLL_MATER_BOLETN not in", values, "APLL_MATER_BOLETN");
            return this;
        }

        public Criteria andAPLL_MATER_BOLETNBetween(String value1, String value2)
        {
            addCriterion("APLL_MATER_BOLETN between", value1, value2, "APLL_MATER_BOLETN");
            return this;
        }

        public Criteria andAPLL_MATER_BOLETNNotBetween(String value1, String value2)
        {
            addCriterion("APLL_MATER_BOLETN not between", value1, value2, "APLL_MATER_BOLETN");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andNOMB_BOLETNIsNull()
        {
            criteriaWithoutValue.add("NOMB_BOLETN is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andNOMB_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("NOMB_BOLETN is not null");
            return this;
        }

        public Criteria andNOMB_BOLETNEqualTo(String value)
        {
            addCriterion("NOMB_BOLETN =", value, "NOMB_BOLETN");
            return this;
        }

        public Criteria andNOMB_BOLETNNotEqualTo(String value)
        {
            addCriterion("NOMB_BOLETN <>", value, "NOMB_BOLETN");
            return this;
        }

        public Criteria andNOMB_BOLETNGreaterThan(String value)
        {
            addCriterion("NOMB_BOLETN >", value, "NOMB_BOLETN");
            return this;
        }

        public Criteria andNOMB_BOLETNGreaterThanOrEqualTo(String value)
        {
            addCriterion("NOMB_BOLETN >=", value, "NOMB_BOLETN");
            return this;
        }

        public Criteria andNOMB_BOLETNLessThan(String value)
        {
            addCriterion("NOMB_BOLETN <", value, "NOMB_BOLETN");
            return this;
        }

        public Criteria andNOMB_BOLETNLessThanOrEqualTo(String value)
        {
            addCriterion("NOMB_BOLETN <=", value, "NOMB_BOLETN");
            return this;
        }

        public Criteria andNOMB_BOLETNLike(String value)
        {
            addCriterion("NOMB_BOLETN like", value, "NOMB_BOLETN");
            return this;
        }

        public Criteria andNOMB_BOLETNNotLike(String value)
        {
            addCriterion("NOMB_BOLETN not like", value, "NOMB_BOLETN");
            return this;
        }

        public Criteria andNOMB_BOLETNIn(List values)
        {
            addCriterion("NOMB_BOLETN in", values, "NOMB_BOLETN");
            return this;
        }

        public Criteria andNOMB_BOLETNNotIn(List values)
        {
            addCriterion("NOMB_BOLETN not in", values, "NOMB_BOLETN");
            return this;
        }

        public Criteria andNOMB_BOLETNBetween(String value1, String value2)
        {
            addCriterion("NOMB_BOLETN between", value1, value2, "NOMB_BOLETN");
            return this;
        }

        public Criteria andNOMB_BOLETNNotBetween(String value1, String value2)
        {
            addCriterion("NOMB_BOLETN not between", value1, value2, "NOMB_BOLETN");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andNOMB_PADRE_BOLETNIsNull()
        {
            criteriaWithoutValue.add("NOMB_PADRE_BOLETN is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andNOMB_PADRE_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("NOMB_PADRE_BOLETN is not null");
            return this;
        }

        public Criteria andNOMB_PADRE_BOLETNEqualTo(String value)
        {
            addCriterion("NOMB_PADRE_BOLETN =", value, "NOMB_PADRE_BOLETN");
            return this;
        }

        public Criteria andNOMB_PADRE_BOLETNNotEqualTo(String value)
        {
            addCriterion("NOMB_PADRE_BOLETN <>", value, "NOMB_PADRE_BOLETN");
            return this;
        }

        public Criteria andNOMB_PADRE_BOLETNGreaterThan(String value)
        {
            addCriterion("NOMB_PADRE_BOLETN >", value, "NOMB_PADRE_BOLETN");
            return this;
        }

        public Criteria andNOMB_PADRE_BOLETNGreaterThanOrEqualTo(String value)
        {
            addCriterion("NOMB_PADRE_BOLETN >=", value, "NOMB_PADRE_BOLETN");
            return this;
        }

        public Criteria andNOMB_PADRE_BOLETNLessThan(String value)
        {
            addCriterion("NOMB_PADRE_BOLETN <", value, "NOMB_PADRE_BOLETN");
            return this;
        }

        public Criteria andNOMB_PADRE_BOLETNLessThanOrEqualTo(String value)
        {
            addCriterion("NOMB_PADRE_BOLETN <=", value, "NOMB_PADRE_BOLETN");
            return this;
        }

        public Criteria andNOMB_PADRE_BOLETNLike(String value)
        {
            addCriterion("NOMB_PADRE_BOLETN like", value, "NOMB_PADRE_BOLETN");
            return this;
        }

        public Criteria andNOMB_PADRE_BOLETNNotLike(String value)
        {
            addCriterion("NOMB_PADRE_BOLETN not like", value, "NOMB_PADRE_BOLETN");
            return this;
        }

        public Criteria andNOMB_PADRE_BOLETNIn(List values)
        {
            addCriterion("NOMB_PADRE_BOLETN in", values, "NOMB_PADRE_BOLETN");
            return this;
        }

        public Criteria andNOMB_PADRE_BOLETNNotIn(List values)
        {
            addCriterion("NOMB_PADRE_BOLETN not in", values, "NOMB_PADRE_BOLETN");
            return this;
        }

        public Criteria andNOMB_PADRE_BOLETNBetween(String value1, String value2)
        {
            addCriterion("NOMB_PADRE_BOLETN between", value1, value2, "NOMB_PADRE_BOLETN");
            return this;
        }

        public Criteria andNOMB_PADRE_BOLETNNotBetween(String value1, String value2)
        {
            addCriterion("NOMB_PADRE_BOLETN not between", value1, value2, "NOMB_PADRE_BOLETN");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andNOMB_MADRE_BOLETNIsNull()
        {
            criteriaWithoutValue.add("NOMB_MADRE_BOLETN is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andNOMB_MADRE_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("NOMB_MADRE_BOLETN is not null");
            return this;
        }

        public Criteria andNOMB_MADRE_BOLETNEqualTo(String value)
        {
            addCriterion("NOMB_MADRE_BOLETN =", value, "NOMB_MADRE_BOLETN");
            return this;
        }

        public Criteria andNOMB_MADRE_BOLETNNotEqualTo(String value)
        {
            addCriterion("NOMB_MADRE_BOLETN <>", value, "NOMB_MADRE_BOLETN");
            return this;
        }

        public Criteria andNOMB_MADRE_BOLETNGreaterThan(String value)
        {
            addCriterion("NOMB_MADRE_BOLETN >", value, "NOMB_MADRE_BOLETN");
            return this;
        }

        public Criteria andNOMB_MADRE_BOLETNGreaterThanOrEqualTo(String value)
        {
            addCriterion("NOMB_MADRE_BOLETN >=", value, "NOMB_MADRE_BOLETN");
            return this;
        }

        public Criteria andNOMB_MADRE_BOLETNLessThan(String value)
        {
            addCriterion("NOMB_MADRE_BOLETN <", value, "NOMB_MADRE_BOLETN");
            return this;
        }

        public Criteria andNOMB_MADRE_BOLETNLessThanOrEqualTo(String value)
        {
            addCriterion("NOMB_MADRE_BOLETN <=", value, "NOMB_MADRE_BOLETN");
            return this;
        }

        public Criteria andNOMB_MADRE_BOLETNLike(String value)
        {
            addCriterion("NOMB_MADRE_BOLETN like", value, "NOMB_MADRE_BOLETN");
            return this;
        }

        public Criteria andNOMB_MADRE_BOLETNNotLike(String value)
        {
            addCriterion("NOMB_MADRE_BOLETN not like", value, "NOMB_MADRE_BOLETN");
            return this;
        }

        public Criteria andNOMB_MADRE_BOLETNIn(List values)
        {
            addCriterion("NOMB_MADRE_BOLETN in", values, "NOMB_MADRE_BOLETN");
            return this;
        }

        public Criteria andNOMB_MADRE_BOLETNNotIn(List values)
        {
            addCriterion("NOMB_MADRE_BOLETN not in", values, "NOMB_MADRE_BOLETN");
            return this;
        }

        public Criteria andNOMB_MADRE_BOLETNBetween(String value1, String value2)
        {
            addCriterion("NOMB_MADRE_BOLETN between", value1, value2, "NOMB_MADRE_BOLETN");
            return this;
        }

        public Criteria andNOMB_MADRE_BOLETNNotBetween(String value1, String value2)
        {
            addCriterion("NOMB_MADRE_BOLETN not between", value1, value2, "NOMB_MADRE_BOLETN");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andFECH_NACIM_BOLETNIsNull()
        {
            criteriaWithoutValue.add("FECH_NACIM_BOLETN is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andFECH_NACIM_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("FECH_NACIM_BOLETN is not null");
            return this;
        }

        public Criteria andFECH_NACIM_BOLETNEqualTo(String value)
        {
            addCriterion("FECH_NACIM_BOLETN =", value, "FECH_NACIM_BOLETN");
            return this;
        }

        public Criteria andFECH_NACIM_BOLETNNotEqualTo(String value)
        {
            addCriterion("FECH_NACIM_BOLETN <>", value, "FECH_NACIM_BOLETN");
            return this;
        }

        public Criteria andFECH_NACIM_BOLETNGreaterThan(String value)
        {
            addCriterion("FECH_NACIM_BOLETN >", value, "FECH_NACIM_BOLETN");
            return this;
        }

        public Criteria andFECH_NACIM_BOLETNGreaterThanOrEqualTo(String value)
        {
            addCriterion("FECH_NACIM_BOLETN >=", value, "FECH_NACIM_BOLETN");
            return this;
        }

        public Criteria andFECH_NACIM_BOLETNLessThan(String value)
        {
            addCriterion("FECH_NACIM_BOLETN <", value, "FECH_NACIM_BOLETN");
            return this;
        }

        public Criteria andFECH_NACIM_BOLETNLessThanOrEqualTo(String value)
        {
            addCriterion("FECH_NACIM_BOLETN <=", value, "FECH_NACIM_BOLETN");
            return this;
        }

        public Criteria andFECH_NACIM_BOLETNLike(String value)
        {
            addCriterion("FECH_NACIM_BOLETN like", value, "FECH_NACIM_BOLETN");
            return this;
        }

        public Criteria andFECH_NACIM_BOLETNNotLike(String value)
        {
            addCriterion("FECH_NACIM_BOLETN not like", value, "FECH_NACIM_BOLETN");
            return this;
        }

        public Criteria andFECH_NACIM_BOLETNIn(List values)
        {
            addCriterion("FECH_NACIM_BOLETN in", values, "FECH_NACIM_BOLETN");
            return this;
        }

        public Criteria andFECH_NACIM_BOLETNNotIn(List values)
        {
            addCriterion("FECH_NACIM_BOLETN not in", values, "FECH_NACIM_BOLETN");
            return this;
        }

        public Criteria andFECH_NACIM_BOLETNBetween(String value1, String value2)
        {
            addCriterion("FECH_NACIM_BOLETN between", value1, value2, "FECH_NACIM_BOLETN");
            return this;
        }

        public Criteria andFECH_NACIM_BOLETNNotBetween(String value1, String value2)
        {
            addCriterion("FECH_NACIM_BOLETN not between", value1, value2, "FECH_NACIM_BOLETN");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andNUMR_INSTA_BOLETNIsNull()
        {
            criteriaWithoutValue.add("NUMR_INSTA_BOLETN is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andNUMR_INSTA_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("NUMR_INSTA_BOLETN is not null");
            return this;
        }

        public Criteria andNUMR_INSTA_BOLETNEqualTo(String value)
        {
            addCriterion("NUMR_INSTA_BOLETN =", value, "NUMR_INSTA_BOLETN");
            return this;
        }

        public Criteria andNUMR_INSTA_BOLETNNotEqualTo(String value)
        {
            addCriterion("NUMR_INSTA_BOLETN <>", value, "NUMR_INSTA_BOLETN");
            return this;
        }

        public Criteria andNUMR_INSTA_BOLETNGreaterThan(String value)
        {
            addCriterion("NUMR_INSTA_BOLETN >", value, "NUMR_INSTA_BOLETN");
            return this;
        }

        public Criteria andNUMR_INSTA_BOLETNGreaterThanOrEqualTo(String value)
        {
            addCriterion("NUMR_INSTA_BOLETN >=", value, "NUMR_INSTA_BOLETN");
            return this;
        }

        public Criteria andNUMR_INSTA_BOLETNLessThan(String value)
        {
            addCriterion("NUMR_INSTA_BOLETN <", value, "NUMR_INSTA_BOLETN");
            return this;
        }

        public Criteria andNUMR_INSTA_BOLETNLessThanOrEqualTo(String value)
        {
            addCriterion("NUMR_INSTA_BOLETN <=", value, "NUMR_INSTA_BOLETN");
            return this;
        }

        public Criteria andNUMR_INSTA_BOLETNLike(String value)
        {
            addCriterion("NUMR_INSTA_BOLETN like", value, "NUMR_INSTA_BOLETN");
            return this;
        }

        public Criteria andNUMR_INSTA_BOLETNNotLike(String value)
        {
            addCriterion("NUMR_INSTA_BOLETN not like", value, "NUMR_INSTA_BOLETN");
            return this;
        }

        public Criteria andNUMR_INSTA_BOLETNIn(List values)
        {
            addCriterion("NUMR_INSTA_BOLETN in", values, "NUMR_INSTA_BOLETN");
            return this;
        }

        public Criteria andNUMR_INSTA_BOLETNNotIn(List values)
        {
            addCriterion("NUMR_INSTA_BOLETN not in", values, "NUMR_INSTA_BOLETN");
            return this;
        }

        public Criteria andNUMR_INSTA_BOLETNBetween(String value1, String value2)
        {
            addCriterion("NUMR_INSTA_BOLETN between", value1, value2, "NUMR_INSTA_BOLETN");
            return this;
        }

        public Criteria andNUMR_INSTA_BOLETNNotBetween(String value1, String value2)
        {
            addCriterion("NUMR_INSTA_BOLETN not between", value1, value2, "NUMR_INSTA_BOLETN");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andTIPO_PRONUIsNull()
        {
            criteriaWithoutValue.add("TIPO_PRONU is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andTIPO_PRONUIsNotNull()
        {
            criteriaWithoutValue.add("TIPO_PRONU is not null");
            return this;
        }

        public Criteria andTIPO_PRONUEqualTo(String value)
        {
            addCriterion("TIPO_PRONU =", value, "TIPO_PRONU");
            return this;
        }

        public Criteria andTIPO_PRONUNotEqualTo(String value)
        {
            addCriterion("TIPO_PRONU <>", value, "TIPO_PRONU");
            return this;
        }

        public Criteria andTIPO_PRONUGreaterThan(String value)
        {
            addCriterion("TIPO_PRONU >", value, "TIPO_PRONU");
            return this;
        }

        public Criteria andTIPO_PRONUGreaterThanOrEqualTo(String value)
        {
            addCriterion("TIPO_PRONU >=", value, "TIPO_PRONU");
            return this;
        }

        public Criteria andTIPO_PRONULessThan(String value)
        {
            addCriterion("TIPO_PRONU <", value, "TIPO_PRONU");
            return this;
        }

        public Criteria andTIPO_PRONULessThanOrEqualTo(String value)
        {
            addCriterion("TIPO_PRONU <=", value, "TIPO_PRONU");
            return this;
        }

        public Criteria andTIPO_PRONULike(String value)
        {
            addCriterion("TIPO_PRONU like", value, "TIPO_PRONU");
            return this;
        }

        public Criteria andTIPO_PRONUNotLike(String value)
        {
            addCriterion("TIPO_PRONU not like", value, "TIPO_PRONU");
            return this;
        }

        public Criteria andTIPO_PRONUIn(List values)
        {
            addCriterion("TIPO_PRONU in", values, "TIPO_PRONU");
            return this;
        }

        public Criteria andTIPO_PRONUNotIn(List values)
        {
            addCriterion("TIPO_PRONU not in", values, "TIPO_PRONU");
            return this;
        }

        public Criteria andTIPO_PRONUBetween(String value1, String value2)
        {
            addCriterion("TIPO_PRONU between", value1, value2, "TIPO_PRONU");
            return this;
        }

        public Criteria andTIPO_PRONUNotBetween(String value1, String value2)
        {
            addCriterion("TIPO_PRONU not between", value1, value2, "TIPO_PRONU");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andCODG_LUGARIsNull()
        {
            criteriaWithoutValue.add("CODG_LUGAR is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andCODG_LUGARIsNotNull()
        {
            criteriaWithoutValue.add("CODG_LUGAR is not null");
            return this;
        }

        public Criteria andCODG_LUGAREqualTo(String value)
        {
            addCriterion("CODG_LUGAR =", value, "CODG_LUGAR");
            return this;
        }

        public Criteria andCODG_LUGARNotEqualTo(String value)
        {
            addCriterion("CODG_LUGAR <>", value, "CODG_LUGAR");
            return this;
        }

        public Criteria andCODG_LUGARGreaterThan(String value)
        {
            addCriterion("CODG_LUGAR >", value, "CODG_LUGAR");
            return this;
        }

        public Criteria andCODG_LUGARGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_LUGAR >=", value, "CODG_LUGAR");
            return this;
        }

        public Criteria andCODG_LUGARLessThan(String value)
        {
            addCriterion("CODG_LUGAR <", value, "CODG_LUGAR");
            return this;
        }

        public Criteria andCODG_LUGARLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_LUGAR <=", value, "CODG_LUGAR");
            return this;
        }

        public Criteria andCODG_LUGARLike(String value)
        {
            addCriterion("CODG_LUGAR like", value, "CODG_LUGAR");
            return this;
        }

        public Criteria andCODG_LUGARNotLike(String value)
        {
            addCriterion("CODG_LUGAR not like", value, "CODG_LUGAR");
            return this;
        }

        public Criteria andCODG_LUGARIn(List values)
        {
            addCriterion("CODG_LUGAR in", values, "CODG_LUGAR");
            return this;
        }

        public Criteria andCODG_LUGARNotIn(List values)
        {
            addCriterion("CODG_LUGAR not in", values, "CODG_LUGAR");
            return this;
        }

        public Criteria andCODG_LUGARBetween(String value1, String value2)
        {
            addCriterion("CODG_LUGAR between", value1, value2, "CODG_LUGAR");
            return this;
        }

        public Criteria andCODG_LUGARNotBetween(String value1, String value2)
        {
            addCriterion("CODG_LUGAR not between", value1, value2, "CODG_LUGAR");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andFECH_PRONU_BOLETNIsNull()
        {
            criteriaWithoutValue.add("FECH_PRONU_BOLETN is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andFECH_PRONU_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("FECH_PRONU_BOLETN is not null");
            return this;
        }

        public Criteria andFECH_PRONU_BOLETNEqualTo(String value)
        {
            addCriterion("FECH_PRONU_BOLETN =", value, "FECH_PRONU_BOLETN");
            return this;
        }

        public Criteria andFECH_PRONU_BOLETNNotEqualTo(String value)
        {
            addCriterion("FECH_PRONU_BOLETN <>", value, "FECH_PRONU_BOLETN");
            return this;
        }

        public Criteria andFECH_PRONU_BOLETNGreaterThan(String value)
        {
            addCriterion("FECH_PRONU_BOLETN >", value, "FECH_PRONU_BOLETN");
            return this;
        }

        public Criteria andFECH_PRONU_BOLETNGreaterThanOrEqualTo(String value)
        {
            addCriterion("FECH_PRONU_BOLETN >=", value, "FECH_PRONU_BOLETN");
            return this;
        }

        public Criteria andFECH_PRONU_BOLETNLessThan(String value)
        {
            addCriterion("FECH_PRONU_BOLETN <", value, "FECH_PRONU_BOLETN");
            return this;
        }

        public Criteria andFECH_PRONU_BOLETNLessThanOrEqualTo(String value)
        {
            addCriterion("FECH_PRONU_BOLETN <=", value, "FECH_PRONU_BOLETN");
            return this;
        }

        public Criteria andFECH_PRONU_BOLETNLike(String value)
        {
            addCriterion("FECH_PRONU_BOLETN like", value, "FECH_PRONU_BOLETN");
            return this;
        }

        public Criteria andFECH_PRONU_BOLETNNotLike(String value)
        {
            addCriterion("FECH_PRONU_BOLETN not like", value, "FECH_PRONU_BOLETN");
            return this;
        }

        public Criteria andFECH_PRONU_BOLETNIn(List values)
        {
            addCriterion("FECH_PRONU_BOLETN in", values, "FECH_PRONU_BOLETN");
            return this;
        }

        public Criteria andFECH_PRONU_BOLETNNotIn(List values)
        {
            addCriterion("FECH_PRONU_BOLETN not in", values, "FECH_PRONU_BOLETN");
            return this;
        }

        public Criteria andFECH_PRONU_BOLETNBetween(String value1, String value2)
        {
            addCriterion("FECH_PRONU_BOLETN between", value1, value2, "FECH_PRONU_BOLETN");
            return this;
        }

        public Criteria andFECH_PRONU_BOLETNNotBetween(String value1, String value2)
        {
            addCriterion("FECH_PRONU_BOLETN not between", value1, value2, "FECH_PRONU_BOLETN");
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
		public Criteria andCODG_PENAIsNull()
        {
            criteriaWithoutValue.add("CODG_PENA is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andCODG_PENAIsNotNull()
        {
            criteriaWithoutValue.add("CODG_PENA is not null");
            return this;
        }

        public Criteria andCODG_PENAEqualTo(Short value)
        {
            addCriterion("CODG_PENA =", value, "CODG_PENA");
            return this;
        }

        public Criteria andCODG_PENANotEqualTo(Short value)
        {
            addCriterion("CODG_PENA <>", value, "CODG_PENA");
            return this;
        }

        public Criteria andCODG_PENAGreaterThan(Short value)
        {
            addCriterion("CODG_PENA >", value, "CODG_PENA");
            return this;
        }

        public Criteria andCODG_PENAGreaterThanOrEqualTo(Short value)
        {
            addCriterion("CODG_PENA >=", value, "CODG_PENA");
            return this;
        }

        public Criteria andCODG_PENALessThan(Short value)
        {
            addCriterion("CODG_PENA <", value, "CODG_PENA");
            return this;
        }

        public Criteria andCODG_PENALessThanOrEqualTo(Short value)
        {
            addCriterion("CODG_PENA <=", value, "CODG_PENA");
            return this;
        }

        public Criteria andCODG_PENAIn(List values)
        {
            addCriterion("CODG_PENA in", values, "CODG_PENA");
            return this;
        }

        public Criteria andCODG_PENANotIn(List values)
        {
            addCriterion("CODG_PENA not in", values, "CODG_PENA");
            return this;
        }

        public Criteria andCODG_PENABetween(Short value1, Short value2)
        {
            addCriterion("CODG_PENA between", value1, value2, "CODG_PENA");
            return this;
        }

        public Criteria andCODG_PENANotBetween(Short value1, Short value2)
        {
            addCriterion("CODG_PENA not between", value1, value2, "CODG_PENA");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andANNO_PENA_BOLETNIsNull()
        {
            criteriaWithoutValue.add("ANNO_PENA_BOLETN is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andANNO_PENA_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("ANNO_PENA_BOLETN is not null");
            return this;
        }

        public Criteria andANNO_PENA_BOLETNEqualTo(Short value)
        {
            addCriterion("ANNO_PENA_BOLETN =", value, "ANNO_PENA_BOLETN");
            return this;
        }

        public Criteria andANNO_PENA_BOLETNNotEqualTo(Short value)
        {
            addCriterion("ANNO_PENA_BOLETN <>", value, "ANNO_PENA_BOLETN");
            return this;
        }

        public Criteria andANNO_PENA_BOLETNGreaterThan(Short value)
        {
            addCriterion("ANNO_PENA_BOLETN >", value, "ANNO_PENA_BOLETN");
            return this;
        }

        public Criteria andANNO_PENA_BOLETNGreaterThanOrEqualTo(Short value)
        {
            addCriterion("ANNO_PENA_BOLETN >=", value, "ANNO_PENA_BOLETN");
            return this;
        }

        public Criteria andANNO_PENA_BOLETNLessThan(Short value)
        {
            addCriterion("ANNO_PENA_BOLETN <", value, "ANNO_PENA_BOLETN");
            return this;
        }

        public Criteria andANNO_PENA_BOLETNLessThanOrEqualTo(Short value)
        {
            addCriterion("ANNO_PENA_BOLETN <=", value, "ANNO_PENA_BOLETN");
            return this;
        }

        public Criteria andANNO_PENA_BOLETNIn(List values)
        {
            addCriterion("ANNO_PENA_BOLETN in", values, "ANNO_PENA_BOLETN");
            return this;
        }

        public Criteria andANNO_PENA_BOLETNNotIn(List values)
        {
            addCriterion("ANNO_PENA_BOLETN not in", values, "ANNO_PENA_BOLETN");
            return this;
        }

        public Criteria andANNO_PENA_BOLETNBetween(Short value1, Short value2)
        {
            addCriterion("ANNO_PENA_BOLETN between", value1, value2, "ANNO_PENA_BOLETN");
            return this;
        }

        public Criteria andANNO_PENA_BOLETNNotBetween(Short value1, Short value2)
        {
            addCriterion("ANNO_PENA_BOLETN not between", value1, value2, "ANNO_PENA_BOLETN");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andMESS_PENA_BOLETNIsNull()
        {
            criteriaWithoutValue.add("MESS_PENA_BOLETN is null");
            return this;
        }

        @SuppressWarnings("unchecked")
        public Criteria andMESS_PENA_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("MESS_PENA_BOLETN is not null");
            return this;
        }

        public Criteria andMESS_PENA_BOLETNEqualTo(Short value)
        {
            addCriterion("MESS_PENA_BOLETN =", value, "MESS_PENA_BOLETN");
            return this;
        }

        public Criteria andMESS_PENA_BOLETNNotEqualTo(Short value)
        {
            addCriterion("MESS_PENA_BOLETN <>", value, "MESS_PENA_BOLETN");
            return this;
        }

        public Criteria andMESS_PENA_BOLETNGreaterThan(Short value)
        {
            addCriterion("MESS_PENA_BOLETN >", value, "MESS_PENA_BOLETN");
            return this;
        }

        public Criteria andMESS_PENA_BOLETNGreaterThanOrEqualTo(Short value)
        {
            addCriterion("MESS_PENA_BOLETN >=", value, "MESS_PENA_BOLETN");
            return this;
        }

        public Criteria andMESS_PENA_BOLETNLessThan(Short value)
        {
            addCriterion("MESS_PENA_BOLETN <", value, "MESS_PENA_BOLETN");
            return this;
        }

        public Criteria andMESS_PENA_BOLETNLessThanOrEqualTo(Short value)
        {
            addCriterion("MESS_PENA_BOLETN <=", value, "MESS_PENA_BOLETN");
            return this;
        }

        public Criteria andMESS_PENA_BOLETNIn(List values)
        {
            addCriterion("MESS_PENA_BOLETN in", values, "MESS_PENA_BOLETN");
            return this;
        }

        public Criteria andMESS_PENA_BOLETNNotIn(List values)
        {
            addCriterion("MESS_PENA_BOLETN not in", values, "MESS_PENA_BOLETN");
            return this;
        }

        public Criteria andMESS_PENA_BOLETNBetween(Short value1, Short value2)
        {
            addCriterion("MESS_PENA_BOLETN between", value1, value2, "MESS_PENA_BOLETN");
            return this;
        }

        public Criteria andMESS_PENA_BOLETNNotBetween(Short value1, Short value2)
        {
            addCriterion("MESS_PENA_BOLETN not between", value1, value2, "MESS_PENA_BOLETN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDIAA_PENA_BOLETNIsNull()
        {
            criteriaWithoutValue.add("DIAA_PENA_BOLETN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDIAA_PENA_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("DIAA_PENA_BOLETN is not null");
            return this;
        }

        public Criteria andDIAA_PENA_BOLETNEqualTo(Short value)
        {
            addCriterion("DIAA_PENA_BOLETN =", value, "DIAA_PENA_BOLETN");
            return this;
        }

        public Criteria andDIAA_PENA_BOLETNNotEqualTo(Short value)
        {
            addCriterion("DIAA_PENA_BOLETN <>", value, "DIAA_PENA_BOLETN");
            return this;
        }

        public Criteria andDIAA_PENA_BOLETNGreaterThan(Short value)
        {
            addCriterion("DIAA_PENA_BOLETN >", value, "DIAA_PENA_BOLETN");
            return this;
        }

        public Criteria andDIAA_PENA_BOLETNGreaterThanOrEqualTo(Short value)
        {
            addCriterion("DIAA_PENA_BOLETN >=", value, "DIAA_PENA_BOLETN");
            return this;
        }

        public Criteria andDIAA_PENA_BOLETNLessThan(Short value)
        {
            addCriterion("DIAA_PENA_BOLETN <", value, "DIAA_PENA_BOLETN");
            return this;
        }

        public Criteria andDIAA_PENA_BOLETNLessThanOrEqualTo(Short value)
        {
            addCriterion("DIAA_PENA_BOLETN <=", value, "DIAA_PENA_BOLETN");
            return this;
        }

        public Criteria andDIAA_PENA_BOLETNIn(List values)
        {
            addCriterion("DIAA_PENA_BOLETN in", values, "DIAA_PENA_BOLETN");
            return this;
        }

        public Criteria andDIAA_PENA_BOLETNNotIn(List values)
        {
            addCriterion("DIAA_PENA_BOLETN not in", values, "DIAA_PENA_BOLETN");
            return this;
        }

        public Criteria andDIAA_PENA_BOLETNBetween(Short value1, Short value2)
        {
            addCriterion("DIAA_PENA_BOLETN between", value1, value2, "DIAA_PENA_BOLETN");
            return this;
        }

        public Criteria andDIAA_PENA_BOLETNNotBetween(Short value1, Short value2)
        {
            addCriterion("DIAA_PENA_BOLETN not between", value1, value2, "DIAA_PENA_BOLETN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andTIPO_REHAB_BOLETNIsNull()
        {
            criteriaWithoutValue.add("TIPO_REHAB_BOLETN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andTIPO_REHAB_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("TIPO_REHAB_BOLETN is not null");
            return this;
        }

        public Criteria andTIPO_REHAB_BOLETNEqualTo(String value)
        {
            addCriterion("TIPO_REHAB_BOLETN =", value, "TIPO_REHAB_BOLETN");
            return this;
        }

        public Criteria andTIPO_REHAB_BOLETNNotEqualTo(String value)
        {
            addCriterion("TIPO_REHAB_BOLETN <>", value, "TIPO_REHAB_BOLETN");
            return this;
        }

        public Criteria andTIPO_REHAB_BOLETNGreaterThan(String value)
        {
            addCriterion("TIPO_REHAB_BOLETN >", value, "TIPO_REHAB_BOLETN");
            return this;
        }

        public Criteria andTIPO_REHAB_BOLETNGreaterThanOrEqualTo(String value)
        {
            addCriterion("TIPO_REHAB_BOLETN >=", value, "TIPO_REHAB_BOLETN");
            return this;
        }

        public Criteria andTIPO_REHAB_BOLETNLessThan(String value)
        {
            addCriterion("TIPO_REHAB_BOLETN <", value, "TIPO_REHAB_BOLETN");
            return this;
        }

        public Criteria andTIPO_REHAB_BOLETNLessThanOrEqualTo(String value)
        {
            addCriterion("TIPO_REHAB_BOLETN <=", value, "TIPO_REHAB_BOLETN");
            return this;
        }

        public Criteria andTIPO_REHAB_BOLETNLike(String value)
        {
            addCriterion("TIPO_REHAB_BOLETN like", value, "TIPO_REHAB_BOLETN");
            return this;
        }

        public Criteria andTIPO_REHAB_BOLETNNotLike(String value)
        {
            addCriterion("TIPO_REHAB_BOLETN not like", value, "TIPO_REHAB_BOLETN");
            return this;
        }

        public Criteria andTIPO_REHAB_BOLETNIn(List values)
        {
            addCriterion("TIPO_REHAB_BOLETN in", values, "TIPO_REHAB_BOLETN");
            return this;
        }

        public Criteria andTIPO_REHAB_BOLETNNotIn(List values)
        {
            addCriterion("TIPO_REHAB_BOLETN not in", values, "TIPO_REHAB_BOLETN");
            return this;
        }

        public Criteria andTIPO_REHAB_BOLETNBetween(String value1, String value2)
        {
            addCriterion("TIPO_REHAB_BOLETN between", value1, value2, "TIPO_REHAB_BOLETN");
            return this;
        }

        public Criteria andTIPO_REHAB_BOLETNNotBetween(String value1, String value2)
        {
            addCriterion("TIPO_REHAB_BOLETN not between", value1, value2, "TIPO_REHAB_BOLETN");
            return this;
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
		public Criteria andCODG_USUAR_MODIFIsNull()
        {
            criteriaWithoutValue.add("CODG_USUAR_MODIF is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andCODG_USUAR_MODIFIsNotNull()
        {
            criteriaWithoutValue.add("CODG_USUAR_MODIF is not null");
            return this;
        }

        public Criteria andCODG_USUAR_MODIFEqualTo(String value)
        {
            addCriterion("CODG_USUAR_MODIF =", value, "CODG_USUAR_MODIF");
            return this;
        }

        public Criteria andCODG_USUAR_MODIFNotEqualTo(String value)
        {
            addCriterion("CODG_USUAR_MODIF <>", value, "CODG_USUAR_MODIF");
            return this;
        }

        public Criteria andCODG_USUAR_MODIFGreaterThan(String value)
        {
            addCriterion("CODG_USUAR_MODIF >", value, "CODG_USUAR_MODIF");
            return this;
        }

        public Criteria andCODG_USUAR_MODIFGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_USUAR_MODIF >=", value, "CODG_USUAR_MODIF");
            return this;
        }

        public Criteria andCODG_USUAR_MODIFLessThan(String value)
        {
            addCriterion("CODG_USUAR_MODIF <", value, "CODG_USUAR_MODIF");
            return this;
        }

        public Criteria andCODG_USUAR_MODIFLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_USUAR_MODIF <=", value, "CODG_USUAR_MODIF");
            return this;
        }

        public Criteria andCODG_USUAR_MODIFLike(String value)
        {
            addCriterion("CODG_USUAR_MODIF like", value, "CODG_USUAR_MODIF");
            return this;
        }

        public Criteria andCODG_USUAR_MODIFNotLike(String value)
        {
            addCriterion("CODG_USUAR_MODIF not like", value, "CODG_USUAR_MODIF");
            return this;
        }

        public Criteria andCODG_USUAR_MODIFIn(List values)
        {
            addCriterion("CODG_USUAR_MODIF in", values, "CODG_USUAR_MODIF");
            return this;
        }

        public Criteria andCODG_USUAR_MODIFNotIn(List values)
        {
            addCriterion("CODG_USUAR_MODIF not in", values, "CODG_USUAR_MODIF");
            return this;
        }

        public Criteria andCODG_USUAR_MODIFBetween(String value1, String value2)
        {
            addCriterion("CODG_USUAR_MODIF between", value1, value2, "CODG_USUAR_MODIF");
            return this;
        }

        public Criteria andCODG_USUAR_MODIFNotBetween(String value1, String value2)
        {
            addCriterion("CODG_USUAR_MODIF not between", value1, value2, "CODG_USUAR_MODIF");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andMONT_REPAR_BOLETNIsNull()
        {
            criteriaWithoutValue.add("MONT_REPAR_BOLETN is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andMONT_REPAR_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("MONT_REPAR_BOLETN is not null");
            return this;
        }

        public Criteria andMONT_REPAR_BOLETNEqualTo(BigDecimal value)
        {
            addCriterion("MONT_REPAR_BOLETN =", value, "MONT_REPAR_BOLETN");
            return this;
        }

        public Criteria andMONT_REPAR_BOLETNNotEqualTo(BigDecimal value)
        {
            addCriterion("MONT_REPAR_BOLETN <>", value, "MONT_REPAR_BOLETN");
            return this;
        }

        public Criteria andMONT_REPAR_BOLETNGreaterThan(BigDecimal value)
        {
            addCriterion("MONT_REPAR_BOLETN >", value, "MONT_REPAR_BOLETN");
            return this;
        }

        public Criteria andMONT_REPAR_BOLETNGreaterThanOrEqualTo(BigDecimal value)
        {
            addCriterion("MONT_REPAR_BOLETN >=", value, "MONT_REPAR_BOLETN");
            return this;
        }

        public Criteria andMONT_REPAR_BOLETNLessThan(BigDecimal value)
        {
            addCriterion("MONT_REPAR_BOLETN <", value, "MONT_REPAR_BOLETN");
            return this;
        }

        public Criteria andMONT_REPAR_BOLETNLessThanOrEqualTo(BigDecimal value)
        {
            addCriterion("MONT_REPAR_BOLETN <=", value, "MONT_REPAR_BOLETN");
            return this;
        }

        public Criteria andMONT_REPAR_BOLETNIn(List values)
        {
            addCriterion("MONT_REPAR_BOLETN in", values, "MONT_REPAR_BOLETN");
            return this;
        }

        public Criteria andMONT_REPAR_BOLETNNotIn(List values)
        {
            addCriterion("MONT_REPAR_BOLETN not in", values, "MONT_REPAR_BOLETN");
            return this;
        }

        public Criteria andMONT_REPAR_BOLETNBetween(BigDecimal value1, BigDecimal value2)
        {
            addCriterion("MONT_REPAR_BOLETN between", value1, value2, "MONT_REPAR_BOLETN");
            return this;
        }

        public Criteria andMONT_REPAR_BOLETNNotBetween(BigDecimal value1, BigDecimal value2)
        {
            addCriterion("MONT_REPAR_BOLETN not between", value1, value2, "MONT_REPAR_BOLETN");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andNUME_EXPTE_BOLETNIsNull()
        {
            criteriaWithoutValue.add("NUME_EXPTE_BOLETN is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andNUME_EXPTE_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("NUME_EXPTE_BOLETN is not null");
            return this;
        }

        public Criteria andNUME_EXPTE_BOLETNEqualTo(String value)
        {
            addCriterion("NUME_EXPTE_BOLETN =", value, "NUME_EXPTE_BOLETN");
            return this;
        }

        public Criteria andNUME_EXPTE_BOLETNNotEqualTo(String value)
        {
            addCriterion("NUME_EXPTE_BOLETN <>", value, "NUME_EXPTE_BOLETN");
            return this;
        }

        public Criteria andNUME_EXPTE_BOLETNGreaterThan(String value)
        {
            addCriterion("NUME_EXPTE_BOLETN >", value, "NUME_EXPTE_BOLETN");
            return this;
        }

        public Criteria andNUME_EXPTE_BOLETNGreaterThanOrEqualTo(String value)
        {
            addCriterion("NUME_EXPTE_BOLETN >=", value, "NUME_EXPTE_BOLETN");
            return this;
        }

        public Criteria andNUME_EXPTE_BOLETNLessThan(String value)
        {
            addCriterion("NUME_EXPTE_BOLETN <", value, "NUME_EXPTE_BOLETN");
            return this;
        }

        public Criteria andNUME_EXPTE_BOLETNLessThanOrEqualTo(String value)
        {
            addCriterion("NUME_EXPTE_BOLETN <=", value, "NUME_EXPTE_BOLETN");
            return this;
        }

        public Criteria andNUME_EXPTE_BOLETNLike(String value)
        {
            addCriterion("NUME_EXPTE_BOLETN like", value, "NUME_EXPTE_BOLETN");
            return this;
        }

        public Criteria andNUME_EXPTE_BOLETNNotLike(String value)
        {
            addCriterion("NUME_EXPTE_BOLETN not like", value, "NUME_EXPTE_BOLETN");
            return this;
        }

        public Criteria andNUME_EXPTE_BOLETNIn(List values)
        {
            addCriterion("NUME_EXPTE_BOLETN in", values, "NUME_EXPTE_BOLETN");
            return this;
        }

        public Criteria andNUME_EXPTE_BOLETNNotIn(List values)
        {
            addCriterion("NUME_EXPTE_BOLETN not in", values, "NUME_EXPTE_BOLETN");
            return this;
        }

        public Criteria andNUME_EXPTE_BOLETNBetween(String value1, String value2)
        {
            addCriterion("NUME_EXPTE_BOLETN between", value1, value2, "NUME_EXPTE_BOLETN");
            return this;
        }

        public Criteria andNUME_EXPTE_BOLETNNotBetween(String value1, String value2)
        {
            addCriterion("NUME_EXPTE_BOLETN not between", value1, value2, "NUME_EXPTE_BOLETN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_DIGIT_BOLETNIsNull()
        {
            criteriaWithoutValue.add("FECH_DIGIT_BOLETN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_DIGIT_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("FECH_DIGIT_BOLETN is not null");
            return this;
        }

        public Criteria andFECH_DIGIT_BOLETNEqualTo(Date value)
        {
            addCriterion("FECH_DIGIT_BOLETN =", value, "FECH_DIGIT_BOLETN");
            return this;
        }

        public Criteria andFECH_DIGIT_BOLETNNotEqualTo(Date value)
        {
            addCriterion("FECH_DIGIT_BOLETN <>", value, "FECH_DIGIT_BOLETN");
            return this;
        }

        public Criteria andFECH_DIGIT_BOLETNGreaterThan(Date value)
        {
            addCriterion("FECH_DIGIT_BOLETN >", value, "FECH_DIGIT_BOLETN");
            return this;
        }

        public Criteria andFECH_DIGIT_BOLETNGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FECH_DIGIT_BOLETN >=", value, "FECH_DIGIT_BOLETN");
            return this;
        }

        public Criteria andFECH_DIGIT_BOLETNLessThan(Date value)
        {
            addCriterion("FECH_DIGIT_BOLETN <", value, "FECH_DIGIT_BOLETN");
            return this;
        }

        public Criteria andFECH_DIGIT_BOLETNLessThanOrEqualTo(Date value)
        {
            addCriterion("FECH_DIGIT_BOLETN <=", value, "FECH_DIGIT_BOLETN");
            return this;
        }

        public Criteria andFECH_DIGIT_BOLETNIn(List values)
        {
            addCriterion("FECH_DIGIT_BOLETN in", values, "FECH_DIGIT_BOLETN");
            return this;
        }

        public Criteria andFECH_DIGIT_BOLETNNotIn(List values)
        {
            addCriterion("FECH_DIGIT_BOLETN not in", values, "FECH_DIGIT_BOLETN");
            return this;
        }

        public Criteria andFECH_DIGIT_BOLETNBetween(Date value1, Date value2)
        {
            addCriterion("FECH_DIGIT_BOLETN between", value1, value2, "FECH_DIGIT_BOLETN");
            return this;
        }

        public Criteria andFECH_DIGIT_BOLETNNotBetween(Date value1, Date value2)
        {
            addCriterion("FECH_DIGIT_BOLETN not between", value1, value2, "FECH_DIGIT_BOLETN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_ANULD_BOLETNIsNull()
        {
            criteriaWithoutValue.add("INDC_ANULD_BOLETN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_ANULD_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("INDC_ANULD_BOLETN is not null");
            return this;
        }

        public Criteria andINDC_ANULD_BOLETNEqualTo(String value)
        {
            addCriterion("INDC_ANULD_BOLETN =", value, "INDC_ANULD_BOLETN");
            return this;
        }

        public Criteria andINDC_ANULD_BOLETNNotEqualTo(String value)
        {
            addCriterion("INDC_ANULD_BOLETN <>", value, "INDC_ANULD_BOLETN");
            return this;
        }

        public Criteria andINDC_ANULD_BOLETNGreaterThan(String value)
        {
            addCriterion("INDC_ANULD_BOLETN >", value, "INDC_ANULD_BOLETN");
            return this;
        }

        public Criteria andINDC_ANULD_BOLETNGreaterThanOrEqualTo(String value)
        {
            addCriterion("INDC_ANULD_BOLETN >=", value, "INDC_ANULD_BOLETN");
            return this;
        }

        public Criteria andINDC_ANULD_BOLETNLessThan(String value)
        {
            addCriterion("INDC_ANULD_BOLETN <", value, "INDC_ANULD_BOLETN");
            return this;
        }

        public Criteria andINDC_ANULD_BOLETNLessThanOrEqualTo(String value)
        {
            addCriterion("INDC_ANULD_BOLETN <=", value, "INDC_ANULD_BOLETN");
            return this;
        }

        public Criteria andINDC_ANULD_BOLETNLike(String value)
        {
            addCriterion("INDC_ANULD_BOLETN like", value, "INDC_ANULD_BOLETN");
            return this;
        }

        public Criteria andINDC_ANULD_BOLETNNotLike(String value)
        {
            addCriterion("INDC_ANULD_BOLETN not like", value, "INDC_ANULD_BOLETN");
            return this;
        }

        public Criteria andINDC_ANULD_BOLETNIn(List values)
        {
            addCriterion("INDC_ANULD_BOLETN in", values, "INDC_ANULD_BOLETN");
            return this;
        }

        public Criteria andINDC_ANULD_BOLETNNotIn(List values)
        {
            addCriterion("INDC_ANULD_BOLETN not in", values, "INDC_ANULD_BOLETN");
            return this;
        }

        public Criteria andINDC_ANULD_BOLETNBetween(String value1, String value2)
        {
            addCriterion("INDC_ANULD_BOLETN between", value1, value2, "INDC_ANULD_BOLETN");
            return this;
        }

        public Criteria andINDC_ANULD_BOLETNNotBetween(String value1, String value2)
        {
            addCriterion("INDC_ANULD_BOLETN not between", value1, value2, "INDC_ANULD_BOLETN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andOBSE_BOLETNIsNull()
        {
            criteriaWithoutValue.add("OBSE_BOLETN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andOBSE_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("OBSE_BOLETN is not null");
            return this;
        }

        public Criteria andOBSE_BOLETNEqualTo(String value)
        {
            addCriterion("OBSE_BOLETN =", value, "OBSE_BOLETN");
            return this;
        }

        public Criteria andOBSE_BOLETNNotEqualTo(String value)
        {
            addCriterion("OBSE_BOLETN <>", value, "OBSE_BOLETN");
            return this;
        }

        public Criteria andOBSE_BOLETNGreaterThan(String value)
        {
            addCriterion("OBSE_BOLETN >", value, "OBSE_BOLETN");
            return this;
        }

        public Criteria andOBSE_BOLETNGreaterThanOrEqualTo(String value)
        {
            addCriterion("OBSE_BOLETN >=", value, "OBSE_BOLETN");
            return this;
        }

        public Criteria andOBSE_BOLETNLessThan(String value)
        {
            addCriterion("OBSE_BOLETN <", value, "OBSE_BOLETN");
            return this;
        }

        public Criteria andOBSE_BOLETNLessThanOrEqualTo(String value)
        {
            addCriterion("OBSE_BOLETN <=", value, "OBSE_BOLETN");
            return this;
        }

        public Criteria andOBSE_BOLETNLike(String value)
        {
            addCriterion("OBSE_BOLETN like", value, "OBSE_BOLETN");
            return this;
        }

        public Criteria andOBSE_BOLETNNotLike(String value)
        {
            addCriterion("OBSE_BOLETN not like", value, "OBSE_BOLETN");
            return this;
        }

        public Criteria andOBSE_BOLETNIn(List values)
        {
            addCriterion("OBSE_BOLETN in", values, "OBSE_BOLETN");
            return this;
        }

        public Criteria andOBSE_BOLETNNotIn(List values)
        {
            addCriterion("OBSE_BOLETN not in", values, "OBSE_BOLETN");
            return this;
        }

        public Criteria andOBSE_BOLETNBetween(String value1, String value2)
        {
            addCriterion("OBSE_BOLETN between", value1, value2, "OBSE_BOLETN");
            return this;
        }

        public Criteria andOBSE_BOLETNNotBetween(String value1, String value2)
        {
            addCriterion("OBSE_BOLETN not between", value1, value2, "OBSE_BOLETN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andMONED_REPAR_BOLETNIsNull()
        {
            criteriaWithoutValue.add("MONED_REPAR_BOLETN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andMONED_REPAR_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("MONED_REPAR_BOLETN is not null");
            return this;
        }

        public Criteria andMONED_REPAR_BOLETNEqualTo(String value)
        {
            addCriterion("MONED_REPAR_BOLETN =", value, "MONED_REPAR_BOLETN");
            return this;
        }

        public Criteria andMONED_REPAR_BOLETNNotEqualTo(String value)
        {
            addCriterion("MONED_REPAR_BOLETN <>", value, "MONED_REPAR_BOLETN");
            return this;
        }

        public Criteria andMONED_REPAR_BOLETNGreaterThan(String value)
        {
            addCriterion("MONED_REPAR_BOLETN >", value, "MONED_REPAR_BOLETN");
            return this;
        }

        public Criteria andMONED_REPAR_BOLETNGreaterThanOrEqualTo(String value)
        {
            addCriterion("MONED_REPAR_BOLETN >=", value, "MONED_REPAR_BOLETN");
            return this;
        }

        public Criteria andMONED_REPAR_BOLETNLessThan(String value)
        {
            addCriterion("MONED_REPAR_BOLETN <", value, "MONED_REPAR_BOLETN");
            return this;
        }

        public Criteria andMONED_REPAR_BOLETNLessThanOrEqualTo(String value)
        {
            addCriterion("MONED_REPAR_BOLETN <=", value, "MONED_REPAR_BOLETN");
            return this;
        }

        public Criteria andMONED_REPAR_BOLETNLike(String value)
        {
            addCriterion("MONED_REPAR_BOLETN like", value, "MONED_REPAR_BOLETN");
            return this;
        }

        public Criteria andMONED_REPAR_BOLETNNotLike(String value)
        {
            addCriterion("MONED_REPAR_BOLETN not like", value, "MONED_REPAR_BOLETN");
            return this;
        }

        public Criteria andMONED_REPAR_BOLETNIn(List values)
        {
            addCriterion("MONED_REPAR_BOLETN in", values, "MONED_REPAR_BOLETN");
            return this;
        }

        public Criteria andMONED_REPAR_BOLETNNotIn(List values)
        {
            addCriterion("MONED_REPAR_BOLETN not in", values, "MONED_REPAR_BOLETN");
            return this;
        }

        public Criteria andMONED_REPAR_BOLETNBetween(String value1, String value2)
        {
            addCriterion("MONED_REPAR_BOLETN between", value1, value2, "MONED_REPAR_BOLETN");
            return this;
        }

        public Criteria andMONED_REPAR_BOLETNNotBetween(String value1, String value2)
        {
            addCriterion("MONED_REPAR_BOLETN not between", value1, value2, "MONED_REPAR_BOLETN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_INICI_CONDENIsNull()
        {
            criteriaWithoutValue.add("FECH_INICI_CONDEN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_INICI_CONDENIsNotNull()
        {
            criteriaWithoutValue.add("FECH_INICI_CONDEN is not null");
            return this;
        }

        public Criteria andFECH_INICI_CONDENEqualTo(Date value)
        {
            addCriterion("FECH_INICI_CONDEN =", value, "FECH_INICI_CONDEN");
            return this;
        }

        public Criteria andFECH_INICI_CONDENNotEqualTo(Date value)
        {
            addCriterion("FECH_INICI_CONDEN <>", value, "FECH_INICI_CONDEN");
            return this;
        }

        public Criteria andFECH_INICI_CONDENGreaterThan(Date value)
        {
            addCriterion("FECH_INICI_CONDEN >", value, "FECH_INICI_CONDEN");
            return this;
        }

        public Criteria andFECH_INICI_CONDENGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FECH_INICI_CONDEN >=", value, "FECH_INICI_CONDEN");
            return this;
        }

        public Criteria andFECH_INICI_CONDENLessThan(Date value)
        {
            addCriterion("FECH_INICI_CONDEN <", value, "FECH_INICI_CONDEN");
            return this;
        }

        public Criteria andFECH_INICI_CONDENLessThanOrEqualTo(Date value)
        {
            addCriterion("FECH_INICI_CONDEN <=", value, "FECH_INICI_CONDEN");
            return this;
        }

        public Criteria andFECH_INICI_CONDENIn(List values)
        {
            addCriterion("FECH_INICI_CONDEN in", values, "FECH_INICI_CONDEN");
            return this;
        }

        public Criteria andFECH_INICI_CONDENNotIn(List values)
        {
            addCriterion("FECH_INICI_CONDEN not in", values, "FECH_INICI_CONDEN");
            return this;
        }

        public Criteria andFECH_INICI_CONDENBetween(Date value1, Date value2)
        {
            addCriterion("FECH_INICI_CONDEN between", value1, value2, "FECH_INICI_CONDEN");
            return this;
        }

        public Criteria andFECH_INICI_CONDENNotBetween(Date value1, Date value2)
        {
            addCriterion("FECH_INICI_CONDEN not between", value1, value2, "FECH_INICI_CONDEN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_FIN_CONDENIsNull()
        {
            criteriaWithoutValue.add("FECH_FIN_CONDEN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_FIN_CONDENIsNotNull()
        {
            criteriaWithoutValue.add("FECH_FIN_CONDEN is not null");
            return this;
        }

        public Criteria andFECH_FIN_CONDENEqualTo(Date value)
        {
            addCriterion("FECH_FIN_CONDEN =", value, "FECH_FIN_CONDEN");
            return this;
        }

        public Criteria andFECH_FIN_CONDENNotEqualTo(Date value)
        {
            addCriterion("FECH_FIN_CONDEN <>", value, "FECH_FIN_CONDEN");
            return this;
        }

        public Criteria andFECH_FIN_CONDENGreaterThan(Date value)
        {
            addCriterion("FECH_FIN_CONDEN >", value, "FECH_FIN_CONDEN");
            return this;
        }

        public Criteria andFECH_FIN_CONDENGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FECH_FIN_CONDEN >=", value, "FECH_FIN_CONDEN");
            return this;
        }

        public Criteria andFECH_FIN_CONDENLessThan(Date value)
        {
            addCriterion("FECH_FIN_CONDEN <", value, "FECH_FIN_CONDEN");
            return this;
        }

        public Criteria andFECH_FIN_CONDENLessThanOrEqualTo(Date value)
        {
            addCriterion("FECH_FIN_CONDEN <=", value, "FECH_FIN_CONDEN");
            return this;
        }

        public Criteria andFECH_FIN_CONDENIn(List values)
        {
            addCriterion("FECH_FIN_CONDEN in", values, "FECH_FIN_CONDEN");
            return this;
        }

        public Criteria andFECH_FIN_CONDENNotIn(List values)
        {
            addCriterion("FECH_FIN_CONDEN not in", values, "FECH_FIN_CONDEN");
            return this;
        }

        public Criteria andFECH_FIN_CONDENBetween(Date value1, Date value2)
        {
            addCriterion("FECH_FIN_CONDEN between", value1, value2, "FECH_FIN_CONDEN");
            return this;
        }

        public Criteria andFECH_FIN_CONDENNotBetween(Date value1, Date value2)
        {
            addCriterion("FECH_FIN_CONDEN not between", value1, value2, "FECH_FIN_CONDEN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andAGRAV_BOLETNIsNull()
        {
            criteriaWithoutValue.add("AGRAV_BOLETN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andAGRAV_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("AGRAV_BOLETN is not null");
            return this;
        }

        public Criteria andAGRAV_BOLETNEqualTo(String value)
        {
            addCriterion("AGRAV_BOLETN =", value, "AGRAV_BOLETN");
            return this;
        }

        public Criteria andAGRAV_BOLETNNotEqualTo(String value)
        {
            addCriterion("AGRAV_BOLETN <>", value, "AGRAV_BOLETN");
            return this;
        }

        public Criteria andAGRAV_BOLETNGreaterThan(String value)
        {
            addCriterion("AGRAV_BOLETN >", value, "AGRAV_BOLETN");
            return this;
        }

        public Criteria andAGRAV_BOLETNGreaterThanOrEqualTo(String value)
        {
            addCriterion("AGRAV_BOLETN >=", value, "AGRAV_BOLETN");
            return this;
        }

        public Criteria andAGRAV_BOLETNLessThan(String value)
        {
            addCriterion("AGRAV_BOLETN <", value, "AGRAV_BOLETN");
            return this;
        }

        public Criteria andAGRAV_BOLETNLessThanOrEqualTo(String value)
        {
            addCriterion("AGRAV_BOLETN <=", value, "AGRAV_BOLETN");
            return this;
        }

        public Criteria andAGRAV_BOLETNLike(String value)
        {
            addCriterion("AGRAV_BOLETN like", value, "AGRAV_BOLETN");
            return this;
        }

        public Criteria andAGRAV_BOLETNNotLike(String value)
        {
            addCriterion("AGRAV_BOLETN not like", value, "AGRAV_BOLETN");
            return this;
        }

        public Criteria andAGRAV_BOLETNIn(List values)
        {
            addCriterion("AGRAV_BOLETN in", values, "AGRAV_BOLETN");
            return this;
        }

        public Criteria andAGRAV_BOLETNNotIn(List values)
        {
            addCriterion("AGRAV_BOLETN not in", values, "AGRAV_BOLETN");
            return this;
        }

        public Criteria andAGRAV_BOLETNBetween(String value1, String value2)
        {
            addCriterion("AGRAV_BOLETN between", value1, value2, "AGRAV_BOLETN");
            return this;
        }

        public Criteria andAGRAV_BOLETNNotBetween(String value1, String value2)
        {
            addCriterion("AGRAV_BOLETN not between", value1, value2, "AGRAV_BOLETN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andOBSE_JUZGDOIsNull()
        {
            criteriaWithoutValue.add("OBSE_JUZGDO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andOBSE_JUZGDOIsNotNull()
        {
            criteriaWithoutValue.add("OBSE_JUZGDO is not null");
            return this;
        }

        public Criteria andOBSE_JUZGDOEqualTo(String value)
        {
            addCriterion("OBSE_JUZGDO =", value, "OBSE_JUZGDO");
            return this;
        }

        public Criteria andOBSE_JUZGDONotEqualTo(String value)
        {
            addCriterion("OBSE_JUZGDO <>", value, "OBSE_JUZGDO");
            return this;
        }

        public Criteria andOBSE_JUZGDOGreaterThan(String value)
        {
            addCriterion("OBSE_JUZGDO >", value, "OBSE_JUZGDO");
            return this;
        }

        public Criteria andOBSE_JUZGDOGreaterThanOrEqualTo(String value)
        {
            addCriterion("OBSE_JUZGDO >=", value, "OBSE_JUZGDO");
            return this;
        }

        public Criteria andOBSE_JUZGDOLessThan(String value)
        {
            addCriterion("OBSE_JUZGDO <", value, "OBSE_JUZGDO");
            return this;
        }

        public Criteria andOBSE_JUZGDOLessThanOrEqualTo(String value)
        {
            addCriterion("OBSE_JUZGDO <=", value, "OBSE_JUZGDO");
            return this;
        }

        public Criteria andOBSE_JUZGDOLike(String value)
        {
            addCriterion("OBSE_JUZGDO like", value, "OBSE_JUZGDO");
            return this;
        }

        public Criteria andOBSE_JUZGDONotLike(String value)
        {
            addCriterion("OBSE_JUZGDO not like", value, "OBSE_JUZGDO");
            return this;
        }

        public Criteria andOBSE_JUZGDOIn(List values)
        {
            addCriterion("OBSE_JUZGDO in", values, "OBSE_JUZGDO");
            return this;
        }

        public Criteria andOBSE_JUZGDONotIn(List values)
        {
            addCriterion("OBSE_JUZGDO not in", values, "OBSE_JUZGDO");
            return this;
        }

        public Criteria andOBSE_JUZGDOBetween(String value1, String value2)
        {
            addCriterion("OBSE_JUZGDO between", value1, value2, "OBSE_JUZGDO");
            return this;
        }

        public Criteria andOBSE_JUZGDONotBetween(String value1, String value2)
        {
            addCriterion("OBSE_JUZGDO not between", value1, value2, "OBSE_JUZGDO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_LUGAR_NACIMIsNull()
        {
            criteriaWithoutValue.add("CODG_LUGAR_NACIM is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_LUGAR_NACIMIsNotNull()
        {
            criteriaWithoutValue.add("CODG_LUGAR_NACIM is not null");
            return this;
        }

        public Criteria andCODG_LUGAR_NACIMEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_NACIM =", value, "CODG_LUGAR_NACIM");
            return this;
        }

        public Criteria andCODG_LUGAR_NACIMNotEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_NACIM <>", value, "CODG_LUGAR_NACIM");
            return this;
        }

        public Criteria andCODG_LUGAR_NACIMGreaterThan(String value)
        {
            addCriterion("CODG_LUGAR_NACIM >", value, "CODG_LUGAR_NACIM");
            return this;
        }

        public Criteria andCODG_LUGAR_NACIMGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_NACIM >=", value, "CODG_LUGAR_NACIM");
            return this;
        }

        public Criteria andCODG_LUGAR_NACIMLessThan(String value)
        {
            addCriterion("CODG_LUGAR_NACIM <", value, "CODG_LUGAR_NACIM");
            return this;
        }

        public Criteria andCODG_LUGAR_NACIMLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_NACIM <=", value, "CODG_LUGAR_NACIM");
            return this;
        }

        public Criteria andCODG_LUGAR_NACIMLike(String value)
        {
            addCriterion("CODG_LUGAR_NACIM like", value, "CODG_LUGAR_NACIM");
            return this;
        }

        public Criteria andCODG_LUGAR_NACIMNotLike(String value)
        {
            addCriterion("CODG_LUGAR_NACIM not like", value, "CODG_LUGAR_NACIM");
            return this;
        }

        public Criteria andCODG_LUGAR_NACIMIn(List values)
        {
            addCriterion("CODG_LUGAR_NACIM in", values, "CODG_LUGAR_NACIM");
            return this;
        }

        public Criteria andCODG_LUGAR_NACIMNotIn(List values)
        {
            addCriterion("CODG_LUGAR_NACIM not in", values, "CODG_LUGAR_NACIM");
            return this;
        }

        public Criteria andCODG_LUGAR_NACIMBetween(String value1, String value2)
        {
            addCriterion("CODG_LUGAR_NACIM between", value1, value2, "CODG_LUGAR_NACIM");
            return this;
        }

        public Criteria andCODG_LUGAR_NACIMNotBetween(String value1, String value2)
        {
            addCriterion("CODG_LUGAR_NACIM not between", value1, value2, "CODG_LUGAR_NACIM");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDOCU_IDENT_SOLICIsNull()
        {
            criteriaWithoutValue.add("DOCU_IDENT_SOLIC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDOCU_IDENT_SOLICIsNotNull()
        {
            criteriaWithoutValue.add("DOCU_IDENT_SOLIC is not null");
            return this;
        }

        public Criteria andDOCU_IDENT_SOLICEqualTo(String value)
        {
            addCriterion("DOCU_IDENT_SOLIC =", value, "DOCU_IDENT_SOLIC");
            return this;
        }

        public Criteria andDOCU_IDENT_SOLICNotEqualTo(String value)
        {
            addCriterion("DOCU_IDENT_SOLIC <>", value, "DOCU_IDENT_SOLIC");
            return this;
        }

        public Criteria andDOCU_IDENT_SOLICGreaterThan(String value)
        {
            addCriterion("DOCU_IDENT_SOLIC >", value, "DOCU_IDENT_SOLIC");
            return this;
        }

        public Criteria andDOCU_IDENT_SOLICGreaterThanOrEqualTo(String value)
        {
            addCriterion("DOCU_IDENT_SOLIC >=", value, "DOCU_IDENT_SOLIC");
            return this;
        }

        public Criteria andDOCU_IDENT_SOLICLessThan(String value)
        {
            addCriterion("DOCU_IDENT_SOLIC <", value, "DOCU_IDENT_SOLIC");
            return this;
        }

        public Criteria andDOCU_IDENT_SOLICLessThanOrEqualTo(String value)
        {
            addCriterion("DOCU_IDENT_SOLIC <=", value, "DOCU_IDENT_SOLIC");
            return this;
        }

        public Criteria andDOCU_IDENT_SOLICLike(String value)
        {
            addCriterion("DOCU_IDENT_SOLIC like", value, "DOCU_IDENT_SOLIC");
            return this;
        }

        public Criteria andDOCU_IDENT_SOLICNotLike(String value)
        {
            addCriterion("DOCU_IDENT_SOLIC not like", value, "DOCU_IDENT_SOLIC");
            return this;
        }

        public Criteria andDOCU_IDENT_SOLICIn(List values)
        {
            addCriterion("DOCU_IDENT_SOLIC in", values, "DOCU_IDENT_SOLIC");
            return this;
        }

        public Criteria andDOCU_IDENT_SOLICNotIn(List values)
        {
            addCriterion("DOCU_IDENT_SOLIC not in", values, "DOCU_IDENT_SOLIC");
            return this;
        }

        public Criteria andDOCU_IDENT_SOLICBetween(String value1, String value2)
        {
            addCriterion("DOCU_IDENT_SOLIC between", value1, value2, "DOCU_IDENT_SOLIC");
            return this;
        }

        public Criteria andDOCU_IDENT_SOLICNotBetween(String value1, String value2)
        {
            addCriterion("DOCU_IDENT_SOLIC not between", value1, value2, "DOCU_IDENT_SOLIC");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUME_IDENT_SOLICIsNull()
        {
            criteriaWithoutValue.add("NUME_IDENT_SOLIC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUME_IDENT_SOLICIsNotNull()
        {
            criteriaWithoutValue.add("NUME_IDENT_SOLIC is not null");
            return this;
        }

        public Criteria andNUME_IDENT_SOLICEqualTo(String value)
        {
            addCriterion("NUME_IDENT_SOLIC =", value, "NUME_IDENT_SOLIC");
            return this;
        }

        public Criteria andNUME_IDENT_SOLICNotEqualTo(String value)
        {
            addCriterion("NUME_IDENT_SOLIC <>", value, "NUME_IDENT_SOLIC");
            return this;
        }

        public Criteria andNUME_IDENT_SOLICGreaterThan(String value)
        {
            addCriterion("NUME_IDENT_SOLIC >", value, "NUME_IDENT_SOLIC");
            return this;
        }

        public Criteria andNUME_IDENT_SOLICGreaterThanOrEqualTo(String value)
        {
            addCriterion("NUME_IDENT_SOLIC >=", value, "NUME_IDENT_SOLIC");
            return this;
        }

        public Criteria andNUME_IDENT_SOLICLessThan(String value)
        {
            addCriterion("NUME_IDENT_SOLIC <", value, "NUME_IDENT_SOLIC");
            return this;
        }

        public Criteria andNUME_IDENT_SOLICLessThanOrEqualTo(String value)
        {
            addCriterion("NUME_IDENT_SOLIC <=", value, "NUME_IDENT_SOLIC");
            return this;
        }

        public Criteria andNUME_IDENT_SOLICLike(String value)
        {
            addCriterion("NUME_IDENT_SOLIC like", value, "NUME_IDENT_SOLIC");
            return this;
        }

        public Criteria andNUME_IDENT_SOLICNotLike(String value)
        {
            addCriterion("NUME_IDENT_SOLIC not like", value, "NUME_IDENT_SOLIC");
            return this;
        }

        public Criteria andNUME_IDENT_SOLICIn(List values)
        {
            addCriterion("NUME_IDENT_SOLIC in", values, "NUME_IDENT_SOLIC");
            return this;
        }

        public Criteria andNUME_IDENT_SOLICNotIn(List values)
        {
            addCriterion("NUME_IDENT_SOLIC not in", values, "NUME_IDENT_SOLIC");
            return this;
        }

        public Criteria andNUME_IDENT_SOLICBetween(String value1, String value2)
        {
            addCriterion("NUME_IDENT_SOLIC between", value1, value2, "NUME_IDENT_SOLIC");
            return this;
        }

        public Criteria andNUME_IDENT_SOLICNotBetween(String value1, String value2)
        {
            addCriterion("NUME_IDENT_SOLIC not between", value1, value2, "NUME_IDENT_SOLIC");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_PROFEIsNull()
        {
            criteriaWithoutValue.add("CODG_PROFE is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_PROFEIsNotNull()
        {
            criteriaWithoutValue.add("CODG_PROFE is not null");
            return this;
        }

        public Criteria andCODG_PROFEEqualTo(String value)
        {
            addCriterion("CODG_PROFE =", value, "CODG_PROFE");
            return this;
        }

        public Criteria andCODG_PROFENotEqualTo(String value)
        {
            addCriterion("CODG_PROFE <>", value, "CODG_PROFE");
            return this;
        }

        public Criteria andCODG_PROFEGreaterThan(String value)
        {
            addCriterion("CODG_PROFE >", value, "CODG_PROFE");
            return this;
        }

        public Criteria andCODG_PROFEGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_PROFE >=", value, "CODG_PROFE");
            return this;
        }

        public Criteria andCODG_PROFELessThan(String value)
        {
            addCriterion("CODG_PROFE <", value, "CODG_PROFE");
            return this;
        }

        public Criteria andCODG_PROFELessThanOrEqualTo(String value)
        {
            addCriterion("CODG_PROFE <=", value, "CODG_PROFE");
            return this;
        }

        public Criteria andCODG_PROFELike(String value)
        {
            addCriterion("CODG_PROFE like", value, "CODG_PROFE");
            return this;
        }

        public Criteria andCODG_PROFENotLike(String value)
        {
            addCriterion("CODG_PROFE not like", value, "CODG_PROFE");
            return this;
        }

        public Criteria andCODG_PROFEIn(List values)
        {
            addCriterion("CODG_PROFE in", values, "CODG_PROFE");
            return this;
        }

        public Criteria andCODG_PROFENotIn(List values)
        {
            addCriterion("CODG_PROFE not in", values, "CODG_PROFE");
            return this;
        }

        public Criteria andCODG_PROFEBetween(String value1, String value2)
        {
            addCriterion("CODG_PROFE between", value1, value2, "CODG_PROFE");
            return this;
        }

        public Criteria andCODG_PROFENotBetween(String value1, String value2)
        {
            addCriterion("CODG_PROFE not between", value1, value2, "CODG_PROFE");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_ASPECIsNull()
        {
            criteriaWithoutValue.add("CODG_ASPEC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_ASPECIsNotNull()
        {
            criteriaWithoutValue.add("CODG_ASPEC is not null");
            return this;
        }

        public Criteria andCODG_ASPECEqualTo(String value)
        {
            addCriterion("CODG_ASPEC =", value, "CODG_ASPEC");
            return this;
        }

        public Criteria andCODG_ASPECNotEqualTo(String value)
        {
            addCriterion("CODG_ASPEC <>", value, "CODG_ASPEC");
            return this;
        }

        public Criteria andCODG_ASPECGreaterThan(String value)
        {
            addCriterion("CODG_ASPEC >", value, "CODG_ASPEC");
            return this;
        }

        public Criteria andCODG_ASPECGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_ASPEC >=", value, "CODG_ASPEC");
            return this;
        }

        public Criteria andCODG_ASPECLessThan(String value)
        {
            addCriterion("CODG_ASPEC <", value, "CODG_ASPEC");
            return this;
        }

        public Criteria andCODG_ASPECLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_ASPEC <=", value, "CODG_ASPEC");
            return this;
        }

        public Criteria andCODG_ASPECLike(String value)
        {
            addCriterion("CODG_ASPEC like", value, "CODG_ASPEC");
            return this;
        }

        public Criteria andCODG_ASPECNotLike(String value)
        {
            addCriterion("CODG_ASPEC not like", value, "CODG_ASPEC");
            return this;
        }

        public Criteria andCODG_ASPECIn(List values)
        {
            addCriterion("CODG_ASPEC in", values, "CODG_ASPEC");
            return this;
        }

        public Criteria andCODG_ASPECNotIn(List values)
        {
            addCriterion("CODG_ASPEC not in", values, "CODG_ASPEC");
            return this;
        }

        public Criteria andCODG_ASPECBetween(String value1, String value2)
        {
            addCriterion("CODG_ASPEC between", value1, value2, "CODG_ASPEC");
            return this;
        }

        public Criteria andCODG_ASPECNotBetween(String value1, String value2)
        {
            addCriterion("CODG_ASPEC not between", value1, value2, "CODG_ASPEC");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_ESTADIsNull()
        {
            criteriaWithoutValue.add("CODG_ESTAD is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_ESTADIsNotNull()
        {
            criteriaWithoutValue.add("CODG_ESTAD is not null");
            return this;
        }

        public Criteria andCODG_ESTADEqualTo(String value)
        {
            addCriterion("CODG_ESTAD =", value, "CODG_ESTAD");
            return this;
        }

        public Criteria andCODG_ESTADNotEqualTo(String value)
        {
            addCriterion("CODG_ESTAD <>", value, "CODG_ESTAD");
            return this;
        }

        public Criteria andCODG_ESTADGreaterThan(String value)
        {
            addCriterion("CODG_ESTAD >", value, "CODG_ESTAD");
            return this;
        }

        public Criteria andCODG_ESTADGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_ESTAD >=", value, "CODG_ESTAD");
            return this;
        }

        public Criteria andCODG_ESTADLessThan(String value)
        {
            addCriterion("CODG_ESTAD <", value, "CODG_ESTAD");
            return this;
        }

        public Criteria andCODG_ESTADLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_ESTAD <=", value, "CODG_ESTAD");
            return this;
        }

        public Criteria andCODG_ESTADLike(String value)
        {
            addCriterion("CODG_ESTAD like", value, "CODG_ESTAD");
            return this;
        }

        public Criteria andCODG_ESTADNotLike(String value)
        {
            addCriterion("CODG_ESTAD not like", value, "CODG_ESTAD");
            return this;
        }

        public Criteria andCODG_ESTADIn(List values)
        {
            addCriterion("CODG_ESTAD in", values, "CODG_ESTAD");
            return this;
        }

        public Criteria andCODG_ESTADNotIn(List values)
        {
            addCriterion("CODG_ESTAD not in", values, "CODG_ESTAD");
            return this;
        }

        public Criteria andCODG_ESTADBetween(String value1, String value2)
        {
            addCriterion("CODG_ESTAD between", value1, value2, "CODG_ESTAD");
            return this;
        }

        public Criteria andCODG_ESTADNotBetween(String value1, String value2)
        {
            addCriterion("CODG_ESTAD not between", value1, value2, "CODG_ESTAD");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andESTATURA_BOLETNIsNull()
        {
            criteriaWithoutValue.add("ESTATURA_BOLETN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andESTATURA_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("ESTATURA_BOLETN is not null");
            return this;
        }

        public Criteria andESTATURA_BOLETNEqualTo(BigDecimal value)
        {
            addCriterion("ESTATURA_BOLETN =", value, "ESTATURA_BOLETN");
            return this;
        }

        public Criteria andESTATURA_BOLETNNotEqualTo(BigDecimal value)
        {
            addCriterion("ESTATURA_BOLETN <>", value, "ESTATURA_BOLETN");
            return this;
        }

        public Criteria andESTATURA_BOLETNGreaterThan(BigDecimal value)
        {
            addCriterion("ESTATURA_BOLETN >", value, "ESTATURA_BOLETN");
            return this;
        }

        public Criteria andESTATURA_BOLETNGreaterThanOrEqualTo(BigDecimal value)
        {
            addCriterion("ESTATURA_BOLETN >=", value, "ESTATURA_BOLETN");
            return this;
        }

        public Criteria andESTATURA_BOLETNLessThan(BigDecimal value)
        {
            addCriterion("ESTATURA_BOLETN <", value, "ESTATURA_BOLETN");
            return this;
        }

        public Criteria andESTATURA_BOLETNLessThanOrEqualTo(BigDecimal value)
        {
            addCriterion("ESTATURA_BOLETN <=", value, "ESTATURA_BOLETN");
            return this;
        }

        public Criteria andESTATURA_BOLETNIn(List values)
        {
            addCriterion("ESTATURA_BOLETN in", values, "ESTATURA_BOLETN");
            return this;
        }

        public Criteria andESTATURA_BOLETNNotIn(List values)
        {
            addCriterion("ESTATURA_BOLETN not in", values, "ESTATURA_BOLETN");
            return this;
        }

        public Criteria andESTATURA_BOLETNBetween(BigDecimal value1, BigDecimal value2)
        {
            addCriterion("ESTATURA_BOLETN between", value1, value2, "ESTATURA_BOLETN");
            return this;
        }

        public Criteria andESTATURA_BOLETNNotBetween(BigDecimal value1, BigDecimal value2)
        {
            addCriterion("ESTATURA_BOLETN not between", value1, value2, "ESTATURA_BOLETN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUME_HIJOS_BOLETNIsNull()
        {
            criteriaWithoutValue.add("NUME_HIJOS_BOLETN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUME_HIJOS_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("NUME_HIJOS_BOLETN is not null");
            return this;
        }

        public Criteria andNUME_HIJOS_BOLETNEqualTo(Short value)
        {
            addCriterion("NUME_HIJOS_BOLETN =", value, "NUME_HIJOS_BOLETN");
            return this;
        }

        public Criteria andNUME_HIJOS_BOLETNNotEqualTo(Short value)
        {
            addCriterion("NUME_HIJOS_BOLETN <>", value, "NUME_HIJOS_BOLETN");
            return this;
        }

        public Criteria andNUME_HIJOS_BOLETNGreaterThan(Short value)
        {
            addCriterion("NUME_HIJOS_BOLETN >", value, "NUME_HIJOS_BOLETN");
            return this;
        }

        public Criteria andNUME_HIJOS_BOLETNGreaterThanOrEqualTo(Short value)
        {
            addCriterion("NUME_HIJOS_BOLETN >=", value, "NUME_HIJOS_BOLETN");
            return this;
        }

        public Criteria andNUME_HIJOS_BOLETNLessThan(Short value)
        {
            addCriterion("NUME_HIJOS_BOLETN <", value, "NUME_HIJOS_BOLETN");
            return this;
        }

        public Criteria andNUME_HIJOS_BOLETNLessThanOrEqualTo(Short value)
        {
            addCriterion("NUME_HIJOS_BOLETN <=", value, "NUME_HIJOS_BOLETN");
            return this;
        }

        public Criteria andNUME_HIJOS_BOLETNIn(List values)
        {
            addCriterion("NUME_HIJOS_BOLETN in", values, "NUME_HIJOS_BOLETN");
            return this;
        }

        public Criteria andNUME_HIJOS_BOLETNNotIn(List values)
        {
            addCriterion("NUME_HIJOS_BOLETN not in", values, "NUME_HIJOS_BOLETN");
            return this;
        }

        public Criteria andNUME_HIJOS_BOLETNBetween(Short value1, Short value2)
        {
            addCriterion("NUME_HIJOS_BOLETN between", value1, value2, "NUME_HIJOS_BOLETN");
            return this;
        }

        public Criteria andNUME_HIJOS_BOLETNNotBetween(Short value1, Short value2)
        {
            addCriterion("NUME_HIJOS_BOLETN not between", value1, value2, "NUME_HIJOS_BOLETN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_DELIT2IsNull()
        {
            criteriaWithoutValue.add("CODG_DELIT2 is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_DELIT2IsNotNull()
        {
            criteriaWithoutValue.add("CODG_DELIT2 is not null");
            return this;
        }

        public Criteria andCODG_DELIT2EqualTo(String value)
        {
            addCriterion("CODG_DELIT2 =", value, "CODG_DELIT2");
            return this;
        }

        public Criteria andCODG_DELIT2NotEqualTo(String value)
        {
            addCriterion("CODG_DELIT2 <>", value, "CODG_DELIT2");
            return this;
        }

        public Criteria andCODG_DELIT2GreaterThan(String value)
        {
            addCriterion("CODG_DELIT2 >", value, "CODG_DELIT2");
            return this;
        }

        public Criteria andCODG_DELIT2GreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_DELIT2 >=", value, "CODG_DELIT2");
            return this;
        }

        public Criteria andCODG_DELIT2LessThan(String value)
        {
            addCriterion("CODG_DELIT2 <", value, "CODG_DELIT2");
            return this;
        }

        public Criteria andCODG_DELIT2LessThanOrEqualTo(String value)
        {
            addCriterion("CODG_DELIT2 <=", value, "CODG_DELIT2");
            return this;
        }

        public Criteria andCODG_DELIT2Like(String value)
        {
            addCriterion("CODG_DELIT2 like", value, "CODG_DELIT2");
            return this;
        }

        public Criteria andCODG_DELIT2NotLike(String value)
        {
            addCriterion("CODG_DELIT2 not like", value, "CODG_DELIT2");
            return this;
        }

        public Criteria andCODG_DELIT2In(List values)
        {
            addCriterion("CODG_DELIT2 in", values, "CODG_DELIT2");
            return this;
        }

        public Criteria andCODG_DELIT2NotIn(List values)
        {
            addCriterion("CODG_DELIT2 not in", values, "CODG_DELIT2");
            return this;
        }

        public Criteria andCODG_DELIT2Between(String value1, String value2)
        {
            addCriterion("CODG_DELIT2 between", value1, value2, "CODG_DELIT2");
            return this;
        }

        public Criteria andCODG_DELIT2NotBetween(String value1, String value2)
        {
            addCriterion("CODG_DELIT2 not between", value1, value2, "CODG_DELIT2");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_DELIT3IsNull()
        {
            criteriaWithoutValue.add("CODG_DELIT3 is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_DELIT3IsNotNull()
        {
            criteriaWithoutValue.add("CODG_DELIT3 is not null");
            return this;
        }

        public Criteria andCODG_DELIT3EqualTo(String value)
        {
            addCriterion("CODG_DELIT3 =", value, "CODG_DELIT3");
            return this;
        }

        public Criteria andCODG_DELIT3NotEqualTo(String value)
        {
            addCriterion("CODG_DELIT3 <>", value, "CODG_DELIT3");
            return this;
        }

        public Criteria andCODG_DELIT3GreaterThan(String value)
        {
            addCriterion("CODG_DELIT3 >", value, "CODG_DELIT3");
            return this;
        }

        public Criteria andCODG_DELIT3GreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_DELIT3 >=", value, "CODG_DELIT3");
            return this;
        }

        public Criteria andCODG_DELIT3LessThan(String value)
        {
            addCriterion("CODG_DELIT3 <", value, "CODG_DELIT3");
            return this;
        }

        public Criteria andCODG_DELIT3LessThanOrEqualTo(String value)
        {
            addCriterion("CODG_DELIT3 <=", value, "CODG_DELIT3");
            return this;
        }

        public Criteria andCODG_DELIT3Like(String value)
        {
            addCriterion("CODG_DELIT3 like", value, "CODG_DELIT3");
            return this;
        }

        public Criteria andCODG_DELIT3NotLike(String value)
        {
            addCriterion("CODG_DELIT3 not like", value, "CODG_DELIT3");
            return this;
        }

        public Criteria andCODG_DELIT3In(List values)
        {
            addCriterion("CODG_DELIT3 in", values, "CODG_DELIT3");
            return this;
        }

        public Criteria andCODG_DELIT3NotIn(List values)
        {
            addCriterion("CODG_DELIT3 not in", values, "CODG_DELIT3");
            return this;
        }

        public Criteria andCODG_DELIT3Between(String value1, String value2)
        {
            addCriterion("CODG_DELIT3 between", value1, value2, "CODG_DELIT3");
            return this;
        }

        public Criteria andCODG_DELIT3NotBetween(String value1, String value2)
        {
            addCriterion("CODG_DELIT3 not between", value1, value2, "CODG_DELIT3");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_DELIT4IsNull()
        {
            criteriaWithoutValue.add("CODG_DELIT4 is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_DELIT4IsNotNull()
        {
            criteriaWithoutValue.add("CODG_DELIT4 is not null");
            return this;
        }

        public Criteria andCODG_DELIT4EqualTo(String value)
        {
            addCriterion("CODG_DELIT4 =", value, "CODG_DELIT4");
            return this;
        }

        public Criteria andCODG_DELIT4NotEqualTo(String value)
        {
            addCriterion("CODG_DELIT4 <>", value, "CODG_DELIT4");
            return this;
        }

        public Criteria andCODG_DELIT4GreaterThan(String value)
        {
            addCriterion("CODG_DELIT4 >", value, "CODG_DELIT4");
            return this;
        }

        public Criteria andCODG_DELIT4GreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_DELIT4 >=", value, "CODG_DELIT4");
            return this;
        }

        public Criteria andCODG_DELIT4LessThan(String value)
        {
            addCriterion("CODG_DELIT4 <", value, "CODG_DELIT4");
            return this;
        }

        public Criteria andCODG_DELIT4LessThanOrEqualTo(String value)
        {
            addCriterion("CODG_DELIT4 <=", value, "CODG_DELIT4");
            return this;
        }

        public Criteria andCODG_DELIT4Like(String value)
        {
            addCriterion("CODG_DELIT4 like", value, "CODG_DELIT4");
            return this;
        }

        public Criteria andCODG_DELIT4NotLike(String value)
        {
            addCriterion("CODG_DELIT4 not like", value, "CODG_DELIT4");
            return this;
        }

        public Criteria andCODG_DELIT4In(List values)
        {
            addCriterion("CODG_DELIT4 in", values, "CODG_DELIT4");
            return this;
        }

        public Criteria andCODG_DELIT4NotIn(List values)
        {
            addCriterion("CODG_DELIT4 not in", values, "CODG_DELIT4");
            return this;
        }

        public Criteria andCODG_DELIT4Between(String value1, String value2)
        {
            addCriterion("CODG_DELIT4 between", value1, value2, "CODG_DELIT4");
            return this;
        }

        public Criteria andCODG_DELIT4NotBetween(String value1, String value2)
        {
            addCriterion("CODG_DELIT4 not between", value1, value2, "CODG_DELIT4");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_DELIT5IsNull()
        {
            criteriaWithoutValue.add("CODG_DELIT5 is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_DELIT5IsNotNull()
        {
            criteriaWithoutValue.add("CODG_DELIT5 is not null");
            return this;
        }

        public Criteria andCODG_DELIT5EqualTo(String value)
        {
            addCriterion("CODG_DELIT5 =", value, "CODG_DELIT5");
            return this;
        }

        public Criteria andCODG_DELIT5NotEqualTo(String value)
        {
            addCriterion("CODG_DELIT5 <>", value, "CODG_DELIT5");
            return this;
        }

        public Criteria andCODG_DELIT5GreaterThan(String value)
        {
            addCriterion("CODG_DELIT5 >", value, "CODG_DELIT5");
            return this;
        }

        public Criteria andCODG_DELIT5GreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_DELIT5 >=", value, "CODG_DELIT5");
            return this;
        }

        public Criteria andCODG_DELIT5LessThan(String value)
        {
            addCriterion("CODG_DELIT5 <", value, "CODG_DELIT5");
            return this;
        }

        public Criteria andCODG_DELIT5LessThanOrEqualTo(String value)
        {
            addCriterion("CODG_DELIT5 <=", value, "CODG_DELIT5");
            return this;
        }

        public Criteria andCODG_DELIT5Like(String value)
        {
            addCriterion("CODG_DELIT5 like", value, "CODG_DELIT5");
            return this;
        }

        public Criteria andCODG_DELIT5NotLike(String value)
        {
            addCriterion("CODG_DELIT5 not like", value, "CODG_DELIT5");
            return this;
        }

        public Criteria andCODG_DELIT5In(List values)
        {
            addCriterion("CODG_DELIT5 in", values, "CODG_DELIT5");
            return this;
        }

        public Criteria andCODG_DELIT5NotIn(List values)
        {
            addCriterion("CODG_DELIT5 not in", values, "CODG_DELIT5");
            return this;
        }

        public Criteria andCODG_DELIT5Between(String value1, String value2)
        {
            addCriterion("CODG_DELIT5 between", value1, value2, "CODG_DELIT5");
            return this;
        }

        public Criteria andCODG_DELIT5NotBetween(String value1, String value2)
        {
            addCriterion("CODG_DELIT5 not between", value1, value2, "CODG_DELIT5");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_DELIT_ANTIGIsNull()
        {
            criteriaWithoutValue.add("DESC_DELIT_ANTIG is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_DELIT_ANTIGIsNotNull()
        {
            criteriaWithoutValue.add("DESC_DELIT_ANTIG is not null");
            return this;
        }

        public Criteria andDESC_DELIT_ANTIGEqualTo(String value)
        {
            addCriterion("DESC_DELIT_ANTIG =", value, "DESC_DELIT_ANTIG");
            return this;
        }

        public Criteria andDESC_DELIT_ANTIGNotEqualTo(String value)
        {
            addCriterion("DESC_DELIT_ANTIG <>", value, "DESC_DELIT_ANTIG");
            return this;
        }

        public Criteria andDESC_DELIT_ANTIGGreaterThan(String value)
        {
            addCriterion("DESC_DELIT_ANTIG >", value, "DESC_DELIT_ANTIG");
            return this;
        }

        public Criteria andDESC_DELIT_ANTIGGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_DELIT_ANTIG >=", value, "DESC_DELIT_ANTIG");
            return this;
        }

        public Criteria andDESC_DELIT_ANTIGLessThan(String value)
        {
            addCriterion("DESC_DELIT_ANTIG <", value, "DESC_DELIT_ANTIG");
            return this;
        }

        public Criteria andDESC_DELIT_ANTIGLessThanOrEqualTo(String value)
        {
            addCriterion("DESC_DELIT_ANTIG <=", value, "DESC_DELIT_ANTIG");
            return this;
        }

        public Criteria andDESC_DELIT_ANTIGLike(String value)
        {
            addCriterion("DESC_DELIT_ANTIG like", value, "DESC_DELIT_ANTIG");
            return this;
        }

        public Criteria andDESC_DELIT_ANTIGNotLike(String value)
        {
            addCriterion("DESC_DELIT_ANTIG not like", value, "DESC_DELIT_ANTIG");
            return this;
        }

        public Criteria andDESC_DELIT_ANTIGIn(List values)
        {
            addCriterion("DESC_DELIT_ANTIG in", values, "DESC_DELIT_ANTIG");
            return this;
        }

        public Criteria andDESC_DELIT_ANTIGNotIn(List values)
        {
            addCriterion("DESC_DELIT_ANTIG not in", values, "DESC_DELIT_ANTIG");
            return this;
        }

        public Criteria andDESC_DELIT_ANTIGBetween(String value1, String value2)
        {
            addCriterion("DESC_DELIT_ANTIG between", value1, value2, "DESC_DELIT_ANTIG");
            return this;
        }

        public Criteria andDESC_DELIT_ANTIGNotBetween(String value1, String value2)
        {
            addCriterion("DESC_DELIT_ANTIG not between", value1, value2, "DESC_DELIT_ANTIG");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andOBSERVADOIsNull()
        {
            criteriaWithoutValue.add("OBSERVADO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andOBSERVADOIsNotNull()
        {
            criteriaWithoutValue.add("OBSERVADO is not null");
            return this;
        }

        public Criteria andOBSERVADOEqualTo(String value)
        {
            addCriterion("OBSERVADO =", value, "OBSERVADO");
            return this;
        }

        public Criteria andOBSERVADONotEqualTo(String value)
        {
            addCriterion("OBSERVADO <>", value, "OBSERVADO");
            return this;
        }

        public Criteria andOBSERVADOGreaterThan(String value)
        {
            addCriterion("OBSERVADO >", value, "OBSERVADO");
            return this;
        }

        public Criteria andOBSERVADOGreaterThanOrEqualTo(String value)
        {
            addCriterion("OBSERVADO >=", value, "OBSERVADO");
            return this;
        }

        public Criteria andOBSERVADOLessThan(String value)
        {
            addCriterion("OBSERVADO <", value, "OBSERVADO");
            return this;
        }

        public Criteria andOBSERVADOLessThanOrEqualTo(String value)
        {
            addCriterion("OBSERVADO <=", value, "OBSERVADO");
            return this;
        }

        public Criteria andOBSERVADOLike(String value)
        {
            addCriterion("OBSERVADO like", value, "OBSERVADO");
            return this;
        }

        public Criteria andOBSERVADONotLike(String value)
        {
            addCriterion("OBSERVADO not like", value, "OBSERVADO");
            return this;
        }

        public Criteria andOBSERVADOIn(List values)
        {
            addCriterion("OBSERVADO in", values, "OBSERVADO");
            return this;
        }

        public Criteria andOBSERVADONotIn(List values)
        {
            addCriterion("OBSERVADO not in", values, "OBSERVADO");
            return this;
        }

        public Criteria andOBSERVADOBetween(String value1, String value2)
        {
            addCriterion("OBSERVADO between", value1, value2, "OBSERVADO");
            return this;
        }

        public Criteria andOBSERVADONotBetween(String value1, String value2)
        {
            addCriterion("OBSERVADO not between", value1, value2, "OBSERVADO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andANN0IsNull()
        {
            criteriaWithoutValue.add("ANN0 is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andANN0IsNotNull()
        {
            criteriaWithoutValue.add("ANN0 is not null");
            return this;
        }

        public Criteria andANN0EqualTo(String value)
        {
            addCriterion("ANN0 =", value, "ANN0");
            return this;
        }

        public Criteria andANN0NotEqualTo(String value)
        {
            addCriterion("ANN0 <>", value, "ANN0");
            return this;
        }

        public Criteria andANN0GreaterThan(String value)
        {
            addCriterion("ANN0 >", value, "ANN0");
            return this;
        }

        public Criteria andANN0GreaterThanOrEqualTo(String value)
        {
            addCriterion("ANN0 >=", value, "ANN0");
            return this;
        }

        public Criteria andANN0LessThan(String value)
        {
            addCriterion("ANN0 <", value, "ANN0");
            return this;
        }

        public Criteria andANN0LessThanOrEqualTo(String value)
        {
            addCriterion("ANN0 <=", value, "ANN0");
            return this;
        }

        public Criteria andANN0Like(String value)
        {
            addCriterion("ANN0 like", value, "ANN0");
            return this;
        }

        public Criteria andANN0NotLike(String value)
        {
            addCriterion("ANN0 not like", value, "ANN0");
            return this;
        }

        public Criteria andANN0In(List values)
        {
            addCriterion("ANN0 in", values, "ANN0");
            return this;
        }

        public Criteria andANN0NotIn(List values)
        {
            addCriterion("ANN0 not in", values, "ANN0");
            return this;
        }

        public Criteria andANN0Between(String value1, String value2)
        {
            addCriterion("ANN0 between", value1, value2, "ANN0");
            return this;
        }

        public Criteria andANN0NotBetween(String value1, String value2)
        {
            addCriterion("ANN0 not between", value1, value2, "ANN0");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_ESTADO_BOLETINIsNull()
        {
            criteriaWithoutValue.add("CODG_ESTADO_BOLETIN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_ESTADO_BOLETINIsNotNull()
        {
            criteriaWithoutValue.add("CODG_ESTADO_BOLETIN is not null");
            return this;
        }

        public Criteria andCODG_ESTADO_BOLETINEqualTo(String value)
        {
            addCriterion("CODG_ESTADO_BOLETIN =", value, "CODG_ESTADO_BOLETIN");
            return this;
        }

        public Criteria andCODG_ESTADO_BOLETINNotEqualTo(String value)
        {
            addCriterion("CODG_ESTADO_BOLETIN <>", value, "CODG_ESTADO_BOLETIN");
            return this;
        }

        public Criteria andCODG_ESTADO_BOLETINGreaterThan(String value)
        {
            addCriterion("CODG_ESTADO_BOLETIN >", value, "CODG_ESTADO_BOLETIN");
            return this;
        }

        public Criteria andCODG_ESTADO_BOLETINGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_ESTADO_BOLETIN >=", value, "CODG_ESTADO_BOLETIN");
            return this;
        }

        public Criteria andCODG_ESTADO_BOLETINLessThan(String value)
        {
            addCriterion("CODG_ESTADO_BOLETIN <", value, "CODG_ESTADO_BOLETIN");
            return this;
        }

        public Criteria andCODG_ESTADO_BOLETINLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_ESTADO_BOLETIN <=", value, "CODG_ESTADO_BOLETIN");
            return this;
        }

        public Criteria andCODG_ESTADO_BOLETINLike(String value)
        {
            addCriterion("CODG_ESTADO_BOLETIN like", value, "CODG_ESTADO_BOLETIN");
            return this;
        }

        public Criteria andCODG_ESTADO_BOLETINNotLike(String value)
        {
            addCriterion("CODG_ESTADO_BOLETIN not like", value, "CODG_ESTADO_BOLETIN");
            return this;
        }

        public Criteria andCODG_ESTADO_BOLETINIn(List values)
        {
            addCriterion("CODG_ESTADO_BOLETIN in", values, "CODG_ESTADO_BOLETIN");
            return this;
        }

        public Criteria andCODG_ESTADO_BOLETINNotIn(List values)
        {
            addCriterion("CODG_ESTADO_BOLETIN not in", values, "CODG_ESTADO_BOLETIN");
            return this;
        }

        public Criteria andCODG_ESTADO_BOLETINBetween(String value1, String value2)
        {
            addCriterion("CODG_ESTADO_BOLETIN between", value1, value2, "CODG_ESTADO_BOLETIN");
            return this;
        }

        public Criteria andCODG_ESTADO_BOLETINNotBetween(String value1, String value2)
        {
            addCriterion("CODG_ESTADO_BOLETIN not between", value1, value2, "CODG_ESTADO_BOLETIN");
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
        public Criteria andCODG_USU_ACTUALIsNull()
        {
            criteriaWithoutValue.add("CODG_USU_ACTUAL is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_USU_ACTUALIsNotNull()
        {
            criteriaWithoutValue.add("CODG_USU_ACTUAL is not null");
            return this;
        }

        public Criteria andCODG_USU_ACTUALEqualTo(String value)
        {
            addCriterion("CODG_USU_ACTUAL =", value, "CODG_USU_ACTUAL");
            return this;
        }

        public Criteria andCODG_USU_ACTUALNotEqualTo(String value)
        {
            addCriterion("CODG_USU_ACTUAL <>", value, "CODG_USU_ACTUAL");
            return this;
        }

        public Criteria andCODG_USU_ACTUALGreaterThan(String value)
        {
            addCriterion("CODG_USU_ACTUAL >", value, "CODG_USU_ACTUAL");
            return this;
        }

        public Criteria andCODG_USU_ACTUALGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_USU_ACTUAL >=", value, "CODG_USU_ACTUAL");
            return this;
        }

        public Criteria andCODG_USU_ACTUALLessThan(String value)
        {
            addCriterion("CODG_USU_ACTUAL <", value, "CODG_USU_ACTUAL");
            return this;
        }

        public Criteria andCODG_USU_ACTUALLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_USU_ACTUAL <=", value, "CODG_USU_ACTUAL");
            return this;
        }

        public Criteria andCODG_USU_ACTUALLike(String value)
        {
            addCriterion("CODG_USU_ACTUAL like", value, "CODG_USU_ACTUAL");
            return this;
        }

        public Criteria andCODG_USU_ACTUALNotLike(String value)
        {
            addCriterion("CODG_USU_ACTUAL not like", value, "CODG_USU_ACTUAL");
            return this;
        }

        public Criteria andCODG_USU_ACTUALIn(List values)
        {
            addCriterion("CODG_USU_ACTUAL in", values, "CODG_USU_ACTUAL");
            return this;
        }

        public Criteria andCODG_USU_ACTUALNotIn(List values)
        {
            addCriterion("CODG_USU_ACTUAL not in", values, "CODG_USU_ACTUAL");
            return this;
        }

        public Criteria andCODG_USU_ACTUALBetween(String value1, String value2)
        {
            addCriterion("CODG_USU_ACTUAL between", value1, value2, "CODG_USU_ACTUAL");
            return this;
        }

        public Criteria andCODG_USU_ACTUALNotBetween(String value1, String value2)
        {
            addCriterion("CODG_USU_ACTUAL not between", value1, value2, "CODG_USU_ACTUAL");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_NUEVO_BOLETINIsNull()
        {
            criteriaWithoutValue.add("NUMR_NUEVO_BOLETIN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_NUEVO_BOLETINIsNotNull()
        {
            criteriaWithoutValue.add("NUMR_NUEVO_BOLETIN is not null");
            return this;
        }

        public Criteria andNUMR_NUEVO_BOLETINEqualTo(Integer value)
        {
            addCriterion("NUMR_NUEVO_BOLETIN =", value, "NUMR_NUEVO_BOLETIN");
            return this;
        }

        public Criteria andNUMR_NUEVO_BOLETINNotEqualTo(Integer value)
        {
            addCriterion("NUMR_NUEVO_BOLETIN <>", value, "NUMR_NUEVO_BOLETIN");
            return this;
        }

        public Criteria andNUMR_NUEVO_BOLETINGreaterThan(Integer value)
        {
            addCriterion("NUMR_NUEVO_BOLETIN >", value, "NUMR_NUEVO_BOLETIN");
            return this;
        }

        public Criteria andNUMR_NUEVO_BOLETINGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("NUMR_NUEVO_BOLETIN >=", value, "NUMR_NUEVO_BOLETIN");
            return this;
        }

        public Criteria andNUMR_NUEVO_BOLETINLessThan(Integer value)
        {
            addCriterion("NUMR_NUEVO_BOLETIN <", value, "NUMR_NUEVO_BOLETIN");
            return this;
        }

        public Criteria andNUMR_NUEVO_BOLETINLessThanOrEqualTo(Integer value)
        {
            addCriterion("NUMR_NUEVO_BOLETIN <=", value, "NUMR_NUEVO_BOLETIN");
            return this;
        }

        public Criteria andNUMR_NUEVO_BOLETINIn(List values)
        {
            addCriterion("NUMR_NUEVO_BOLETIN in", values, "NUMR_NUEVO_BOLETIN");
            return this;
        }

        public Criteria andNUMR_NUEVO_BOLETINNotIn(List values)
        {
            addCriterion("NUMR_NUEVO_BOLETIN not in", values, "NUMR_NUEVO_BOLETIN");
            return this;
        }

        public Criteria andNUMR_NUEVO_BOLETINBetween(Integer value1, Integer value2)
        {
            addCriterion("NUMR_NUEVO_BOLETIN between", value1, value2, "NUMR_NUEVO_BOLETIN");
            return this;
        }

        public Criteria andNUMR_NUEVO_BOLETINNotBetween(Integer value1, Integer value2)
        {
            addCriterion("NUMR_NUEVO_BOLETIN not between", value1, value2, "NUMR_NUEVO_BOLETIN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_REHABILITADOIsNull()
        {
            criteriaWithoutValue.add("INDC_REHABILITADO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_REHABILITADOIsNotNull()
        {
            criteriaWithoutValue.add("INDC_REHABILITADO is not null");
            return this;
        }

        public Criteria andINDC_REHABILITADOEqualTo(String value)
        {
            addCriterion("INDC_REHABILITADO =", value, "INDC_REHABILITADO");
            return this;
        }

        public Criteria andINDC_REHABILITADONotEqualTo(String value)
        {
            addCriterion("INDC_REHABILITADO <>", value, "INDC_REHABILITADO");
            return this;
        }

        public Criteria andINDC_REHABILITADOGreaterThan(String value)
        {
            addCriterion("INDC_REHABILITADO >", value, "INDC_REHABILITADO");
            return this;
        }

        public Criteria andINDC_REHABILITADOGreaterThanOrEqualTo(String value)
        {
            addCriterion("INDC_REHABILITADO >=", value, "INDC_REHABILITADO");
            return this;
        }

        public Criteria andINDC_REHABILITADOLessThan(String value)
        {
            addCriterion("INDC_REHABILITADO <", value, "INDC_REHABILITADO");
            return this;
        }

        public Criteria andINDC_REHABILITADOLessThanOrEqualTo(String value)
        {
            addCriterion("INDC_REHABILITADO <=", value, "INDC_REHABILITADO");
            return this;
        }

        public Criteria andINDC_REHABILITADOLike(String value)
        {
            addCriterion("INDC_REHABILITADO like", value, "INDC_REHABILITADO");
            return this;
        }

        public Criteria andINDC_REHABILITADONotLike(String value)
        {
            addCriterion("INDC_REHABILITADO not like", value, "INDC_REHABILITADO");
            return this;
        }

        public Criteria andINDC_REHABILITADOIn(List values)
        {
            addCriterion("INDC_REHABILITADO in", values, "INDC_REHABILITADO");
            return this;
        }

        public Criteria andINDC_REHABILITADONotIn(List values)
        {
            addCriterion("INDC_REHABILITADO not in", values, "INDC_REHABILITADO");
            return this;
        }

        public Criteria andINDC_REHABILITADOBetween(String value1, String value2)
        {
            addCriterion("INDC_REHABILITADO between", value1, value2, "INDC_REHABILITADO");
            return this;
        }

        public Criteria andINDC_REHABILITADONotBetween(String value1, String value2)
        {
            addCriterion("INDC_REHABILITADO not between", value1, value2, "INDC_REHABILITADO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andOBSE_BOLETN2IsNull()
        {
            criteriaWithoutValue.add("OBSE_BOLETN2 is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andOBSE_BOLETN2IsNotNull()
        {
            criteriaWithoutValue.add("OBSE_BOLETN2 is not null");
            return this;
        }

        public Criteria andOBSE_BOLETN2EqualTo(String value)
        {
            addCriterion("OBSE_BOLETN2 =", value, "OBSE_BOLETN2");
            return this;
        }

        public Criteria andOBSE_BOLETN2NotEqualTo(String value)
        {
            addCriterion("OBSE_BOLETN2 <>", value, "OBSE_BOLETN2");
            return this;
        }

        public Criteria andOBSE_BOLETN2GreaterThan(String value)
        {
            addCriterion("OBSE_BOLETN2 >", value, "OBSE_BOLETN2");
            return this;
        }

        public Criteria andOBSE_BOLETN2GreaterThanOrEqualTo(String value)
        {
            addCriterion("OBSE_BOLETN2 >=", value, "OBSE_BOLETN2");
            return this;
        }

        public Criteria andOBSE_BOLETN2LessThan(String value)
        {
            addCriterion("OBSE_BOLETN2 <", value, "OBSE_BOLETN2");
            return this;
        }

        public Criteria andOBSE_BOLETN2LessThanOrEqualTo(String value)
        {
            addCriterion("OBSE_BOLETN2 <=", value, "OBSE_BOLETN2");
            return this;
        }

        public Criteria andOBSE_BOLETN2Like(String value)
        {
            addCriterion("OBSE_BOLETN2 like", value, "OBSE_BOLETN2");
            return this;
        }

        public Criteria andOBSE_BOLETN2NotLike(String value)
        {
            addCriterion("OBSE_BOLETN2 not like", value, "OBSE_BOLETN2");
            return this;
        }

        public Criteria andOBSE_BOLETN2In(List values)
        {
            addCriterion("OBSE_BOLETN2 in", values, "OBSE_BOLETN2");
            return this;
        }

        public Criteria andOBSE_BOLETN2NotIn(List values)
        {
            addCriterion("OBSE_BOLETN2 not in", values, "OBSE_BOLETN2");
            return this;
        }

        public Criteria andOBSE_BOLETN2Between(String value1, String value2)
        {
            addCriterion("OBSE_BOLETN2 between", value1, value2, "OBSE_BOLETN2");
            return this;
        }

        public Criteria andOBSE_BOLETN2NotBetween(String value1, String value2)
        {
            addCriterion("OBSE_BOLETN2 not between", value1, value2, "OBSE_BOLETN2");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andL_migradoIsNull()
        {
            criteriaWithoutValue.add("l_migrado is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andL_migradoIsNotNull()
        {
            criteriaWithoutValue.add("l_migrado is not null");
            return this;
        }

        public Criteria andL_migradoEqualTo(String value)
        {
            addCriterion("l_migrado =", value, "l_migrado");
            return this;
        }

        public Criteria andL_migradoNotEqualTo(String value)
        {
            addCriterion("l_migrado <>", value, "l_migrado");
            return this;
        }

        public Criteria andL_migradoGreaterThan(String value)
        {
            addCriterion("l_migrado >", value, "l_migrado");
            return this;
        }

        public Criteria andL_migradoGreaterThanOrEqualTo(String value)
        {
            addCriterion("l_migrado >=", value, "l_migrado");
            return this;
        }

        public Criteria andL_migradoLessThan(String value)
        {
            addCriterion("l_migrado <", value, "l_migrado");
            return this;
        }

        public Criteria andL_migradoLessThanOrEqualTo(String value)
        {
            addCriterion("l_migrado <=", value, "l_migrado");
            return this;
        }

        public Criteria andL_migradoLike(String value)
        {
            addCriterion("l_migrado like", value, "l_migrado");
            return this;
        }

        public Criteria andL_migradoNotLike(String value)
        {
            addCriterion("l_migrado not like", value, "l_migrado");
            return this;
        }

        public Criteria andL_migradoIn(List values)
        {
            addCriterion("l_migrado in", values, "l_migrado");
            return this;
        }

        public Criteria andL_migradoNotIn(List values)
        {
            addCriterion("l_migrado not in", values, "l_migrado");
            return this;
        }

        public Criteria andL_migradoBetween(String value1, String value2)
        {
            addCriterion("l_migrado between", value1, value2, "l_migrado");
            return this;
        }

        public Criteria andL_migradoNotBetween(String value1, String value2)
        {
            addCriterion("l_migrado not between", value1, value2, "l_migrado");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andF_migradoIsNull()
        {
            criteriaWithoutValue.add("f_migrado is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andF_migradoIsNotNull()
        {
            criteriaWithoutValue.add("f_migrado is not null");
            return this;
        }

        public Criteria andF_migradoEqualTo(Date value)
        {
            addCriterion("f_migrado =", value, "f_migrado");
            return this;
        }

        public Criteria andF_migradoNotEqualTo(Date value)
        {
            addCriterion("f_migrado <>", value, "f_migrado");
            return this;
        }

        public Criteria andF_migradoGreaterThan(Date value)
        {
            addCriterion("f_migrado >", value, "f_migrado");
            return this;
        }

        public Criteria andF_migradoGreaterThanOrEqualTo(Date value)
        {
            addCriterion("f_migrado >=", value, "f_migrado");
            return this;
        }

        public Criteria andF_migradoLessThan(Date value)
        {
            addCriterion("f_migrado <", value, "f_migrado");
            return this;
        }

        public Criteria andF_migradoLessThanOrEqualTo(Date value)
        {
            addCriterion("f_migrado <=", value, "f_migrado");
            return this;
        }

        public Criteria andF_migradoIn(List values)
        {
            addCriterion("f_migrado in", values, "f_migrado");
            return this;
        }

        public Criteria andF_migradoNotIn(List values)
        {
            addCriterion("f_migrado not in", values, "f_migrado");
            return this;
        }

        public Criteria andF_migradoBetween(Date value1, Date value2)
        {
            addCriterion("f_migrado between", value1, value2, "f_migrado");
            return this;
        }

        public Criteria andF_migradoNotBetween(Date value1, Date value2)
        {
            addCriterion("f_migrado not between", value1, value2, "f_migrado");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_cod_origenIsNull()
        {
            criteriaWithoutValue.add("c_cod_origen is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_cod_origenIsNotNull()
        {
            criteriaWithoutValue.add("c_cod_origen is not null");
            return this;
        }

        public Criteria andC_cod_origenEqualTo(String value)
        {
            addCriterion("c_cod_origen =", value, "c_cod_origen");
            return this;
        }

        public Criteria andC_cod_origenNotEqualTo(String value)
        {
            addCriterion("c_cod_origen <>", value, "c_cod_origen");
            return this;
        }

        public Criteria andC_cod_origenGreaterThan(String value)
        {
            addCriterion("c_cod_origen >", value, "c_cod_origen");
            return this;
        }

        public Criteria andC_cod_origenGreaterThanOrEqualTo(String value)
        {
            addCriterion("c_cod_origen >=", value, "c_cod_origen");
            return this;
        }

        public Criteria andC_cod_origenLessThan(String value)
        {
            addCriterion("c_cod_origen <", value, "c_cod_origen");
            return this;
        }

        public Criteria andC_cod_origenLessThanOrEqualTo(String value)
        {
            addCriterion("c_cod_origen <=", value, "c_cod_origen");
            return this;
        }

        public Criteria andC_cod_origenLike(String value)
        {
            addCriterion("c_cod_origen like", value, "c_cod_origen");
            return this;
        }

        public Criteria andC_cod_origenNotLike(String value)
        {
            addCriterion("c_cod_origen not like", value, "c_cod_origen");
            return this;
        }

        public Criteria andC_cod_origenIn(List values)
        {
            addCriterion("c_cod_origen in", values, "c_cod_origen");
            return this;
        }

        public Criteria andC_cod_origenNotIn(List values)
        {
            addCriterion("c_cod_origen not in", values, "c_cod_origen");
            return this;
        }

        public Criteria andC_cod_origenBetween(String value1, String value2)
        {
            addCriterion("c_cod_origen between", value1, value2, "c_cod_origen");
            return this;
        }

        public Criteria andC_cod_origenNotBetween(String value1, String value2)
        {
            addCriterion("c_cod_origen not between", value1, value2, "c_cod_origen");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_bol_origenIsNull()
        {
            criteriaWithoutValue.add("c_bol_origen is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_bol_origenIsNotNull()
        {
            criteriaWithoutValue.add("c_bol_origen is not null");
            return this;
        }

        public Criteria andC_bol_origenEqualTo(String value)
        {
            addCriterion("c_bol_origen =", value, "c_bol_origen");
            return this;
        }

        public Criteria andC_bol_origenNotEqualTo(String value)
        {
            addCriterion("c_bol_origen <>", value, "c_bol_origen");
            return this;
        }

        public Criteria andC_bol_origenGreaterThan(String value)
        {
            addCriterion("c_bol_origen >", value, "c_bol_origen");
            return this;
        }

        public Criteria andC_bol_origenGreaterThanOrEqualTo(String value)
        {
            addCriterion("c_bol_origen >=", value, "c_bol_origen");
            return this;
        }

        public Criteria andC_bol_origenLessThan(String value)
        {
            addCriterion("c_bol_origen <", value, "c_bol_origen");
            return this;
        }

        public Criteria andC_bol_origenLessThanOrEqualTo(String value)
        {
            addCriterion("c_bol_origen <=", value, "c_bol_origen");
            return this;
        }

        public Criteria andC_bol_origenLike(String value)
        {
            addCriterion("c_bol_origen like", value, "c_bol_origen");
            return this;
        }

        public Criteria andC_bol_origenNotLike(String value)
        {
            addCriterion("c_bol_origen not like", value, "c_bol_origen");
            return this;
        }

        public Criteria andC_bol_origenIn(List values)
        {
            addCriterion("c_bol_origen in", values, "c_bol_origen");
            return this;
        }

        public Criteria andC_bol_origenNotIn(List values)
        {
            addCriterion("c_bol_origen not in", values, "c_bol_origen");
            return this;
        }

        public Criteria andC_bol_origenBetween(String value1, String value2)
        {
            addCriterion("c_bol_origen between", value1, value2, "c_bol_origen");
            return this;
        }

        public Criteria andC_bol_origenNotBetween(String value1, String value2)
        {
            addCriterion("c_bol_origen not between", value1, value2, "c_bol_origen");
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
        public Criteria andNUMR_JUZGADO_JPAZIsNull()
        {
            criteriaWithoutValue.add("NUMR_JUZGADO_JPAZ is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_JUZGADO_JPAZIsNotNull()
        {
            criteriaWithoutValue.add("NUMR_JUZGADO_JPAZ is not null");
            return this;
        }

        public Criteria andNUMR_JUZGADO_JPAZEqualTo(Short value)
        {
            addCriterion("NUMR_JUZGADO_JPAZ =", value, "NUMR_JUZGADO_JPAZ");
            return this;
        }

        public Criteria andNUMR_JUZGADO_JPAZNotEqualTo(Short value)
        {
            addCriterion("NUMR_JUZGADO_JPAZ <>", value, "NUMR_JUZGADO_JPAZ");
            return this;
        }

        public Criteria andNUMR_JUZGADO_JPAZGreaterThan(Short value)
        {
            addCriterion("NUMR_JUZGADO_JPAZ >", value, "NUMR_JUZGADO_JPAZ");
            return this;
        }

        public Criteria andNUMR_JUZGADO_JPAZGreaterThanOrEqualTo(Short value)
        {
            addCriterion("NUMR_JUZGADO_JPAZ >=", value, "NUMR_JUZGADO_JPAZ");
            return this;
        }

        public Criteria andNUMR_JUZGADO_JPAZLessThan(Short value)
        {
            addCriterion("NUMR_JUZGADO_JPAZ <", value, "NUMR_JUZGADO_JPAZ");
            return this;
        }

        public Criteria andNUMR_JUZGADO_JPAZLessThanOrEqualTo(Short value)
        {
            addCriterion("NUMR_JUZGADO_JPAZ <=", value, "NUMR_JUZGADO_JPAZ");
            return this;
        }

        public Criteria andNUMR_JUZGADO_JPAZIn(List values)
        {
            addCriterion("NUMR_JUZGADO_JPAZ in", values, "NUMR_JUZGADO_JPAZ");
            return this;
        }

        public Criteria andNUMR_JUZGADO_JPAZNotIn(List values)
        {
            addCriterion("NUMR_JUZGADO_JPAZ not in", values, "NUMR_JUZGADO_JPAZ");
            return this;
        }

        public Criteria andNUMR_JUZGADO_JPAZBetween(Short value1, Short value2)
        {
            addCriterion("NUMR_JUZGADO_JPAZ between", value1, value2, "NUMR_JUZGADO_JPAZ");
            return this;
        }

        public Criteria andNUMR_JUZGADO_JPAZNotBetween(Short value1, Short value2)
        {
            addCriterion("NUMR_JUZGADO_JPAZ not between", value1, value2, "NUMR_JUZGADO_JPAZ");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_LUGAR_JPAZIsNull()
        {
            criteriaWithoutValue.add("CODG_LUGAR_JPAZ is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_LUGAR_JPAZIsNotNull()
        {
            criteriaWithoutValue.add("CODG_LUGAR_JPAZ is not null");
            return this;
        }

        public Criteria andCODG_LUGAR_JPAZEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_JPAZ =", value, "CODG_LUGAR_JPAZ");
            return this;
        }

        public Criteria andCODG_LUGAR_JPAZNotEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_JPAZ <>", value, "CODG_LUGAR_JPAZ");
            return this;
        }

        public Criteria andCODG_LUGAR_JPAZGreaterThan(String value)
        {
            addCriterion("CODG_LUGAR_JPAZ >", value, "CODG_LUGAR_JPAZ");
            return this;
        }

        public Criteria andCODG_LUGAR_JPAZGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_JPAZ >=", value, "CODG_LUGAR_JPAZ");
            return this;
        }

        public Criteria andCODG_LUGAR_JPAZLessThan(String value)
        {
            addCriterion("CODG_LUGAR_JPAZ <", value, "CODG_LUGAR_JPAZ");
            return this;
        }

        public Criteria andCODG_LUGAR_JPAZLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_JPAZ <=", value, "CODG_LUGAR_JPAZ");
            return this;
        }

        public Criteria andCODG_LUGAR_JPAZLike(String value)
        {
            addCriterion("CODG_LUGAR_JPAZ like", value, "CODG_LUGAR_JPAZ");
            return this;
        }

        public Criteria andCODG_LUGAR_JPAZNotLike(String value)
        {
            addCriterion("CODG_LUGAR_JPAZ not like", value, "CODG_LUGAR_JPAZ");
            return this;
        }

        public Criteria andCODG_LUGAR_JPAZIn(List values)
        {
            addCriterion("CODG_LUGAR_JPAZ in", values, "CODG_LUGAR_JPAZ");
            return this;
        }

        public Criteria andCODG_LUGAR_JPAZNotIn(List values)
        {
            addCriterion("CODG_LUGAR_JPAZ not in", values, "CODG_LUGAR_JPAZ");
            return this;
        }

        public Criteria andCODG_LUGAR_JPAZBetween(String value1, String value2)
        {
            addCriterion("CODG_LUGAR_JPAZ between", value1, value2, "CODG_LUGAR_JPAZ");
            return this;
        }

        public Criteria andCODG_LUGAR_JPAZNotBetween(String value1, String value2)
        {
            addCriterion("CODG_LUGAR_JPAZ not between", value1, value2, "CODG_LUGAR_JPAZ");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_SENTENCIA_JPAZIsNull()
        {
            criteriaWithoutValue.add("FECH_SENTENCIA_JPAZ is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_SENTENCIA_JPAZIsNotNull()
        {
            criteriaWithoutValue.add("FECH_SENTENCIA_JPAZ is not null");
            return this;
        }

        public Criteria andFECH_SENTENCIA_JPAZEqualTo(Date value)
        {
            addCriterion("FECH_SENTENCIA_JPAZ =", value, "FECH_SENTENCIA_JPAZ");
            return this;
        }

        public Criteria andFECH_SENTENCIA_JPAZNotEqualTo(Date value)
        {
            addCriterion("FECH_SENTENCIA_JPAZ <>", value, "FECH_SENTENCIA_JPAZ");
            return this;
        }

        public Criteria andFECH_SENTENCIA_JPAZGreaterThan(Date value)
        {
            addCriterion("FECH_SENTENCIA_JPAZ >", value, "FECH_SENTENCIA_JPAZ");
            return this;
        }

        public Criteria andFECH_SENTENCIA_JPAZGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FECH_SENTENCIA_JPAZ >=", value, "FECH_SENTENCIA_JPAZ");
            return this;
        }

        public Criteria andFECH_SENTENCIA_JPAZLessThan(Date value)
        {
            addCriterion("FECH_SENTENCIA_JPAZ <", value, "FECH_SENTENCIA_JPAZ");
            return this;
        }

        public Criteria andFECH_SENTENCIA_JPAZLessThanOrEqualTo(Date value)
        {
            addCriterion("FECH_SENTENCIA_JPAZ <=", value, "FECH_SENTENCIA_JPAZ");
            return this;
        }

        public Criteria andFECH_SENTENCIA_JPAZIn(List values)
        {
            addCriterion("FECH_SENTENCIA_JPAZ in", values, "FECH_SENTENCIA_JPAZ");
            return this;
        }

        public Criteria andFECH_SENTENCIA_JPAZNotIn(List values)
        {
            addCriterion("FECH_SENTENCIA_JPAZ not in", values, "FECH_SENTENCIA_JPAZ");
            return this;
        }

        public Criteria andFECH_SENTENCIA_JPAZBetween(Date value1, Date value2)
        {
            addCriterion("FECH_SENTENCIA_JPAZ between", value1, value2, "FECH_SENTENCIA_JPAZ");
            return this;
        }

        public Criteria andFECH_SENTENCIA_JPAZNotBetween(Date value1, Date value2)
        {
            addCriterion("FECH_SENTENCIA_JPAZ not between", value1, value2, "FECH_SENTENCIA_JPAZ");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_JUZGADO_JINSTIsNull()
        {
            criteriaWithoutValue.add("NUMR_JUZGADO_JINST is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_JUZGADO_JINSTIsNotNull()
        {
            criteriaWithoutValue.add("NUMR_JUZGADO_JINST is not null");
            return this;
        }

        public Criteria andNUMR_JUZGADO_JINSTEqualTo(Short value)
        {
            addCriterion("NUMR_JUZGADO_JINST =", value, "NUMR_JUZGADO_JINST");
            return this;
        }

        public Criteria andNUMR_JUZGADO_JINSTNotEqualTo(Short value)
        {
            addCriterion("NUMR_JUZGADO_JINST <>", value, "NUMR_JUZGADO_JINST");
            return this;
        }

        public Criteria andNUMR_JUZGADO_JINSTGreaterThan(Short value)
        {
            addCriterion("NUMR_JUZGADO_JINST >", value, "NUMR_JUZGADO_JINST");
            return this;
        }

        public Criteria andNUMR_JUZGADO_JINSTGreaterThanOrEqualTo(Short value)
        {
            addCriterion("NUMR_JUZGADO_JINST >=", value, "NUMR_JUZGADO_JINST");
            return this;
        }

        public Criteria andNUMR_JUZGADO_JINSTLessThan(Short value)
        {
            addCriterion("NUMR_JUZGADO_JINST <", value, "NUMR_JUZGADO_JINST");
            return this;
        }

        public Criteria andNUMR_JUZGADO_JINSTLessThanOrEqualTo(Short value)
        {
            addCriterion("NUMR_JUZGADO_JINST <=", value, "NUMR_JUZGADO_JINST");
            return this;
        }

        public Criteria andNUMR_JUZGADO_JINSTIn(List values)
        {
            addCriterion("NUMR_JUZGADO_JINST in", values, "NUMR_JUZGADO_JINST");
            return this;
        }

        public Criteria andNUMR_JUZGADO_JINSTNotIn(List values)
        {
            addCriterion("NUMR_JUZGADO_JINST not in", values, "NUMR_JUZGADO_JINST");
            return this;
        }

        public Criteria andNUMR_JUZGADO_JINSTBetween(Short value1, Short value2)
        {
            addCriterion("NUMR_JUZGADO_JINST between", value1, value2, "NUMR_JUZGADO_JINST");
            return this;
        }

        public Criteria andNUMR_JUZGADO_JINSTNotBetween(Short value1, Short value2)
        {
            addCriterion("NUMR_JUZGADO_JINST not between", value1, value2, "NUMR_JUZGADO_JINST");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_LUGAR_JINSTIsNull()
        {
            criteriaWithoutValue.add("CODG_LUGAR_JINST is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_LUGAR_JINSTIsNotNull()
        {
            criteriaWithoutValue.add("CODG_LUGAR_JINST is not null");
            return this;
        }

        public Criteria andCODG_LUGAR_JINSTEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_JINST =", value, "CODG_LUGAR_JINST");
            return this;
        }

        public Criteria andCODG_LUGAR_JINSTNotEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_JINST <>", value, "CODG_LUGAR_JINST");
            return this;
        }

        public Criteria andCODG_LUGAR_JINSTGreaterThan(String value)
        {
            addCriterion("CODG_LUGAR_JINST >", value, "CODG_LUGAR_JINST");
            return this;
        }

        public Criteria andCODG_LUGAR_JINSTGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_JINST >=", value, "CODG_LUGAR_JINST");
            return this;
        }

        public Criteria andCODG_LUGAR_JINSTLessThan(String value)
        {
            addCriterion("CODG_LUGAR_JINST <", value, "CODG_LUGAR_JINST");
            return this;
        }

        public Criteria andCODG_LUGAR_JINSTLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_JINST <=", value, "CODG_LUGAR_JINST");
            return this;
        }

        public Criteria andCODG_LUGAR_JINSTLike(String value)
        {
            addCriterion("CODG_LUGAR_JINST like", value, "CODG_LUGAR_JINST");
            return this;
        }

        public Criteria andCODG_LUGAR_JINSTNotLike(String value)
        {
            addCriterion("CODG_LUGAR_JINST not like", value, "CODG_LUGAR_JINST");
            return this;
        }

        public Criteria andCODG_LUGAR_JINSTIn(List values)
        {
            addCriterion("CODG_LUGAR_JINST in", values, "CODG_LUGAR_JINST");
            return this;
        }

        public Criteria andCODG_LUGAR_JINSTNotIn(List values)
        {
            addCriterion("CODG_LUGAR_JINST not in", values, "CODG_LUGAR_JINST");
            return this;
        }

        public Criteria andCODG_LUGAR_JINSTBetween(String value1, String value2)
        {
            addCriterion("CODG_LUGAR_JINST between", value1, value2, "CODG_LUGAR_JINST");
            return this;
        }

        public Criteria andCODG_LUGAR_JINSTNotBetween(String value1, String value2)
        {
            addCriterion("CODG_LUGAR_JINST not between", value1, value2, "CODG_LUGAR_JINST");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_SENTENCIA_JINSTIsNull()
        {
            criteriaWithoutValue.add("FECH_SENTENCIA_JINST is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_SENTENCIA_JINSTIsNotNull()
        {
            criteriaWithoutValue.add("FECH_SENTENCIA_JINST is not null");
            return this;
        }

        public Criteria andFECH_SENTENCIA_JINSTEqualTo(Date value)
        {
            addCriterion("FECH_SENTENCIA_JINST =", value, "FECH_SENTENCIA_JINST");
            return this;
        }

        public Criteria andFECH_SENTENCIA_JINSTNotEqualTo(Date value)
        {
            addCriterion("FECH_SENTENCIA_JINST <>", value, "FECH_SENTENCIA_JINST");
            return this;
        }

        public Criteria andFECH_SENTENCIA_JINSTGreaterThan(Date value)
        {
            addCriterion("FECH_SENTENCIA_JINST >", value, "FECH_SENTENCIA_JINST");
            return this;
        }

        public Criteria andFECH_SENTENCIA_JINSTGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FECH_SENTENCIA_JINST >=", value, "FECH_SENTENCIA_JINST");
            return this;
        }

        public Criteria andFECH_SENTENCIA_JINSTLessThan(Date value)
        {
            addCriterion("FECH_SENTENCIA_JINST <", value, "FECH_SENTENCIA_JINST");
            return this;
        }

        public Criteria andFECH_SENTENCIA_JINSTLessThanOrEqualTo(Date value)
        {
            addCriterion("FECH_SENTENCIA_JINST <=", value, "FECH_SENTENCIA_JINST");
            return this;
        }

        public Criteria andFECH_SENTENCIA_JINSTIn(List values)
        {
            addCriterion("FECH_SENTENCIA_JINST in", values, "FECH_SENTENCIA_JINST");
            return this;
        }

        public Criteria andFECH_SENTENCIA_JINSTNotIn(List values)
        {
            addCriterion("FECH_SENTENCIA_JINST not in", values, "FECH_SENTENCIA_JINST");
            return this;
        }

        public Criteria andFECH_SENTENCIA_JINSTBetween(Date value1, Date value2)
        {
            addCriterion("FECH_SENTENCIA_JINST between", value1, value2, "FECH_SENTENCIA_JINST");
            return this;
        }

        public Criteria andFECH_SENTENCIA_JINSTNotBetween(Date value1, Date value2)
        {
            addCriterion("FECH_SENTENCIA_JINST not between", value1, value2, "FECH_SENTENCIA_JINST");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_SALA_CSUPERIORIsNull()
        {
            criteriaWithoutValue.add("NUMR_SALA_CSUPERIOR is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_SALA_CSUPERIORIsNotNull()
        {
            criteriaWithoutValue.add("NUMR_SALA_CSUPERIOR is not null");
            return this;
        }

        public Criteria andNUMR_SALA_CSUPERIOREqualTo(Short value)
        {
            addCriterion("NUMR_SALA_CSUPERIOR =", value, "NUMR_SALA_CSUPERIOR");
            return this;
        }

        public Criteria andNUMR_SALA_CSUPERIORNotEqualTo(Short value)
        {
            addCriterion("NUMR_SALA_CSUPERIOR <>", value, "NUMR_SALA_CSUPERIOR");
            return this;
        }

        public Criteria andNUMR_SALA_CSUPERIORGreaterThan(Short value)
        {
            addCriterion("NUMR_SALA_CSUPERIOR >", value, "NUMR_SALA_CSUPERIOR");
            return this;
        }

        public Criteria andNUMR_SALA_CSUPERIORGreaterThanOrEqualTo(Short value)
        {
            addCriterion("NUMR_SALA_CSUPERIOR >=", value, "NUMR_SALA_CSUPERIOR");
            return this;
        }

        public Criteria andNUMR_SALA_CSUPERIORLessThan(Short value)
        {
            addCriterion("NUMR_SALA_CSUPERIOR <", value, "NUMR_SALA_CSUPERIOR");
            return this;
        }

        public Criteria andNUMR_SALA_CSUPERIORLessThanOrEqualTo(Short value)
        {
            addCriterion("NUMR_SALA_CSUPERIOR <=", value, "NUMR_SALA_CSUPERIOR");
            return this;
        }

        public Criteria andNUMR_SALA_CSUPERIORIn(List values)
        {
            addCriterion("NUMR_SALA_CSUPERIOR in", values, "NUMR_SALA_CSUPERIOR");
            return this;
        }

        public Criteria andNUMR_SALA_CSUPERIORNotIn(List values)
        {
            addCriterion("NUMR_SALA_CSUPERIOR not in", values, "NUMR_SALA_CSUPERIOR");
            return this;
        }

        public Criteria andNUMR_SALA_CSUPERIORBetween(Short value1, Short value2)
        {
            addCriterion("NUMR_SALA_CSUPERIOR between", value1, value2, "NUMR_SALA_CSUPERIOR");
            return this;
        }

        public Criteria andNUMR_SALA_CSUPERIORNotBetween(Short value1, Short value2)
        {
            addCriterion("NUMR_SALA_CSUPERIOR not between", value1, value2, "NUMR_SALA_CSUPERIOR");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_LUGAR_CSUPERIORIsNull()
        {
            criteriaWithoutValue.add("CODG_LUGAR_CSUPERIOR is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_LUGAR_CSUPERIORIsNotNull()
        {
            criteriaWithoutValue.add("CODG_LUGAR_CSUPERIOR is not null");
            return this;
        }

        public Criteria andCODG_LUGAR_CSUPERIOREqualTo(String value)
        {
            addCriterion("CODG_LUGAR_CSUPERIOR =", value, "CODG_LUGAR_CSUPERIOR");
            return this;
        }

        public Criteria andCODG_LUGAR_CSUPERIORNotEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_CSUPERIOR <>", value, "CODG_LUGAR_CSUPERIOR");
            return this;
        }

        public Criteria andCODG_LUGAR_CSUPERIORGreaterThan(String value)
        {
            addCriterion("CODG_LUGAR_CSUPERIOR >", value, "CODG_LUGAR_CSUPERIOR");
            return this;
        }

        public Criteria andCODG_LUGAR_CSUPERIORGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_CSUPERIOR >=", value, "CODG_LUGAR_CSUPERIOR");
            return this;
        }

        public Criteria andCODG_LUGAR_CSUPERIORLessThan(String value)
        {
            addCriterion("CODG_LUGAR_CSUPERIOR <", value, "CODG_LUGAR_CSUPERIOR");
            return this;
        }

        public Criteria andCODG_LUGAR_CSUPERIORLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_CSUPERIOR <=", value, "CODG_LUGAR_CSUPERIOR");
            return this;
        }

        public Criteria andCODG_LUGAR_CSUPERIORLike(String value)
        {
            addCriterion("CODG_LUGAR_CSUPERIOR like", value, "CODG_LUGAR_CSUPERIOR");
            return this;
        }

        public Criteria andCODG_LUGAR_CSUPERIORNotLike(String value)
        {
            addCriterion("CODG_LUGAR_CSUPERIOR not like", value, "CODG_LUGAR_CSUPERIOR");
            return this;
        }

        public Criteria andCODG_LUGAR_CSUPERIORIn(List values)
        {
            addCriterion("CODG_LUGAR_CSUPERIOR in", values, "CODG_LUGAR_CSUPERIOR");
            return this;
        }

        public Criteria andCODG_LUGAR_CSUPERIORNotIn(List values)
        {
            addCriterion("CODG_LUGAR_CSUPERIOR not in", values, "CODG_LUGAR_CSUPERIOR");
            return this;
        }

        public Criteria andCODG_LUGAR_CSUPERIORBetween(String value1, String value2)
        {
            addCriterion("CODG_LUGAR_CSUPERIOR between", value1, value2, "CODG_LUGAR_CSUPERIOR");
            return this;
        }

        public Criteria andCODG_LUGAR_CSUPERIORNotBetween(String value1, String value2)
        {
            addCriterion("CODG_LUGAR_CSUPERIOR not between", value1, value2, "CODG_LUGAR_CSUPERIOR");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_SENTENCIA_CSUPERIORIsNull()
        {
            criteriaWithoutValue.add("FECH_SENTENCIA_CSUPERIOR is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_SENTENCIA_CSUPERIORIsNotNull()
        {
            criteriaWithoutValue.add("FECH_SENTENCIA_CSUPERIOR is not null");
            return this;
        }

        public Criteria andFECH_SENTENCIA_CSUPERIOREqualTo(Date value)
        {
            addCriterion("FECH_SENTENCIA_CSUPERIOR =", value, "FECH_SENTENCIA_CSUPERIOR");
            return this;
        }

        public Criteria andFECH_SENTENCIA_CSUPERIORNotEqualTo(Date value)
        {
            addCriterion("FECH_SENTENCIA_CSUPERIOR <>", value, "FECH_SENTENCIA_CSUPERIOR");
            return this;
        }

        public Criteria andFECH_SENTENCIA_CSUPERIORGreaterThan(Date value)
        {
            addCriterion("FECH_SENTENCIA_CSUPERIOR >", value, "FECH_SENTENCIA_CSUPERIOR");
            return this;
        }

        public Criteria andFECH_SENTENCIA_CSUPERIORGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FECH_SENTENCIA_CSUPERIOR >=", value, "FECH_SENTENCIA_CSUPERIOR");
            return this;
        }

        public Criteria andFECH_SENTENCIA_CSUPERIORLessThan(Date value)
        {
            addCriterion("FECH_SENTENCIA_CSUPERIOR <", value, "FECH_SENTENCIA_CSUPERIOR");
            return this;
        }

        public Criteria andFECH_SENTENCIA_CSUPERIORLessThanOrEqualTo(Date value)
        {
            addCriterion("FECH_SENTENCIA_CSUPERIOR <=", value, "FECH_SENTENCIA_CSUPERIOR");
            return this;
        }

        public Criteria andFECH_SENTENCIA_CSUPERIORIn(List values)
        {
            addCriterion("FECH_SENTENCIA_CSUPERIOR in", values, "FECH_SENTENCIA_CSUPERIOR");
            return this;
        }

        public Criteria andFECH_SENTENCIA_CSUPERIORNotIn(List values)
        {
            addCriterion("FECH_SENTENCIA_CSUPERIOR not in", values, "FECH_SENTENCIA_CSUPERIOR");
            return this;
        }

        public Criteria andFECH_SENTENCIA_CSUPERIORBetween(Date value1, Date value2)
        {
            addCriterion("FECH_SENTENCIA_CSUPERIOR between", value1, value2, "FECH_SENTENCIA_CSUPERIOR");
            return this;
        }

        public Criteria andFECH_SENTENCIA_CSUPERIORNotBetween(Date value1, Date value2)
        {
            addCriterion("FECH_SENTENCIA_CSUPERIOR not between", value1, value2, "FECH_SENTENCIA_CSUPERIOR");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_SENTENCIA_CSUPREMAIsNull()
        {
            criteriaWithoutValue.add("FECH_SENTENCIA_CSUPREMA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_SENTENCIA_CSUPREMAIsNotNull()
        {
            criteriaWithoutValue.add("FECH_SENTENCIA_CSUPREMA is not null");
            return this;
        }

        public Criteria andFECH_SENTENCIA_CSUPREMAEqualTo(Date value)
        {
            addCriterion("FECH_SENTENCIA_CSUPREMA =", value, "FECH_SENTENCIA_CSUPREMA");
            return this;
        }

        public Criteria andFECH_SENTENCIA_CSUPREMANotEqualTo(Date value)
        {
            addCriterion("FECH_SENTENCIA_CSUPREMA <>", value, "FECH_SENTENCIA_CSUPREMA");
            return this;
        }

        public Criteria andFECH_SENTENCIA_CSUPREMAGreaterThan(Date value)
        {
            addCriterion("FECH_SENTENCIA_CSUPREMA >", value, "FECH_SENTENCIA_CSUPREMA");
            return this;
        }

        public Criteria andFECH_SENTENCIA_CSUPREMAGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FECH_SENTENCIA_CSUPREMA >=", value, "FECH_SENTENCIA_CSUPREMA");
            return this;
        }

        public Criteria andFECH_SENTENCIA_CSUPREMALessThan(Date value)
        {
            addCriterion("FECH_SENTENCIA_CSUPREMA <", value, "FECH_SENTENCIA_CSUPREMA");
            return this;
        }

        public Criteria andFECH_SENTENCIA_CSUPREMALessThanOrEqualTo(Date value)
        {
            addCriterion("FECH_SENTENCIA_CSUPREMA <=", value, "FECH_SENTENCIA_CSUPREMA");
            return this;
        }

        public Criteria andFECH_SENTENCIA_CSUPREMAIn(List values)
        {
            addCriterion("FECH_SENTENCIA_CSUPREMA in", values, "FECH_SENTENCIA_CSUPREMA");
            return this;
        }

        public Criteria andFECH_SENTENCIA_CSUPREMANotIn(List values)
        {
            addCriterion("FECH_SENTENCIA_CSUPREMA not in", values, "FECH_SENTENCIA_CSUPREMA");
            return this;
        }

        public Criteria andFECH_SENTENCIA_CSUPREMABetween(Date value1, Date value2)
        {
            addCriterion("FECH_SENTENCIA_CSUPREMA between", value1, value2, "FECH_SENTENCIA_CSUPREMA");
            return this;
        }

        public Criteria andFECH_SENTENCIA_CSUPREMANotBetween(Date value1, Date value2)
        {
            addCriterion("FECH_SENTENCIA_CSUPREMA not between", value1, value2, "FECH_SENTENCIA_CSUPREMA");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_TIENE_ALIASIsNull()
        {
            criteriaWithoutValue.add("INDC_TIENE_ALIAS is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_TIENE_ALIASIsNotNull()
        {
            criteriaWithoutValue.add("INDC_TIENE_ALIAS is not null");
            return this;
        }

        public Criteria andINDC_TIENE_ALIASEqualTo(String value)
        {
            addCriterion("INDC_TIENE_ALIAS =", value, "INDC_TIENE_ALIAS");
            return this;
        }

        public Criteria andINDC_TIENE_ALIASNotEqualTo(String value)
        {
            addCriterion("INDC_TIENE_ALIAS <>", value, "INDC_TIENE_ALIAS");
            return this;
        }

        public Criteria andINDC_TIENE_ALIASGreaterThan(String value)
        {
            addCriterion("INDC_TIENE_ALIAS >", value, "INDC_TIENE_ALIAS");
            return this;
        }

        public Criteria andINDC_TIENE_ALIASGreaterThanOrEqualTo(String value)
        {
            addCriterion("INDC_TIENE_ALIAS >=", value, "INDC_TIENE_ALIAS");
            return this;
        }

        public Criteria andINDC_TIENE_ALIASLessThan(String value)
        {
            addCriterion("INDC_TIENE_ALIAS <", value, "INDC_TIENE_ALIAS");
            return this;
        }

        public Criteria andINDC_TIENE_ALIASLessThanOrEqualTo(String value)
        {
            addCriterion("INDC_TIENE_ALIAS <=", value, "INDC_TIENE_ALIAS");
            return this;
        }

        public Criteria andINDC_TIENE_ALIASLike(String value)
        {
            addCriterion("INDC_TIENE_ALIAS like", value, "INDC_TIENE_ALIAS");
            return this;
        }

        public Criteria andINDC_TIENE_ALIASNotLike(String value)
        {
            addCriterion("INDC_TIENE_ALIAS not like", value, "INDC_TIENE_ALIAS");
            return this;
        }

        public Criteria andINDC_TIENE_ALIASIn(List values)
        {
            addCriterion("INDC_TIENE_ALIAS in", values, "INDC_TIENE_ALIAS");
            return this;
        }

        public Criteria andINDC_TIENE_ALIASNotIn(List values)
        {
            addCriterion("INDC_TIENE_ALIAS not in", values, "INDC_TIENE_ALIAS");
            return this;
        }

        public Criteria andINDC_TIENE_ALIASBetween(String value1, String value2)
        {
            addCriterion("INDC_TIENE_ALIAS between", value1, value2, "INDC_TIENE_ALIAS");
            return this;
        }

        public Criteria andINDC_TIENE_ALIASNotBetween(String value1, String value2)
        {
            addCriterion("INDC_TIENE_ALIAS not between", value1, value2, "INDC_TIENE_ALIAS");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_ARTICULOS_APLICADOSIsNull()
        {
            criteriaWithoutValue.add("DESC_ARTICULOS_APLICADOS is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_ARTICULOS_APLICADOSIsNotNull()
        {
            criteriaWithoutValue.add("DESC_ARTICULOS_APLICADOS is not null");
            return this;
        }

        public Criteria andDESC_ARTICULOS_APLICADOSEqualTo(String value)
        {
            addCriterion("DESC_ARTICULOS_APLICADOS =", value, "DESC_ARTICULOS_APLICADOS");
            return this;
        }

        public Criteria andDESC_ARTICULOS_APLICADOSNotEqualTo(String value)
        {
            addCriterion("DESC_ARTICULOS_APLICADOS <>", value, "DESC_ARTICULOS_APLICADOS");
            return this;
        }

        public Criteria andDESC_ARTICULOS_APLICADOSGreaterThan(String value)
        {
            addCriterion("DESC_ARTICULOS_APLICADOS >", value, "DESC_ARTICULOS_APLICADOS");
            return this;
        }

        public Criteria andDESC_ARTICULOS_APLICADOSGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_ARTICULOS_APLICADOS >=", value, "DESC_ARTICULOS_APLICADOS");
            return this;
        }

        public Criteria andDESC_ARTICULOS_APLICADOSLessThan(String value)
        {
            addCriterion("DESC_ARTICULOS_APLICADOS <", value, "DESC_ARTICULOS_APLICADOS");
            return this;
        }

        public Criteria andDESC_ARTICULOS_APLICADOSLessThanOrEqualTo(String value)
        {
            addCriterion("DESC_ARTICULOS_APLICADOS <=", value, "DESC_ARTICULOS_APLICADOS");
            return this;
        }

        public Criteria andDESC_ARTICULOS_APLICADOSLike(String value)
        {
            addCriterion("DESC_ARTICULOS_APLICADOS like", value, "DESC_ARTICULOS_APLICADOS");
            return this;
        }

        public Criteria andDESC_ARTICULOS_APLICADOSNotLike(String value)
        {
            addCriterion("DESC_ARTICULOS_APLICADOS not like", value, "DESC_ARTICULOS_APLICADOS");
            return this;
        }

        public Criteria andDESC_ARTICULOS_APLICADOSIn(List values)
        {
            addCriterion("DESC_ARTICULOS_APLICADOS in", values, "DESC_ARTICULOS_APLICADOS");
            return this;
        }

        public Criteria andDESC_ARTICULOS_APLICADOSNotIn(List values)
        {
            addCriterion("DESC_ARTICULOS_APLICADOS not in", values, "DESC_ARTICULOS_APLICADOS");
            return this;
        }

        public Criteria andDESC_ARTICULOS_APLICADOSBetween(String value1, String value2)
        {
            addCriterion("DESC_ARTICULOS_APLICADOS between", value1, value2, "DESC_ARTICULOS_APLICADOS");
            return this;
        }

        public Criteria andDESC_ARTICULOS_APLICADOSNotBetween(String value1, String value2)
        {
            addCriterion("DESC_ARTICULOS_APLICADOS not between", value1, value2, "DESC_ARTICULOS_APLICADOS");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_BOLETIN_borrarIsNull()
        {
            criteriaWithoutValue.add("CODG_BOLETIN_borrar is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_BOLETIN_borrarIsNotNull()
        {
            criteriaWithoutValue.add("CODG_BOLETIN_borrar is not null");
            return this;
        }

        public Criteria andCODG_BOLETIN_borrarEqualTo(String value)
        {
            addCriterion("CODG_BOLETIN_borrar =", value, "CODG_BOLETIN_borrar");
            return this;
        }

        public Criteria andCODG_BOLETIN_borrarNotEqualTo(String value)
        {
            addCriterion("CODG_BOLETIN_borrar <>", value, "CODG_BOLETIN_borrar");
            return this;
        }

        public Criteria andCODG_BOLETIN_borrarGreaterThan(String value)
        {
            addCriterion("CODG_BOLETIN_borrar >", value, "CODG_BOLETIN_borrar");
            return this;
        }

        public Criteria andCODG_BOLETIN_borrarGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_BOLETIN_borrar >=", value, "CODG_BOLETIN_borrar");
            return this;
        }

        public Criteria andCODG_BOLETIN_borrarLessThan(String value)
        {
            addCriterion("CODG_BOLETIN_borrar <", value, "CODG_BOLETIN_borrar");
            return this;
        }

        public Criteria andCODG_BOLETIN_borrarLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_BOLETIN_borrar <=", value, "CODG_BOLETIN_borrar");
            return this;
        }

        public Criteria andCODG_BOLETIN_borrarLike(String value)
        {
            addCriterion("CODG_BOLETIN_borrar like", value, "CODG_BOLETIN_borrar");
            return this;
        }

        public Criteria andCODG_BOLETIN_borrarNotLike(String value)
        {
            addCriterion("CODG_BOLETIN_borrar not like", value, "CODG_BOLETIN_borrar");
            return this;
        }

        public Criteria andCODG_BOLETIN_borrarIn(List values)
        {
            addCriterion("CODG_BOLETIN_borrar in", values, "CODG_BOLETIN_borrar");
            return this;
        }

        public Criteria andCODG_BOLETIN_borrarNotIn(List values)
        {
            addCriterion("CODG_BOLETIN_borrar not in", values, "CODG_BOLETIN_borrar");
            return this;
        }

        public Criteria andCODG_BOLETIN_borrarBetween(String value1, String value2)
        {
            addCriterion("CODG_BOLETIN_borrar between", value1, value2, "CODG_BOLETIN_borrar");
            return this;
        }

        public Criteria andCODG_BOLETIN_borrarNotBetween(String value1, String value2)
        {
            addCriterion("CODG_BOLETIN_borrar not between", value1, value2, "CODG_BOLETIN_borrar");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_BOLETINIsNull()
        {
            criteriaWithoutValue.add("CODG_BOLETIN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_BOLETINIsNotNull()
        {
            criteriaWithoutValue.add("CODG_BOLETIN is not null");
            return this;
        }

        public Criteria andCODG_BOLETINEqualTo(String value)
        {
            addCriterion("CODG_BOLETIN =", value, "CODG_BOLETIN");
            return this;
        }

        public Criteria andCODG_BOLETINNotEqualTo(String value)
        {
            addCriterion("CODG_BOLETIN <>", value, "CODG_BOLETIN");
            return this;
        }

        public Criteria andCODG_BOLETINGreaterThan(String value)
        {
            addCriterion("CODG_BOLETIN >", value, "CODG_BOLETIN");
            return this;
        }

        public Criteria andCODG_BOLETINGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_BOLETIN >=", value, "CODG_BOLETIN");
            return this;
        }

        public Criteria andCODG_BOLETINLessThan(String value)
        {
            addCriterion("CODG_BOLETIN <", value, "CODG_BOLETIN");
            return this;
        }

        public Criteria andCODG_BOLETINLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_BOLETIN <=", value, "CODG_BOLETIN");
            return this;
        }

        public Criteria andCODG_BOLETINLike(String value)
        {
            addCriterion("CODG_BOLETIN like", value, "CODG_BOLETIN");
            return this;
        }

        public Criteria andCODG_BOLETINNotLike(String value)
        {
            addCriterion("CODG_BOLETIN not like", value, "CODG_BOLETIN");
            return this;
        }

        public Criteria andCODG_BOLETINIn(List values)
        {
            addCriterion("CODG_BOLETIN in", values, "CODG_BOLETIN");
            return this;
        }

        public Criteria andCODG_BOLETINNotIn(List values)
        {
            addCriterion("CODG_BOLETIN not in", values, "CODG_BOLETIN");
            return this;
        }

        public Criteria andCODG_BOLETINBetween(String value1, String value2)
        {
            addCriterion("CODG_BOLETIN between", value1, value2, "CODG_BOLETIN");
            return this;
        }

        public Criteria andCODG_BOLETINNotBetween(String value1, String value2)
        {
            addCriterion("CODG_BOLETIN not between", value1, value2, "CODG_BOLETIN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_OFICIOIsNull()
        {
            criteriaWithoutValue.add("NUMR_OFICIO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_OFICIOIsNotNull()
        {
            criteriaWithoutValue.add("NUMR_OFICIO is not null");
            return this;
        }

        public Criteria andNUMR_OFICIOEqualTo(Integer value)
        {
            addCriterion("NUMR_OFICIO =", value, "NUMR_OFICIO");
            return this;
        }

        public Criteria andNUMR_OFICIONotEqualTo(Integer value)
        {
            addCriterion("NUMR_OFICIO <>", value, "NUMR_OFICIO");
            return this;
        }

        public Criteria andNUMR_OFICIOGreaterThan(Integer value)
        {
            addCriterion("NUMR_OFICIO >", value, "NUMR_OFICIO");
            return this;
        }

        public Criteria andNUMR_OFICIOGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("NUMR_OFICIO >=", value, "NUMR_OFICIO");
            return this;
        }

        public Criteria andNUMR_OFICIOLessThan(Integer value)
        {
            addCriterion("NUMR_OFICIO <", value, "NUMR_OFICIO");
            return this;
        }

        public Criteria andNUMR_OFICIOLessThanOrEqualTo(Integer value)
        {
            addCriterion("NUMR_OFICIO <=", value, "NUMR_OFICIO");
            return this;
        }

        public Criteria andNUMR_OFICIOIn(List values)
        {
            addCriterion("NUMR_OFICIO in", values, "NUMR_OFICIO");
            return this;
        }

        public Criteria andNUMR_OFICIONotIn(List values)
        {
            addCriterion("NUMR_OFICIO not in", values, "NUMR_OFICIO");
            return this;
        }

        public Criteria andNUMR_OFICIOBetween(Integer value1, Integer value2)
        {
            addCriterion("NUMR_OFICIO between", value1, value2, "NUMR_OFICIO");
            return this;
        }

        public Criteria andNUMR_OFICIONotBetween(Integer value1, Integer value2)
        {
            addCriterion("NUMR_OFICIO not between", value1, value2, "NUMR_OFICIO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andANIO_OFICIOIsNull()
        {
            criteriaWithoutValue.add("ANIO_OFICIO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andANIO_OFICIOIsNotNull()
        {
            criteriaWithoutValue.add("ANIO_OFICIO is not null");
            return this;
        }

        public Criteria andANIO_OFICIOEqualTo(Short value)
        {
            addCriterion("ANIO_OFICIO =", value, "ANIO_OFICIO");
            return this;
        }

        public Criteria andANIO_OFICIONotEqualTo(Short value)
        {
            addCriterion("ANIO_OFICIO <>", value, "ANIO_OFICIO");
            return this;
        }

        public Criteria andANIO_OFICIOGreaterThan(Short value)
        {
            addCriterion("ANIO_OFICIO >", value, "ANIO_OFICIO");
            return this;
        }

        public Criteria andANIO_OFICIOGreaterThanOrEqualTo(Short value)
        {
            addCriterion("ANIO_OFICIO >=", value, "ANIO_OFICIO");
            return this;
        }

        public Criteria andANIO_OFICIOLessThan(Short value)
        {
            addCriterion("ANIO_OFICIO <", value, "ANIO_OFICIO");
            return this;
        }

        public Criteria andANIO_OFICIOLessThanOrEqualTo(Short value)
        {
            addCriterion("ANIO_OFICIO <=", value, "ANIO_OFICIO");
            return this;
        }

        public Criteria andANIO_OFICIOIn(List values)
        {
            addCriterion("ANIO_OFICIO in", values, "ANIO_OFICIO");
            return this;
        }

        public Criteria andANIO_OFICIONotIn(List values)
        {
            addCriterion("ANIO_OFICIO not in", values, "ANIO_OFICIO");
            return this;
        }

        public Criteria andANIO_OFICIOBetween(Short value1, Short value2)
        {
            addCriterion("ANIO_OFICIO between", value1, value2, "ANIO_OFICIO");
            return this;
        }

        public Criteria andANIO_OFICIONotBetween(Short value1, Short value2)
        {
            addCriterion("ANIO_OFICIO not between", value1, value2, "ANIO_OFICIO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_EXPEDIENTEIsNull()
        {
            criteriaWithoutValue.add("NUMR_EXPEDIENTE is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_EXPEDIENTEIsNotNull()
        {
            criteriaWithoutValue.add("NUMR_EXPEDIENTE is not null");
            return this;
        }

        public Criteria andNUMR_EXPEDIENTEEqualTo(Integer value)
        {
            addCriterion("NUMR_EXPEDIENTE =", value, "NUMR_EXPEDIENTE");
            return this;
        }

        public Criteria andNUMR_EXPEDIENTENotEqualTo(Integer value)
        {
            addCriterion("NUMR_EXPEDIENTE <>", value, "NUMR_EXPEDIENTE");
            return this;
        }

        public Criteria andNUMR_EXPEDIENTEGreaterThan(Integer value)
        {
            addCriterion("NUMR_EXPEDIENTE >", value, "NUMR_EXPEDIENTE");
            return this;
        }

        public Criteria andNUMR_EXPEDIENTEGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("NUMR_EXPEDIENTE >=", value, "NUMR_EXPEDIENTE");
            return this;
        }

        public Criteria andNUMR_EXPEDIENTELessThan(Integer value)
        {
            addCriterion("NUMR_EXPEDIENTE <", value, "NUMR_EXPEDIENTE");
            return this;
        }

        public Criteria andNUMR_EXPEDIENTELessThanOrEqualTo(Integer value)
        {
            addCriterion("NUMR_EXPEDIENTE <=", value, "NUMR_EXPEDIENTE");
            return this;
        }

        public Criteria andNUMR_EXPEDIENTEIn(List values)
        {
            addCriterion("NUMR_EXPEDIENTE in", values, "NUMR_EXPEDIENTE");
            return this;
        }

        public Criteria andNUMR_EXPEDIENTENotIn(List values)
        {
            addCriterion("NUMR_EXPEDIENTE not in", values, "NUMR_EXPEDIENTE");
            return this;
        }

        public Criteria andNUMR_EXPEDIENTEBetween(Integer value1, Integer value2)
        {
            addCriterion("NUMR_EXPEDIENTE between", value1, value2, "NUMR_EXPEDIENTE");
            return this;
        }

        public Criteria andNUMR_EXPEDIENTENotBetween(Integer value1, Integer value2)
        {
            addCriterion("NUMR_EXPEDIENTE not between", value1, value2, "NUMR_EXPEDIENTE");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andANIO_EXPEDIENTEIsNull()
        {
            criteriaWithoutValue.add("ANIO_EXPEDIENTE is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andANIO_EXPEDIENTEIsNotNull()
        {
            criteriaWithoutValue.add("ANIO_EXPEDIENTE is not null");
            return this;
        }

        public Criteria andANIO_EXPEDIENTEEqualTo(Short value)
        {
            addCriterion("ANIO_EXPEDIENTE =", value, "ANIO_EXPEDIENTE");
            return this;
        }

        public Criteria andANIO_EXPEDIENTENotEqualTo(Short value)
        {
            addCriterion("ANIO_EXPEDIENTE <>", value, "ANIO_EXPEDIENTE");
            return this;
        }

        public Criteria andANIO_EXPEDIENTEGreaterThan(Short value)
        {
            addCriterion("ANIO_EXPEDIENTE >", value, "ANIO_EXPEDIENTE");
            return this;
        }

        public Criteria andANIO_EXPEDIENTEGreaterThanOrEqualTo(Short value)
        {
            addCriterion("ANIO_EXPEDIENTE >=", value, "ANIO_EXPEDIENTE");
            return this;
        }

        public Criteria andANIO_EXPEDIENTELessThan(Short value)
        {
            addCriterion("ANIO_EXPEDIENTE <", value, "ANIO_EXPEDIENTE");
            return this;
        }

        public Criteria andANIO_EXPEDIENTELessThanOrEqualTo(Short value)
        {
            addCriterion("ANIO_EXPEDIENTE <=", value, "ANIO_EXPEDIENTE");
            return this;
        }

        public Criteria andANIO_EXPEDIENTEIn(List values)
        {
            addCriterion("ANIO_EXPEDIENTE in", values, "ANIO_EXPEDIENTE");
            return this;
        }

        public Criteria andANIO_EXPEDIENTENotIn(List values)
        {
            addCriterion("ANIO_EXPEDIENTE not in", values, "ANIO_EXPEDIENTE");
            return this;
        }

        public Criteria andANIO_EXPEDIENTEBetween(Short value1, Short value2)
        {
            addCriterion("ANIO_EXPEDIENTE between", value1, value2, "ANIO_EXPEDIENTE");
            return this;
        }

        public Criteria andANIO_EXPEDIENTENotBetween(Short value1, Short value2)
        {
            addCriterion("ANIO_EXPEDIENTE not between", value1, value2, "ANIO_EXPEDIENTE");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_ANULACIONIsNull()
        {
            criteriaWithoutValue.add("FECH_ANULACION is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_ANULACIONIsNotNull()
        {
            criteriaWithoutValue.add("FECH_ANULACION is not null");
            return this;
        }

        public Criteria andFECH_ANULACIONEqualTo(Date value)
        {
            addCriterion("FECH_ANULACION =", value, "FECH_ANULACION");
            return this;
        }

        public Criteria andFECH_ANULACIONNotEqualTo(Date value)
        {
            addCriterion("FECH_ANULACION <>", value, "FECH_ANULACION");
            return this;
        }

        public Criteria andFECH_ANULACIONGreaterThan(Date value)
        {
            addCriterion("FECH_ANULACION >", value, "FECH_ANULACION");
            return this;
        }

        public Criteria andFECH_ANULACIONGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FECH_ANULACION >=", value, "FECH_ANULACION");
            return this;
        }

        public Criteria andFECH_ANULACIONLessThan(Date value)
        {
            addCriterion("FECH_ANULACION <", value, "FECH_ANULACION");
            return this;
        }

        public Criteria andFECH_ANULACIONLessThanOrEqualTo(Date value)
        {
            addCriterion("FECH_ANULACION <=", value, "FECH_ANULACION");
            return this;
        }

        public Criteria andFECH_ANULACIONIn(List values)
        {
            addCriterion("FECH_ANULACION in", values, "FECH_ANULACION");
            return this;
        }

        public Criteria andFECH_ANULACIONNotIn(List values)
        {
            addCriterion("FECH_ANULACION not in", values, "FECH_ANULACION");
            return this;
        }

        public Criteria andFECH_ANULACIONBetween(Date value1, Date value2)
        {
            addCriterion("FECH_ANULACION between", value1, value2, "FECH_ANULACION");
            return this;
        }

        public Criteria andFECH_ANULACIONNotBetween(Date value1, Date value2)
        {
            addCriterion("FECH_ANULACION not between", value1, value2, "FECH_ANULACION");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_ANULACIONIsNull()
        {
            criteriaWithoutValue.add("DESC_ANULACION is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_ANULACIONIsNotNull()
        {
            criteriaWithoutValue.add("DESC_ANULACION is not null");
            return this;
        }

        public Criteria andDESC_ANULACIONEqualTo(String value)
        {
            addCriterion("DESC_ANULACION =", value, "DESC_ANULACION");
            return this;
        }

        public Criteria andDESC_ANULACIONNotEqualTo(String value)
        {
            addCriterion("DESC_ANULACION <>", value, "DESC_ANULACION");
            return this;
        }

        public Criteria andDESC_ANULACIONGreaterThan(String value)
        {
            addCriterion("DESC_ANULACION >", value, "DESC_ANULACION");
            return this;
        }

        public Criteria andDESC_ANULACIONGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_ANULACION >=", value, "DESC_ANULACION");
            return this;
        }

        public Criteria andDESC_ANULACIONLessThan(String value)
        {
            addCriterion("DESC_ANULACION <", value, "DESC_ANULACION");
            return this;
        }

        public Criteria andDESC_ANULACIONLessThanOrEqualTo(String value)
        {
            addCriterion("DESC_ANULACION <=", value, "DESC_ANULACION");
            return this;
        }

        public Criteria andDESC_ANULACIONLike(String value)
        {
            addCriterion("DESC_ANULACION like", value, "DESC_ANULACION");
            return this;
        }

        public Criteria andDESC_ANULACIONNotLike(String value)
        {
            addCriterion("DESC_ANULACION not like", value, "DESC_ANULACION");
            return this;
        }

        public Criteria andDESC_ANULACIONIn(List values)
        {
            addCriterion("DESC_ANULACION in", values, "DESC_ANULACION");
            return this;
        }

        public Criteria andDESC_ANULACIONNotIn(List values)
        {
            addCriterion("DESC_ANULACION not in", values, "DESC_ANULACION");
            return this;
        }

        public Criteria andDESC_ANULACIONBetween(String value1, String value2)
        {
            addCriterion("DESC_ANULACION between", value1, value2, "DESC_ANULACION");
            return this;
        }

        public Criteria andDESC_ANULACIONNotBetween(String value1, String value2)
        {
            addCriterion("DESC_ANULACION not between", value1, value2, "DESC_ANULACION");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_SOLIDARIOIsNull()
        {
            criteriaWithoutValue.add("INDC_SOLIDARIO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_SOLIDARIOIsNotNull()
        {
            criteriaWithoutValue.add("INDC_SOLIDARIO is not null");
            return this;
        }

        public Criteria andINDC_SOLIDARIOEqualTo(String value)
        {
            addCriterion("INDC_SOLIDARIO =", value, "INDC_SOLIDARIO");
            return this;
        }

        public Criteria andINDC_SOLIDARIONotEqualTo(String value)
        {
            addCriterion("INDC_SOLIDARIO <>", value, "INDC_SOLIDARIO");
            return this;
        }

        public Criteria andINDC_SOLIDARIOGreaterThan(String value)
        {
            addCriterion("INDC_SOLIDARIO >", value, "INDC_SOLIDARIO");
            return this;
        }

        public Criteria andINDC_SOLIDARIOGreaterThanOrEqualTo(String value)
        {
            addCriterion("INDC_SOLIDARIO >=", value, "INDC_SOLIDARIO");
            return this;
        }

        public Criteria andINDC_SOLIDARIOLessThan(String value)
        {
            addCriterion("INDC_SOLIDARIO <", value, "INDC_SOLIDARIO");
            return this;
        }

        public Criteria andINDC_SOLIDARIOLessThanOrEqualTo(String value)
        {
            addCriterion("INDC_SOLIDARIO <=", value, "INDC_SOLIDARIO");
            return this;
        }

        public Criteria andINDC_SOLIDARIOLike(String value)
        {
            addCriterion("INDC_SOLIDARIO like", value, "INDC_SOLIDARIO");
            return this;
        }

        public Criteria andINDC_SOLIDARIONotLike(String value)
        {
            addCriterion("INDC_SOLIDARIO not like", value, "INDC_SOLIDARIO");
            return this;
        }

        public Criteria andINDC_SOLIDARIOIn(List values)
        {
            addCriterion("INDC_SOLIDARIO in", values, "INDC_SOLIDARIO");
            return this;
        }

        public Criteria andINDC_SOLIDARIONotIn(List values)
        {
            addCriterion("INDC_SOLIDARIO not in", values, "INDC_SOLIDARIO");
            return this;
        }

        public Criteria andINDC_SOLIDARIOBetween(String value1, String value2)
        {
            addCriterion("INDC_SOLIDARIO between", value1, value2, "INDC_SOLIDARIO");
            return this;
        }

        public Criteria andINDC_SOLIDARIONotBetween(String value1, String value2)
        {
            addCriterion("INDC_SOLIDARIO not between", value1, value2, "INDC_SOLIDARIO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_TIEMPO_SUSPENSIONIsNull()
        {
            criteriaWithoutValue.add("DESC_TIEMPO_SUSPENSION is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_TIEMPO_SUSPENSIONIsNotNull()
        {
            criteriaWithoutValue.add("DESC_TIEMPO_SUSPENSION is not null");
            return this;
        }

        public Criteria andDESC_TIEMPO_SUSPENSIONEqualTo(String value)
        {
            addCriterion("DESC_TIEMPO_SUSPENSION =", value, "DESC_TIEMPO_SUSPENSION");
            return this;
        }

        public Criteria andDESC_TIEMPO_SUSPENSIONNotEqualTo(String value)
        {
            addCriterion("DESC_TIEMPO_SUSPENSION <>", value, "DESC_TIEMPO_SUSPENSION");
            return this;
        }

        public Criteria andDESC_TIEMPO_SUSPENSIONGreaterThan(String value)
        {
            addCriterion("DESC_TIEMPO_SUSPENSION >", value, "DESC_TIEMPO_SUSPENSION");
            return this;
        }

        public Criteria andDESC_TIEMPO_SUSPENSIONGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_TIEMPO_SUSPENSION >=", value, "DESC_TIEMPO_SUSPENSION");
            return this;
        }

        public Criteria andDESC_TIEMPO_SUSPENSIONLessThan(String value)
        {
            addCriterion("DESC_TIEMPO_SUSPENSION <", value, "DESC_TIEMPO_SUSPENSION");
            return this;
        }

        public Criteria andDESC_TIEMPO_SUSPENSIONLessThanOrEqualTo(String value)
        {
            addCriterion("DESC_TIEMPO_SUSPENSION <=", value, "DESC_TIEMPO_SUSPENSION");
            return this;
        }

        public Criteria andDESC_TIEMPO_SUSPENSIONLike(String value)
        {
            addCriterion("DESC_TIEMPO_SUSPENSION like", value, "DESC_TIEMPO_SUSPENSION");
            return this;
        }

        public Criteria andDESC_TIEMPO_SUSPENSIONNotLike(String value)
        {
            addCriterion("DESC_TIEMPO_SUSPENSION not like", value, "DESC_TIEMPO_SUSPENSION");
            return this;
        }

        public Criteria andDESC_TIEMPO_SUSPENSIONIn(List values)
        {
            addCriterion("DESC_TIEMPO_SUSPENSION in", values, "DESC_TIEMPO_SUSPENSION");
            return this;
        }

        public Criteria andDESC_TIEMPO_SUSPENSIONNotIn(List values)
        {
            addCriterion("DESC_TIEMPO_SUSPENSION not in", values, "DESC_TIEMPO_SUSPENSION");
            return this;
        }

        public Criteria andDESC_TIEMPO_SUSPENSIONBetween(String value1, String value2)
        {
            addCriterion("DESC_TIEMPO_SUSPENSION between", value1, value2, "DESC_TIEMPO_SUSPENSION");
            return this;
        }

        public Criteria andDESC_TIEMPO_SUSPENSIONNotBetween(String value1, String value2)
        {
            addCriterion("DESC_TIEMPO_SUSPENSION not between", value1, value2, "DESC_TIEMPO_SUSPENSION");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andTIPO_PRONU_JINSTIsNull()
        {
            criteriaWithoutValue.add("TIPO_PRONU_JINST is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andTIPO_PRONU_JINSTIsNotNull()
        {
            criteriaWithoutValue.add("TIPO_PRONU_JINST is not null");
            return this;
        }

        public Criteria andTIPO_PRONU_JINSTEqualTo(String value)
        {
            addCriterion("TIPO_PRONU_JINST =", value, "TIPO_PRONU_JINST");
            return this;
        }

        public Criteria andTIPO_PRONU_JINSTNotEqualTo(String value)
        {
            addCriterion("TIPO_PRONU_JINST <>", value, "TIPO_PRONU_JINST");
            return this;
        }

        public Criteria andTIPO_PRONU_JINSTGreaterThan(String value)
        {
            addCriterion("TIPO_PRONU_JINST >", value, "TIPO_PRONU_JINST");
            return this;
        }

        public Criteria andTIPO_PRONU_JINSTGreaterThanOrEqualTo(String value)
        {
            addCriterion("TIPO_PRONU_JINST >=", value, "TIPO_PRONU_JINST");
            return this;
        }

        public Criteria andTIPO_PRONU_JINSTLessThan(String value)
        {
            addCriterion("TIPO_PRONU_JINST <", value, "TIPO_PRONU_JINST");
            return this;
        }

        public Criteria andTIPO_PRONU_JINSTLessThanOrEqualTo(String value)
        {
            addCriterion("TIPO_PRONU_JINST <=", value, "TIPO_PRONU_JINST");
            return this;
        }

        public Criteria andTIPO_PRONU_JINSTLike(String value)
        {
            addCriterion("TIPO_PRONU_JINST like", value, "TIPO_PRONU_JINST");
            return this;
        }

        public Criteria andTIPO_PRONU_JINSTNotLike(String value)
        {
            addCriterion("TIPO_PRONU_JINST not like", value, "TIPO_PRONU_JINST");
            return this;
        }

        public Criteria andTIPO_PRONU_JINSTIn(List values)
        {
            addCriterion("TIPO_PRONU_JINST in", values, "TIPO_PRONU_JINST");
            return this;
        }

        public Criteria andTIPO_PRONU_JINSTNotIn(List values)
        {
            addCriterion("TIPO_PRONU_JINST not in", values, "TIPO_PRONU_JINST");
            return this;
        }

        public Criteria andTIPO_PRONU_JINSTBetween(String value1, String value2)
        {
            addCriterion("TIPO_PRONU_JINST between", value1, value2, "TIPO_PRONU_JINST");
            return this;
        }

        public Criteria andTIPO_PRONU_JINSTNotBetween(String value1, String value2)
        {
            addCriterion("TIPO_PRONU_JINST not between", value1, value2, "TIPO_PRONU_JINST");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_APLL_PATER_BOLETNIsNull()
        {
            criteriaWithoutValue.add("X_APLL_PATER_BOLETN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_APLL_PATER_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("X_APLL_PATER_BOLETN is not null");
            return this;
        }

        public Criteria andX_APLL_PATER_BOLETNEqualTo(String value)
        {
            addCriterion("X_APLL_PATER_BOLETN =", value, "X_APLL_PATER_BOLETN");
            return this;
        }

        public Criteria andX_APLL_PATER_BOLETNNotEqualTo(String value)
        {
            addCriterion("X_APLL_PATER_BOLETN <>", value, "X_APLL_PATER_BOLETN");
            return this;
        }

        public Criteria andX_APLL_PATER_BOLETNGreaterThan(String value)
        {
            addCriterion("X_APLL_PATER_BOLETN >", value, "X_APLL_PATER_BOLETN");
            return this;
        }

        public Criteria andX_APLL_PATER_BOLETNGreaterThanOrEqualTo(String value)
        {
            addCriterion("X_APLL_PATER_BOLETN >=", value, "X_APLL_PATER_BOLETN");
            return this;
        }

        public Criteria andX_APLL_PATER_BOLETNLessThan(String value)
        {
            addCriterion("X_APLL_PATER_BOLETN <", value, "X_APLL_PATER_BOLETN");
            return this;
        }

        public Criteria andX_APLL_PATER_BOLETNLessThanOrEqualTo(String value)
        {
            addCriterion("X_APLL_PATER_BOLETN <=", value, "X_APLL_PATER_BOLETN");
            return this;
        }

        public Criteria andX_APLL_PATER_BOLETNLike(String value)
        {
            addCriterion("X_APLL_PATER_BOLETN like", value, "X_APLL_PATER_BOLETN");
            return this;
        }

        public Criteria andX_APLL_PATER_BOLETNNotLike(String value)
        {
            addCriterion("X_APLL_PATER_BOLETN not like", value, "X_APLL_PATER_BOLETN");
            return this;
        }

        public Criteria andX_APLL_PATER_BOLETNIn(List values)
        {
            addCriterion("X_APLL_PATER_BOLETN in", values, "X_APLL_PATER_BOLETN");
            return this;
        }

        public Criteria andX_APLL_PATER_BOLETNNotIn(List values)
        {
            addCriterion("X_APLL_PATER_BOLETN not in", values, "X_APLL_PATER_BOLETN");
            return this;
        }

        public Criteria andX_APLL_PATER_BOLETNBetween(String value1, String value2)
        {
            addCriterion("X_APLL_PATER_BOLETN between", value1, value2, "X_APLL_PATER_BOLETN");
            return this;
        }

        public Criteria andX_APLL_PATER_BOLETNNotBetween(String value1, String value2)
        {
            addCriterion("X_APLL_PATER_BOLETN not between", value1, value2, "X_APLL_PATER_BOLETN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_APLL_MATER_BOLETNIsNull()
        {
            criteriaWithoutValue.add("X_APLL_MATER_BOLETN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_APLL_MATER_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("X_APLL_MATER_BOLETN is not null");
            return this;
        }

        public Criteria andX_APLL_MATER_BOLETNEqualTo(String value)
        {
            addCriterion("X_APLL_MATER_BOLETN =", value, "X_APLL_MATER_BOLETN");
            return this;
        }

        public Criteria andX_APLL_MATER_BOLETNNotEqualTo(String value)
        {
            addCriterion("X_APLL_MATER_BOLETN <>", value, "X_APLL_MATER_BOLETN");
            return this;
        }

        public Criteria andX_APLL_MATER_BOLETNGreaterThan(String value)
        {
            addCriterion("X_APLL_MATER_BOLETN >", value, "X_APLL_MATER_BOLETN");
            return this;
        }

        public Criteria andX_APLL_MATER_BOLETNGreaterThanOrEqualTo(String value)
        {
            addCriterion("X_APLL_MATER_BOLETN >=", value, "X_APLL_MATER_BOLETN");
            return this;
        }

        public Criteria andX_APLL_MATER_BOLETNLessThan(String value)
        {
            addCriterion("X_APLL_MATER_BOLETN <", value, "X_APLL_MATER_BOLETN");
            return this;
        }

        public Criteria andX_APLL_MATER_BOLETNLessThanOrEqualTo(String value)
        {
            addCriterion("X_APLL_MATER_BOLETN <=", value, "X_APLL_MATER_BOLETN");
            return this;
        }

        public Criteria andX_APLL_MATER_BOLETNLike(String value)
        {
            addCriterion("X_APLL_MATER_BOLETN like", value, "X_APLL_MATER_BOLETN");
            return this;
        }

        public Criteria andX_APLL_MATER_BOLETNNotLike(String value)
        {
            addCriterion("X_APLL_MATER_BOLETN not like", value, "X_APLL_MATER_BOLETN");
            return this;
        }

        public Criteria andX_APLL_MATER_BOLETNIn(List values)
        {
            addCriterion("X_APLL_MATER_BOLETN in", values, "X_APLL_MATER_BOLETN");
            return this;
        }

        public Criteria andX_APLL_MATER_BOLETNNotIn(List values)
        {
            addCriterion("X_APLL_MATER_BOLETN not in", values, "X_APLL_MATER_BOLETN");
            return this;
        }

        public Criteria andX_APLL_MATER_BOLETNBetween(String value1, String value2)
        {
            addCriterion("X_APLL_MATER_BOLETN between", value1, value2, "X_APLL_MATER_BOLETN");
            return this;
        }

        public Criteria andX_APLL_MATER_BOLETNNotBetween(String value1, String value2)
        {
            addCriterion("X_APLL_MATER_BOLETN not between", value1, value2, "X_APLL_MATER_BOLETN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_NOMB_BOLETNIsNull()
        {
            criteriaWithoutValue.add("X_NOMB_BOLETN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_NOMB_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("X_NOMB_BOLETN is not null");
            return this;
        }

        public Criteria andX_NOMB_BOLETNEqualTo(String value)
        {
            addCriterion("X_NOMB_BOLETN =", value, "X_NOMB_BOLETN");
            return this;
        }

        public Criteria andX_NOMB_BOLETNNotEqualTo(String value)
        {
            addCriterion("X_NOMB_BOLETN <>", value, "X_NOMB_BOLETN");
            return this;
        }

        public Criteria andX_NOMB_BOLETNGreaterThan(String value)
        {
            addCriterion("X_NOMB_BOLETN >", value, "X_NOMB_BOLETN");
            return this;
        }

        public Criteria andX_NOMB_BOLETNGreaterThanOrEqualTo(String value)
        {
            addCriterion("X_NOMB_BOLETN >=", value, "X_NOMB_BOLETN");
            return this;
        }

        public Criteria andX_NOMB_BOLETNLessThan(String value)
        {
            addCriterion("X_NOMB_BOLETN <", value, "X_NOMB_BOLETN");
            return this;
        }

        public Criteria andX_NOMB_BOLETNLessThanOrEqualTo(String value)
        {
            addCriterion("X_NOMB_BOLETN <=", value, "X_NOMB_BOLETN");
            return this;
        }

        public Criteria andX_NOMB_BOLETNLike(String value)
        {
            addCriterion("X_NOMB_BOLETN like", value, "X_NOMB_BOLETN");
            return this;
        }

        public Criteria andX_NOMB_BOLETNNotLike(String value)
        {
            addCriterion("X_NOMB_BOLETN not like", value, "X_NOMB_BOLETN");
            return this;
        }

        public Criteria andX_NOMB_BOLETNIn(List values)
        {
            addCriterion("X_NOMB_BOLETN in", values, "X_NOMB_BOLETN");
            return this;
        }

        public Criteria andX_NOMB_BOLETNNotIn(List values)
        {
            addCriterion("X_NOMB_BOLETN not in", values, "X_NOMB_BOLETN");
            return this;
        }

        public Criteria andX_NOMB_BOLETNBetween(String value1, String value2)
        {
            addCriterion("X_NOMB_BOLETN between", value1, value2, "X_NOMB_BOLETN");
            return this;
        }

        public Criteria andX_NOMB_BOLETNNotBetween(String value1, String value2)
        {
            addCriterion("X_NOMB_BOLETN not between", value1, value2, "X_NOMB_BOLETN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_APLL_PATER_BOLETN_2IsNull()
        {
            criteriaWithoutValue.add("X_APLL_PATER_BOLETN_2 is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_APLL_PATER_BOLETN_2IsNotNull()
        {
            criteriaWithoutValue.add("X_APLL_PATER_BOLETN_2 is not null");
            return this;
        }

        public Criteria andX_APLL_PATER_BOLETN_2EqualTo(String value)
        {
            addCriterion("X_APLL_PATER_BOLETN_2 =", value, "X_APLL_PATER_BOLETN_2");
            return this;
        }

        public Criteria andX_APLL_PATER_BOLETN_2NotEqualTo(String value)
        {
            addCriterion("X_APLL_PATER_BOLETN_2 <>", value, "X_APLL_PATER_BOLETN_2");
            return this;
        }

        public Criteria andX_APLL_PATER_BOLETN_2GreaterThan(String value)
        {
            addCriterion("X_APLL_PATER_BOLETN_2 >", value, "X_APLL_PATER_BOLETN_2");
            return this;
        }

        public Criteria andX_APLL_PATER_BOLETN_2GreaterThanOrEqualTo(String value)
        {
            addCriterion("X_APLL_PATER_BOLETN_2 >=", value, "X_APLL_PATER_BOLETN_2");
            return this;
        }

        public Criteria andX_APLL_PATER_BOLETN_2LessThan(String value)
        {
            addCriterion("X_APLL_PATER_BOLETN_2 <", value, "X_APLL_PATER_BOLETN_2");
            return this;
        }

        public Criteria andX_APLL_PATER_BOLETN_2LessThanOrEqualTo(String value)
        {
            addCriterion("X_APLL_PATER_BOLETN_2 <=", value, "X_APLL_PATER_BOLETN_2");
            return this;
        }

        public Criteria andX_APLL_PATER_BOLETN_2Like(String value)
        {
            addCriterion("X_APLL_PATER_BOLETN_2 like", value, "X_APLL_PATER_BOLETN_2");
            return this;
        }

        public Criteria andX_APLL_PATER_BOLETN_2NotLike(String value)
        {
            addCriterion("X_APLL_PATER_BOLETN_2 not like", value, "X_APLL_PATER_BOLETN_2");
            return this;
        }

        public Criteria andX_APLL_PATER_BOLETN_2In(List values)
        {
            addCriterion("X_APLL_PATER_BOLETN_2 in", values, "X_APLL_PATER_BOLETN_2");
            return this;
        }

        public Criteria andX_APLL_PATER_BOLETN_2NotIn(List values)
        {
            addCriterion("X_APLL_PATER_BOLETN_2 not in", values, "X_APLL_PATER_BOLETN_2");
            return this;
        }

        public Criteria andX_APLL_PATER_BOLETN_2Between(String value1, String value2)
        {
            addCriterion("X_APLL_PATER_BOLETN_2 between", value1, value2, "X_APLL_PATER_BOLETN_2");
            return this;
        }

        public Criteria andX_APLL_PATER_BOLETN_2NotBetween(String value1, String value2)
        {
            addCriterion("X_APLL_PATER_BOLETN_2 not between", value1, value2, "X_APLL_PATER_BOLETN_2");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_APLL_MATER_BOLETN_2IsNull()
        {
            criteriaWithoutValue.add("X_APLL_MATER_BOLETN_2 is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_APLL_MATER_BOLETN_2IsNotNull()
        {
            criteriaWithoutValue.add("X_APLL_MATER_BOLETN_2 is not null");
            return this;
        }

        public Criteria andX_APLL_MATER_BOLETN_2EqualTo(String value)
        {
            addCriterion("X_APLL_MATER_BOLETN_2 =", value, "X_APLL_MATER_BOLETN_2");
            return this;
        }

        public Criteria andX_APLL_MATER_BOLETN_2NotEqualTo(String value)
        {
            addCriterion("X_APLL_MATER_BOLETN_2 <>", value, "X_APLL_MATER_BOLETN_2");
            return this;
        }

        public Criteria andX_APLL_MATER_BOLETN_2GreaterThan(String value)
        {
            addCriterion("X_APLL_MATER_BOLETN_2 >", value, "X_APLL_MATER_BOLETN_2");
            return this;
        }

        public Criteria andX_APLL_MATER_BOLETN_2GreaterThanOrEqualTo(String value)
        {
            addCriterion("X_APLL_MATER_BOLETN_2 >=", value, "X_APLL_MATER_BOLETN_2");
            return this;
        }

        public Criteria andX_APLL_MATER_BOLETN_2LessThan(String value)
        {
            addCriterion("X_APLL_MATER_BOLETN_2 <", value, "X_APLL_MATER_BOLETN_2");
            return this;
        }

        public Criteria andX_APLL_MATER_BOLETN_2LessThanOrEqualTo(String value)
        {
            addCriterion("X_APLL_MATER_BOLETN_2 <=", value, "X_APLL_MATER_BOLETN_2");
            return this;
        }

        public Criteria andX_APLL_MATER_BOLETN_2Like(String value)
        {
            addCriterion("X_APLL_MATER_BOLETN_2 like", value, "X_APLL_MATER_BOLETN_2");
            return this;
        }

        public Criteria andX_APLL_MATER_BOLETN_2NotLike(String value)
        {
            addCriterion("X_APLL_MATER_BOLETN_2 not like", value, "X_APLL_MATER_BOLETN_2");
            return this;
        }

        public Criteria andX_APLL_MATER_BOLETN_2In(List values)
        {
            addCriterion("X_APLL_MATER_BOLETN_2 in", values, "X_APLL_MATER_BOLETN_2");
            return this;
        }

        public Criteria andX_APLL_MATER_BOLETN_2NotIn(List values)
        {
            addCriterion("X_APLL_MATER_BOLETN_2 not in", values, "X_APLL_MATER_BOLETN_2");
            return this;
        }

        public Criteria andX_APLL_MATER_BOLETN_2Between(String value1, String value2)
        {
            addCriterion("X_APLL_MATER_BOLETN_2 between", value1, value2, "X_APLL_MATER_BOLETN_2");
            return this;
        }

        public Criteria andX_APLL_MATER_BOLETN_2NotBetween(String value1, String value2)
        {
            addCriterion("X_APLL_MATER_BOLETN_2 not between", value1, value2, "X_APLL_MATER_BOLETN_2");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_NOMB_BOLETN_2IsNull()
        {
            criteriaWithoutValue.add("X_NOMB_BOLETN_2 is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_NOMB_BOLETN_2IsNotNull()
        {
            criteriaWithoutValue.add("X_NOMB_BOLETN_2 is not null");
            return this;
        }

        public Criteria andX_NOMB_BOLETN_2EqualTo(String value)
        {
            addCriterion("X_NOMB_BOLETN_2 =", value, "X_NOMB_BOLETN_2");
            return this;
        }

        public Criteria andX_NOMB_BOLETN_2NotEqualTo(String value)
        {
            addCriterion("X_NOMB_BOLETN_2 <>", value, "X_NOMB_BOLETN_2");
            return this;
        }

        public Criteria andX_NOMB_BOLETN_2GreaterThan(String value)
        {
            addCriterion("X_NOMB_BOLETN_2 >", value, "X_NOMB_BOLETN_2");
            return this;
        }

        public Criteria andX_NOMB_BOLETN_2GreaterThanOrEqualTo(String value)
        {
            addCriterion("X_NOMB_BOLETN_2 >=", value, "X_NOMB_BOLETN_2");
            return this;
        }

        public Criteria andX_NOMB_BOLETN_2LessThan(String value)
        {
            addCriterion("X_NOMB_BOLETN_2 <", value, "X_NOMB_BOLETN_2");
            return this;
        }

        public Criteria andX_NOMB_BOLETN_2LessThanOrEqualTo(String value)
        {
            addCriterion("X_NOMB_BOLETN_2 <=", value, "X_NOMB_BOLETN_2");
            return this;
        }

        public Criteria andX_NOMB_BOLETN_2Like(String value)
        {
            addCriterion("X_NOMB_BOLETN_2 like", value, "X_NOMB_BOLETN_2");
            return this;
        }

        public Criteria andX_NOMB_BOLETN_2NotLike(String value)
        {
            addCriterion("X_NOMB_BOLETN_2 not like", value, "X_NOMB_BOLETN_2");
            return this;
        }

        public Criteria andX_NOMB_BOLETN_2In(List values)
        {
            addCriterion("X_NOMB_BOLETN_2 in", values, "X_NOMB_BOLETN_2");
            return this;
        }

        public Criteria andX_NOMB_BOLETN_2NotIn(List values)
        {
            addCriterion("X_NOMB_BOLETN_2 not in", values, "X_NOMB_BOLETN_2");
            return this;
        }

        public Criteria andX_NOMB_BOLETN_2Between(String value1, String value2)
        {
            addCriterion("X_NOMB_BOLETN_2 between", value1, value2, "X_NOMB_BOLETN_2");
            return this;
        }

        public Criteria andX_NOMB_BOLETN_2NotBetween(String value1, String value2)
        {
            addCriterion("X_NOMB_BOLETN_2 not between", value1, value2, "X_NOMB_BOLETN_2");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_JORNADASIsNull()
        {
            criteriaWithoutValue.add("X_JORNADAS is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_JORNADASIsNotNull()
        {
            criteriaWithoutValue.add("X_JORNADAS is not null");
            return this;
        }

        public Criteria andX_JORNADASEqualTo(Long value)
        {
            addCriterion("X_JORNADAS =", value, "X_JORNADAS");
            return this;
        }

        public Criteria andX_JORNADASNotEqualTo(Long value)
        {
            addCriterion("X_JORNADAS <>", value, "X_JORNADAS");
            return this;
        }

        public Criteria andX_JORNADASGreaterThan(Long value)
        {
            addCriterion("X_JORNADAS >", value, "X_JORNADAS");
            return this;
        }

        public Criteria andX_JORNADASGreaterThanOrEqualTo(Long value)
        {
            addCriterion("X_JORNADAS >=", value, "X_JORNADAS");
            return this;
        }

        public Criteria andX_JORNADASLessThan(Long value)
        {
            addCriterion("X_JORNADAS <", value, "X_JORNADAS");
            return this;
        }

        public Criteria andX_JORNADASLessThanOrEqualTo(Long value)
        {
            addCriterion("X_JORNADAS <=", value, "X_JORNADAS");
            return this;
        }

        public Criteria andX_JORNADASIn(List values)
        {
            addCriterion("X_JORNADAS in", values, "X_JORNADAS");
            return this;
        }

        public Criteria andX_JORNADASNotIn(List values)
        {
            addCriterion("X_JORNADAS not in", values, "X_JORNADAS");
            return this;
        }

        public Criteria andX_JORNADASBetween(Long value1, Long value2)
        {
            addCriterion("X_JORNADAS between", value1, value2, "X_JORNADAS");
            return this;
        }

        public Criteria andX_JORNADASNotBetween(Long value1, Long value2)
        {
            addCriterion("X_JORNADAS not between", value1, value2, "X_JORNADAS");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_DIAS_MULTAIsNull()
        {
            criteriaWithoutValue.add("X_DIAS_MULTA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_DIAS_MULTAIsNotNull()
        {
            criteriaWithoutValue.add("X_DIAS_MULTA is not null");
            return this;
        }

        public Criteria andX_DIAS_MULTAEqualTo(Long value)
        {
            addCriterion("X_DIAS_MULTA =", value, "X_DIAS_MULTA");
            return this;
        }

        public Criteria andX_DIAS_MULTANotEqualTo(Long value)
        {
            addCriterion("X_DIAS_MULTA <>", value, "X_DIAS_MULTA");
            return this;
        }

        public Criteria andX_DIAS_MULTAGreaterThan(Long value)
        {
            addCriterion("X_DIAS_MULTA >", value, "X_DIAS_MULTA");
            return this;
        }

        public Criteria andX_DIAS_MULTAGreaterThanOrEqualTo(Long value)
        {
            addCriterion("X_DIAS_MULTA >=", value, "X_DIAS_MULTA");
            return this;
        }

        public Criteria andX_DIAS_MULTALessThan(Long value)
        {
            addCriterion("X_DIAS_MULTA <", value, "X_DIAS_MULTA");
            return this;
        }

        public Criteria andX_DIAS_MULTALessThanOrEqualTo(Long value)
        {
            addCriterion("X_DIAS_MULTA <=", value, "X_DIAS_MULTA");
            return this;
        }

        public Criteria andX_DIAS_MULTAIn(List values)
        {
            addCriterion("X_DIAS_MULTA in", values, "X_DIAS_MULTA");
            return this;
        }

        public Criteria andX_DIAS_MULTANotIn(List values)
        {
            addCriterion("X_DIAS_MULTA not in", values, "X_DIAS_MULTA");
            return this;
        }

        public Criteria andX_DIAS_MULTABetween(Long value1, Long value2)
        {
            addCriterion("X_DIAS_MULTA between", value1, value2, "X_DIAS_MULTA");
            return this;
        }

        public Criteria andX_DIAS_MULTANotBetween(Long value1, Long value2)
        {
            addCriterion("X_DIAS_MULTA not between", value1, value2, "X_DIAS_MULTA");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_INHABILITACIONIsNull()
        {
            criteriaWithoutValue.add("X_INHABILITACION is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_INHABILITACIONIsNotNull()
        {
            criteriaWithoutValue.add("X_INHABILITACION is not null");
            return this;
        }

        public Criteria andX_INHABILITACIONEqualTo(Long value)
        {
            addCriterion("X_INHABILITACION =", value, "X_INHABILITACION");
            return this;
        }

        public Criteria andX_INHABILITACIONNotEqualTo(Long value)
        {
            addCriterion("X_INHABILITACION <>", value, "X_INHABILITACION");
            return this;
        }

        public Criteria andX_INHABILITACIONGreaterThan(Long value)
        {
            addCriterion("X_INHABILITACION >", value, "X_INHABILITACION");
            return this;
        }

        public Criteria andX_INHABILITACIONGreaterThanOrEqualTo(Long value)
        {
            addCriterion("X_INHABILITACION >=", value, "X_INHABILITACION");
            return this;
        }

        public Criteria andX_INHABILITACIONLessThan(Long value)
        {
            addCriterion("X_INHABILITACION <", value, "X_INHABILITACION");
            return this;
        }

        public Criteria andX_INHABILITACIONLessThanOrEqualTo(Long value)
        {
            addCriterion("X_INHABILITACION <=", value, "X_INHABILITACION");
            return this;
        }

        public Criteria andX_INHABILITACIONIn(List values)
        {
            addCriterion("X_INHABILITACION in", values, "X_INHABILITACION");
            return this;
        }

        public Criteria andX_INHABILITACIONNotIn(List values)
        {
            addCriterion("X_INHABILITACION not in", values, "X_INHABILITACION");
            return this;
        }

        public Criteria andX_INHABILITACIONBetween(Long value1, Long value2)
        {
            addCriterion("X_INHABILITACION between", value1, value2, "X_INHABILITACION");
            return this;
        }

        public Criteria andX_INHABILITACIONNotBetween(Long value1, Long value2)
        {
            addCriterion("X_INHABILITACION not between", value1, value2, "X_INHABILITACION");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_INHABILITACION2IsNull()
        {
            criteriaWithoutValue.add("X_INHABILITACION2 is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_INHABILITACION2IsNotNull()
        {
            criteriaWithoutValue.add("X_INHABILITACION2 is not null");
            return this;
        }

        public Criteria andX_INHABILITACION2EqualTo(String value)
        {
            addCriterion("X_INHABILITACION2 =", value, "X_INHABILITACION2");
            return this;
        }

        public Criteria andX_INHABILITACION2NotEqualTo(String value)
        {
            addCriterion("X_INHABILITACION2 <>", value, "X_INHABILITACION2");
            return this;
        }

        public Criteria andX_INHABILITACION2GreaterThan(String value)
        {
            addCriterion("X_INHABILITACION2 >", value, "X_INHABILITACION2");
            return this;
        }

        public Criteria andX_INHABILITACION2GreaterThanOrEqualTo(String value)
        {
            addCriterion("X_INHABILITACION2 >=", value, "X_INHABILITACION2");
            return this;
        }

        public Criteria andX_INHABILITACION2LessThan(String value)
        {
            addCriterion("X_INHABILITACION2 <", value, "X_INHABILITACION2");
            return this;
        }

        public Criteria andX_INHABILITACION2LessThanOrEqualTo(String value)
        {
            addCriterion("X_INHABILITACION2 <=", value, "X_INHABILITACION2");
            return this;
        }

        public Criteria andX_INHABILITACION2Like(String value)
        {
            addCriterion("X_INHABILITACION2 like", value, "X_INHABILITACION2");
            return this;
        }

        public Criteria andX_INHABILITACION2NotLike(String value)
        {
            addCriterion("X_INHABILITACION2 not like", value, "X_INHABILITACION2");
            return this;
        }

        public Criteria andX_INHABILITACION2In(List values)
        {
            addCriterion("X_INHABILITACION2 in", values, "X_INHABILITACION2");
            return this;
        }

        public Criteria andX_INHABILITACION2NotIn(List values)
        {
            addCriterion("X_INHABILITACION2 not in", values, "X_INHABILITACION2");
            return this;
        }

        public Criteria andX_INHABILITACION2Between(String value1, String value2)
        {
            addCriterion("X_INHABILITACION2 between", value1, value2, "X_INHABILITACION2");
            return this;
        }

        public Criteria andX_INHABILITACION2NotBetween(String value1, String value2)
        {
            addCriterion("X_INHABILITACION2 not between", value1, value2, "X_INHABILITACION2");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_PERIODO_SUSPIsNull()
        {
            criteriaWithoutValue.add("X_PERIODO_SUSP is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_PERIODO_SUSPIsNotNull()
        {
            criteriaWithoutValue.add("X_PERIODO_SUSP is not null");
            return this;
        }

        public Criteria andX_PERIODO_SUSPEqualTo(String value)
        {
            addCriterion("X_PERIODO_SUSP =", value, "X_PERIODO_SUSP");
            return this;
        }

        public Criteria andX_PERIODO_SUSPNotEqualTo(String value)
        {
            addCriterion("X_PERIODO_SUSP <>", value, "X_PERIODO_SUSP");
            return this;
        }

        public Criteria andX_PERIODO_SUSPGreaterThan(String value)
        {
            addCriterion("X_PERIODO_SUSP >", value, "X_PERIODO_SUSP");
            return this;
        }

        public Criteria andX_PERIODO_SUSPGreaterThanOrEqualTo(String value)
        {
            addCriterion("X_PERIODO_SUSP >=", value, "X_PERIODO_SUSP");
            return this;
        }

        public Criteria andX_PERIODO_SUSPLessThan(String value)
        {
            addCriterion("X_PERIODO_SUSP <", value, "X_PERIODO_SUSP");
            return this;
        }

        public Criteria andX_PERIODO_SUSPLessThanOrEqualTo(String value)
        {
            addCriterion("X_PERIODO_SUSP <=", value, "X_PERIODO_SUSP");
            return this;
        }

        public Criteria andX_PERIODO_SUSPLike(String value)
        {
            addCriterion("X_PERIODO_SUSP like", value, "X_PERIODO_SUSP");
            return this;
        }

        public Criteria andX_PERIODO_SUSPNotLike(String value)
        {
            addCriterion("X_PERIODO_SUSP not like", value, "X_PERIODO_SUSP");
            return this;
        }

        public Criteria andX_PERIODO_SUSPIn(List values)
        {
            addCriterion("X_PERIODO_SUSP in", values, "X_PERIODO_SUSP");
            return this;
        }

        public Criteria andX_PERIODO_SUSPNotIn(List values)
        {
            addCriterion("X_PERIODO_SUSP not in", values, "X_PERIODO_SUSP");
            return this;
        }

        public Criteria andX_PERIODO_SUSPBetween(String value1, String value2)
        {
            addCriterion("X_PERIODO_SUSP between", value1, value2, "X_PERIODO_SUSP");
            return this;
        }

        public Criteria andX_PERIODO_SUSPNotBetween(String value1, String value2)
        {
            addCriterion("X_PERIODO_SUSP not between", value1, value2, "X_PERIODO_SUSP");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_NUMR_INSTA_BOLETN_2IsNull()
        {
            criteriaWithoutValue.add("X_NUMR_INSTA_BOLETN_2 is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_NUMR_INSTA_BOLETN_2IsNotNull()
        {
            criteriaWithoutValue.add("X_NUMR_INSTA_BOLETN_2 is not null");
            return this;
        }

        public Criteria andX_NUMR_INSTA_BOLETN_2EqualTo(String value)
        {
            addCriterion("X_NUMR_INSTA_BOLETN_2 =", value, "X_NUMR_INSTA_BOLETN_2");
            return this;
        }

        public Criteria andX_NUMR_INSTA_BOLETN_2NotEqualTo(String value)
        {
            addCriterion("X_NUMR_INSTA_BOLETN_2 <>", value, "X_NUMR_INSTA_BOLETN_2");
            return this;
        }

        public Criteria andX_NUMR_INSTA_BOLETN_2GreaterThan(String value)
        {
            addCriterion("X_NUMR_INSTA_BOLETN_2 >", value, "X_NUMR_INSTA_BOLETN_2");
            return this;
        }

        public Criteria andX_NUMR_INSTA_BOLETN_2GreaterThanOrEqualTo(String value)
        {
            addCriterion("X_NUMR_INSTA_BOLETN_2 >=", value, "X_NUMR_INSTA_BOLETN_2");
            return this;
        }

        public Criteria andX_NUMR_INSTA_BOLETN_2LessThan(String value)
        {
            addCriterion("X_NUMR_INSTA_BOLETN_2 <", value, "X_NUMR_INSTA_BOLETN_2");
            return this;
        }

        public Criteria andX_NUMR_INSTA_BOLETN_2LessThanOrEqualTo(String value)
        {
            addCriterion("X_NUMR_INSTA_BOLETN_2 <=", value, "X_NUMR_INSTA_BOLETN_2");
            return this;
        }

        public Criteria andX_NUMR_INSTA_BOLETN_2Like(String value)
        {
            addCriterion("X_NUMR_INSTA_BOLETN_2 like", value, "X_NUMR_INSTA_BOLETN_2");
            return this;
        }

        public Criteria andX_NUMR_INSTA_BOLETN_2NotLike(String value)
        {
            addCriterion("X_NUMR_INSTA_BOLETN_2 not like", value, "X_NUMR_INSTA_BOLETN_2");
            return this;
        }

        public Criteria andX_NUMR_INSTA_BOLETN_2In(List values)
        {
            addCriterion("X_NUMR_INSTA_BOLETN_2 in", values, "X_NUMR_INSTA_BOLETN_2");
            return this;
        }

        public Criteria andX_NUMR_INSTA_BOLETN_2NotIn(List values)
        {
            addCriterion("X_NUMR_INSTA_BOLETN_2 not in", values, "X_NUMR_INSTA_BOLETN_2");
            return this;
        }

        public Criteria andX_NUMR_INSTA_BOLETN_2Between(String value1, String value2)
        {
            addCriterion("X_NUMR_INSTA_BOLETN_2 between", value1, value2, "X_NUMR_INSTA_BOLETN_2");
            return this;
        }

        public Criteria andX_NUMR_INSTA_BOLETN_2NotBetween(String value1, String value2)
        {
            addCriterion("X_NUMR_INSTA_BOLETN_2 not between", value1, value2, "X_NUMR_INSTA_BOLETN_2");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_TIPO_PRONU_2IsNull()
        {
            criteriaWithoutValue.add("X_TIPO_PRONU_2 is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_TIPO_PRONU_2IsNotNull()
        {
            criteriaWithoutValue.add("X_TIPO_PRONU_2 is not null");
            return this;
        }

        public Criteria andX_TIPO_PRONU_2EqualTo(String value)
        {
            addCriterion("X_TIPO_PRONU_2 =", value, "X_TIPO_PRONU_2");
            return this;
        }

        public Criteria andX_TIPO_PRONU_2NotEqualTo(String value)
        {
            addCriterion("X_TIPO_PRONU_2 <>", value, "X_TIPO_PRONU_2");
            return this;
        }

        public Criteria andX_TIPO_PRONU_2GreaterThan(String value)
        {
            addCriterion("X_TIPO_PRONU_2 >", value, "X_TIPO_PRONU_2");
            return this;
        }

        public Criteria andX_TIPO_PRONU_2GreaterThanOrEqualTo(String value)
        {
            addCriterion("X_TIPO_PRONU_2 >=", value, "X_TIPO_PRONU_2");
            return this;
        }

        public Criteria andX_TIPO_PRONU_2LessThan(String value)
        {
            addCriterion("X_TIPO_PRONU_2 <", value, "X_TIPO_PRONU_2");
            return this;
        }

        public Criteria andX_TIPO_PRONU_2LessThanOrEqualTo(String value)
        {
            addCriterion("X_TIPO_PRONU_2 <=", value, "X_TIPO_PRONU_2");
            return this;
        }

        public Criteria andX_TIPO_PRONU_2Like(String value)
        {
            addCriterion("X_TIPO_PRONU_2 like", value, "X_TIPO_PRONU_2");
            return this;
        }

        public Criteria andX_TIPO_PRONU_2NotLike(String value)
        {
            addCriterion("X_TIPO_PRONU_2 not like", value, "X_TIPO_PRONU_2");
            return this;
        }

        public Criteria andX_TIPO_PRONU_2In(List values)
        {
            addCriterion("X_TIPO_PRONU_2 in", values, "X_TIPO_PRONU_2");
            return this;
        }

        public Criteria andX_TIPO_PRONU_2NotIn(List values)
        {
            addCriterion("X_TIPO_PRONU_2 not in", values, "X_TIPO_PRONU_2");
            return this;
        }

        public Criteria andX_TIPO_PRONU_2Between(String value1, String value2)
        {
            addCriterion("X_TIPO_PRONU_2 between", value1, value2, "X_TIPO_PRONU_2");
            return this;
        }

        public Criteria andX_TIPO_PRONU_2NotBetween(String value1, String value2)
        {
            addCriterion("X_TIPO_PRONU_2 not between", value1, value2, "X_TIPO_PRONU_2");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_CODG_LUGAR_2IsNull()
        {
            criteriaWithoutValue.add("X_CODG_LUGAR_2 is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_CODG_LUGAR_2IsNotNull()
        {
            criteriaWithoutValue.add("X_CODG_LUGAR_2 is not null");
            return this;
        }

        public Criteria andX_CODG_LUGAR_2EqualTo(String value)
        {
            addCriterion("X_CODG_LUGAR_2 =", value, "X_CODG_LUGAR_2");
            return this;
        }

        public Criteria andX_CODG_LUGAR_2NotEqualTo(String value)
        {
            addCriterion("X_CODG_LUGAR_2 <>", value, "X_CODG_LUGAR_2");
            return this;
        }

        public Criteria andX_CODG_LUGAR_2GreaterThan(String value)
        {
            addCriterion("X_CODG_LUGAR_2 >", value, "X_CODG_LUGAR_2");
            return this;
        }

        public Criteria andX_CODG_LUGAR_2GreaterThanOrEqualTo(String value)
        {
            addCriterion("X_CODG_LUGAR_2 >=", value, "X_CODG_LUGAR_2");
            return this;
        }

        public Criteria andX_CODG_LUGAR_2LessThan(String value)
        {
            addCriterion("X_CODG_LUGAR_2 <", value, "X_CODG_LUGAR_2");
            return this;
        }

        public Criteria andX_CODG_LUGAR_2LessThanOrEqualTo(String value)
        {
            addCriterion("X_CODG_LUGAR_2 <=", value, "X_CODG_LUGAR_2");
            return this;
        }

        public Criteria andX_CODG_LUGAR_2Like(String value)
        {
            addCriterion("X_CODG_LUGAR_2 like", value, "X_CODG_LUGAR_2");
            return this;
        }

        public Criteria andX_CODG_LUGAR_2NotLike(String value)
        {
            addCriterion("X_CODG_LUGAR_2 not like", value, "X_CODG_LUGAR_2");
            return this;
        }

        public Criteria andX_CODG_LUGAR_2In(List values)
        {
            addCriterion("X_CODG_LUGAR_2 in", values, "X_CODG_LUGAR_2");
            return this;
        }

        public Criteria andX_CODG_LUGAR_2NotIn(List values)
        {
            addCriterion("X_CODG_LUGAR_2 not in", values, "X_CODG_LUGAR_2");
            return this;
        }

        public Criteria andX_CODG_LUGAR_2Between(String value1, String value2)
        {
            addCriterion("X_CODG_LUGAR_2 between", value1, value2, "X_CODG_LUGAR_2");
            return this;
        }

        public Criteria andX_CODG_LUGAR_2NotBetween(String value1, String value2)
        {
            addCriterion("X_CODG_LUGAR_2 not between", value1, value2, "X_CODG_LUGAR_2");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_NUMR_INSTA_BOLETN_3IsNull()
        {
            criteriaWithoutValue.add("X_NUMR_INSTA_BOLETN_3 is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_NUMR_INSTA_BOLETN_3IsNotNull()
        {
            criteriaWithoutValue.add("X_NUMR_INSTA_BOLETN_3 is not null");
            return this;
        }

        public Criteria andX_NUMR_INSTA_BOLETN_3EqualTo(String value)
        {
            addCriterion("X_NUMR_INSTA_BOLETN_3 =", value, "X_NUMR_INSTA_BOLETN_3");
            return this;
        }

        public Criteria andX_NUMR_INSTA_BOLETN_3NotEqualTo(String value)
        {
            addCriterion("X_NUMR_INSTA_BOLETN_3 <>", value, "X_NUMR_INSTA_BOLETN_3");
            return this;
        }

        public Criteria andX_NUMR_INSTA_BOLETN_3GreaterThan(String value)
        {
            addCriterion("X_NUMR_INSTA_BOLETN_3 >", value, "X_NUMR_INSTA_BOLETN_3");
            return this;
        }

        public Criteria andX_NUMR_INSTA_BOLETN_3GreaterThanOrEqualTo(String value)
        {
            addCriterion("X_NUMR_INSTA_BOLETN_3 >=", value, "X_NUMR_INSTA_BOLETN_3");
            return this;
        }

        public Criteria andX_NUMR_INSTA_BOLETN_3LessThan(String value)
        {
            addCriterion("X_NUMR_INSTA_BOLETN_3 <", value, "X_NUMR_INSTA_BOLETN_3");
            return this;
        }

        public Criteria andX_NUMR_INSTA_BOLETN_3LessThanOrEqualTo(String value)
        {
            addCriterion("X_NUMR_INSTA_BOLETN_3 <=", value, "X_NUMR_INSTA_BOLETN_3");
            return this;
        }

        public Criteria andX_NUMR_INSTA_BOLETN_3Like(String value)
        {
            addCriterion("X_NUMR_INSTA_BOLETN_3 like", value, "X_NUMR_INSTA_BOLETN_3");
            return this;
        }

        public Criteria andX_NUMR_INSTA_BOLETN_3NotLike(String value)
        {
            addCriterion("X_NUMR_INSTA_BOLETN_3 not like", value, "X_NUMR_INSTA_BOLETN_3");
            return this;
        }

        public Criteria andX_NUMR_INSTA_BOLETN_3In(List values)
        {
            addCriterion("X_NUMR_INSTA_BOLETN_3 in", values, "X_NUMR_INSTA_BOLETN_3");
            return this;
        }

        public Criteria andX_NUMR_INSTA_BOLETN_3NotIn(List values)
        {
            addCriterion("X_NUMR_INSTA_BOLETN_3 not in", values, "X_NUMR_INSTA_BOLETN_3");
            return this;
        }

        public Criteria andX_NUMR_INSTA_BOLETN_3Between(String value1, String value2)
        {
            addCriterion("X_NUMR_INSTA_BOLETN_3 between", value1, value2, "X_NUMR_INSTA_BOLETN_3");
            return this;
        }

        public Criteria andX_NUMR_INSTA_BOLETN_3NotBetween(String value1, String value2)
        {
            addCriterion("X_NUMR_INSTA_BOLETN_3 not between", value1, value2, "X_NUMR_INSTA_BOLETN_3");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_TIPO_PRONU_3IsNull()
        {
            criteriaWithoutValue.add("X_TIPO_PRONU_3 is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_TIPO_PRONU_3IsNotNull()
        {
            criteriaWithoutValue.add("X_TIPO_PRONU_3 is not null");
            return this;
        }

        public Criteria andX_TIPO_PRONU_3EqualTo(String value)
        {
            addCriterion("X_TIPO_PRONU_3 =", value, "X_TIPO_PRONU_3");
            return this;
        }

        public Criteria andX_TIPO_PRONU_3NotEqualTo(String value)
        {
            addCriterion("X_TIPO_PRONU_3 <>", value, "X_TIPO_PRONU_3");
            return this;
        }

        public Criteria andX_TIPO_PRONU_3GreaterThan(String value)
        {
            addCriterion("X_TIPO_PRONU_3 >", value, "X_TIPO_PRONU_3");
            return this;
        }

        public Criteria andX_TIPO_PRONU_3GreaterThanOrEqualTo(String value)
        {
            addCriterion("X_TIPO_PRONU_3 >=", value, "X_TIPO_PRONU_3");
            return this;
        }

        public Criteria andX_TIPO_PRONU_3LessThan(String value)
        {
            addCriterion("X_TIPO_PRONU_3 <", value, "X_TIPO_PRONU_3");
            return this;
        }

        public Criteria andX_TIPO_PRONU_3LessThanOrEqualTo(String value)
        {
            addCriterion("X_TIPO_PRONU_3 <=", value, "X_TIPO_PRONU_3");
            return this;
        }

        public Criteria andX_TIPO_PRONU_3Like(String value)
        {
            addCriterion("X_TIPO_PRONU_3 like", value, "X_TIPO_PRONU_3");
            return this;
        }

        public Criteria andX_TIPO_PRONU_3NotLike(String value)
        {
            addCriterion("X_TIPO_PRONU_3 not like", value, "X_TIPO_PRONU_3");
            return this;
        }

        public Criteria andX_TIPO_PRONU_3In(List values)
        {
            addCriterion("X_TIPO_PRONU_3 in", values, "X_TIPO_PRONU_3");
            return this;
        }

        public Criteria andX_TIPO_PRONU_3NotIn(List values)
        {
            addCriterion("X_TIPO_PRONU_3 not in", values, "X_TIPO_PRONU_3");
            return this;
        }

        public Criteria andX_TIPO_PRONU_3Between(String value1, String value2)
        {
            addCriterion("X_TIPO_PRONU_3 between", value1, value2, "X_TIPO_PRONU_3");
            return this;
        }

        public Criteria andX_TIPO_PRONU_3NotBetween(String value1, String value2)
        {
            addCriterion("X_TIPO_PRONU_3 not between", value1, value2, "X_TIPO_PRONU_3");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_CODG_LUGAR_3IsNull()
        {
            criteriaWithoutValue.add("X_CODG_LUGAR_3 is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_CODG_LUGAR_3IsNotNull()
        {
            criteriaWithoutValue.add("X_CODG_LUGAR_3 is not null");
            return this;
        }

        public Criteria andX_CODG_LUGAR_3EqualTo(String value)
        {
            addCriterion("X_CODG_LUGAR_3 =", value, "X_CODG_LUGAR_3");
            return this;
        }

        public Criteria andX_CODG_LUGAR_3NotEqualTo(String value)
        {
            addCriterion("X_CODG_LUGAR_3 <>", value, "X_CODG_LUGAR_3");
            return this;
        }

        public Criteria andX_CODG_LUGAR_3GreaterThan(String value)
        {
            addCriterion("X_CODG_LUGAR_3 >", value, "X_CODG_LUGAR_3");
            return this;
        }

        public Criteria andX_CODG_LUGAR_3GreaterThanOrEqualTo(String value)
        {
            addCriterion("X_CODG_LUGAR_3 >=", value, "X_CODG_LUGAR_3");
            return this;
        }

        public Criteria andX_CODG_LUGAR_3LessThan(String value)
        {
            addCriterion("X_CODG_LUGAR_3 <", value, "X_CODG_LUGAR_3");
            return this;
        }

        public Criteria andX_CODG_LUGAR_3LessThanOrEqualTo(String value)
        {
            addCriterion("X_CODG_LUGAR_3 <=", value, "X_CODG_LUGAR_3");
            return this;
        }

        public Criteria andX_CODG_LUGAR_3Like(String value)
        {
            addCriterion("X_CODG_LUGAR_3 like", value, "X_CODG_LUGAR_3");
            return this;
        }

        public Criteria andX_CODG_LUGAR_3NotLike(String value)
        {
            addCriterion("X_CODG_LUGAR_3 not like", value, "X_CODG_LUGAR_3");
            return this;
        }

        public Criteria andX_CODG_LUGAR_3In(List values)
        {
            addCriterion("X_CODG_LUGAR_3 in", values, "X_CODG_LUGAR_3");
            return this;
        }

        public Criteria andX_CODG_LUGAR_3NotIn(List values)
        {
            addCriterion("X_CODG_LUGAR_3 not in", values, "X_CODG_LUGAR_3");
            return this;
        }

        public Criteria andX_CODG_LUGAR_3Between(String value1, String value2)
        {
            addCriterion("X_CODG_LUGAR_3 between", value1, value2, "X_CODG_LUGAR_3");
            return this;
        }

        public Criteria andX_CODG_LUGAR_3NotBetween(String value1, String value2)
        {
            addCriterion("X_CODG_LUGAR_3 not between", value1, value2, "X_CODG_LUGAR_3");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_FECH_PRONU_BOLETN_2IsNull()
        {
            criteriaWithoutValue.add("X_FECH_PRONU_BOLETN_2 is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_FECH_PRONU_BOLETN_2IsNotNull()
        {
            criteriaWithoutValue.add("X_FECH_PRONU_BOLETN_2 is not null");
            return this;
        }

        public Criteria andX_FECH_PRONU_BOLETN_2EqualTo(String value)
        {
            addCriterion("X_FECH_PRONU_BOLETN_2 =", value, "X_FECH_PRONU_BOLETN_2");
            return this;
        }

        public Criteria andX_FECH_PRONU_BOLETN_2NotEqualTo(String value)
        {
            addCriterion("X_FECH_PRONU_BOLETN_2 <>", value, "X_FECH_PRONU_BOLETN_2");
            return this;
        }

        public Criteria andX_FECH_PRONU_BOLETN_2GreaterThan(String value)
        {
            addCriterion("X_FECH_PRONU_BOLETN_2 >", value, "X_FECH_PRONU_BOLETN_2");
            return this;
        }

        public Criteria andX_FECH_PRONU_BOLETN_2GreaterThanOrEqualTo(String value)
        {
            addCriterion("X_FECH_PRONU_BOLETN_2 >=", value, "X_FECH_PRONU_BOLETN_2");
            return this;
        }

        public Criteria andX_FECH_PRONU_BOLETN_2LessThan(String value)
        {
            addCriterion("X_FECH_PRONU_BOLETN_2 <", value, "X_FECH_PRONU_BOLETN_2");
            return this;
        }

        public Criteria andX_FECH_PRONU_BOLETN_2LessThanOrEqualTo(String value)
        {
            addCriterion("X_FECH_PRONU_BOLETN_2 <=", value, "X_FECH_PRONU_BOLETN_2");
            return this;
        }

        public Criteria andX_FECH_PRONU_BOLETN_2Like(String value)
        {
            addCriterion("X_FECH_PRONU_BOLETN_2 like", value, "X_FECH_PRONU_BOLETN_2");
            return this;
        }

        public Criteria andX_FECH_PRONU_BOLETN_2NotLike(String value)
        {
            addCriterion("X_FECH_PRONU_BOLETN_2 not like", value, "X_FECH_PRONU_BOLETN_2");
            return this;
        }

        public Criteria andX_FECH_PRONU_BOLETN_2In(List values)
        {
            addCriterion("X_FECH_PRONU_BOLETN_2 in", values, "X_FECH_PRONU_BOLETN_2");
            return this;
        }

        public Criteria andX_FECH_PRONU_BOLETN_2NotIn(List values)
        {
            addCriterion("X_FECH_PRONU_BOLETN_2 not in", values, "X_FECH_PRONU_BOLETN_2");
            return this;
        }

        public Criteria andX_FECH_PRONU_BOLETN_2Between(String value1, String value2)
        {
            addCriterion("X_FECH_PRONU_BOLETN_2 between", value1, value2, "X_FECH_PRONU_BOLETN_2");
            return this;
        }

        public Criteria andX_FECH_PRONU_BOLETN_2NotBetween(String value1, String value2)
        {
            addCriterion("X_FECH_PRONU_BOLETN_2 not between", value1, value2, "X_FECH_PRONU_BOLETN_2");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_FECH_PRONU_BOLETN_3IsNull()
        {
            criteriaWithoutValue.add("X_FECH_PRONU_BOLETN_3 is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_FECH_PRONU_BOLETN_3IsNotNull()
        {
            criteriaWithoutValue.add("X_FECH_PRONU_BOLETN_3 is not null");
            return this;
        }

        public Criteria andX_FECH_PRONU_BOLETN_3EqualTo(Date value)
        {
            addCriterion("X_FECH_PRONU_BOLETN_3 =", value, "X_FECH_PRONU_BOLETN_3");
            return this;
        }

        public Criteria andX_FECH_PRONU_BOLETN_3NotEqualTo(Date value)
        {
            addCriterion("X_FECH_PRONU_BOLETN_3 <>", value, "X_FECH_PRONU_BOLETN_3");
            return this;
        }

        public Criteria andX_FECH_PRONU_BOLETN_3GreaterThan(Date value)
        {
            addCriterion("X_FECH_PRONU_BOLETN_3 >", value, "X_FECH_PRONU_BOLETN_3");
            return this;
        }

        public Criteria andX_FECH_PRONU_BOLETN_3GreaterThanOrEqualTo(Date value)
        {
            addCriterion("X_FECH_PRONU_BOLETN_3 >=", value, "X_FECH_PRONU_BOLETN_3");
            return this;
        }

        public Criteria andX_FECH_PRONU_BOLETN_3LessThan(Date value)
        {
            addCriterion("X_FECH_PRONU_BOLETN_3 <", value, "X_FECH_PRONU_BOLETN_3");
            return this;
        }

        public Criteria andX_FECH_PRONU_BOLETN_3LessThanOrEqualTo(Date value)
        {
            addCriterion("X_FECH_PRONU_BOLETN_3 <=", value, "X_FECH_PRONU_BOLETN_3");
            return this;
        }

        public Criteria andX_FECH_PRONU_BOLETN_3In(List values)
        {
            addCriterion("X_FECH_PRONU_BOLETN_3 in", values, "X_FECH_PRONU_BOLETN_3");
            return this;
        }

        public Criteria andX_FECH_PRONU_BOLETN_3NotIn(List values)
        {
            addCriterion("X_FECH_PRONU_BOLETN_3 not in", values, "X_FECH_PRONU_BOLETN_3");
            return this;
        }

        public Criteria andX_FECH_PRONU_BOLETN_3Between(Date value1, Date value2)
        {
            addCriterion("X_FECH_PRONU_BOLETN_3 between", value1, value2, "X_FECH_PRONU_BOLETN_3");
            return this;
        }

        public Criteria andX_FECH_PRONU_BOLETN_3NotBetween(Date value1, Date value2)
        {
            addCriterion("X_FECH_PRONU_BOLETN_3 not between", value1, value2, "X_FECH_PRONU_BOLETN_3");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_ANNO_PENA_BOLETNIsNull()
        {
            criteriaWithoutValue.add("X_ANNO_PENA_BOLETN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_ANNO_PENA_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("X_ANNO_PENA_BOLETN is not null");
            return this;
        }

        public Criteria andX_ANNO_PENA_BOLETNEqualTo(Short value)
        {
            addCriterion("X_ANNO_PENA_BOLETN =", value, "X_ANNO_PENA_BOLETN");
            return this;
        }

        public Criteria andX_ANNO_PENA_BOLETNNotEqualTo(Short value)
        {
            addCriterion("X_ANNO_PENA_BOLETN <>", value, "X_ANNO_PENA_BOLETN");
            return this;
        }

        public Criteria andX_ANNO_PENA_BOLETNGreaterThan(Short value)
        {
            addCriterion("X_ANNO_PENA_BOLETN >", value, "X_ANNO_PENA_BOLETN");
            return this;
        }

        public Criteria andX_ANNO_PENA_BOLETNGreaterThanOrEqualTo(Short value)
        {
            addCriterion("X_ANNO_PENA_BOLETN >=", value, "X_ANNO_PENA_BOLETN");
            return this;
        }

        public Criteria andX_ANNO_PENA_BOLETNLessThan(Short value)
        {
            addCriterion("X_ANNO_PENA_BOLETN <", value, "X_ANNO_PENA_BOLETN");
            return this;
        }

        public Criteria andX_ANNO_PENA_BOLETNLessThanOrEqualTo(Short value)
        {
            addCriterion("X_ANNO_PENA_BOLETN <=", value, "X_ANNO_PENA_BOLETN");
            return this;
        }

        public Criteria andX_ANNO_PENA_BOLETNIn(List values)
        {
            addCriterion("X_ANNO_PENA_BOLETN in", values, "X_ANNO_PENA_BOLETN");
            return this;
        }

        public Criteria andX_ANNO_PENA_BOLETNNotIn(List values)
        {
            addCriterion("X_ANNO_PENA_BOLETN not in", values, "X_ANNO_PENA_BOLETN");
            return this;
        }

        public Criteria andX_ANNO_PENA_BOLETNBetween(Short value1, Short value2)
        {
            addCriterion("X_ANNO_PENA_BOLETN between", value1, value2, "X_ANNO_PENA_BOLETN");
            return this;
        }

        public Criteria andX_ANNO_PENA_BOLETNNotBetween(Short value1, Short value2)
        {
            addCriterion("X_ANNO_PENA_BOLETN not between", value1, value2, "X_ANNO_PENA_BOLETN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_MESS_PENA_BOLETNIsNull()
        {
            criteriaWithoutValue.add("X_MESS_PENA_BOLETN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_MESS_PENA_BOLETNIsNotNull()
        {
            criteriaWithoutValue.add("X_MESS_PENA_BOLETN is not null");
            return this;
        }

        public Criteria andX_MESS_PENA_BOLETNEqualTo(Short value)
        {
            addCriterion("X_MESS_PENA_BOLETN =", value, "X_MESS_PENA_BOLETN");
            return this;
        }

        public Criteria andX_MESS_PENA_BOLETNNotEqualTo(Short value)
        {
            addCriterion("X_MESS_PENA_BOLETN <>", value, "X_MESS_PENA_BOLETN");
            return this;
        }

        public Criteria andX_MESS_PENA_BOLETNGreaterThan(Short value)
        {
            addCriterion("X_MESS_PENA_BOLETN >", value, "X_MESS_PENA_BOLETN");
            return this;
        }

        public Criteria andX_MESS_PENA_BOLETNGreaterThanOrEqualTo(Short value)
        {
            addCriterion("X_MESS_PENA_BOLETN >=", value, "X_MESS_PENA_BOLETN");
            return this;
        }

        public Criteria andX_MESS_PENA_BOLETNLessThan(Short value)
        {
            addCriterion("X_MESS_PENA_BOLETN <", value, "X_MESS_PENA_BOLETN");
            return this;
        }

        public Criteria andX_MESS_PENA_BOLETNLessThanOrEqualTo(Short value)
        {
            addCriterion("X_MESS_PENA_BOLETN <=", value, "X_MESS_PENA_BOLETN");
            return this;
        }

        public Criteria andX_MESS_PENA_BOLETNIn(List values)
        {
            addCriterion("X_MESS_PENA_BOLETN in", values, "X_MESS_PENA_BOLETN");
            return this;
        }

        public Criteria andX_MESS_PENA_BOLETNNotIn(List values)
        {
            addCriterion("X_MESS_PENA_BOLETN not in", values, "X_MESS_PENA_BOLETN");
            return this;
        }

        public Criteria andX_MESS_PENA_BOLETNBetween(Short value1, Short value2)
        {
            addCriterion("X_MESS_PENA_BOLETN between", value1, value2, "X_MESS_PENA_BOLETN");
            return this;
        }

        public Criteria andX_MESS_PENA_BOLETNNotBetween(Short value1, Short value2)
        {
            addCriterion("X_MESS_PENA_BOLETN not between", value1, value2, "X_MESS_PENA_BOLETN");
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
        public Criteria and____b_audIsNull()
        {
            criteriaWithoutValue.add("____b_aud is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria and____b_audIsNotNull()
        {
            criteriaWithoutValue.add("____b_aud is not null");
            return this;
        }

        public Criteria and____b_audEqualTo(String value)
        {
            addCriterion("____b_aud =", value, "____b_aud");
            return this;
        }

        public Criteria and____b_audNotEqualTo(String value)
        {
            addCriterion("____b_aud <>", value, "____b_aud");
            return this;
        }

        public Criteria and____b_audGreaterThan(String value)
        {
            addCriterion("____b_aud >", value, "____b_aud");
            return this;
        }

        public Criteria and____b_audGreaterThanOrEqualTo(String value)
        {
            addCriterion("____b_aud >=", value, "____b_aud");
            return this;
        }

        public Criteria and____b_audLessThan(String value)
        {
            addCriterion("____b_aud <", value, "____b_aud");
            return this;
        }

        public Criteria and____b_audLessThanOrEqualTo(String value)
        {
            addCriterion("____b_aud <=", value, "____b_aud");
            return this;
        }

        public Criteria and____b_audLike(String value)
        {
            addCriterion("____b_aud like", value, "____b_aud");
            return this;
        }

        public Criteria and____b_audNotLike(String value)
        {
            addCriterion("____b_aud not like", value, "____b_aud");
            return this;
        }

        public Criteria and____b_audIn(List values)
        {
            addCriterion("____b_aud in", values, "____b_aud");
            return this;
        }

        public Criteria and____b_audNotIn(List values)
        {
            addCriterion("____b_aud not in", values, "____b_aud");
            return this;
        }

        public Criteria and____b_audBetween(String value1, String value2)
        {
            addCriterion("____b_aud between", value1, value2, "____b_aud");
            return this;
        }

        public Criteria and____b_audNotBetween(String value1, String value2)
        {
            addCriterion("____b_aud not between", value1, value2, "____b_aud");
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
        @SuppressWarnings("unchecked")
        public Criteria andSexoIsNull()
        {
            criteriaWithoutValue.add("sexo is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andSexoIsNotNull()
        {
            criteriaWithoutValue.add("sexo is not null");
            return this;
        }

        public Criteria andSexoEqualTo(String value)
        {
            addCriterion("sexo =", value, "sexo");
            return this;
        }

        public Criteria andSexoNotEqualTo(String value)
        {
            addCriterion("sexo <>", value, "sexo");
            return this;
        }

        public Criteria andSexoGreaterThan(String value)
        {
            addCriterion("sexo >", value, "sexo");
            return this;
        }

        public Criteria andSexoGreaterThanOrEqualTo(String value)
        {
            addCriterion("sexo >=", value, "sexo");
            return this;
        }

        public Criteria andSexoLessThan(String value)
        {
            addCriterion("sexo <", value, "sexo");
            return this;
        }

        public Criteria andSexoLessThanOrEqualTo(String value)
        {
            addCriterion("sexo <=", value, "sexo");
            return this;
        }

        public Criteria andSexoLike(String value)
        {
            addCriterion("sexo like", value, "sexo");
            return this;
        }

        public Criteria andSexoNotLike(String value)
        {
            addCriterion("sexo not like", value, "sexo");
            return this;
        }

        public Criteria andSexoIn(List values)
        {
            addCriterion("sexo in", values, "sexo");
            return this;
        }

        public Criteria andSexoNotIn(List values)
        {
            addCriterion("sexo not in", values, "sexo");
            return this;
        }

        public Criteria andSexoBetween(String value1, String value2)
        {
            addCriterion("sexo between", value1, value2, "sexo");
            return this;
        }

        public Criteria andSexoNotBetween(String value1, String value2)
        {
            addCriterion("sexo not between", value1, value2, "sexo");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andUSUARIO_ANULOIsNull()
        {
            criteriaWithoutValue.add("USUARIO_ANULO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andUSUARIO_ANULOIsNotNull()
        {
            criteriaWithoutValue.add("USUARIO_ANULO is not null");
            return this;
        }

        public Criteria andUSUARIO_ANULOEqualTo(String value)
        {
            addCriterion("USUARIO_ANULO =", value, "USUARIO_ANULO");
            return this;
        }

        public Criteria andUSUARIO_ANULONotEqualTo(String value)
        {
            addCriterion("USUARIO_ANULO <>", value, "USUARIO_ANULO");
            return this;
        }

        public Criteria andUSUARIO_ANULOGreaterThan(String value)
        {
            addCriterion("USUARIO_ANULO >", value, "USUARIO_ANULO");
            return this;
        }

        public Criteria andUSUARIO_ANULOGreaterThanOrEqualTo(String value)
        {
            addCriterion("USUARIO_ANULO >=", value, "USUARIO_ANULO");
            return this;
        }

        public Criteria andUSUARIO_ANULOLessThan(String value)
        {
            addCriterion("USUARIO_ANULO <", value, "USUARIO_ANULO");
            return this;
        }

        public Criteria andUSUARIO_ANULOLessThanOrEqualTo(String value)
        {
            addCriterion("USUARIO_ANULO <=", value, "USUARIO_ANULO");
            return this;
        }

        public Criteria andUSUARIO_ANULOLike(String value)
        {
            addCriterion("USUARIO_ANULO like", value, "USUARIO_ANULO");
            return this;
        }

        public Criteria andUSUARIO_ANULONotLike(String value)
        {
            addCriterion("USUARIO_ANULO not like", value, "USUARIO_ANULO");
            return this;
        }

        public Criteria andUSUARIO_ANULOIn(List values)
        {
            addCriterion("USUARIO_ANULO in", values, "USUARIO_ANULO");
            return this;
        }

        public Criteria andUSUARIO_ANULONotIn(List values)
        {
            addCriterion("USUARIO_ANULO not in", values, "USUARIO_ANULO");
            return this;
        }

        public Criteria andUSUARIO_ANULOBetween(String value1, String value2)
        {
            addCriterion("USUARIO_ANULO between", value1, value2, "USUARIO_ANULO");
            return this;
        }

        public Criteria andUSUARIO_ANULONotBetween(String value1, String value2)
        {
            addCriterion("USUARIO_ANULO not between", value1, value2, "USUARIO_ANULO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andTipo_inhabilitacionIsNull()
        {
            criteriaWithoutValue.add("tipo_inhabilitacion is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andTipo_inhabilitacionIsNotNull()
        {
            criteriaWithoutValue.add("tipo_inhabilitacion is not null");
            return this;
        }

        public Criteria andTipo_inhabilitacionEqualTo(String value)
        {
            addCriterion("tipo_inhabilitacion =", value, "tipo_inhabilitacion");
            return this;
        }

        public Criteria andTipo_inhabilitacionNotEqualTo(String value)
        {
            addCriterion("tipo_inhabilitacion <>", value, "tipo_inhabilitacion");
            return this;
        }

        public Criteria andTipo_inhabilitacionGreaterThan(String value)
        {
            addCriterion("tipo_inhabilitacion >", value, "tipo_inhabilitacion");
            return this;
        }

        public Criteria andTipo_inhabilitacionGreaterThanOrEqualTo(String value)
        {
            addCriterion("tipo_inhabilitacion >=", value, "tipo_inhabilitacion");
            return this;
        }

        public Criteria andTipo_inhabilitacionLessThan(String value)
        {
            addCriterion("tipo_inhabilitacion <", value, "tipo_inhabilitacion");
            return this;
        }

        public Criteria andTipo_inhabilitacionLessThanOrEqualTo(String value)
        {
            addCriterion("tipo_inhabilitacion <=", value, "tipo_inhabilitacion");
            return this;
        }

        public Criteria andTipo_inhabilitacionLike(String value)
        {
            addCriterion("tipo_inhabilitacion like", value, "tipo_inhabilitacion");
            return this;
        }

        public Criteria andTipo_inhabilitacionNotLike(String value)
        {
            addCriterion("tipo_inhabilitacion not like", value, "tipo_inhabilitacion");
            return this;
        }

        public Criteria andTipo_inhabilitacionIn(List values)
        {
            addCriterion("tipo_inhabilitacion in", values, "tipo_inhabilitacion");
            return this;
        }

        public Criteria andTipo_inhabilitacionNotIn(List values)
        {
            addCriterion("tipo_inhabilitacion not in", values, "tipo_inhabilitacion");
            return this;
        }

        public Criteria andTipo_inhabilitacionBetween(String value1, String value2)
        {
            addCriterion("tipo_inhabilitacion between", value1, value2, "tipo_inhabilitacion");
            return this;
        }

        public Criteria andTipo_inhabilitacionNotBetween(String value1, String value2)
        {
            addCriterion("tipo_inhabilitacion not between", value1, value2, "tipo_inhabilitacion");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_MAS_DELITOSIsNull()
        {
            criteriaWithoutValue.add("INDC_MAS_DELITOS is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_MAS_DELITOSIsNotNull()
        {
            criteriaWithoutValue.add("INDC_MAS_DELITOS is not null");
            return this;
        }

        public Criteria andINDC_MAS_DELITOSEqualTo(String value)
        {
            addCriterion("INDC_MAS_DELITOS =", value, "INDC_MAS_DELITOS");
            return this;
        }

        public Criteria andINDC_MAS_DELITOSNotEqualTo(String value)
        {
            addCriterion("INDC_MAS_DELITOS <>", value, "INDC_MAS_DELITOS");
            return this;
        }

        public Criteria andINDC_MAS_DELITOSGreaterThan(String value)
        {
            addCriterion("INDC_MAS_DELITOS >", value, "INDC_MAS_DELITOS");
            return this;
        }

        public Criteria andINDC_MAS_DELITOSGreaterThanOrEqualTo(String value)
        {
            addCriterion("INDC_MAS_DELITOS >=", value, "INDC_MAS_DELITOS");
            return this;
        }

        public Criteria andINDC_MAS_DELITOSLessThan(String value)
        {
            addCriterion("INDC_MAS_DELITOS <", value, "INDC_MAS_DELITOS");
            return this;
        }

        public Criteria andINDC_MAS_DELITOSLessThanOrEqualTo(String value)
        {
            addCriterion("INDC_MAS_DELITOS <=", value, "INDC_MAS_DELITOS");
            return this;
        }

        public Criteria andINDC_MAS_DELITOSLike(String value)
        {
            addCriterion("INDC_MAS_DELITOS like", value, "INDC_MAS_DELITOS");
            return this;
        }

        public Criteria andINDC_MAS_DELITOSNotLike(String value)
        {
            addCriterion("INDC_MAS_DELITOS not like", value, "INDC_MAS_DELITOS");
            return this;
        }

        public Criteria andINDC_MAS_DELITOSIn(List values)
        {
            addCriterion("INDC_MAS_DELITOS in", values, "INDC_MAS_DELITOS");
            return this;
        }

        public Criteria andINDC_MAS_DELITOSNotIn(List values)
        {
            addCriterion("INDC_MAS_DELITOS not in", values, "INDC_MAS_DELITOS");
            return this;
        }

        public Criteria andINDC_MAS_DELITOSBetween(String value1, String value2)
        {
            addCriterion("INDC_MAS_DELITOS between", value1, value2, "INDC_MAS_DELITOS");
            return this;
        }

        public Criteria andINDC_MAS_DELITOSNotBetween(String value1, String value2)
        {
            addCriterion("INDC_MAS_DELITOS not between", value1, value2, "INDC_MAS_DELITOS");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andOBSERVADO_OFIIsNull()
        {
            criteriaWithoutValue.add("OBSERVADO_OFI is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andOBSERVADO_OFIIsNotNull()
        {
            criteriaWithoutValue.add("OBSERVADO_OFI is not null");
            return this;
        }

        public Criteria andOBSERVADO_OFIEqualTo(String value)
        {
            addCriterion("OBSERVADO_OFI =", value, "OBSERVADO_OFI");
            return this;
        }

        public Criteria andOBSERVADO_OFINotEqualTo(String value)
        {
            addCriterion("OBSERVADO_OFI <>", value, "OBSERVADO_OFI");
            return this;
        }

        public Criteria andOBSERVADO_OFIGreaterThan(String value)
        {
            addCriterion("OBSERVADO_OFI >", value, "OBSERVADO_OFI");
            return this;
        }

        public Criteria andOBSERVADO_OFIGreaterThanOrEqualTo(String value)
        {
            addCriterion("OBSERVADO_OFI >=", value, "OBSERVADO_OFI");
            return this;
        }

        public Criteria andOBSERVADO_OFILessThan(String value)
        {
            addCriterion("OBSERVADO_OFI <", value, "OBSERVADO_OFI");
            return this;
        }

        public Criteria andOBSERVADO_OFILessThanOrEqualTo(String value)
        {
            addCriterion("OBSERVADO_OFI <=", value, "OBSERVADO_OFI");
            return this;
        }

        public Criteria andOBSERVADO_OFILike(String value)
        {
            addCriterion("OBSERVADO_OFI like", value, "OBSERVADO_OFI");
            return this;
        }

        public Criteria andOBSERVADO_OFINotLike(String value)
        {
            addCriterion("OBSERVADO_OFI not like", value, "OBSERVADO_OFI");
            return this;
        }

        public Criteria andOBSERVADO_OFIIn(List values)
        {
            addCriterion("OBSERVADO_OFI in", values, "OBSERVADO_OFI");
            return this;
        }

        public Criteria andOBSERVADO_OFINotIn(List values)
        {
            addCriterion("OBSERVADO_OFI not in", values, "OBSERVADO_OFI");
            return this;
        }

        public Criteria andOBSERVADO_OFIBetween(String value1, String value2)
        {
            addCriterion("OBSERVADO_OFI between", value1, value2, "OBSERVADO_OFI");
            return this;
        }

        public Criteria andOBSERVADO_OFINotBetween(String value1, String value2)
        {
            addCriterion("OBSERVADO_OFI not between", value1, value2, "OBSERVADO_OFI");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_MAS_INHABILITIsNull()
        {
            criteriaWithoutValue.add("INDC_MAS_INHABILIT is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_MAS_INHABILITIsNotNull()
        {
            criteriaWithoutValue.add("INDC_MAS_INHABILIT is not null");
            return this;
        }

        public Criteria andINDC_MAS_INHABILITEqualTo(String value)
        {
            addCriterion("INDC_MAS_INHABILIT =", value, "INDC_MAS_INHABILIT");
            return this;
        }

        public Criteria andINDC_MAS_INHABILITNotEqualTo(String value)
        {
            addCriterion("INDC_MAS_INHABILIT <>", value, "INDC_MAS_INHABILIT");
            return this;
        }

        public Criteria andINDC_MAS_INHABILITGreaterThan(String value)
        {
            addCriterion("INDC_MAS_INHABILIT >", value, "INDC_MAS_INHABILIT");
            return this;
        }

        public Criteria andINDC_MAS_INHABILITGreaterThanOrEqualTo(String value)
        {
            addCriterion("INDC_MAS_INHABILIT >=", value, "INDC_MAS_INHABILIT");
            return this;
        }

        public Criteria andINDC_MAS_INHABILITLessThan(String value)
        {
            addCriterion("INDC_MAS_INHABILIT <", value, "INDC_MAS_INHABILIT");
            return this;
        }

        public Criteria andINDC_MAS_INHABILITLessThanOrEqualTo(String value)
        {
            addCriterion("INDC_MAS_INHABILIT <=", value, "INDC_MAS_INHABILIT");
            return this;
        }

        public Criteria andINDC_MAS_INHABILITLike(String value)
        {
            addCriterion("INDC_MAS_INHABILIT like", value, "INDC_MAS_INHABILIT");
            return this;
        }

        public Criteria andINDC_MAS_INHABILITNotLike(String value)
        {
            addCriterion("INDC_MAS_INHABILIT not like", value, "INDC_MAS_INHABILIT");
            return this;
        }

        public Criteria andINDC_MAS_INHABILITIn(List values)
        {
            addCriterion("INDC_MAS_INHABILIT in", values, "INDC_MAS_INHABILIT");
            return this;
        }

        public Criteria andINDC_MAS_INHABILITNotIn(List values)
        {
            addCriterion("INDC_MAS_INHABILIT not in", values, "INDC_MAS_INHABILIT");
            return this;
        }

        public Criteria andINDC_MAS_INHABILITBetween(String value1, String value2)
        {
            addCriterion("INDC_MAS_INHABILIT between", value1, value2, "INDC_MAS_INHABILIT");
            return this;
        }

        public Criteria andINDC_MAS_INHABILITNotBetween(String value1, String value2)
        {
            addCriterion("INDC_MAS_INHABILIT not between", value1, value2, "INDC_MAS_INHABILIT");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_CODG_BOLETINIsNull()
        {
            criteriaWithoutValue.add("C_CODG_BOLETIN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_CODG_BOLETINIsNotNull()
        {
            criteriaWithoutValue.add("C_CODG_BOLETIN is not null");
            return this;
        }

        public Criteria andC_CODG_BOLETINEqualTo(String value)
        {
            addCriterion("C_CODG_BOLETIN =", value, "C_CODG_BOLETIN");
            return this;
        }

        public Criteria andC_CODG_BOLETINNotEqualTo(String value)
        {
            addCriterion("C_CODG_BOLETIN <>", value, "C_CODG_BOLETIN");
            return this;
        }

        public Criteria andC_CODG_BOLETINGreaterThan(String value)
        {
            addCriterion("C_CODG_BOLETIN >", value, "C_CODG_BOLETIN");
            return this;
        }

        public Criteria andC_CODG_BOLETINGreaterThanOrEqualTo(String value)
        {
            addCriterion("C_CODG_BOLETIN >=", value, "C_CODG_BOLETIN");
            return this;
        }

        public Criteria andC_CODG_BOLETINLessThan(String value)
        {
            addCriterion("C_CODG_BOLETIN <", value, "C_CODG_BOLETIN");
            return this;
        }

        public Criteria andC_CODG_BOLETINLessThanOrEqualTo(String value)
        {
            addCriterion("C_CODG_BOLETIN <=", value, "C_CODG_BOLETIN");
            return this;
        }

        public Criteria andC_CODG_BOLETINLike(String value)
        {
            addCriterion("C_CODG_BOLETIN like", value, "C_CODG_BOLETIN");
            return this;
        }

        public Criteria andC_CODG_BOLETINNotLike(String value)
        {
            addCriterion("C_CODG_BOLETIN not like", value, "C_CODG_BOLETIN");
            return this;
        }

        public Criteria andC_CODG_BOLETINIn(List values)
        {
            addCriterion("C_CODG_BOLETIN in", values, "C_CODG_BOLETIN");
            return this;
        }

        public Criteria andC_CODG_BOLETINNotIn(List values)
        {
            addCriterion("C_CODG_BOLETIN not in", values, "C_CODG_BOLETIN");
            return this;
        }

        public Criteria andC_CODG_BOLETINBetween(String value1, String value2)
        {
            addCriterion("C_CODG_BOLETIN between", value1, value2, "C_CODG_BOLETIN");
            return this;
        }

        public Criteria andC_CODG_BOLETINNotBetween(String value1, String value2)
        {
            addCriterion("C_CODG_BOLETIN not between", value1, value2, "C_CODG_BOLETIN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_INSTA_REHABIsNull()
        {
            criteriaWithoutValue.add("NUMR_INSTA_REHAB is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_INSTA_REHABIsNotNull()
        {
            criteriaWithoutValue.add("NUMR_INSTA_REHAB is not null");
            return this;
        }

        public Criteria andNUMR_INSTA_REHABEqualTo(String value)
        {
            addCriterion("NUMR_INSTA_REHAB =", value, "NUMR_INSTA_REHAB");
            return this;
        }

        public Criteria andNUMR_INSTA_REHABNotEqualTo(String value)
        {
            addCriterion("NUMR_INSTA_REHAB <>", value, "NUMR_INSTA_REHAB");
            return this;
        }

        public Criteria andNUMR_INSTA_REHABGreaterThan(String value)
        {
            addCriterion("NUMR_INSTA_REHAB >", value, "NUMR_INSTA_REHAB");
            return this;
        }

        public Criteria andNUMR_INSTA_REHABGreaterThanOrEqualTo(String value)
        {
            addCriterion("NUMR_INSTA_REHAB >=", value, "NUMR_INSTA_REHAB");
            return this;
        }

        public Criteria andNUMR_INSTA_REHABLessThan(String value)
        {
            addCriterion("NUMR_INSTA_REHAB <", value, "NUMR_INSTA_REHAB");
            return this;
        }

        public Criteria andNUMR_INSTA_REHABLessThanOrEqualTo(String value)
        {
            addCriterion("NUMR_INSTA_REHAB <=", value, "NUMR_INSTA_REHAB");
            return this;
        }

        public Criteria andNUMR_INSTA_REHABLike(String value)
        {
            addCriterion("NUMR_INSTA_REHAB like", value, "NUMR_INSTA_REHAB");
            return this;
        }

        public Criteria andNUMR_INSTA_REHABNotLike(String value)
        {
            addCriterion("NUMR_INSTA_REHAB not like", value, "NUMR_INSTA_REHAB");
            return this;
        }

        public Criteria andNUMR_INSTA_REHABIn(List values)
        {
            addCriterion("NUMR_INSTA_REHAB in", values, "NUMR_INSTA_REHAB");
            return this;
        }

        public Criteria andNUMR_INSTA_REHABNotIn(List values)
        {
            addCriterion("NUMR_INSTA_REHAB not in", values, "NUMR_INSTA_REHAB");
            return this;
        }

        public Criteria andNUMR_INSTA_REHABBetween(String value1, String value2)
        {
            addCriterion("NUMR_INSTA_REHAB between", value1, value2, "NUMR_INSTA_REHAB");
            return this;
        }

        public Criteria andNUMR_INSTA_REHABNotBetween(String value1, String value2)
        {
            addCriterion("NUMR_INSTA_REHAB not between", value1, value2, "NUMR_INSTA_REHAB");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andTIPO_PRONU_REHABIsNull()
        {
            criteriaWithoutValue.add("TIPO_PRONU_REHAB is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andTIPO_PRONU_REHABIsNotNull()
        {
            criteriaWithoutValue.add("TIPO_PRONU_REHAB is not null");
            return this;
        }

        public Criteria andTIPO_PRONU_REHABEqualTo(String value)
        {
            addCriterion("TIPO_PRONU_REHAB =", value, "TIPO_PRONU_REHAB");
            return this;
        }

        public Criteria andTIPO_PRONU_REHABNotEqualTo(String value)
        {
            addCriterion("TIPO_PRONU_REHAB <>", value, "TIPO_PRONU_REHAB");
            return this;
        }

        public Criteria andTIPO_PRONU_REHABGreaterThan(String value)
        {
            addCriterion("TIPO_PRONU_REHAB >", value, "TIPO_PRONU_REHAB");
            return this;
        }

        public Criteria andTIPO_PRONU_REHABGreaterThanOrEqualTo(String value)
        {
            addCriterion("TIPO_PRONU_REHAB >=", value, "TIPO_PRONU_REHAB");
            return this;
        }

        public Criteria andTIPO_PRONU_REHABLessThan(String value)
        {
            addCriterion("TIPO_PRONU_REHAB <", value, "TIPO_PRONU_REHAB");
            return this;
        }

        public Criteria andTIPO_PRONU_REHABLessThanOrEqualTo(String value)
        {
            addCriterion("TIPO_PRONU_REHAB <=", value, "TIPO_PRONU_REHAB");
            return this;
        }

        public Criteria andTIPO_PRONU_REHABLike(String value)
        {
            addCriterion("TIPO_PRONU_REHAB like", value, "TIPO_PRONU_REHAB");
            return this;
        }

        public Criteria andTIPO_PRONU_REHABNotLike(String value)
        {
            addCriterion("TIPO_PRONU_REHAB not like", value, "TIPO_PRONU_REHAB");
            return this;
        }

        public Criteria andTIPO_PRONU_REHABIn(List values)
        {
            addCriterion("TIPO_PRONU_REHAB in", values, "TIPO_PRONU_REHAB");
            return this;
        }

        public Criteria andTIPO_PRONU_REHABNotIn(List values)
        {
            addCriterion("TIPO_PRONU_REHAB not in", values, "TIPO_PRONU_REHAB");
            return this;
        }

        public Criteria andTIPO_PRONU_REHABBetween(String value1, String value2)
        {
            addCriterion("TIPO_PRONU_REHAB between", value1, value2, "TIPO_PRONU_REHAB");
            return this;
        }

        public Criteria andTIPO_PRONU_REHABNotBetween(String value1, String value2)
        {
            addCriterion("TIPO_PRONU_REHAB not between", value1, value2, "TIPO_PRONU_REHAB");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_LUGAR_REHABIsNull()
        {
            criteriaWithoutValue.add("CODG_LUGAR_REHAB is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_LUGAR_REHABIsNotNull()
        {
            criteriaWithoutValue.add("CODG_LUGAR_REHAB is not null");
            return this;
        }

        public Criteria andCODG_LUGAR_REHABEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_REHAB =", value, "CODG_LUGAR_REHAB");
            return this;
        }

        public Criteria andCODG_LUGAR_REHABNotEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_REHAB <>", value, "CODG_LUGAR_REHAB");
            return this;
        }

        public Criteria andCODG_LUGAR_REHABGreaterThan(String value)
        {
            addCriterion("CODG_LUGAR_REHAB >", value, "CODG_LUGAR_REHAB");
            return this;
        }

        public Criteria andCODG_LUGAR_REHABGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_REHAB >=", value, "CODG_LUGAR_REHAB");
            return this;
        }

        public Criteria andCODG_LUGAR_REHABLessThan(String value)
        {
            addCriterion("CODG_LUGAR_REHAB <", value, "CODG_LUGAR_REHAB");
            return this;
        }

        public Criteria andCODG_LUGAR_REHABLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_REHAB <=", value, "CODG_LUGAR_REHAB");
            return this;
        }

        public Criteria andCODG_LUGAR_REHABLike(String value)
        {
            addCriterion("CODG_LUGAR_REHAB like", value, "CODG_LUGAR_REHAB");
            return this;
        }

        public Criteria andCODG_LUGAR_REHABNotLike(String value)
        {
            addCriterion("CODG_LUGAR_REHAB not like", value, "CODG_LUGAR_REHAB");
            return this;
        }

        public Criteria andCODG_LUGAR_REHABIn(List values)
        {
            addCriterion("CODG_LUGAR_REHAB in", values, "CODG_LUGAR_REHAB");
            return this;
        }

        public Criteria andCODG_LUGAR_REHABNotIn(List values)
        {
            addCriterion("CODG_LUGAR_REHAB not in", values, "CODG_LUGAR_REHAB");
            return this;
        }

        public Criteria andCODG_LUGAR_REHABBetween(String value1, String value2)
        {
            addCriterion("CODG_LUGAR_REHAB between", value1, value2, "CODG_LUGAR_REHAB");
            return this;
        }

        public Criteria andCODG_LUGAR_REHABNotBetween(String value1, String value2)
        {
            addCriterion("CODG_LUGAR_REHAB not between", value1, value2, "CODG_LUGAR_REHAB");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_REHABIsNull()
        {
            criteriaWithoutValue.add("FECH_REHAB is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_REHABIsNotNull()
        {
            criteriaWithoutValue.add("FECH_REHAB is not null");
            return this;
        }

        public Criteria andFECH_REHABEqualTo(Date value)
        {
            addCriterion("FECH_REHAB =", value, "FECH_REHAB");
            return this;
        }

        public Criteria andFECH_REHABNotEqualTo(Date value)
        {
            addCriterion("FECH_REHAB <>", value, "FECH_REHAB");
            return this;
        }

        public Criteria andFECH_REHABGreaterThan(Date value)
        {
            addCriterion("FECH_REHAB >", value, "FECH_REHAB");
            return this;
        }

        public Criteria andFECH_REHABGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FECH_REHAB >=", value, "FECH_REHAB");
            return this;
        }

        public Criteria andFECH_REHABLessThan(Date value)
        {
            addCriterion("FECH_REHAB <", value, "FECH_REHAB");
            return this;
        }

        public Criteria andFECH_REHABLessThanOrEqualTo(Date value)
        {
            addCriterion("FECH_REHAB <=", value, "FECH_REHAB");
            return this;
        }

        public Criteria andFECH_REHABIn(List values)
        {
            addCriterion("FECH_REHAB in", values, "FECH_REHAB");
            return this;
        }

        public Criteria andFECH_REHABNotIn(List values)
        {
            addCriterion("FECH_REHAB not in", values, "FECH_REHAB");
            return this;
        }

        public Criteria andFECH_REHABBetween(Date value1, Date value2)
        {
            addCriterion("FECH_REHAB between", value1, value2, "FECH_REHAB");
            return this;
        }

        public Criteria andFECH_REHABNotBetween(Date value1, Date value2)
        {
            addCriterion("FECH_REHAB not between", value1, value2, "FECH_REHAB");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_INSC_REHABIsNull()
        {
            criteriaWithoutValue.add("FECH_INSC_REHAB is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_INSC_REHABIsNotNull()
        {
            criteriaWithoutValue.add("FECH_INSC_REHAB is not null");
            return this;
        }

        public Criteria andFECH_INSC_REHABEqualTo(Date value)
        {
            addCriterion("FECH_INSC_REHAB =", value, "FECH_INSC_REHAB");
            return this;
        }

        public Criteria andFECH_INSC_REHABNotEqualTo(Date value)
        {
            addCriterion("FECH_INSC_REHAB <>", value, "FECH_INSC_REHAB");
            return this;
        }

        public Criteria andFECH_INSC_REHABGreaterThan(Date value)
        {
            addCriterion("FECH_INSC_REHAB >", value, "FECH_INSC_REHAB");
            return this;
        }

        public Criteria andFECH_INSC_REHABGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FECH_INSC_REHAB >=", value, "FECH_INSC_REHAB");
            return this;
        }

        public Criteria andFECH_INSC_REHABLessThan(Date value)
        {
            addCriterion("FECH_INSC_REHAB <", value, "FECH_INSC_REHAB");
            return this;
        }

        public Criteria andFECH_INSC_REHABLessThanOrEqualTo(Date value)
        {
            addCriterion("FECH_INSC_REHAB <=", value, "FECH_INSC_REHAB");
            return this;
        }

        public Criteria andFECH_INSC_REHABIn(List values)
        {
            addCriterion("FECH_INSC_REHAB in", values, "FECH_INSC_REHAB");
            return this;
        }

        public Criteria andFECH_INSC_REHABNotIn(List values)
        {
            addCriterion("FECH_INSC_REHAB not in", values, "FECH_INSC_REHAB");
            return this;
        }

        public Criteria andFECH_INSC_REHABBetween(Date value1, Date value2)
        {
            addCriterion("FECH_INSC_REHAB between", value1, value2, "FECH_INSC_REHAB");
            return this;
        }

        public Criteria andFECH_INSC_REHABNotBetween(Date value1, Date value2)
        {
            addCriterion("FECH_INSC_REHAB not between", value1, value2, "FECH_INSC_REHAB");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUME_EXPDTE_REHABIsNull()
        {
            criteriaWithoutValue.add("NUME_EXPDTE_REHAB is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUME_EXPDTE_REHABIsNotNull()
        {
            criteriaWithoutValue.add("NUME_EXPDTE_REHAB is not null");
            return this;
        }

        public Criteria andNUME_EXPDTE_REHABEqualTo(String value)
        {
            addCriterion("NUME_EXPDTE_REHAB =", value, "NUME_EXPDTE_REHAB");
            return this;
        }

        public Criteria andNUME_EXPDTE_REHABNotEqualTo(String value)
        {
            addCriterion("NUME_EXPDTE_REHAB <>", value, "NUME_EXPDTE_REHAB");
            return this;
        }

        public Criteria andNUME_EXPDTE_REHABGreaterThan(String value)
        {
            addCriterion("NUME_EXPDTE_REHAB >", value, "NUME_EXPDTE_REHAB");
            return this;
        }

        public Criteria andNUME_EXPDTE_REHABGreaterThanOrEqualTo(String value)
        {
            addCriterion("NUME_EXPDTE_REHAB >=", value, "NUME_EXPDTE_REHAB");
            return this;
        }

        public Criteria andNUME_EXPDTE_REHABLessThan(String value)
        {
            addCriterion("NUME_EXPDTE_REHAB <", value, "NUME_EXPDTE_REHAB");
            return this;
        }

        public Criteria andNUME_EXPDTE_REHABLessThanOrEqualTo(String value)
        {
            addCriterion("NUME_EXPDTE_REHAB <=", value, "NUME_EXPDTE_REHAB");
            return this;
        }

        public Criteria andNUME_EXPDTE_REHABLike(String value)
        {
            addCriterion("NUME_EXPDTE_REHAB like", value, "NUME_EXPDTE_REHAB");
            return this;
        }

        public Criteria andNUME_EXPDTE_REHABNotLike(String value)
        {
            addCriterion("NUME_EXPDTE_REHAB not like", value, "NUME_EXPDTE_REHAB");
            return this;
        }

        public Criteria andNUME_EXPDTE_REHABIn(List values)
        {
            addCriterion("NUME_EXPDTE_REHAB in", values, "NUME_EXPDTE_REHAB");
            return this;
        }

        public Criteria andNUME_EXPDTE_REHABNotIn(List values)
        {
            addCriterion("NUME_EXPDTE_REHAB not in", values, "NUME_EXPDTE_REHAB");
            return this;
        }

        public Criteria andNUME_EXPDTE_REHABBetween(String value1, String value2)
        {
            addCriterion("NUME_EXPDTE_REHAB between", value1, value2, "NUME_EXPDTE_REHAB");
            return this;
        }

        public Criteria andNUME_EXPDTE_REHABNotBetween(String value1, String value2)
        {
            addCriterion("NUME_EXPDTE_REHAB not between", value1, value2, "NUME_EXPDTE_REHAB");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andOBSE_REHABIsNull()
        {
            criteriaWithoutValue.add("OBSE_REHAB is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andOBSE_REHABIsNotNull()
        {
            criteriaWithoutValue.add("OBSE_REHAB is not null");
            return this;
        }

        public Criteria andOBSE_REHABEqualTo(String value)
        {
            addCriterion("OBSE_REHAB =", value, "OBSE_REHAB");
            return this;
        }

        public Criteria andOBSE_REHABNotEqualTo(String value)
        {
            addCriterion("OBSE_REHAB <>", value, "OBSE_REHAB");
            return this;
        }

        public Criteria andOBSE_REHABGreaterThan(String value)
        {
            addCriterion("OBSE_REHAB >", value, "OBSE_REHAB");
            return this;
        }

        public Criteria andOBSE_REHABGreaterThanOrEqualTo(String value)
        {
            addCriterion("OBSE_REHAB >=", value, "OBSE_REHAB");
            return this;
        }

        public Criteria andOBSE_REHABLessThan(String value)
        {
            addCriterion("OBSE_REHAB <", value, "OBSE_REHAB");
            return this;
        }

        public Criteria andOBSE_REHABLessThanOrEqualTo(String value)
        {
            addCriterion("OBSE_REHAB <=", value, "OBSE_REHAB");
            return this;
        }

        public Criteria andOBSE_REHABLike(String value)
        {
            addCriterion("OBSE_REHAB like", value, "OBSE_REHAB");
            return this;
        }

        public Criteria andOBSE_REHABNotLike(String value)
        {
            addCriterion("OBSE_REHAB not like", value, "OBSE_REHAB");
            return this;
        }

        public Criteria andOBSE_REHABIn(List values)
        {
            addCriterion("OBSE_REHAB in", values, "OBSE_REHAB");
            return this;
        }

        public Criteria andOBSE_REHABNotIn(List values)
        {
            addCriterion("OBSE_REHAB not in", values, "OBSE_REHAB");
            return this;
        }

        public Criteria andOBSE_REHABBetween(String value1, String value2)
        {
            addCriterion("OBSE_REHAB between", value1, value2, "OBSE_REHAB");
            return this;
        }

        public Criteria andOBSE_REHABNotBetween(String value1, String value2)
        {
            addCriterion("OBSE_REHAB not between", value1, value2, "OBSE_REHAB");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andN_NUM_ACT_REHABIsNull()
        {
            criteriaWithoutValue.add("N_NUM_ACT_REHAB is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andN_NUM_ACT_REHABIsNotNull()
        {
            criteriaWithoutValue.add("N_NUM_ACT_REHAB is not null");
            return this;
        }

        public Criteria andN_NUM_ACT_REHABEqualTo(Short value)
        {
            addCriterion("N_NUM_ACT_REHAB =", value, "N_NUM_ACT_REHAB");
            return this;
        }

        public Criteria andN_NUM_ACT_REHABNotEqualTo(Short value)
        {
            addCriterion("N_NUM_ACT_REHAB <>", value, "N_NUM_ACT_REHAB");
            return this;
        }

        public Criteria andN_NUM_ACT_REHABGreaterThan(Short value)
        {
            addCriterion("N_NUM_ACT_REHAB >", value, "N_NUM_ACT_REHAB");
            return this;
        }

        public Criteria andN_NUM_ACT_REHABGreaterThanOrEqualTo(Short value)
        {
            addCriterion("N_NUM_ACT_REHAB >=", value, "N_NUM_ACT_REHAB");
            return this;
        }

        public Criteria andN_NUM_ACT_REHABLessThan(Short value)
        {
            addCriterion("N_NUM_ACT_REHAB <", value, "N_NUM_ACT_REHAB");
            return this;
        }

        public Criteria andN_NUM_ACT_REHABLessThanOrEqualTo(Short value)
        {
            addCriterion("N_NUM_ACT_REHAB <=", value, "N_NUM_ACT_REHAB");
            return this;
        }

        public Criteria andN_NUM_ACT_REHABIn(List values)
        {
            addCriterion("N_NUM_ACT_REHAB in", values, "N_NUM_ACT_REHAB");
            return this;
        }

        public Criteria andN_NUM_ACT_REHABNotIn(List values)
        {
            addCriterion("N_NUM_ACT_REHAB not in", values, "N_NUM_ACT_REHAB");
            return this;
        }

        public Criteria andN_NUM_ACT_REHABBetween(Short value1, Short value2)
        {
            addCriterion("N_NUM_ACT_REHAB between", value1, value2, "N_NUM_ACT_REHAB");
            return this;
        }

        public Criteria andN_NUM_ACT_REHABNotBetween(Short value1, Short value2)
        {
            addCriterion("N_NUM_ACT_REHAB not between", value1, value2, "N_NUM_ACT_REHAB");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andL_BLOQUEO_REHABIsNull()
        {
            criteriaWithoutValue.add("L_BLOQUEO_REHAB is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andL_BLOQUEO_REHABIsNotNull()
        {
            criteriaWithoutValue.add("L_BLOQUEO_REHAB is not null");
            return this;
        }

        public Criteria andL_BLOQUEO_REHABEqualTo(String value)
        {
            addCriterion("L_BLOQUEO_REHAB =", value, "L_BLOQUEO_REHAB");
            return this;
        }

        public Criteria andL_BLOQUEO_REHABNotEqualTo(String value)
        {
            addCriterion("L_BLOQUEO_REHAB <>", value, "L_BLOQUEO_REHAB");
            return this;
        }

        public Criteria andL_BLOQUEO_REHABGreaterThan(String value)
        {
            addCriterion("L_BLOQUEO_REHAB >", value, "L_BLOQUEO_REHAB");
            return this;
        }

        public Criteria andL_BLOQUEO_REHABGreaterThanOrEqualTo(String value)
        {
            addCriterion("L_BLOQUEO_REHAB >=", value, "L_BLOQUEO_REHAB");
            return this;
        }

        public Criteria andL_BLOQUEO_REHABLessThan(String value)
        {
            addCriterion("L_BLOQUEO_REHAB <", value, "L_BLOQUEO_REHAB");
            return this;
        }

        public Criteria andL_BLOQUEO_REHABLessThanOrEqualTo(String value)
        {
            addCriterion("L_BLOQUEO_REHAB <=", value, "L_BLOQUEO_REHAB");
            return this;
        }

        public Criteria andL_BLOQUEO_REHABLike(String value)
        {
            addCriterion("L_BLOQUEO_REHAB like", value, "L_BLOQUEO_REHAB");
            return this;
        }

        public Criteria andL_BLOQUEO_REHABNotLike(String value)
        {
            addCriterion("L_BLOQUEO_REHAB not like", value, "L_BLOQUEO_REHAB");
            return this;
        }

        public Criteria andL_BLOQUEO_REHABIn(List values)
        {
            addCriterion("L_BLOQUEO_REHAB in", values, "L_BLOQUEO_REHAB");
            return this;
        }

        public Criteria andL_BLOQUEO_REHABNotIn(List values)
        {
            addCriterion("L_BLOQUEO_REHAB not in", values, "L_BLOQUEO_REHAB");
            return this;
        }

        public Criteria andL_BLOQUEO_REHABBetween(String value1, String value2)
        {
            addCriterion("L_BLOQUEO_REHAB between", value1, value2, "L_BLOQUEO_REHAB");
            return this;
        }

        public Criteria andL_BLOQUEO_REHABNotBetween(String value1, String value2)
        {
            addCriterion("L_BLOQUEO_REHAB not between", value1, value2, "L_BLOQUEO_REHAB");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_CODG_MOTIVOIsNull()
        {
            criteriaWithoutValue.add("C_CODG_MOTIVO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_CODG_MOTIVOIsNotNull()
        {
            criteriaWithoutValue.add("C_CODG_MOTIVO is not null");
            return this;
        }

        public Criteria andC_CODG_MOTIVOEqualTo(String value)
        {
            addCriterion("C_CODG_MOTIVO =", value, "C_CODG_MOTIVO");
            return this;
        }

        public Criteria andC_CODG_MOTIVONotEqualTo(String value)
        {
            addCriterion("C_CODG_MOTIVO <>", value, "C_CODG_MOTIVO");
            return this;
        }

        public Criteria andC_CODG_MOTIVOGreaterThan(String value)
        {
            addCriterion("C_CODG_MOTIVO >", value, "C_CODG_MOTIVO");
            return this;
        }

        public Criteria andC_CODG_MOTIVOGreaterThanOrEqualTo(String value)
        {
            addCriterion("C_CODG_MOTIVO >=", value, "C_CODG_MOTIVO");
            return this;
        }

        public Criteria andC_CODG_MOTIVOLessThan(String value)
        {
            addCriterion("C_CODG_MOTIVO <", value, "C_CODG_MOTIVO");
            return this;
        }

        public Criteria andC_CODG_MOTIVOLessThanOrEqualTo(String value)
        {
            addCriterion("C_CODG_MOTIVO <=", value, "C_CODG_MOTIVO");
            return this;
        }

        public Criteria andC_CODG_MOTIVOLike(String value)
        {
            addCriterion("C_CODG_MOTIVO like", value, "C_CODG_MOTIVO");
            return this;
        }

        public Criteria andC_CODG_MOTIVONotLike(String value)
        {
            addCriterion("C_CODG_MOTIVO not like", value, "C_CODG_MOTIVO");
            return this;
        }

        public Criteria andC_CODG_MOTIVOIn(List values)
        {
            addCriterion("C_CODG_MOTIVO in", values, "C_CODG_MOTIVO");
            return this;
        }

        public Criteria andC_CODG_MOTIVONotIn(List values)
        {
            addCriterion("C_CODG_MOTIVO not in", values, "C_CODG_MOTIVO");
            return this;
        }

        public Criteria andC_CODG_MOTIVOBetween(String value1, String value2)
        {
            addCriterion("C_CODG_MOTIVO between", value1, value2, "C_CODG_MOTIVO");
            return this;
        }

        public Criteria andC_CODG_MOTIVONotBetween(String value1, String value2)
        {
            addCriterion("C_CODG_MOTIVO not between", value1, value2, "C_CODG_MOTIVO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_USUAR_UBIC_ACTIsNull()
        {
            criteriaWithoutValue.add("C_USUAR_UBIC_ACT is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andC_USUAR_UBIC_ACTIsNotNull()
        {
            criteriaWithoutValue.add("C_USUAR_UBIC_ACT is not null");
            return this;
        }

        public Criteria andC_USUAR_UBIC_ACTEqualTo(String value)
        {
            addCriterion("C_USUAR_UBIC_ACT =", value, "C_USUAR_UBIC_ACT");
            return this;
        }

        public Criteria andC_USUAR_UBIC_ACTNotEqualTo(String value)
        {
            addCriterion("C_USUAR_UBIC_ACT <>", value, "C_USUAR_UBIC_ACT");
            return this;
        }

        public Criteria andC_USUAR_UBIC_ACTGreaterThan(String value)
        {
            addCriterion("C_USUAR_UBIC_ACT >", value, "C_USUAR_UBIC_ACT");
            return this;
        }

        public Criteria andC_USUAR_UBIC_ACTGreaterThanOrEqualTo(String value)
        {
            addCriterion("C_USUAR_UBIC_ACT >=", value, "C_USUAR_UBIC_ACT");
            return this;
        }

        public Criteria andC_USUAR_UBIC_ACTLessThan(String value)
        {
            addCriterion("C_USUAR_UBIC_ACT <", value, "C_USUAR_UBIC_ACT");
            return this;
        }

        public Criteria andC_USUAR_UBIC_ACTLessThanOrEqualTo(String value)
        {
            addCriterion("C_USUAR_UBIC_ACT <=", value, "C_USUAR_UBIC_ACT");
            return this;
        }

        public Criteria andC_USUAR_UBIC_ACTLike(String value)
        {
            addCriterion("C_USUAR_UBIC_ACT like", value, "C_USUAR_UBIC_ACT");
            return this;
        }

        public Criteria andC_USUAR_UBIC_ACTNotLike(String value)
        {
            addCriterion("C_USUAR_UBIC_ACT not like", value, "C_USUAR_UBIC_ACT");
            return this;
        }

        public Criteria andC_USUAR_UBIC_ACTIn(List values)
        {
            addCriterion("C_USUAR_UBIC_ACT in", values, "C_USUAR_UBIC_ACT");
            return this;
        }

        public Criteria andC_USUAR_UBIC_ACTNotIn(List values)
        {
            addCriterion("C_USUAR_UBIC_ACT not in", values, "C_USUAR_UBIC_ACT");
            return this;
        }

        public Criteria andC_USUAR_UBIC_ACTBetween(String value1, String value2)
        {
            addCriterion("C_USUAR_UBIC_ACT between", value1, value2, "C_USUAR_UBIC_ACT");
            return this;
        }

        public Criteria andC_USUAR_UBIC_ACTNotBetween(String value1, String value2)
        {
            addCriterion("C_USUAR_UBIC_ACT not between", value1, value2, "C_USUAR_UBIC_ACT");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andF_UBIC_ACTIsNull()
        {
            criteriaWithoutValue.add("F_UBIC_ACT is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andF_UBIC_ACTIsNotNull()
        {
            criteriaWithoutValue.add("F_UBIC_ACT is not null");
            return this;
        }

        public Criteria andF_UBIC_ACTEqualTo(Date value)
        {
            addCriterion("F_UBIC_ACT =", value, "F_UBIC_ACT");
            return this;
        }

        public Criteria andF_UBIC_ACTNotEqualTo(Date value)
        {
            addCriterion("F_UBIC_ACT <>", value, "F_UBIC_ACT");
            return this;
        }

        public Criteria andF_UBIC_ACTGreaterThan(Date value)
        {
            addCriterion("F_UBIC_ACT >", value, "F_UBIC_ACT");
            return this;
        }

        public Criteria andF_UBIC_ACTGreaterThanOrEqualTo(Date value)
        {
            addCriterion("F_UBIC_ACT >=", value, "F_UBIC_ACT");
            return this;
        }

        public Criteria andF_UBIC_ACTLessThan(Date value)
        {
            addCriterion("F_UBIC_ACT <", value, "F_UBIC_ACT");
            return this;
        }

        public Criteria andF_UBIC_ACTLessThanOrEqualTo(Date value)
        {
            addCriterion("F_UBIC_ACT <=", value, "F_UBIC_ACT");
            return this;
        }

        public Criteria andF_UBIC_ACTIn(List values)
        {
            addCriterion("F_UBIC_ACT in", values, "F_UBIC_ACT");
            return this;
        }

        public Criteria andF_UBIC_ACTNotIn(List values)
        {
            addCriterion("F_UBIC_ACT not in", values, "F_UBIC_ACT");
            return this;
        }

        public Criteria andF_UBIC_ACTBetween(Date value1, Date value2)
        {
            addCriterion("F_UBIC_ACT between", value1, value2, "F_UBIC_ACT");
            return this;
        }

        public Criteria andF_UBIC_ACTNotBetween(Date value1, Date value2)
        {
            addCriterion("F_UBIC_ACT not between", value1, value2, "F_UBIC_ACT");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andL_SENTENCIAIsNull()
        {
            criteriaWithoutValue.add("L_SENTENCIA is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andL_SENTENCIAIsNotNull()
        {
            criteriaWithoutValue.add("L_SENTENCIA is not null");
            return this;
        }

        public Criteria andL_SENTENCIAEqualTo(String value)
        {
            addCriterion("L_SENTENCIA =", value, "L_SENTENCIA");
            return this;
        }

        public Criteria andL_SENTENCIANotEqualTo(String value)
        {
            addCriterion("L_SENTENCIA <>", value, "L_SENTENCIA");
            return this;
        }

        public Criteria andL_SENTENCIAGreaterThan(String value)
        {
            addCriterion("L_SENTENCIA >", value, "L_SENTENCIA");
            return this;
        }

        public Criteria andL_SENTENCIAGreaterThanOrEqualTo(String value)
        {
            addCriterion("L_SENTENCIA >=", value, "L_SENTENCIA");
            return this;
        }

        public Criteria andL_SENTENCIALessThan(String value)
        {
            addCriterion("L_SENTENCIA <", value, "L_SENTENCIA");
            return this;
        }

        public Criteria andL_SENTENCIALessThanOrEqualTo(String value)
        {
            addCriterion("L_SENTENCIA <=", value, "L_SENTENCIA");
            return this;
        }

        public Criteria andL_SENTENCIALike(String value)
        {
            addCriterion("L_SENTENCIA like", value, "L_SENTENCIA");
            return this;
        }

        public Criteria andL_SENTENCIANotLike(String value)
        {
            addCriterion("L_SENTENCIA not like", value, "L_SENTENCIA");
            return this;
        }

        public Criteria andL_SENTENCIAIn(List values)
        {
            addCriterion("L_SENTENCIA in", values, "L_SENTENCIA");
            return this;
        }

        public Criteria andL_SENTENCIANotIn(List values)
        {
            addCriterion("L_SENTENCIA not in", values, "L_SENTENCIA");
            return this;
        }

        public Criteria andL_SENTENCIABetween(String value1, String value2)
        {
            addCriterion("L_SENTENCIA between", value1, value2, "L_SENTENCIA");
            return this;
        }

        public Criteria andL_SENTENCIANotBetween(String value1, String value2)
        {
            addCriterion("L_SENTENCIA not between", value1, value2, "L_SENTENCIA");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andC_USUAR_IMPRESIONIsNull()
        {
            criteriaWithoutValue.add("C_USUAR_IMPRESION is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andC_USUAR_IMPRESIONIsNotNull()
        {
            criteriaWithoutValue.add("C_USUAR_IMPRESION is not null");
            return this;
        }

        public Criteria andC_USUAR_IMPRESIONEqualTo(String value)
        {
            addCriterion("C_USUAR_IMPRESION =", value, "C_USUAR_IMPRESION");
            return this;
        }

        public Criteria andC_USUAR_IMPRESIONNotEqualTo(String value)
        {
            addCriterion("C_USUAR_IMPRESION <>", value, "C_USUAR_IMPRESION");
            return this;
        }

        public Criteria andC_USUAR_IMPRESIONGreaterThan(String value)
        {
            addCriterion("C_USUAR_IMPRESION >", value, "C_USUAR_IMPRESION");
            return this;
        }

        public Criteria andC_USUAR_IMPRESIONGreaterThanOrEqualTo(String value)
        {
            addCriterion("C_USUAR_IMPRESION >=", value, "C_USUAR_IMPRESION");
            return this;
        }

        public Criteria andC_USUAR_IMPRESIONLessThan(String value)
        {
            addCriterion("C_USUAR_IMPRESION <", value, "C_USUAR_IMPRESION");
            return this;
        }

        public Criteria andC_USUAR_IMPRESIONLessThanOrEqualTo(String value)
        {
            addCriterion("C_USUAR_IMPRESION <=", value, "C_USUAR_IMPRESION");
            return this;
        }

        public Criteria andC_USUAR_IMPRESIONLike(String value)
        {
            addCriterion("C_USUAR_IMPRESION like", value, "C_USUAR_IMPRESION");
            return this;
        }

        public Criteria andC_USUAR_IMPRESIONNotLike(String value)
        {
            addCriterion("C_USUAR_IMPRESION not like", value, "C_USUAR_IMPRESION");
            return this;
        }

        public Criteria andC_USUAR_IMPRESIONIn(List values)
        {
            addCriterion("C_USUAR_IMPRESION in", values, "C_USUAR_IMPRESION");
            return this;
        }

        public Criteria andC_USUAR_IMPRESIONNotIn(List values)
        {
            addCriterion("C_USUAR_IMPRESION not in", values, "C_USUAR_IMPRESION");
            return this;
        }

        public Criteria andC_USUAR_IMPRESIONBetween(String value1, String value2)
        {
            addCriterion("C_USUAR_IMPRESION between", value1, value2, "C_USUAR_IMPRESION");
            return this;
        }

        public Criteria andC_USUAR_IMPRESIONNotBetween(String value1, String value2)
        {
            addCriterion("C_USUAR_IMPRESION not between", value1, value2, "C_USUAR_IMPRESION");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andF_IMPRESIONIsNull()
        {
            criteriaWithoutValue.add("F_IMPRESION is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andF_IMPRESIONIsNotNull()
        {
            criteriaWithoutValue.add("F_IMPRESION is not null");
            return this;
        }

        public Criteria andF_IMPRESIONEqualTo(Date value)
        {
            addCriterion("F_IMPRESION =", value, "F_IMPRESION");
            return this;
        }

        public Criteria andF_IMPRESIONNotEqualTo(Date value)
        {
            addCriterion("F_IMPRESION <>", value, "F_IMPRESION");
            return this;
        }

        public Criteria andF_IMPRESIONGreaterThan(Date value)
        {
            addCriterion("F_IMPRESION >", value, "F_IMPRESION");
            return this;
        }

        public Criteria andF_IMPRESIONGreaterThanOrEqualTo(Date value)
        {
            addCriterion("F_IMPRESION >=", value, "F_IMPRESION");
            return this;
        }

        public Criteria andF_IMPRESIONLessThan(Date value)
        {
            addCriterion("F_IMPRESION <", value, "F_IMPRESION");
            return this;
        }

        public Criteria andF_IMPRESIONLessThanOrEqualTo(Date value)
        {
            addCriterion("F_IMPRESION <=", value, "F_IMPRESION");
            return this;
        }

        public Criteria andF_IMPRESIONIn(List values)
        {
            addCriterion("F_IMPRESION in", values, "F_IMPRESION");
            return this;
        }

        public Criteria andF_IMPRESIONNotIn(List values)
        {
            addCriterion("F_IMPRESION not in", values, "F_IMPRESION");
            return this;
        }

        public Criteria andF_IMPRESIONBetween(Date value1, Date value2)
        {
            addCriterion("F_IMPRESION between", value1, value2, "F_IMPRESION");
            return this;
        }

        public Criteria andF_IMPRESIONNotBetween(Date value1, Date value2)
        {
            addCriterion("F_IMPRESION not between", value1, value2, "F_IMPRESION");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andF_REGISTRO_INVIsNull()
        {
            criteriaWithoutValue.add("F_REGISTRO_INV is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andF_REGISTRO_INVIsNotNull()
        {
            criteriaWithoutValue.add("F_REGISTRO_INV is not null");
            return this;
        }

        public Criteria andF_REGISTRO_INVEqualTo(Date value)
        {
            addCriterion("F_REGISTRO_INV =", value, "F_REGISTRO_INV");
            return this;
        }

        public Criteria andF_REGISTRO_INVNotEqualTo(Date value)
        {
            addCriterion("F_REGISTRO_INV <>", value, "F_REGISTRO_INV");
            return this;
        }

        public Criteria andF_REGISTRO_INVGreaterThan(Date value)
        {
            addCriterion("F_REGISTRO_INV >", value, "F_REGISTRO_INV");
            return this;
        }

        public Criteria andF_REGISTRO_INVGreaterThanOrEqualTo(Date value)
        {
            addCriterion("F_REGISTRO_INV >=", value, "F_REGISTRO_INV");
            return this;
        }

        public Criteria andF_REGISTRO_INVLessThan(Date value)
        {
            addCriterion("F_REGISTRO_INV <", value, "F_REGISTRO_INV");
            return this;
        }

        public Criteria andF_REGISTRO_INVLessThanOrEqualTo(Date value)
        {
            addCriterion("F_REGISTRO_INV <=", value, "F_REGISTRO_INV");
            return this;
        }

        public Criteria andF_REGISTRO_INVIn(List values)
        {
            addCriterion("F_REGISTRO_INV in", values, "F_REGISTRO_INV");
            return this;
        }

        public Criteria andF_REGISTRO_INVNotIn(List values)
        {
            addCriterion("F_REGISTRO_INV not in", values, "F_REGISTRO_INV");
            return this;
        }

        public Criteria andF_REGISTRO_INVBetween(Date value1, Date value2)
        {
            addCriterion("F_REGISTRO_INV between", value1, value2, "F_REGISTRO_INV");
            return this;
        }

        public Criteria andF_REGISTRO_INVNotBetween(Date value1, Date value2)
        {
            addCriterion("F_REGISTRO_INV not between", value1, value2, "F_REGISTRO_INV");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andL_autorizaIsNull()
        {
            criteriaWithoutValue.add("l_autoriza is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andL_autorizaIsNotNull()
        {
            criteriaWithoutValue.add("l_autoriza is not null");
            return this;
        }

        public Criteria andL_autorizaEqualTo(String value)
        {
            addCriterion("l_autoriza =", value, "l_autoriza");
            return this;
        }

        public Criteria andL_autorizaNotEqualTo(String value)
        {
            addCriterion("l_autoriza <>", value, "l_autoriza");
            return this;
        }

        public Criteria andL_autorizaGreaterThan(String value)
        {
            addCriterion("l_autoriza >", value, "l_autoriza");
            return this;
        }

        public Criteria andL_autorizaGreaterThanOrEqualTo(String value)
        {
            addCriterion("l_autoriza >=", value, "l_autoriza");
            return this;
        }

        public Criteria andL_autorizaLessThan(String value)
        {
            addCriterion("l_autoriza <", value, "l_autoriza");
            return this;
        }

        public Criteria andL_autorizaLessThanOrEqualTo(String value)
        {
            addCriterion("l_autoriza <=", value, "l_autoriza");
            return this;
        }

        public Criteria andL_autorizaLike(String value)
        {
            addCriterion("l_autoriza like", value, "l_autoriza");
            return this;
        }

        public Criteria andL_autorizaNotLike(String value)
        {
            addCriterion("l_autoriza not like", value, "l_autoriza");
            return this;
        }

        public Criteria andL_autorizaIn(List values)
        {
            addCriterion("l_autoriza in", values, "l_autoriza");
            return this;
        }

        public Criteria andL_autorizaNotIn(List values)
        {
            addCriterion("l_autoriza not in", values, "l_autoriza");
            return this;
        }

        public Criteria andL_autorizaBetween(String value1, String value2)
        {
            addCriterion("l_autoriza between", value1, value2, "l_autoriza");
            return this;
        }

        public Criteria andL_autorizaNotBetween(String value1, String value2)
        {
            addCriterion("l_autoriza not between", value1, value2, "l_autoriza");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andL_usuar_autIsNull()
        {
            criteriaWithoutValue.add("l_usuar_aut is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andL_usuar_autIsNotNull()
        {
            criteriaWithoutValue.add("l_usuar_aut is not null");
            return this;
        }

        public Criteria andL_usuar_autEqualTo(String value)
        {
            addCriterion("l_usuar_aut =", value, "l_usuar_aut");
            return this;
        }

        public Criteria andL_usuar_autNotEqualTo(String value)
        {
            addCriterion("l_usuar_aut <>", value, "l_usuar_aut");
            return this;
        }

        public Criteria andL_usuar_autGreaterThan(String value)
        {
            addCriterion("l_usuar_aut >", value, "l_usuar_aut");
            return this;
        }

        public Criteria andL_usuar_autGreaterThanOrEqualTo(String value)
        {
            addCriterion("l_usuar_aut >=", value, "l_usuar_aut");
            return this;
        }

        public Criteria andL_usuar_autLessThan(String value)
        {
            addCriterion("l_usuar_aut <", value, "l_usuar_aut");
            return this;
        }

        public Criteria andL_usuar_autLessThanOrEqualTo(String value)
        {
            addCriterion("l_usuar_aut <=", value, "l_usuar_aut");
            return this;
        }

        public Criteria andL_usuar_autLike(String value)
        {
            addCriterion("l_usuar_aut like", value, "l_usuar_aut");
            return this;
        }

        public Criteria andL_usuar_autNotLike(String value)
        {
            addCriterion("l_usuar_aut not like", value, "l_usuar_aut");
            return this;
        }

        public Criteria andL_usuar_autIn(List values)
        {
            addCriterion("l_usuar_aut in", values, "l_usuar_aut");
            return this;
        }

        public Criteria andL_usuar_autNotIn(List values)
        {
            addCriterion("l_usuar_aut not in", values, "l_usuar_aut");
            return this;
        }

        public Criteria andL_usuar_autBetween(String value1, String value2)
        {
            addCriterion("l_usuar_aut between", value1, value2, "l_usuar_aut");
            return this;
        }

        public Criteria andL_usuar_autNotBetween(String value1, String value2)
        {
            addCriterion("l_usuar_aut not between", value1, value2, "l_usuar_aut");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFech_autIsNull()
        {
            criteriaWithoutValue.add("fech_aut is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFech_autIsNotNull()
        {
            criteriaWithoutValue.add("fech_aut is not null");
            return this;
        }

        public Criteria andFech_autEqualTo(Date value)
        {
            addCriterion("fech_aut =", value, "fech_aut");
            return this;
        }

        public Criteria andFech_autNotEqualTo(Date value)
        {
            addCriterion("fech_aut <>", value, "fech_aut");
            return this;
        }

        public Criteria andFech_autGreaterThan(Date value)
        {
            addCriterion("fech_aut >", value, "fech_aut");
            return this;
        }

        public Criteria andFech_autGreaterThanOrEqualTo(Date value)
        {
            addCriterion("fech_aut >=", value, "fech_aut");
            return this;
        }

        public Criteria andFech_autLessThan(Date value)
        {
            addCriterion("fech_aut <", value, "fech_aut");
            return this;
        }

        public Criteria andFech_autLessThanOrEqualTo(Date value)
        {
            addCriterion("fech_aut <=", value, "fech_aut");
            return this;
        }

        public Criteria andFech_autIn(List values)
        {
            addCriterion("fech_aut in", values, "fech_aut");
            return this;
        }

        public Criteria andFech_autNotIn(List values)
        {
            addCriterion("fech_aut not in", values, "fech_aut");
            return this;
        }

        public Criteria andFech_autBetween(Date value1, Date value2)
        {
            addCriterion("fech_aut between", value1, value2, "fech_aut");
            return this;
        }

        public Criteria andFech_autNotBetween(Date value1, Date value2)
        {
            addCriterion("fech_aut not between", value1, value2, "fech_aut");
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


    public BoletinExample()
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
