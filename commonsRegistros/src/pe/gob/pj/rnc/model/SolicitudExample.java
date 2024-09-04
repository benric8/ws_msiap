// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   SolicitudExample.java

package pe.gob.pj.rnc.model;

import java.util.*;

public class SolicitudExample
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

        public List getCriteriaSpecialConditions() {
			return criteriaSpecialConditions;
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
        public Criteria andNUME_CERTIIsNull()
        {
            criteriaWithoutValue.add("NUME_CERTI is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUME_CERTIIsNotNull()
        {
            criteriaWithoutValue.add("NUME_CERTI is not null");
            return this;
        }

        public Criteria andNUME_CERTIEqualTo(String value)
        {
            addCriterion("NUME_CERTI =", value, "NUME_CERTI");
            return this;
        }

        public Criteria andNUME_CERTINotEqualTo(String value)
        {
            addCriterion("NUME_CERTI <>", value, "NUME_CERTI");
            return this;
        }

        public Criteria andNUME_CERTIGreaterThan(String value)
        {
            addCriterion("NUME_CERTI >", value, "NUME_CERTI");
            return this;
        }

        public Criteria andNUME_CERTIGreaterThanOrEqualTo(String value)
        {
            addCriterion("NUME_CERTI >=", value, "NUME_CERTI");
            return this;
        }

        public Criteria andNUME_CERTILessThan(String value)
        {
            addCriterion("NUME_CERTI <", value, "NUME_CERTI");
            return this;
        }

        public Criteria andNUME_CERTILessThanOrEqualTo(String value)
        {
            addCriterion("NUME_CERTI <=", value, "NUME_CERTI");
            return this;
        }

        public Criteria andNUME_CERTILike(String value)
        {
            addCriterion("NUME_CERTI like", value, "NUME_CERTI");
            return this;
        }

        public Criteria andNUME_CERTINotLike(String value)
        {
            addCriterion("NUME_CERTI not like", value, "NUME_CERTI");
            return this;
        }

        public Criteria andNUME_CERTIIn(List values)
        {
            addCriterion("NUME_CERTI in", values, "NUME_CERTI");
            return this;
        }

        public Criteria andNUME_CERTINotIn(List values)
        {
            addCriterion("NUME_CERTI not in", values, "NUME_CERTI");
            return this;
        }

        public Criteria andNUME_CERTIBetween(String value1, String value2)
        {
            addCriterion("NUME_CERTI between", value1, value2, "NUME_CERTI");
            return this;
        }

        public Criteria andNUME_CERTINotBetween(String value1, String value2)
        {
            addCriterion("NUME_CERTI not between", value1, value2, "NUME_CERTI");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andAPLL_PATER_SOLICIsNull()
        {
            criteriaWithoutValue.add("APLL_PATER_SOLIC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andAPLL_PATER_SOLICIsNotNull()
        {
            criteriaWithoutValue.add("APLL_PATER_SOLIC is not null");
            return this;
        }

        public Criteria andAPLL_PATER_SOLICEqualTo(String value)
        {
            addCriterion("APLL_PATER_SOLIC =", value, "APLL_PATER_SOLIC");
            return this;
        }

        public Criteria andAPLL_PATER_SOLICNotEqualTo(String value)
        {
            addCriterion("APLL_PATER_SOLIC <>", value, "APLL_PATER_SOLIC");
            return this;
        }

        public Criteria andAPLL_PATER_SOLICGreaterThan(String value)
        {
            addCriterion("APLL_PATER_SOLIC >", value, "APLL_PATER_SOLIC");
            return this;
        }

        public Criteria andAPLL_PATER_SOLICGreaterThanOrEqualTo(String value)
        {
            addCriterion("APLL_PATER_SOLIC >=", value, "APLL_PATER_SOLIC");
            return this;
        }

        public Criteria andAPLL_PATER_SOLICLessThan(String value)
        {
            addCriterion("APLL_PATER_SOLIC <", value, "APLL_PATER_SOLIC");
            return this;
        }

        public Criteria andAPLL_PATER_SOLICLessThanOrEqualTo(String value)
        {
            addCriterion("APLL_PATER_SOLIC <=", value, "APLL_PATER_SOLIC");
            return this;
        }

        public Criteria andAPLL_PATER_SOLICLike(String value)
        {
        		addCriterion("APLL_PATER_SOLIC like", value, "APLL_PATER_SOLIC");

            return this;
        }

        public Criteria andAPLL_PATER_SOLICNotLike(String value)
        {
            addCriterion("APLL_PATER_SOLIC not like", value, "APLL_PATER_SOLIC");
            return this;
        }

        public Criteria andAPLL_PATER_SOLICIn(List values)
        {
            addCriterion("APLL_PATER_SOLIC in", values, "APLL_PATER_SOLIC");
            return this;
        }

        public Criteria andAPLL_PATER_SOLICNotIn(List values)
        {
            addCriterion("APLL_PATER_SOLIC not in", values, "APLL_PATER_SOLIC");
            return this;
        }

        public Criteria andAPLL_PATER_SOLICBetween(String value1, String value2)
        {
            addCriterion("APLL_PATER_SOLIC between", value1, value2, "APLL_PATER_SOLIC");
            return this;
        }

        public Criteria andAPLL_PATER_SOLICNotBetween(String value1, String value2)
        {
            addCriterion("APLL_PATER_SOLIC not between", value1, value2, "APLL_PATER_SOLIC");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andAPLL_MATER_SOLICIsNull()
        {
            criteriaWithoutValue.add("APLL_MATER_SOLIC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andAPLL_MATER_SOLICIsNotNull()
        {
            criteriaWithoutValue.add("APLL_MATER_SOLIC is not null");
            return this;
        }

        public Criteria andAPLL_MATER_SOLICEqualTo(String value)
        {
            addCriterion("APLL_MATER_SOLIC =", value, "APLL_MATER_SOLIC");
            return this;
        }

        public Criteria andAPLL_MATER_SOLICNotEqualTo(String value)
        {
            addCriterion("APLL_MATER_SOLIC <>", value, "APLL_MATER_SOLIC");
            return this;
        }

        public Criteria andAPLL_MATER_SOLICGreaterThan(String value)
        {
            addCriterion("APLL_MATER_SOLIC >", value, "APLL_MATER_SOLIC");
            return this;
        }

        public Criteria andAPLL_MATER_SOLICGreaterThanOrEqualTo(String value)
        {
            addCriterion("APLL_MATER_SOLIC >=", value, "APLL_MATER_SOLIC");
            return this;
        }

        public Criteria andAPLL_MATER_SOLICLessThan(String value)
        {
            addCriterion("APLL_MATER_SOLIC <", value, "APLL_MATER_SOLIC");
            return this;
        }

        public Criteria andAPLL_MATER_SOLICLessThanOrEqualTo(String value)
        {
            addCriterion("APLL_MATER_SOLIC <=", value, "APLL_MATER_SOLIC");
            return this;
        }

        public Criteria andAPLL_MATER_SOLICLike(String value)
        {
            addCriterion("APLL_MATER_SOLIC like", value, "APLL_MATER_SOLIC");
            return this;
        }

        public Criteria andAPLL_MATER_SOLICNotLike(String value)
        {
            addCriterion("APLL_MATER_SOLIC not like", value, "APLL_MATER_SOLIC");
            return this;
        }

        public Criteria andAPLL_MATER_SOLICIn(List values)
        {
            addCriterion("APLL_MATER_SOLIC in", values, "APLL_MATER_SOLIC");
            return this;
        }

        public Criteria andAPLL_MATER_SOLICNotIn(List values)
        {
            addCriterion("APLL_MATER_SOLIC not in", values, "APLL_MATER_SOLIC");
            return this;
        }

        public Criteria andAPLL_MATER_SOLICBetween(String value1, String value2)
        {
            addCriterion("APLL_MATER_SOLIC between", value1, value2, "APLL_MATER_SOLIC");
            return this;
        }

        public Criteria andAPLL_MATER_SOLICNotBetween(String value1, String value2)
        {
            addCriterion("APLL_MATER_SOLIC not between", value1, value2, "APLL_MATER_SOLIC");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNOM1_SOLICIsNull()
        {
            criteriaWithoutValue.add("NOM1_SOLIC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNOM1_SOLICIsNotNull()
        {
            criteriaWithoutValue.add("NOM1_SOLIC is not null");
            return this;
        }

        public Criteria andNOM1_SOLICEqualTo(String value)
        {
            addCriterion("NOM1_SOLIC =", value, "NOM1_SOLIC");
            return this;
        }

        public Criteria andNOM1_SOLICNotEqualTo(String value)
        {
            addCriterion("NOM1_SOLIC <>", value, "NOM1_SOLIC");
            return this;
        }

        public Criteria andNOM1_SOLICGreaterThan(String value)
        {
            addCriterion("NOM1_SOLIC >", value, "NOM1_SOLIC");
            return this;
        }

        public Criteria andNOM1_SOLICGreaterThanOrEqualTo(String value)
        {
            addCriterion("NOM1_SOLIC >=", value, "NOM1_SOLIC");
            return this;
        }

        public Criteria andNOM1_SOLICLessThan(String value)
        {
            addCriterion("NOM1_SOLIC <", value, "NOM1_SOLIC");
            return this;
        }

        public Criteria andNOM1_SOLICLessThanOrEqualTo(String value)
        {
            addCriterion("NOM1_SOLIC <=", value, "NOM1_SOLIC");
            return this;
        }

        public Criteria andNOM1_SOLICLike(String value)
        {
            addCriterion("NOM1_SOLIC like", value, "NOM1_SOLIC");
            return this;
        }

        public Criteria andNOM1_SOLICNotLike(String value)
        {
            addCriterion("NOM1_SOLIC not like", value, "NOM1_SOLIC");
            return this;
        }

        public Criteria andNOM1_SOLICIn(List values)
        {
            addCriterion("NOM1_SOLIC in", values, "NOM1_SOLIC");
            return this;
        }

        public Criteria andNOM1_SOLICNotIn(List values)
        {
            addCriterion("NOM1_SOLIC not in", values, "NOM1_SOLIC");
            return this;
        }

        public Criteria andNOM1_SOLICBetween(String value1, String value2)
        {
            addCriterion("NOM1_SOLIC between", value1, value2, "NOM1_SOLIC");
            return this;
        }

        public Criteria andNOM1_SOLICNotBetween(String value1, String value2)
        {
            addCriterion("NOM1_SOLIC not between", value1, value2, "NOM1_SOLIC");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNOM2_SOLICIsNull()
        {
            criteriaWithoutValue.add("NOM2_SOLIC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNOM2_SOLICIsNotNull()
        {
            criteriaWithoutValue.add("NOM2_SOLIC is not null");
            return this;
        }

        public Criteria andNOM2_SOLICEqualTo(String value)
        {
            addCriterion("NOM2_SOLIC =", value, "NOM2_SOLIC");
            return this;
        }

        public Criteria andNOM2_SOLICNotEqualTo(String value)
        {
            addCriterion("NOM2_SOLIC <>", value, "NOM2_SOLIC");
            return this;
        }

        public Criteria andNOM2_SOLICGreaterThan(String value)
        {
            addCriterion("NOM2_SOLIC >", value, "NOM2_SOLIC");
            return this;
        }

        public Criteria andNOM2_SOLICGreaterThanOrEqualTo(String value)
        {
            addCriterion("NOM2_SOLIC >=", value, "NOM2_SOLIC");
            return this;
        }

        public Criteria andNOM2_SOLICLessThan(String value)
        {
            addCriterion("NOM2_SOLIC <", value, "NOM2_SOLIC");
            return this;
        }

        public Criteria andNOM2_SOLICLessThanOrEqualTo(String value)
        {
            addCriterion("NOM2_SOLIC <=", value, "NOM2_SOLIC");
            return this;
        }

        public Criteria andNOM2_SOLICLike(String value)
        {
            addCriterion("NOM2_SOLIC like", value, "NOM2_SOLIC");
            return this;
        }

        public Criteria andNOM2_SOLICNotLike(String value)
        {
            addCriterion("NOM2_SOLIC not like", value, "NOM2_SOLIC");
            return this;
        }

        public Criteria andNOM2_SOLICIn(List values)
        {
            addCriterion("NOM2_SOLIC in", values, "NOM2_SOLIC");
            return this;
        }

        public Criteria andNOM2_SOLICNotIn(List values)
        {
            addCriterion("NOM2_SOLIC not in", values, "NOM2_SOLIC");
            return this;
        }

        public Criteria andNOM2_SOLICBetween(String value1, String value2)
        {
            addCriterion("NOM2_SOLIC between", value1, value2, "NOM2_SOLIC");
            return this;
        }

        public Criteria andNOM2_SOLICNotBetween(String value1, String value2)
        {
            addCriterion("NOM2_SOLIC not between", value1, value2, "NOM2_SOLIC");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNOM3_SOLICIsNull()
        {
            criteriaWithoutValue.add("NOM3_SOLIC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNOM3_SOLICIsNotNull()
        {
            criteriaWithoutValue.add("NOM3_SOLIC is not null");
            return this;
        }

        public Criteria andNOM3_SOLICEqualTo(String value)
        {
            addCriterion("NOM3_SOLIC =", value, "NOM3_SOLIC");
            return this;
        }

        public Criteria andNOM3_SOLICNotEqualTo(String value)
        {
            addCriterion("NOM3_SOLIC <>", value, "NOM3_SOLIC");
            return this;
        }

        public Criteria andNOM3_SOLICGreaterThan(String value)
        {
            addCriterion("NOM3_SOLIC >", value, "NOM3_SOLIC");
            return this;
        }

        public Criteria andNOM3_SOLICGreaterThanOrEqualTo(String value)
        {
            addCriterion("NOM3_SOLIC >=", value, "NOM3_SOLIC");
            return this;
        }

        public Criteria andNOM3_SOLICLessThan(String value)
        {
            addCriterion("NOM3_SOLIC <", value, "NOM3_SOLIC");
            return this;
        }

        public Criteria andNOM3_SOLICLessThanOrEqualTo(String value)
        {
            addCriterion("NOM3_SOLIC <=", value, "NOM3_SOLIC");
            return this;
        }

        public Criteria andNOM3_SOLICLike(String value)
        {
            addCriterion("NOM3_SOLIC like", value, "NOM3_SOLIC");
            return this;
        }

        public Criteria andNOM3_SOLICNotLike(String value)
        {
            addCriterion("NOM3_SOLIC not like", value, "NOM3_SOLIC");
            return this;
        }

        public Criteria andNOM3_SOLICIn(List values)
        {
            addCriterion("NOM3_SOLIC in", values, "NOM3_SOLIC");
            return this;
        }

        public Criteria andNOM3_SOLICNotIn(List values)
        {
            addCriterion("NOM3_SOLIC not in", values, "NOM3_SOLIC");
            return this;
        }

        public Criteria andNOM3_SOLICBetween(String value1, String value2)
        {
            addCriterion("NOM3_SOLIC between", value1, value2, "NOM3_SOLIC");
            return this;
        }

        public Criteria andNOM3_SOLICNotBetween(String value1, String value2)
        {
            addCriterion("NOM3_SOLIC not between", value1, value2, "NOM3_SOLIC");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNOM4_SOLICIsNull()
        {
            criteriaWithoutValue.add("NOM4_SOLIC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNOM4_SOLICIsNotNull()
        {
            criteriaWithoutValue.add("NOM4_SOLIC is not null");
            return this;
        }

        public Criteria andNOM4_SOLICEqualTo(String value)
        {
            addCriterion("NOM4_SOLIC =", value, "NOM4_SOLIC");
            return this;
        }

        public Criteria andNOM4_SOLICNotEqualTo(String value)
        {
            addCriterion("NOM4_SOLIC <>", value, "NOM4_SOLIC");
            return this;
        }

        public Criteria andNOM4_SOLICGreaterThan(String value)
        {
            addCriterion("NOM4_SOLIC >", value, "NOM4_SOLIC");
            return this;
        }

        public Criteria andNOM4_SOLICGreaterThanOrEqualTo(String value)
        {
            addCriterion("NOM4_SOLIC >=", value, "NOM4_SOLIC");
            return this;
        }

        public Criteria andNOM4_SOLICLessThan(String value)
        {
            addCriterion("NOM4_SOLIC <", value, "NOM4_SOLIC");
            return this;
        }

        public Criteria andNOM4_SOLICLessThanOrEqualTo(String value)
        {
            addCriterion("NOM4_SOLIC <=", value, "NOM4_SOLIC");
            return this;
        }

        public Criteria andNOM4_SOLICLike(String value)
        {
            addCriterion("NOM4_SOLIC like", value, "NOM4_SOLIC");
            return this;
        }

        public Criteria andNOM4_SOLICNotLike(String value)
        {
            addCriterion("NOM4_SOLIC not like", value, "NOM4_SOLIC");
            return this;
        }

        public Criteria andNOM4_SOLICIn(List values)
        {
            addCriterion("NOM4_SOLIC in", values, "NOM4_SOLIC");
            return this;
        }

        public Criteria andNOM4_SOLICNotIn(List values)
        {
            addCriterion("NOM4_SOLIC not in", values, "NOM4_SOLIC");
            return this;
        }

        public Criteria andNOM4_SOLICBetween(String value1, String value2)
        {
            addCriterion("NOM4_SOLIC between", value1, value2, "NOM4_SOLIC");
            return this;
        }

        public Criteria andNOM4_SOLICNotBetween(String value1, String value2)
        {
            addCriterion("NOM4_SOLIC not between", value1, value2, "NOM4_SOLIC");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNOM5_SOLICIsNull()
        {
            criteriaWithoutValue.add("NOM5_SOLIC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNOM5_SOLICIsNotNull()
        {
            criteriaWithoutValue.add("NOM5_SOLIC is not null");
            return this;
        }

        public Criteria andNOM5_SOLICEqualTo(String value)
        {
            addCriterion("NOM5_SOLIC =", value, "NOM5_SOLIC");
            return this;
        }

        public Criteria andNOM5_SOLICNotEqualTo(String value)
        {
            addCriterion("NOM5_SOLIC <>", value, "NOM5_SOLIC");
            return this;
        }

        public Criteria andNOM5_SOLICGreaterThan(String value)
        {
            addCriterion("NOM5_SOLIC >", value, "NOM5_SOLIC");
            return this;
        }

        public Criteria andNOM5_SOLICGreaterThanOrEqualTo(String value)
        {
            addCriterion("NOM5_SOLIC >=", value, "NOM5_SOLIC");
            return this;
        }

        public Criteria andNOM5_SOLICLessThan(String value)
        {
            addCriterion("NOM5_SOLIC <", value, "NOM5_SOLIC");
            return this;
        }

        public Criteria andNOM5_SOLICLessThanOrEqualTo(String value)
        {
            addCriterion("NOM5_SOLIC <=", value, "NOM5_SOLIC");
            return this;
        }

        public Criteria andNOM5_SOLICLike(String value)
        {
            addCriterion("NOM5_SOLIC like", value, "NOM5_SOLIC");
            return this;
        }

        public Criteria andNOM5_SOLICNotLike(String value)
        {
            addCriterion("NOM5_SOLIC not like", value, "NOM5_SOLIC");
            return this;
        }

        public Criteria andNOM5_SOLICIn(List values)
        {
            addCriterion("NOM5_SOLIC in", values, "NOM5_SOLIC");
            return this;
        }

        public Criteria andNOM5_SOLICNotIn(List values)
        {
            addCriterion("NOM5_SOLIC not in", values, "NOM5_SOLIC");
            return this;
        }

        public Criteria andNOM5_SOLICBetween(String value1, String value2)
        {
            addCriterion("NOM5_SOLIC between", value1, value2, "NOM5_SOLIC");
            return this;
        }

        public Criteria andNOM5_SOLICNotBetween(String value1, String value2)
        {
            addCriterion("NOM5_SOLIC not between", value1, value2, "NOM5_SOLIC");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andTIPO_SOLICIsNull()
        {
            criteriaWithoutValue.add("TIPO_SOLIC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andTIPO_SOLICIsNotNull()
        {
            criteriaWithoutValue.add("TIPO_SOLIC is not null");
            return this;
        }

        public Criteria andTIPO_SOLICEqualTo(String value)
        {
            addCriterion("TIPO_SOLIC =", value, "TIPO_SOLIC");
            return this;
        }

        public Criteria andTIPO_SOLICNotEqualTo(String value)
        {
            addCriterion("TIPO_SOLIC <>", value, "TIPO_SOLIC");
            return this;
        }

        public Criteria andTIPO_SOLICGreaterThan(String value)
        {
            addCriterion("TIPO_SOLIC >", value, "TIPO_SOLIC");
            return this;
        }

        public Criteria andTIPO_SOLICGreaterThanOrEqualTo(String value)
        {
            addCriterion("TIPO_SOLIC >=", value, "TIPO_SOLIC");
            return this;
        }

        public Criteria andTIPO_SOLICLessThan(String value)
        {
            addCriterion("TIPO_SOLIC <", value, "TIPO_SOLIC");
            return this;
        }

        public Criteria andTIPO_SOLICLessThanOrEqualTo(String value)
        {
            addCriterion("TIPO_SOLIC <=", value, "TIPO_SOLIC");
            return this;
        }

        public Criteria andTIPO_SOLICLike(String value)
        {
            addCriterion("TIPO_SOLIC like", value, "TIPO_SOLIC");
            return this;
        }

        public Criteria andTIPO_SOLICNotLike(String value)
        {
            addCriterion("TIPO_SOLIC not like", value, "TIPO_SOLIC");
            return this;
        }

        public Criteria andTIPO_SOLICIn(List values)
        {
            addCriterion("TIPO_SOLIC in", values, "TIPO_SOLIC");
            return this;
        }

        public Criteria andTIPO_SOLICNotIn(List values)
        {
            addCriterion("TIPO_SOLIC not in", values, "TIPO_SOLIC");
            return this;
        }

        public Criteria andTIPO_SOLICBetween(String value1, String value2)
        {
            addCriterion("TIPO_SOLIC between", value1, value2, "TIPO_SOLIC");
            return this;
        }

        public Criteria andTIPO_SOLICNotBetween(String value1, String value2)
        {
            addCriterion("TIPO_SOLIC not between", value1, value2, "TIPO_SOLIC");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andMOTI_SOLICIsNull()
        {
            criteriaWithoutValue.add("MOTI_SOLIC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andMOTI_SOLICIsNotNull()
        {
            criteriaWithoutValue.add("MOTI_SOLIC is not null");
            return this;
        }

        public Criteria andMOTI_SOLICEqualTo(String value)
        {
            addCriterion("MOTI_SOLIC =", value, "MOTI_SOLIC");
            return this;
        }

        public Criteria andMOTI_SOLICNotEqualTo(String value)
        {
            addCriterion("MOTI_SOLIC <>", value, "MOTI_SOLIC");
            return this;
        }

        public Criteria andMOTI_SOLICGreaterThan(String value)
        {
            addCriterion("MOTI_SOLIC >", value, "MOTI_SOLIC");
            return this;
        }

        public Criteria andMOTI_SOLICGreaterThanOrEqualTo(String value)
        {
            addCriterion("MOTI_SOLIC >=", value, "MOTI_SOLIC");
            return this;
        }

        public Criteria andMOTI_SOLICLessThan(String value)
        {
            addCriterion("MOTI_SOLIC <", value, "MOTI_SOLIC");
            return this;
        }

        public Criteria andMOTI_SOLICLessThanOrEqualTo(String value)
        {
            addCriterion("MOTI_SOLIC <=", value, "MOTI_SOLIC");
            return this;
        }

        public Criteria andMOTI_SOLICLike(String value)
        {
            addCriterion("MOTI_SOLIC like", value, "MOTI_SOLIC");
            return this;
        }

        public Criteria andMOTI_SOLICNotLike(String value)
        {
            addCriterion("MOTI_SOLIC not like", value, "MOTI_SOLIC");
            return this;
        }

        public Criteria andMOTI_SOLICIn(List values)
        {
            addCriterion("MOTI_SOLIC in", values, "MOTI_SOLIC");
            return this;
        }

        public Criteria andMOTI_SOLICNotIn(List values)
        {
            addCriterion("MOTI_SOLIC not in", values, "MOTI_SOLIC");
            return this;
        }

        public Criteria andMOTI_SOLICBetween(String value1, String value2)
        {
            addCriterion("MOTI_SOLIC between", value1, value2, "MOTI_SOLIC");
            return this;
        }

        public Criteria andMOTI_SOLICNotBetween(String value1, String value2)
        {
            addCriterion("MOTI_SOLIC not between", value1, value2, "MOTI_SOLIC");
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
        public Criteria andNUME_JUZGAIsNull()
        {
            criteriaWithoutValue.add("NUME_JUZGA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUME_JUZGAIsNotNull()
        {
            criteriaWithoutValue.add("NUME_JUZGA is not null");
            return this;
        }

        public Criteria andNUME_JUZGAEqualTo(String value)
        {
            addCriterion("NUME_JUZGA =", value, "NUME_JUZGA");
            return this;
        }

        public Criteria andNUME_JUZGANotEqualTo(String value)
        {
            addCriterion("NUME_JUZGA <>", value, "NUME_JUZGA");
            return this;
        }

        public Criteria andNUME_JUZGAGreaterThan(String value)
        {
            addCriterion("NUME_JUZGA >", value, "NUME_JUZGA");
            return this;
        }

        public Criteria andNUME_JUZGAGreaterThanOrEqualTo(String value)
        {
            addCriterion("NUME_JUZGA >=", value, "NUME_JUZGA");
            return this;
        }

        public Criteria andNUME_JUZGALessThan(String value)
        {
            addCriterion("NUME_JUZGA <", value, "NUME_JUZGA");
            return this;
        }

        public Criteria andNUME_JUZGALessThanOrEqualTo(String value)
        {
            addCriterion("NUME_JUZGA <=", value, "NUME_JUZGA");
            return this;
        }

        public Criteria andNUME_JUZGALike(String value)
        {
            addCriterion("NUME_JUZGA like", value, "NUME_JUZGA");
            return this;
        }

        public Criteria andNUME_JUZGANotLike(String value)
        {
            addCriterion("NUME_JUZGA not like", value, "NUME_JUZGA");
            return this;
        }

        public Criteria andNUME_JUZGAIn(List values)
        {
            addCriterion("NUME_JUZGA in", values, "NUME_JUZGA");
            return this;
        }

        public Criteria andNUME_JUZGANotIn(List values)
        {
            addCriterion("NUME_JUZGA not in", values, "NUME_JUZGA");
            return this;
        }

        public Criteria andNUME_JUZGABetween(String value1, String value2)
        {
            addCriterion("NUME_JUZGA between", value1, value2, "NUME_JUZGA");
            return this;
        }

        public Criteria andNUME_JUZGANotBetween(String value1, String value2)
        {
            addCriterion("NUME_JUZGA not between", value1, value2, "NUME_JUZGA");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_JUZGADIsNull()
        {
            criteriaWithoutValue.add("CODG_JUZGAD is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_JUZGADIsNotNull()
        {
            criteriaWithoutValue.add("CODG_JUZGAD is not null");
            return this;
        }

        public Criteria andCODG_JUZGADEqualTo(String value)
        {
            addCriterion("CODG_JUZGAD =", value, "CODG_JUZGAD");
            return this;
        }

        public Criteria andCODG_JUZGADNotEqualTo(String value)
        {
            addCriterion("CODG_JUZGAD <>", value, "CODG_JUZGAD");
            return this;
        }

        public Criteria andCODG_JUZGADGreaterThan(String value)
        {
            addCriterion("CODG_JUZGAD >", value, "CODG_JUZGAD");
            return this;
        }

        public Criteria andCODG_JUZGADGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_JUZGAD >=", value, "CODG_JUZGAD");
            return this;
        }

        public Criteria andCODG_JUZGADLessThan(String value)
        {
            addCriterion("CODG_JUZGAD <", value, "CODG_JUZGAD");
            return this;
        }

        public Criteria andCODG_JUZGADLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_JUZGAD <=", value, "CODG_JUZGAD");
            return this;
        }

        public Criteria andCODG_JUZGADLike(String value)
        {
            addCriterion("CODG_JUZGAD like", value, "CODG_JUZGAD");
            return this;
        }

        public Criteria andCODG_JUZGADNotLike(String value)
        {
            addCriterion("CODG_JUZGAD not like", value, "CODG_JUZGAD");
            return this;
        }

        public Criteria andCODG_JUZGADIn(List values)
        {
            addCriterion("CODG_JUZGAD in", values, "CODG_JUZGAD");
            return this;
        }

        public Criteria andCODG_JUZGADNotIn(List values)
        {
            addCriterion("CODG_JUZGAD not in", values, "CODG_JUZGAD");
            return this;
        }

        public Criteria andCODG_JUZGADBetween(String value1, String value2)
        {
            addCriterion("CODG_JUZGAD between", value1, value2, "CODG_JUZGAD");
            return this;
        }

        public Criteria andCODG_JUZGADNotBetween(String value1, String value2)
        {
            addCriterion("CODG_JUZGAD not between", value1, value2, "CODG_JUZGAD");
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
        public Criteria andNOMB_JUZGA_SOLICIsNull()
        {
            criteriaWithoutValue.add("NOMB_JUZGA_SOLIC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNOMB_JUZGA_SOLICIsNotNull()
        {
            criteriaWithoutValue.add("NOMB_JUZGA_SOLIC is not null");
            return this;
        }

        public Criteria andNOMB_JUZGA_SOLICEqualTo(String value)
        {
            addCriterion("NOMB_JUZGA_SOLIC =", value, "NOMB_JUZGA_SOLIC");
            return this;
        }

        public Criteria andNOMB_JUZGA_SOLICNotEqualTo(String value)
        {
            addCriterion("NOMB_JUZGA_SOLIC <>", value, "NOMB_JUZGA_SOLIC");
            return this;
        }

        public Criteria andNOMB_JUZGA_SOLICGreaterThan(String value)
        {
            addCriterion("NOMB_JUZGA_SOLIC >", value, "NOMB_JUZGA_SOLIC");
            return this;
        }

        public Criteria andNOMB_JUZGA_SOLICGreaterThanOrEqualTo(String value)
        {
            addCriterion("NOMB_JUZGA_SOLIC >=", value, "NOMB_JUZGA_SOLIC");
            return this;
        }

        public Criteria andNOMB_JUZGA_SOLICLessThan(String value)
        {
            addCriterion("NOMB_JUZGA_SOLIC <", value, "NOMB_JUZGA_SOLIC");
            return this;
        }

        public Criteria andNOMB_JUZGA_SOLICLessThanOrEqualTo(String value)
        {
            addCriterion("NOMB_JUZGA_SOLIC <=", value, "NOMB_JUZGA_SOLIC");
            return this;
        }

        public Criteria andNOMB_JUZGA_SOLICLike(String value)
        {
            addCriterion("NOMB_JUZGA_SOLIC like", value, "NOMB_JUZGA_SOLIC");
            return this;
        }

        public Criteria andNOMB_JUZGA_SOLICNotLike(String value)
        {
            addCriterion("NOMB_JUZGA_SOLIC not like", value, "NOMB_JUZGA_SOLIC");
            return this;
        }

        public Criteria andNOMB_JUZGA_SOLICIn(List values)
        {
            addCriterion("NOMB_JUZGA_SOLIC in", values, "NOMB_JUZGA_SOLIC");
            return this;
        }

        public Criteria andNOMB_JUZGA_SOLICNotIn(List values)
        {
            addCriterion("NOMB_JUZGA_SOLIC not in", values, "NOMB_JUZGA_SOLIC");
            return this;
        }

        public Criteria andNOMB_JUZGA_SOLICBetween(String value1, String value2)
        {
            addCriterion("NOMB_JUZGA_SOLIC between", value1, value2, "NOMB_JUZGA_SOLIC");
            return this;
        }

        public Criteria andNOMB_JUZGA_SOLICNotBetween(String value1, String value2)
        {
            addCriterion("NOMB_JUZGA_SOLIC not between", value1, value2, "NOMB_JUZGA_SOLIC");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUME_EXPED_SOLICIsNull()
        {
            criteriaWithoutValue.add("NUME_EXPED_SOLIC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUME_EXPED_SOLICIsNotNull()
        {
            criteriaWithoutValue.add("NUME_EXPED_SOLIC is not null");
            return this;
        }

        public Criteria andNUME_EXPED_SOLICEqualTo(String value)
        {
            addCriterion("NUME_EXPED_SOLIC =", value, "NUME_EXPED_SOLIC");
            return this;
        }

        public Criteria andNUME_EXPED_SOLICNotEqualTo(String value)
        {
            addCriterion("NUME_EXPED_SOLIC <>", value, "NUME_EXPED_SOLIC");
            return this;
        }

        public Criteria andNUME_EXPED_SOLICGreaterThan(String value)
        {
            addCriterion("NUME_EXPED_SOLIC >", value, "NUME_EXPED_SOLIC");
            return this;
        }

        public Criteria andNUME_EXPED_SOLICGreaterThanOrEqualTo(String value)
        {
            addCriterion("NUME_EXPED_SOLIC >=", value, "NUME_EXPED_SOLIC");
            return this;
        }

        public Criteria andNUME_EXPED_SOLICLessThan(String value)
        {
            addCriterion("NUME_EXPED_SOLIC <", value, "NUME_EXPED_SOLIC");
            return this;
        }

        public Criteria andNUME_EXPED_SOLICLessThanOrEqualTo(String value)
        {
            addCriterion("NUME_EXPED_SOLIC <=", value, "NUME_EXPED_SOLIC");
            return this;
        }

        public Criteria andNUME_EXPED_SOLICLike(String value)
        {
            addCriterion("NUME_EXPED_SOLIC like", value, "NUME_EXPED_SOLIC");
            return this;
        }

        public Criteria andNUME_EXPED_SOLICNotLike(String value)
        {
            addCriterion("NUME_EXPED_SOLIC not like", value, "NUME_EXPED_SOLIC");
            return this;
        }

        public Criteria andNUME_EXPED_SOLICIn(List values)
        {
            addCriterion("NUME_EXPED_SOLIC in", values, "NUME_EXPED_SOLIC");
            return this;
        }

        public Criteria andNUME_EXPED_SOLICNotIn(List values)
        {
            addCriterion("NUME_EXPED_SOLIC not in", values, "NUME_EXPED_SOLIC");
            return this;
        }

        public Criteria andNUME_EXPED_SOLICBetween(String value1, String value2)
        {
            addCriterion("NUME_EXPED_SOLIC between", value1, value2, "NUME_EXPED_SOLIC");
            return this;
        }

        public Criteria andNUME_EXPED_SOLICNotBetween(String value1, String value2)
        {
            addCriterion("NUME_EXPED_SOLIC not between", value1, value2, "NUME_EXPED_SOLIC");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_NACIM_SOLICIsNull()
        {
            criteriaWithoutValue.add("FECH_NACIM_SOLIC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_NACIM_SOLICIsNotNull()
        {
            criteriaWithoutValue.add("FECH_NACIM_SOLIC is not null");
            return this;
        }

        public Criteria andFECH_NACIM_SOLICEqualTo(Date value)
        {
            addCriterion("FECH_NACIM_SOLIC =", value, "FECH_NACIM_SOLIC");
            return this;
        }

        public Criteria andFECH_NACIM_SOLICNotEqualTo(Date value)
        {
            addCriterion("FECH_NACIM_SOLIC <>", value, "FECH_NACIM_SOLIC");
            return this;
        }

        public Criteria andFECH_NACIM_SOLICGreaterThan(Date value)
        {
            addCriterion("FECH_NACIM_SOLIC >", value, "FECH_NACIM_SOLIC");
            return this;
        }

        public Criteria andFECH_NACIM_SOLICGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FECH_NACIM_SOLIC >=", value, "FECH_NACIM_SOLIC");
            return this;
        }

        public Criteria andFECH_NACIM_SOLICLessThan(Date value)
        {
            addCriterion("FECH_NACIM_SOLIC <", value, "FECH_NACIM_SOLIC");
            return this;
        }

        public Criteria andFECH_NACIM_SOLICLessThanOrEqualTo(Date value)
        {
            addCriterion("FECH_NACIM_SOLIC <=", value, "FECH_NACIM_SOLIC");
            return this;
        }

        public Criteria andFECH_NACIM_SOLICIn(List values)
        {
            addCriterion("FECH_NACIM_SOLIC in", values, "FECH_NACIM_SOLIC");
            return this;
        }

        public Criteria andFECH_NACIM_SOLICNotIn(List values)
        {
            addCriterion("FECH_NACIM_SOLIC not in", values, "FECH_NACIM_SOLIC");
            return this;
        }

        public Criteria andFECH_NACIM_SOLICBetween(Date value1, Date value2)
        {
            addCriterion("FECH_NACIM_SOLIC between", value1, value2, "FECH_NACIM_SOLIC");
            return this;
        }

        public Criteria andFECH_NACIM_SOLICNotBetween(Date value1, Date value2)
        {
            addCriterion("FECH_NACIM_SOLIC not between", value1, value2, "FECH_NACIM_SOLIC");
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
        public Criteria andN_VECESIsNull()
        {
            criteriaWithoutValue.add("N_VECES is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andN_VECESIsNotNull()
        {
            criteriaWithoutValue.add("N_VECES is not null");
            return this;
        }

        public Criteria andN_VECESEqualTo(Integer value)
        {
            addCriterion("N_VECES =", value, "N_VECES");
            return this;
        }

        public Criteria andN_VECESNotEqualTo(Integer value)
        {
            addCriterion("N_VECES <>", value, "N_VECES");
            return this;
        }

        public Criteria andN_VECESGreaterThan(Integer value)
        {
            addCriterion("N_VECES >", value, "N_VECES");
            return this;
        }

        public Criteria andN_VECESGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("N_VECES >=", value, "N_VECES");
            return this;
        }

        public Criteria andN_VECESLessThan(Integer value)
        {
            addCriterion("N_VECES <", value, "N_VECES");
            return this;
        }

        public Criteria andN_VECESLessThanOrEqualTo(Integer value)
        {
            addCriterion("N_VECES <=", value, "N_VECES");
            return this;
        }

        public Criteria andN_VECESIn(List values)
        {
            addCriterion("N_VECES in", values, "N_VECES");
            return this;
        }

        public Criteria andN_VECESNotIn(List values)
        {
            addCriterion("N_VECES not in", values, "N_VECES");
            return this;
        }

        public Criteria andN_VECESBetween(Integer value1, Integer value2)
        {
            addCriterion("N_VECES between", value1, value2, "N_VECES");
            return this;
        }

        public Criteria andN_VECESNotBetween(Integer value1, Integer value2)
        {
            addCriterion("N_VECES not between", value1, value2, "N_VECES");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andMARCAIsNull()
        {
            criteriaWithoutValue.add("MARCA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andMARCAIsNotNull()
        {
            criteriaWithoutValue.add("MARCA is not null");
            return this;
        }

        public Criteria andMARCAEqualTo(String value)
        {
            addCriterion("MARCA =", value, "MARCA");
            return this;
        }

        public Criteria andMARCANotEqualTo(String value)
        {
            addCriterion("MARCA <>", value, "MARCA");
            return this;
        }

        public Criteria andMARCAGreaterThan(String value)
        {
            addCriterion("MARCA >", value, "MARCA");
            return this;
        }

        public Criteria andMARCAGreaterThanOrEqualTo(String value)
        {
            addCriterion("MARCA >=", value, "MARCA");
            return this;
        }

        public Criteria andMARCALessThan(String value)
        {
            addCriterion("MARCA <", value, "MARCA");
            return this;
        }

        public Criteria andMARCALessThanOrEqualTo(String value)
        {
            addCriterion("MARCA <=", value, "MARCA");
            return this;
        }

        public Criteria andMARCALike(String value)
        {
            addCriterion("MARCA like", value, "MARCA");
            return this;
        }

        public Criteria andMARCANotLike(String value)
        {
            addCriterion("MARCA not like", value, "MARCA");
            return this;
        }

        public Criteria andMARCAIn(List values)
        {
            addCriterion("MARCA in", values, "MARCA");
            return this;
        }

        public Criteria andMARCANotIn(List values)
        {
            addCriterion("MARCA not in", values, "MARCA");
            return this;
        }

        public Criteria andMARCABetween(String value1, String value2)
        {
            addCriterion("MARCA between", value1, value2, "MARCA");
            return this;
        }

        public Criteria andMARCANotBetween(String value1, String value2)
        {
            addCriterion("MARCA not between", value1, value2, "MARCA");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_JUZGA_SOLICIsNull()
        {
            criteriaWithoutValue.add("DESC_JUZGA_SOLIC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_JUZGA_SOLICIsNotNull()
        {
            criteriaWithoutValue.add("DESC_JUZGA_SOLIC is not null");
            return this;
        }

        public Criteria andDESC_JUZGA_SOLICEqualTo(String value)
        {
            addCriterion("DESC_JUZGA_SOLIC =", value, "DESC_JUZGA_SOLIC");
            return this;
        }

        public Criteria andDESC_JUZGA_SOLICNotEqualTo(String value)
        {
            addCriterion("DESC_JUZGA_SOLIC <>", value, "DESC_JUZGA_SOLIC");
            return this;
        }

        public Criteria andDESC_JUZGA_SOLICGreaterThan(String value)
        {
            addCriterion("DESC_JUZGA_SOLIC >", value, "DESC_JUZGA_SOLIC");
            return this;
        }

        public Criteria andDESC_JUZGA_SOLICGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_JUZGA_SOLIC >=", value, "DESC_JUZGA_SOLIC");
            return this;
        }

        public Criteria andDESC_JUZGA_SOLICLessThan(String value)
        {
            addCriterion("DESC_JUZGA_SOLIC <", value, "DESC_JUZGA_SOLIC");
            return this;
        }

        public Criteria andDESC_JUZGA_SOLICLessThanOrEqualTo(String value)
        {
            addCriterion("DESC_JUZGA_SOLIC <=", value, "DESC_JUZGA_SOLIC");
            return this;
        }

        public Criteria andDESC_JUZGA_SOLICLike(String value)
        {
            addCriterion("DESC_JUZGA_SOLIC like", value, "DESC_JUZGA_SOLIC");
            return this;
        }

        public Criteria andDESC_JUZGA_SOLICNotLike(String value)
        {
            addCriterion("DESC_JUZGA_SOLIC not like", value, "DESC_JUZGA_SOLIC");
            return this;
        }

        public Criteria andDESC_JUZGA_SOLICIn(List values)
        {
            addCriterion("DESC_JUZGA_SOLIC in", values, "DESC_JUZGA_SOLIC");
            return this;
        }

        public Criteria andDESC_JUZGA_SOLICNotIn(List values)
        {
            addCriterion("DESC_JUZGA_SOLIC not in", values, "DESC_JUZGA_SOLIC");
            return this;
        }

        public Criteria andDESC_JUZGA_SOLICBetween(String value1, String value2)
        {
            addCriterion("DESC_JUZGA_SOLIC between", value1, value2, "DESC_JUZGA_SOLIC");
            return this;
        }

        public Criteria andDESC_JUZGA_SOLICNotBetween(String value1, String value2)
        {
            addCriterion("DESC_JUZGA_SOLIC not between", value1, value2, "DESC_JUZGA_SOLIC");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_DIGIT_SOLICIsNull()
        {
            criteriaWithoutValue.add("FECH_DIGIT_SOLIC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_DIGIT_SOLICIsNotNull()
        {
            criteriaWithoutValue.add("FECH_DIGIT_SOLIC is not null");
            return this;
        }

        public Criteria andFECH_DIGIT_SOLICEqualTo(Date value)
        {
            addCriterion("FECH_DIGIT_SOLIC =", value, "FECH_DIGIT_SOLIC");
            return this;
        }

        public Criteria andFECH_DIGIT_SOLICNotEqualTo(Date value)
        {
            addCriterion("FECH_DIGIT_SOLIC <>", value, "FECH_DIGIT_SOLIC");
            return this;
        }

        public Criteria andFECH_DIGIT_SOLICGreaterThan(Date value)
        {
            addCriterion("FECH_DIGIT_SOLIC >", value, "FECH_DIGIT_SOLIC");
            return this;
        }

        public Criteria andFECH_DIGIT_SOLICGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FECH_DIGIT_SOLIC >=", value, "FECH_DIGIT_SOLIC");
            return this;
        }

        public Criteria andFECH_DIGIT_SOLICLessThan(Date value)
        {
            addCriterion("FECH_DIGIT_SOLIC <", value, "FECH_DIGIT_SOLIC");
            return this;
        }

        public Criteria andFECH_DIGIT_SOLICLessThanOrEqualTo(Date value)
        {
            addCriterion("FECH_DIGIT_SOLIC <=", value, "FECH_DIGIT_SOLIC");
            return this;
        }

        public Criteria andFECH_DIGIT_SOLICIn(List values)
        {
            addCriterion("FECH_DIGIT_SOLIC in", values, "FECH_DIGIT_SOLIC");
            return this;
        }

        public Criteria andFECH_DIGIT_SOLICNotIn(List values)
        {
            addCriterion("FECH_DIGIT_SOLIC not in", values, "FECH_DIGIT_SOLIC");
            return this;
        }

        public Criteria andFECH_DIGIT_SOLICBetween(Date value1, Date value2)
        {
            addCriterion("FECH_DIGIT_SOLIC between", value1, value2, "FECH_DIGIT_SOLIC");
            return this;
        }

        public Criteria andFECH_DIGIT_SOLICNotBetween(Date value1, Date value2)
        {
            addCriterion("FECH_DIGIT_SOLIC not between", value1, value2, "FECH_DIGIT_SOLIC");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_PROCE_SOLICIsNull()
        {
            criteriaWithoutValue.add("INDC_PROCE_SOLIC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_PROCE_SOLICIsNotNull()
        {
            criteriaWithoutValue.add("INDC_PROCE_SOLIC is not null");
            return this;
        }

        public Criteria andINDC_PROCE_SOLICEqualTo(String value)
        {
            addCriterion("INDC_PROCE_SOLIC =", value, "INDC_PROCE_SOLIC");
            return this;
        }

        public Criteria andINDC_PROCE_SOLICNotEqualTo(String value)
        {
            addCriterion("INDC_PROCE_SOLIC <>", value, "INDC_PROCE_SOLIC");
            return this;
        }

        public Criteria andINDC_PROCE_SOLICGreaterThan(String value)
        {
            addCriterion("INDC_PROCE_SOLIC >", value, "INDC_PROCE_SOLIC");
            return this;
        }

        public Criteria andINDC_PROCE_SOLICGreaterThanOrEqualTo(String value)
        {
            addCriterion("INDC_PROCE_SOLIC >=", value, "INDC_PROCE_SOLIC");
            return this;
        }

        public Criteria andINDC_PROCE_SOLICLessThan(String value)
        {
            addCriterion("INDC_PROCE_SOLIC <", value, "INDC_PROCE_SOLIC");
            return this;
        }

        public Criteria andINDC_PROCE_SOLICLessThanOrEqualTo(String value)
        {
            addCriterion("INDC_PROCE_SOLIC <=", value, "INDC_PROCE_SOLIC");
            return this;
        }

        public Criteria andINDC_PROCE_SOLICLike(String value)
        {
            addCriterion("INDC_PROCE_SOLIC like", value, "INDC_PROCE_SOLIC");
            return this;
        }

        public Criteria andINDC_PROCE_SOLICNotLike(String value)
        {
            addCriterion("INDC_PROCE_SOLIC not like", value, "INDC_PROCE_SOLIC");
            return this;
        }

        public Criteria andINDC_PROCE_SOLICIn(List values)
        {
            addCriterion("INDC_PROCE_SOLIC in", values, "INDC_PROCE_SOLIC");
            return this;
        }

        public Criteria andINDC_PROCE_SOLICNotIn(List values)
        {
            addCriterion("INDC_PROCE_SOLIC not in", values, "INDC_PROCE_SOLIC");
            return this;
        }

        public Criteria andINDC_PROCE_SOLICBetween(String value1, String value2)
        {
            addCriterion("INDC_PROCE_SOLIC between", value1, value2, "INDC_PROCE_SOLIC");
            return this;
        }

        public Criteria andINDC_PROCE_SOLICNotBetween(String value1, String value2)
        {
            addCriterion("INDC_PROCE_SOLIC not between", value1, value2, "INDC_PROCE_SOLIC");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andV_DES_OFICIOxIsNull()
        {
            criteriaWithoutValue.add("V_DES_OFICIOx is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andV_DES_OFICIOxIsNotNull()
        {
            criteriaWithoutValue.add("V_DES_OFICIOx is not null");
            return this;
        }

        public Criteria andV_DES_OFICIOxEqualTo(String value)
        {
            addCriterion("V_DES_OFICIOx =", value, "V_DES_OFICIOx");
            return this;
        }

        public Criteria andV_DES_OFICIOxNotEqualTo(String value)
        {
            addCriterion("V_DES_OFICIOx <>", value, "V_DES_OFICIOx");
            return this;
        }

        public Criteria andV_DES_OFICIOxGreaterThan(String value)
        {
            addCriterion("V_DES_OFICIOx >", value, "V_DES_OFICIOx");
            return this;
        }

        public Criteria andV_DES_OFICIOxGreaterThanOrEqualTo(String value)
        {
            addCriterion("V_DES_OFICIOx >=", value, "V_DES_OFICIOx");
            return this;
        }

        public Criteria andV_DES_OFICIOxLessThan(String value)
        {
            addCriterion("V_DES_OFICIOx <", value, "V_DES_OFICIOx");
            return this;
        }

        public Criteria andV_DES_OFICIOxLessThanOrEqualTo(String value)
        {
            addCriterion("V_DES_OFICIOx <=", value, "V_DES_OFICIOx");
            return this;
        }

        public Criteria andV_DES_OFICIOxLike(String value)
        {
            addCriterion("V_DES_OFICIOx like", value, "V_DES_OFICIOx");
            return this;
        }

        public Criteria andV_DES_OFICIOxNotLike(String value)
        {
            addCriterion("V_DES_OFICIOx not like", value, "V_DES_OFICIOx");
            return this;
        }

        public Criteria andV_DES_OFICIOxIn(List values)
        {
            addCriterion("V_DES_OFICIOx in", values, "V_DES_OFICIOx");
            return this;
        }

        public Criteria andV_DES_OFICIOxNotIn(List values)
        {
            addCriterion("V_DES_OFICIOx not in", values, "V_DES_OFICIOx");
            return this;
        }

        public Criteria andV_DES_OFICIOxBetween(String value1, String value2)
        {
            addCriterion("V_DES_OFICIOx between", value1, value2, "V_DES_OFICIOx");
            return this;
        }

        public Criteria andV_DES_OFICIOxNotBetween(String value1, String value2)
        {
            addCriterion("V_DES_OFICIOx not between", value1, value2, "V_DES_OFICIOx");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andV_DES_DISTRITOxIsNull()
        {
            criteriaWithoutValue.add("V_DES_DISTRITOx is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andV_DES_DISTRITOxIsNotNull()
        {
            criteriaWithoutValue.add("V_DES_DISTRITOx is not null");
            return this;
        }

        public Criteria andV_DES_DISTRITOxEqualTo(String value)
        {
            addCriterion("V_DES_DISTRITOx =", value, "V_DES_DISTRITOx");
            return this;
        }

        public Criteria andV_DES_DISTRITOxNotEqualTo(String value)
        {
            addCriterion("V_DES_DISTRITOx <>", value, "V_DES_DISTRITOx");
            return this;
        }

        public Criteria andV_DES_DISTRITOxGreaterThan(String value)
        {
            addCriterion("V_DES_DISTRITOx >", value, "V_DES_DISTRITOx");
            return this;
        }

        public Criteria andV_DES_DISTRITOxGreaterThanOrEqualTo(String value)
        {
            addCriterion("V_DES_DISTRITOx >=", value, "V_DES_DISTRITOx");
            return this;
        }

        public Criteria andV_DES_DISTRITOxLessThan(String value)
        {
            addCriterion("V_DES_DISTRITOx <", value, "V_DES_DISTRITOx");
            return this;
        }

        public Criteria andV_DES_DISTRITOxLessThanOrEqualTo(String value)
        {
            addCriterion("V_DES_DISTRITOx <=", value, "V_DES_DISTRITOx");
            return this;
        }

        public Criteria andV_DES_DISTRITOxLike(String value)
        {
            addCriterion("V_DES_DISTRITOx like", value, "V_DES_DISTRITOx");
            return this;
        }

        public Criteria andV_DES_DISTRITOxNotLike(String value)
        {
            addCriterion("V_DES_DISTRITOx not like", value, "V_DES_DISTRITOx");
            return this;
        }

        public Criteria andV_DES_DISTRITOxIn(List values)
        {
            addCriterion("V_DES_DISTRITOx in", values, "V_DES_DISTRITOx");
            return this;
        }

        public Criteria andV_DES_DISTRITOxNotIn(List values)
        {
            addCriterion("V_DES_DISTRITOx not in", values, "V_DES_DISTRITOx");
            return this;
        }

        public Criteria andV_DES_DISTRITOxBetween(String value1, String value2)
        {
            addCriterion("V_DES_DISTRITOx between", value1, value2, "V_DES_DISTRITOx");
            return this;
        }

        public Criteria andV_DES_DISTRITOxNotBetween(String value1, String value2)
        {
            addCriterion("V_DES_DISTRITOx not between", value1, value2, "V_DES_DISTRITOx");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_TASAIsNull()
        {
            criteriaWithoutValue.add("DESC_TASA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_TASAIsNotNull()
        {
            criteriaWithoutValue.add("DESC_TASA is not null");
            return this;
        }

        public Criteria andDESC_TASAEqualTo(String value)
        {
            addCriterion("DESC_TASA =", value, "DESC_TASA");
            return this;
        }

        public Criteria andDESC_TASANotEqualTo(String value)
        {
            addCriterion("DESC_TASA <>", value, "DESC_TASA");
            return this;
        }

        public Criteria andDESC_TASAGreaterThan(String value)
        {
            addCriterion("DESC_TASA >", value, "DESC_TASA");
            return this;
        }

        public Criteria andDESC_TASAGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_TASA >=", value, "DESC_TASA");
            return this;
        }

        public Criteria andDESC_TASALessThan(String value)
        {
            addCriterion("DESC_TASA <", value, "DESC_TASA");
            return this;
        }

        public Criteria andDESC_TASALessThanOrEqualTo(String value)
        {
            addCriterion("DESC_TASA <=", value, "DESC_TASA");
            return this;
        }

        public Criteria andDESC_TASALike(String value)
        {
            addCriterion("DESC_TASA like", value, "DESC_TASA");
            return this;
        }

        public Criteria andDESC_TASANotLike(String value)
        {
            addCriterion("DESC_TASA not like", value, "DESC_TASA");
            return this;
        }

        public Criteria andDESC_TASAIn(List values)
        {
            addCriterion("DESC_TASA in", values, "DESC_TASA");
            return this;
        }

        public Criteria andDESC_TASANotIn(List values)
        {
            addCriterion("DESC_TASA not in", values, "DESC_TASA");
            return this;
        }

        public Criteria andDESC_TASABetween(String value1, String value2)
        {
            addCriterion("DESC_TASA between", value1, value2, "DESC_TASA");
            return this;
        }

        public Criteria andDESC_TASANotBetween(String value1, String value2)
        {
            addCriterion("DESC_TASA not between", value1, value2, "DESC_TASA");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_USU_FOTOIsNull()
        {
            criteriaWithoutValue.add("CODG_USU_FOTO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_USU_FOTOIsNotNull()
        {
            criteriaWithoutValue.add("CODG_USU_FOTO is not null");
            return this;
        }

        public Criteria andCODG_USU_FOTOEqualTo(String value)
        {
            addCriterion("CODG_USU_FOTO =", value, "CODG_USU_FOTO");
            return this;
        }

        public Criteria andCODG_USU_FOTONotEqualTo(String value)
        {
            addCriterion("CODG_USU_FOTO <>", value, "CODG_USU_FOTO");
            return this;
        }

        public Criteria andCODG_USU_FOTOGreaterThan(String value)
        {
            addCriterion("CODG_USU_FOTO >", value, "CODG_USU_FOTO");
            return this;
        }

        public Criteria andCODG_USU_FOTOGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_USU_FOTO >=", value, "CODG_USU_FOTO");
            return this;
        }

        public Criteria andCODG_USU_FOTOLessThan(String value)
        {
            addCriterion("CODG_USU_FOTO <", value, "CODG_USU_FOTO");
            return this;
        }

        public Criteria andCODG_USU_FOTOLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_USU_FOTO <=", value, "CODG_USU_FOTO");
            return this;
        }

        public Criteria andCODG_USU_FOTOLike(String value)
        {
            addCriterion("CODG_USU_FOTO like", value, "CODG_USU_FOTO");
            return this;
        }

        public Criteria andCODG_USU_FOTONotLike(String value)
        {
            addCriterion("CODG_USU_FOTO not like", value, "CODG_USU_FOTO");
            return this;
        }

        public Criteria andCODG_USU_FOTOIn(List values)
        {
            addCriterion("CODG_USU_FOTO in", values, "CODG_USU_FOTO");
            return this;
        }

        public Criteria andCODG_USU_FOTONotIn(List values)
        {
            addCriterion("CODG_USU_FOTO not in", values, "CODG_USU_FOTO");
            return this;
        }

        public Criteria andCODG_USU_FOTOBetween(String value1, String value2)
        {
            addCriterion("CODG_USU_FOTO between", value1, value2, "CODG_USU_FOTO");
            return this;
        }

        public Criteria andCODG_USU_FOTONotBetween(String value1, String value2)
        {
            addCriterion("CODG_USU_FOTO not between", value1, value2, "CODG_USU_FOTO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_FOTOIsNull()
        {
            criteriaWithoutValue.add("FECH_FOTO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_FOTOIsNotNull()
        {
            criteriaWithoutValue.add("FECH_FOTO is not null");
            return this;
        }

        public Criteria andFECH_FOTOEqualTo(Date value)
        {
            addCriterion("FECH_FOTO =", value, "FECH_FOTO");
            return this;
        }

        public Criteria andFECH_FOTONotEqualTo(Date value)
        {
            addCriterion("FECH_FOTO <>", value, "FECH_FOTO");
            return this;
        }

        public Criteria andFECH_FOTOGreaterThan(Date value)
        {
            addCriterion("FECH_FOTO >", value, "FECH_FOTO");
            return this;
        }

        public Criteria andFECH_FOTOGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FECH_FOTO >=", value, "FECH_FOTO");
            return this;
        }

        public Criteria andFECH_FOTOLessThan(Date value)
        {
            addCriterion("FECH_FOTO <", value, "FECH_FOTO");
            return this;
        }

        public Criteria andFECH_FOTOLessThanOrEqualTo(Date value)
        {
            addCriterion("FECH_FOTO <=", value, "FECH_FOTO");
            return this;
        }

        public Criteria andFECH_FOTOIn(List values)
        {
            addCriterion("FECH_FOTO in", values, "FECH_FOTO");
            return this;
        }

        public Criteria andFECH_FOTONotIn(List values)
        {
            addCriterion("FECH_FOTO not in", values, "FECH_FOTO");
            return this;
        }

        public Criteria andFECH_FOTOBetween(Date value1, Date value2)
        {
            addCriterion("FECH_FOTO between", value1, value2, "FECH_FOTO");
            return this;
        }

        public Criteria andFECH_FOTONotBetween(Date value1, Date value2)
        {
            addCriterion("FECH_FOTO not between", value1, value2, "FECH_FOTO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andRUTA_FOTOIsNull()
        {
            criteriaWithoutValue.add("RUTA_FOTO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andRUTA_FOTOIsNotNull()
        {
            criteriaWithoutValue.add("RUTA_FOTO is not null");
            return this;
        }

        public Criteria andRUTA_FOTOEqualTo(String value)
        {
            addCriterion("RUTA_FOTO =", value, "RUTA_FOTO");
            return this;
        }

        public Criteria andRUTA_FOTONotEqualTo(String value)
        {
            addCriterion("RUTA_FOTO <>", value, "RUTA_FOTO");
            return this;
        }

        public Criteria andRUTA_FOTOGreaterThan(String value)
        {
            addCriterion("RUTA_FOTO >", value, "RUTA_FOTO");
            return this;
        }

        public Criteria andRUTA_FOTOGreaterThanOrEqualTo(String value)
        {
            addCriterion("RUTA_FOTO >=", value, "RUTA_FOTO");
            return this;
        }

        public Criteria andRUTA_FOTOLessThan(String value)
        {
            addCriterion("RUTA_FOTO <", value, "RUTA_FOTO");
            return this;
        }

        public Criteria andRUTA_FOTOLessThanOrEqualTo(String value)
        {
            addCriterion("RUTA_FOTO <=", value, "RUTA_FOTO");
            return this;
        }

        public Criteria andRUTA_FOTOLike(String value)
        {
            addCriterion("RUTA_FOTO like", value, "RUTA_FOTO");
            return this;
        }

        public Criteria andRUTA_FOTONotLike(String value)
        {
            addCriterion("RUTA_FOTO not like", value, "RUTA_FOTO");
            return this;
        }

        public Criteria andRUTA_FOTOIn(List values)
        {
            addCriterion("RUTA_FOTO in", values, "RUTA_FOTO");
            return this;
        }

        public Criteria andRUTA_FOTONotIn(List values)
        {
            addCriterion("RUTA_FOTO not in", values, "RUTA_FOTO");
            return this;
        }

        public Criteria andRUTA_FOTOBetween(String value1, String value2)
        {
            addCriterion("RUTA_FOTO between", value1, value2, "RUTA_FOTO");
            return this;
        }

        public Criteria andRUTA_FOTONotBetween(String value1, String value2)
        {
            addCriterion("RUTA_FOTO not between", value1, value2, "RUTA_FOTO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_ESTADO_FOTOIsNull()
        {
            criteriaWithoutValue.add("CODG_ESTADO_FOTO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_ESTADO_FOTOIsNotNull()
        {
            criteriaWithoutValue.add("CODG_ESTADO_FOTO is not null");
            return this;
        }

        public Criteria andCODG_ESTADO_FOTOEqualTo(String value)
        {
            addCriterion("CODG_ESTADO_FOTO =", value, "CODG_ESTADO_FOTO");
            return this;
        }

        public Criteria andCODG_ESTADO_FOTONotEqualTo(String value)
        {
            addCriterion("CODG_ESTADO_FOTO <>", value, "CODG_ESTADO_FOTO");
            return this;
        }

        public Criteria andCODG_ESTADO_FOTOGreaterThan(String value)
        {
            addCriterion("CODG_ESTADO_FOTO >", value, "CODG_ESTADO_FOTO");
            return this;
        }

        public Criteria andCODG_ESTADO_FOTOGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_ESTADO_FOTO >=", value, "CODG_ESTADO_FOTO");
            return this;
        }

        public Criteria andCODG_ESTADO_FOTOLessThan(String value)
        {
            addCriterion("CODG_ESTADO_FOTO <", value, "CODG_ESTADO_FOTO");
            return this;
        }

        public Criteria andCODG_ESTADO_FOTOLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_ESTADO_FOTO <=", value, "CODG_ESTADO_FOTO");
            return this;
        }

        public Criteria andCODG_ESTADO_FOTOLike(String value)
        {
            addCriterion("CODG_ESTADO_FOTO like", value, "CODG_ESTADO_FOTO");
            return this;
        }

        public Criteria andCODG_ESTADO_FOTONotLike(String value)
        {
            addCriterion("CODG_ESTADO_FOTO not like", value, "CODG_ESTADO_FOTO");
            return this;
        }

        public Criteria andCODG_ESTADO_FOTOIn(List values)
        {
            addCriterion("CODG_ESTADO_FOTO in", values, "CODG_ESTADO_FOTO");
            return this;
        }

        public Criteria andCODG_ESTADO_FOTONotIn(List values)
        {
            addCriterion("CODG_ESTADO_FOTO not in", values, "CODG_ESTADO_FOTO");
            return this;
        }

        public Criteria andCODG_ESTADO_FOTOBetween(String value1, String value2)
        {
            addCriterion("CODG_ESTADO_FOTO between", value1, value2, "CODG_ESTADO_FOTO");
            return this;
        }

        public Criteria andCODG_ESTADO_FOTONotBetween(String value1, String value2)
        {
            addCriterion("CODG_ESTADO_FOTO not between", value1, value2, "CODG_ESTADO_FOTO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_TIPO_ORIGENIsNull()
        {
            criteriaWithoutValue.add("CODG_TIPO_ORIGEN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_TIPO_ORIGENIsNotNull()
        {
            criteriaWithoutValue.add("CODG_TIPO_ORIGEN is not null");
            return this;
        }

        public Criteria andCODG_TIPO_ORIGENEqualTo(String value)
        {
            addCriterion("CODG_TIPO_ORIGEN =", value, "CODG_TIPO_ORIGEN");
            return this;
        }

        public Criteria andCODG_TIPO_ORIGENNotEqualTo(String value)
        {
            addCriterion("CODG_TIPO_ORIGEN <>", value, "CODG_TIPO_ORIGEN");
            return this;
        }

        public Criteria andCODG_TIPO_ORIGENGreaterThan(String value)
        {
            addCriterion("CODG_TIPO_ORIGEN >", value, "CODG_TIPO_ORIGEN");
            return this;
        }

        public Criteria andCODG_TIPO_ORIGENGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_TIPO_ORIGEN >=", value, "CODG_TIPO_ORIGEN");
            return this;
        }

        public Criteria andCODG_TIPO_ORIGENLessThan(String value)
        {
            addCriterion("CODG_TIPO_ORIGEN <", value, "CODG_TIPO_ORIGEN");
            return this;
        }

        public Criteria andCODG_TIPO_ORIGENLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_TIPO_ORIGEN <=", value, "CODG_TIPO_ORIGEN");
            return this;
        }

        public Criteria andCODG_TIPO_ORIGENLike(String value)
        {
            addCriterion("CODG_TIPO_ORIGEN like", value, "CODG_TIPO_ORIGEN");
            return this;
        }

        public Criteria andCODG_TIPO_ORIGENNotLike(String value)
        {
            addCriterion("CODG_TIPO_ORIGEN not like", value, "CODG_TIPO_ORIGEN");
            return this;
        }

        public Criteria andCODG_TIPO_ORIGENIn(List values)
        {
            addCriterion("CODG_TIPO_ORIGEN in", values, "CODG_TIPO_ORIGEN");
            return this;
        }

        public Criteria andCODG_TIPO_ORIGENNotIn(List values)
        {
            addCriterion("CODG_TIPO_ORIGEN not in", values, "CODG_TIPO_ORIGEN");
            return this;
        }

        public Criteria andCODG_TIPO_ORIGENBetween(String value1, String value2)
        {
            addCriterion("CODG_TIPO_ORIGEN between", value1, value2, "CODG_TIPO_ORIGEN");
            return this;
        }

        public Criteria andCODG_TIPO_ORIGENNotBetween(String value1, String value2)
        {
            addCriterion("CODG_TIPO_ORIGEN not between", value1, value2, "CODG_TIPO_ORIGEN");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andOBSERVACIONIsNull()
        {
            criteriaWithoutValue.add("OBSERVACION is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andOBSERVACIONIsNotNull()
        {
            criteriaWithoutValue.add("OBSERVACION is not null");
            return this;
        }

        public Criteria andOBSERVACIONEqualTo(String value)
        {
            addCriterion("OBSERVACION =", value, "OBSERVACION");
            return this;
        }

        public Criteria andOBSERVACIONNotEqualTo(String value)
        {
            addCriterion("OBSERVACION <>", value, "OBSERVACION");
            return this;
        }

        public Criteria andOBSERVACIONGreaterThan(String value)
        {
            addCriterion("OBSERVACION >", value, "OBSERVACION");
            return this;
        }

        public Criteria andOBSERVACIONGreaterThanOrEqualTo(String value)
        {
            addCriterion("OBSERVACION >=", value, "OBSERVACION");
            return this;
        }

        public Criteria andOBSERVACIONLessThan(String value)
        {
            addCriterion("OBSERVACION <", value, "OBSERVACION");
            return this;
        }

        public Criteria andOBSERVACIONLessThanOrEqualTo(String value)
        {
            addCriterion("OBSERVACION <=", value, "OBSERVACION");
            return this;
        }

        public Criteria andOBSERVACIONLike(String value)
        {
            addCriterion("OBSERVACION like", value, "OBSERVACION");
            return this;
        }

        public Criteria andOBSERVACIONNotLike(String value)
        {
            addCriterion("OBSERVACION not like", value, "OBSERVACION");
            return this;
        }

        public Criteria andOBSERVACIONIn(List values)
        {
            addCriterion("OBSERVACION in", values, "OBSERVACION");
            return this;
        }

        public Criteria andOBSERVACIONNotIn(List values)
        {
            addCriterion("OBSERVACION not in", values, "OBSERVACION");
            return this;
        }

        public Criteria andOBSERVACIONBetween(String value1, String value2)
        {
            addCriterion("OBSERVACION between", value1, value2, "OBSERVACION");
            return this;
        }

        public Criteria andOBSERVACIONNotBetween(String value1, String value2)
        {
            addCriterion("OBSERVACION not between", value1, value2, "OBSERVACION");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_ESTADO_SOLICITUDIsNull()
        {
            criteriaWithoutValue.add("CODG_ESTADO_SOLICITUD is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_ESTADO_SOLICITUDIsNotNull()
        {
            criteriaWithoutValue.add("CODG_ESTADO_SOLICITUD is not null");
            return this;
        }

        public Criteria andCODG_ESTADO_SOLICITUDEqualTo(String value)
        {
            addCriterion("CODG_ESTADO_SOLICITUD =", value, "CODG_ESTADO_SOLICITUD");
            return this;
        }

        public Criteria andCODG_ESTADO_SOLICITUDNotEqualTo(String value)
        {
            addCriterion("CODG_ESTADO_SOLICITUD <>", value, "CODG_ESTADO_SOLICITUD");
            return this;
        }

        public Criteria andCODG_ESTADO_SOLICITUDGreaterThan(String value)
        {
            addCriterion("CODG_ESTADO_SOLICITUD >", value, "CODG_ESTADO_SOLICITUD");
            return this;
        }

        public Criteria andCODG_ESTADO_SOLICITUDGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_ESTADO_SOLICITUD >=", value, "CODG_ESTADO_SOLICITUD");
            return this;
        }

        public Criteria andCODG_ESTADO_SOLICITUDLessThan(String value)
        {
            addCriterion("CODG_ESTADO_SOLICITUD <", value, "CODG_ESTADO_SOLICITUD");
            return this;
        }

        public Criteria andCODG_ESTADO_SOLICITUDLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_ESTADO_SOLICITUD <=", value, "CODG_ESTADO_SOLICITUD");
            return this;
        }

        public Criteria andCODG_ESTADO_SOLICITUDLike(String value)
        {
            addCriterion("CODG_ESTADO_SOLICITUD like", value, "CODG_ESTADO_SOLICITUD");
            return this;
        }

        public Criteria andCODG_ESTADO_SOLICITUDNotLike(String value)
        {
            addCriterion("CODG_ESTADO_SOLICITUD not like", value, "CODG_ESTADO_SOLICITUD");
            return this;
        }

        public Criteria andCODG_ESTADO_SOLICITUDIn(List values)
        {
            addCriterion("CODG_ESTADO_SOLICITUD in", values, "CODG_ESTADO_SOLICITUD");
            return this;
        }

        public Criteria andCODG_ESTADO_SOLICITUDNotIn(List values)
        {
            addCriterion("CODG_ESTADO_SOLICITUD not in", values, "CODG_ESTADO_SOLICITUD");
            return this;
        }

        public Criteria andCODG_ESTADO_SOLICITUDBetween(String value1, String value2)
        {
            addCriterion("CODG_ESTADO_SOLICITUD between", value1, value2, "CODG_ESTADO_SOLICITUD");
            return this;
        }

        public Criteria andCODG_ESTADO_SOLICITUDNotBetween(String value1, String value2)
        {
            addCriterion("CODG_ESTADO_SOLICITUD not between", value1, value2, "CODG_ESTADO_SOLICITUD");
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
        public Criteria andNOM_PADREIsNull()
        {
            criteriaWithoutValue.add("NOM_PADRE is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNOM_PADREIsNotNull()
        {
            criteriaWithoutValue.add("NOM_PADRE is not null");
            return this;
        }

        public Criteria andNOM_PADREEqualTo(String value)
        {
            addCriterion("NOM_PADRE =", value, "NOM_PADRE");
            return this;
        }

        public Criteria andNOM_PADRENotEqualTo(String value)
        {
            addCriterion("NOM_PADRE <>", value, "NOM_PADRE");
            return this;
        }

        public Criteria andNOM_PADREGreaterThan(String value)
        {
            addCriterion("NOM_PADRE >", value, "NOM_PADRE");
            return this;
        }

        public Criteria andNOM_PADREGreaterThanOrEqualTo(String value)
        {
            addCriterion("NOM_PADRE >=", value, "NOM_PADRE");
            return this;
        }

        public Criteria andNOM_PADRELessThan(String value)
        {
            addCriterion("NOM_PADRE <", value, "NOM_PADRE");
            return this;
        }

        public Criteria andNOM_PADRELessThanOrEqualTo(String value)
        {
            addCriterion("NOM_PADRE <=", value, "NOM_PADRE");
            return this;
        }

        public Criteria andNOM_PADRELike(String value)
        {
            addCriterion("NOM_PADRE like", value, "NOM_PADRE");
            return this;
        }

        public Criteria andNOM_PADRENotLike(String value)
        {
            addCriterion("NOM_PADRE not like", value, "NOM_PADRE");
            return this;
        }

        public Criteria andNOM_PADREIn(List values)
        {
            addCriterion("NOM_PADRE in", values, "NOM_PADRE");
            return this;
        }

        public Criteria andNOM_PADRENotIn(List values)
        {
            addCriterion("NOM_PADRE not in", values, "NOM_PADRE");
            return this;
        }

        public Criteria andNOM_PADREBetween(String value1, String value2)
        {
            addCriterion("NOM_PADRE between", value1, value2, "NOM_PADRE");
            return this;
        }

        public Criteria andNOM_PADRENotBetween(String value1, String value2)
        {
            addCriterion("NOM_PADRE not between", value1, value2, "NOM_PADRE");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNOM_MADREIsNull()
        {
            criteriaWithoutValue.add("NOM_MADRE is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNOM_MADREIsNotNull()
        {
            criteriaWithoutValue.add("NOM_MADRE is not null");
            return this;
        }

        public Criteria andNOM_MADREEqualTo(String value)
        {
            addCriterion("NOM_MADRE =", value, "NOM_MADRE");
            return this;
        }

        public Criteria andNOM_MADRENotEqualTo(String value)
        {
            addCriterion("NOM_MADRE <>", value, "NOM_MADRE");
            return this;
        }

        public Criteria andNOM_MADREGreaterThan(String value)
        {
            addCriterion("NOM_MADRE >", value, "NOM_MADRE");
            return this;
        }

        public Criteria andNOM_MADREGreaterThanOrEqualTo(String value)
        {
            addCriterion("NOM_MADRE >=", value, "NOM_MADRE");
            return this;
        }

        public Criteria andNOM_MADRELessThan(String value)
        {
            addCriterion("NOM_MADRE <", value, "NOM_MADRE");
            return this;
        }

        public Criteria andNOM_MADRELessThanOrEqualTo(String value)
        {
            addCriterion("NOM_MADRE <=", value, "NOM_MADRE");
            return this;
        }

        public Criteria andNOM_MADRELike(String value)
        {
            addCriterion("NOM_MADRE like", value, "NOM_MADRE");
            return this;
        }

        public Criteria andNOM_MADRENotLike(String value)
        {
            addCriterion("NOM_MADRE not like", value, "NOM_MADRE");
            return this;
        }

        public Criteria andNOM_MADREIn(List values)
        {
            addCriterion("NOM_MADRE in", values, "NOM_MADRE");
            return this;
        }

        public Criteria andNOM_MADRENotIn(List values)
        {
            addCriterion("NOM_MADRE not in", values, "NOM_MADRE");
            return this;
        }

        public Criteria andNOM_MADREBetween(String value1, String value2)
        {
            addCriterion("NOM_MADRE between", value1, value2, "NOM_MADRE");
            return this;
        }

        public Criteria andNOM_MADRENotBetween(String value1, String value2)
        {
            addCriterion("NOM_MADRE not between", value1, value2, "NOM_MADRE");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNOM_APODERADOIsNull()
        {
            criteriaWithoutValue.add("NOM_APODERADO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNOM_APODERADOIsNotNull()
        {
            criteriaWithoutValue.add("NOM_APODERADO is not null");
            return this;
        }

        public Criteria andNOM_APODERADOEqualTo(String value)
        {
            addCriterion("NOM_APODERADO =", value, "NOM_APODERADO");
            return this;
        }

        public Criteria andNOM_APODERADONotEqualTo(String value)
        {
            addCriterion("NOM_APODERADO <>", value, "NOM_APODERADO");
            return this;
        }

        public Criteria andNOM_APODERADOGreaterThan(String value)
        {
            addCriterion("NOM_APODERADO >", value, "NOM_APODERADO");
            return this;
        }

        public Criteria andNOM_APODERADOGreaterThanOrEqualTo(String value)
        {
            addCriterion("NOM_APODERADO >=", value, "NOM_APODERADO");
            return this;
        }

        public Criteria andNOM_APODERADOLessThan(String value)
        {
            addCriterion("NOM_APODERADO <", value, "NOM_APODERADO");
            return this;
        }

        public Criteria andNOM_APODERADOLessThanOrEqualTo(String value)
        {
            addCriterion("NOM_APODERADO <=", value, "NOM_APODERADO");
            return this;
        }

        public Criteria andNOM_APODERADOLike(String value)
        {
            addCriterion("NOM_APODERADO like", value, "NOM_APODERADO");
            return this;
        }

        public Criteria andNOM_APODERADONotLike(String value)
        {
            addCriterion("NOM_APODERADO not like", value, "NOM_APODERADO");
            return this;
        }

        public Criteria andNOM_APODERADOIn(List values)
        {
            addCriterion("NOM_APODERADO in", values, "NOM_APODERADO");
            return this;
        }

        public Criteria andNOM_APODERADONotIn(List values)
        {
            addCriterion("NOM_APODERADO not in", values, "NOM_APODERADO");
            return this;
        }

        public Criteria andNOM_APODERADOBetween(String value1, String value2)
        {
            addCriterion("NOM_APODERADO between", value1, value2, "NOM_APODERADO");
            return this;
        }

        public Criteria andNOM_APODERADONotBetween(String value1, String value2)
        {
            addCriterion("NOM_APODERADO not between", value1, value2, "NOM_APODERADO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_PROVINCIAIsNull()
        {
            criteriaWithoutValue.add("INDC_PROVINCIA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_PROVINCIAIsNotNull()
        {
            criteriaWithoutValue.add("INDC_PROVINCIA is not null");
            return this;
        }

        public Criteria andINDC_PROVINCIAEqualTo(String value)
        {
            addCriterion("INDC_PROVINCIA =", value, "INDC_PROVINCIA");
            return this;
        }

        public Criteria andINDC_PROVINCIANotEqualTo(String value)
        {
            addCriterion("INDC_PROVINCIA <>", value, "INDC_PROVINCIA");
            return this;
        }

        public Criteria andINDC_PROVINCIAGreaterThan(String value)
        {
            addCriterion("INDC_PROVINCIA >", value, "INDC_PROVINCIA");
            return this;
        }

        public Criteria andINDC_PROVINCIAGreaterThanOrEqualTo(String value)
        {
            addCriterion("INDC_PROVINCIA >=", value, "INDC_PROVINCIA");
            return this;
        }

        public Criteria andINDC_PROVINCIALessThan(String value)
        {
            addCriterion("INDC_PROVINCIA <", value, "INDC_PROVINCIA");
            return this;
        }

        public Criteria andINDC_PROVINCIALessThanOrEqualTo(String value)
        {
            addCriterion("INDC_PROVINCIA <=", value, "INDC_PROVINCIA");
            return this;
        }

        public Criteria andINDC_PROVINCIALike(String value)
        {
            addCriterion("INDC_PROVINCIA like", value, "INDC_PROVINCIA");
            return this;
        }

        public Criteria andINDC_PROVINCIANotLike(String value)
        {
            addCriterion("INDC_PROVINCIA not like", value, "INDC_PROVINCIA");
            return this;
        }

        public Criteria andINDC_PROVINCIAIn(List values)
        {
            addCriterion("INDC_PROVINCIA in", values, "INDC_PROVINCIA");
            return this;
        }

        public Criteria andINDC_PROVINCIANotIn(List values)
        {
            addCriterion("INDC_PROVINCIA not in", values, "INDC_PROVINCIA");
            return this;
        }

        public Criteria andINDC_PROVINCIABetween(String value1, String value2)
        {
            addCriterion("INDC_PROVINCIA between", value1, value2, "INDC_PROVINCIA");
            return this;
        }

        public Criteria andINDC_PROVINCIANotBetween(String value1, String value2)
        {
            addCriterion("INDC_PROVINCIA not between", value1, value2, "INDC_PROVINCIA");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_ANULADOIsNull()
        {
            criteriaWithoutValue.add("INDC_ANULADO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_ANULADOIsNotNull()
        {
            criteriaWithoutValue.add("INDC_ANULADO is not null");
            return this;
        }

        public Criteria andINDC_ANULADOEqualTo(String value)
        {
            addCriterion("INDC_ANULADO =", value, "INDC_ANULADO");
            return this;
        }

        public Criteria andINDC_ANULADONotEqualTo(String value)
        {
            addCriterion("INDC_ANULADO <>", value, "INDC_ANULADO");
            return this;
        }

        public Criteria andINDC_ANULADOGreaterThan(String value)
        {
            addCriterion("INDC_ANULADO >", value, "INDC_ANULADO");
            return this;
        }

        public Criteria andINDC_ANULADOGreaterThanOrEqualTo(String value)
        {
            addCriterion("INDC_ANULADO >=", value, "INDC_ANULADO");
            return this;
        }

        public Criteria andINDC_ANULADOLessThan(String value)
        {
            addCriterion("INDC_ANULADO <", value, "INDC_ANULADO");
            return this;
        }

        public Criteria andINDC_ANULADOLessThanOrEqualTo(String value)
        {
            addCriterion("INDC_ANULADO <=", value, "INDC_ANULADO");
            return this;
        }

        public Criteria andINDC_ANULADOLike(String value)
        {
            addCriterion("INDC_ANULADO like", value, "INDC_ANULADO");
            return this;
        }

        public Criteria andINDC_ANULADONotLike(String value)
        {
            addCriterion("INDC_ANULADO not like", value, "INDC_ANULADO");
            return this;
        }

        public Criteria andINDC_ANULADOIn(List values)
        {
            addCriterion("INDC_ANULADO in", values, "INDC_ANULADO");
            return this;
        }

        public Criteria andINDC_ANULADONotIn(List values)
        {
            addCriterion("INDC_ANULADO not in", values, "INDC_ANULADO");
            return this;
        }

        public Criteria andINDC_ANULADOBetween(String value1, String value2)
        {
            addCriterion("INDC_ANULADO between", value1, value2, "INDC_ANULADO");
            return this;
        }

        public Criteria andINDC_ANULADONotBetween(String value1, String value2)
        {
            addCriterion("INDC_ANULADO not between", value1, value2, "INDC_ANULADO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_USU_ANULACIONIsNull()
        {
            criteriaWithoutValue.add("CODG_USU_ANULACION is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_USU_ANULACIONIsNotNull()
        {
            criteriaWithoutValue.add("CODG_USU_ANULACION is not null");
            return this;
        }

        public Criteria andCODG_USU_ANULACIONEqualTo(String value)
        {
            addCriterion("CODG_USU_ANULACION =", value, "CODG_USU_ANULACION");
            return this;
        }

        public Criteria andCODG_USU_ANULACIONNotEqualTo(String value)
        {
            addCriterion("CODG_USU_ANULACION <>", value, "CODG_USU_ANULACION");
            return this;
        }

        public Criteria andCODG_USU_ANULACIONGreaterThan(String value)
        {
            addCriterion("CODG_USU_ANULACION >", value, "CODG_USU_ANULACION");
            return this;
        }

        public Criteria andCODG_USU_ANULACIONGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_USU_ANULACION >=", value, "CODG_USU_ANULACION");
            return this;
        }

        public Criteria andCODG_USU_ANULACIONLessThan(String value)
        {
            addCriterion("CODG_USU_ANULACION <", value, "CODG_USU_ANULACION");
            return this;
        }

        public Criteria andCODG_USU_ANULACIONLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_USU_ANULACION <=", value, "CODG_USU_ANULACION");
            return this;
        }

        public Criteria andCODG_USU_ANULACIONLike(String value)
        {
            addCriterion("CODG_USU_ANULACION like", value, "CODG_USU_ANULACION");
            return this;
        }

        public Criteria andCODG_USU_ANULACIONNotLike(String value)
        {
            addCriterion("CODG_USU_ANULACION not like", value, "CODG_USU_ANULACION");
            return this;
        }

        public Criteria andCODG_USU_ANULACIONIn(List values)
        {
            addCriterion("CODG_USU_ANULACION in", values, "CODG_USU_ANULACION");
            return this;
        }

        public Criteria andCODG_USU_ANULACIONNotIn(List values)
        {
            addCriterion("CODG_USU_ANULACION not in", values, "CODG_USU_ANULACION");
            return this;
        }

        public Criteria andCODG_USU_ANULACIONBetween(String value1, String value2)
        {
            addCriterion("CODG_USU_ANULACION between", value1, value2, "CODG_USU_ANULACION");
            return this;
        }

        public Criteria andCODG_USU_ANULACIONNotBetween(String value1, String value2)
        {
            addCriterion("CODG_USU_ANULACION not between", value1, value2, "CODG_USU_ANULACION");
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
        public Criteria andNUMR_HOJAIsNull()
        {
            criteriaWithoutValue.add("NUMR_HOJA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_HOJAIsNotNull()
        {
            criteriaWithoutValue.add("NUMR_HOJA is not null");
            return this;
        }

        public Criteria andNUMR_HOJAEqualTo(String value)
        {
            addCriterion("NUMR_HOJA =", value, "NUMR_HOJA");
            return this;
        }

        public Criteria andNUMR_HOJANotEqualTo(String value)
        {
            addCriterion("NUMR_HOJA <>", value, "NUMR_HOJA");
            return this;
        }

        public Criteria andNUMR_HOJAGreaterThan(String value)
        {
            addCriterion("NUMR_HOJA >", value, "NUMR_HOJA");
            return this;
        }

        public Criteria andNUMR_HOJAGreaterThanOrEqualTo(String value)
        {
            addCriterion("NUMR_HOJA >=", value, "NUMR_HOJA");
            return this;
        }

        public Criteria andNUMR_HOJALessThan(String value)
        {
            addCriterion("NUMR_HOJA <", value, "NUMR_HOJA");
            return this;
        }

        public Criteria andNUMR_HOJALessThanOrEqualTo(String value)
        {
            addCriterion("NUMR_HOJA <=", value, "NUMR_HOJA");
            return this;
        }

        public Criteria andNUMR_HOJALike(String value)
        {
            addCriterion("NUMR_HOJA like", value, "NUMR_HOJA");
            return this;
        }

        public Criteria andNUMR_HOJANotLike(String value)
        {
            addCriterion("NUMR_HOJA not like", value, "NUMR_HOJA");
            return this;
        }

        public Criteria andNUMR_HOJAIn(List values)
        {
            addCriterion("NUMR_HOJA in", values, "NUMR_HOJA");
            return this;
        }

        public Criteria andNUMR_HOJANotIn(List values)
        {
            addCriterion("NUMR_HOJA not in", values, "NUMR_HOJA");
            return this;
        }

        public Criteria andNUMR_HOJABetween(String value1, String value2)
        {
            addCriterion("NUMR_HOJA between", value1, value2, "NUMR_HOJA");
            return this;
        }

        public Criteria andNUMR_HOJANotBetween(String value1, String value2)
        {
            addCriterion("NUMR_HOJA not between", value1, value2, "NUMR_HOJA");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andV_DES_OFICIOIsNull()
        {
            criteriaWithoutValue.add("V_DES_OFICIO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andV_DES_OFICIOIsNotNull()
        {
            criteriaWithoutValue.add("V_DES_OFICIO is not null");
            return this;
        }

        public Criteria andV_DES_OFICIOEqualTo(String value)
        {
            addCriterion("V_DES_OFICIO =", value, "V_DES_OFICIO");
            return this;
        }

        public Criteria andV_DES_OFICIONotEqualTo(String value)
        {
            addCriterion("V_DES_OFICIO <>", value, "V_DES_OFICIO");
            return this;
        }

        public Criteria andV_DES_OFICIOGreaterThan(String value)
        {
            addCriterion("V_DES_OFICIO >", value, "V_DES_OFICIO");
            return this;
        }

        public Criteria andV_DES_OFICIOGreaterThanOrEqualTo(String value)
        {
            addCriterion("V_DES_OFICIO >=", value, "V_DES_OFICIO");
            return this;
        }

        public Criteria andV_DES_OFICIOLessThan(String value)
        {
            addCriterion("V_DES_OFICIO <", value, "V_DES_OFICIO");
            return this;
        }

        public Criteria andV_DES_OFICIOLessThanOrEqualTo(String value)
        {
            addCriterion("V_DES_OFICIO <=", value, "V_DES_OFICIO");
            return this;
        }

        public Criteria andV_DES_OFICIOLike(String value)
        {
            addCriterion("V_DES_OFICIO like", value, "V_DES_OFICIO");
            return this;
        }

        public Criteria andV_DES_OFICIONotLike(String value)
        {
            addCriterion("V_DES_OFICIO not like", value, "V_DES_OFICIO");
            return this;
        }

        public Criteria andV_DES_OFICIOIn(List values)
        {
            addCriterion("V_DES_OFICIO in", values, "V_DES_OFICIO");
            return this;
        }

        public Criteria andV_DES_OFICIONotIn(List values)
        {
            addCriterion("V_DES_OFICIO not in", values, "V_DES_OFICIO");
            return this;
        }

        public Criteria andV_DES_OFICIOBetween(String value1, String value2)
        {
            addCriterion("V_DES_OFICIO between", value1, value2, "V_DES_OFICIO");
            return this;
        }

        public Criteria andV_DES_OFICIONotBetween(String value1, String value2)
        {
            addCriterion("V_DES_OFICIO not between", value1, value2, "V_DES_OFICIO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andV_DES_DISTRITOIsNull()
        {
            criteriaWithoutValue.add("V_DES_DISTRITO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andV_DES_DISTRITOIsNotNull()
        {
            criteriaWithoutValue.add("V_DES_DISTRITO is not null");
            return this;
        }

        public Criteria andV_DES_DISTRITOEqualTo(String value)
        {
            addCriterion("V_DES_DISTRITO =", value, "V_DES_DISTRITO");
            return this;
        }

        public Criteria andV_DES_DISTRITONotEqualTo(String value)
        {
            addCriterion("V_DES_DISTRITO <>", value, "V_DES_DISTRITO");
            return this;
        }

        public Criteria andV_DES_DISTRITOGreaterThan(String value)
        {
            addCriterion("V_DES_DISTRITO >", value, "V_DES_DISTRITO");
            return this;
        }

        public Criteria andV_DES_DISTRITOGreaterThanOrEqualTo(String value)
        {
            addCriterion("V_DES_DISTRITO >=", value, "V_DES_DISTRITO");
            return this;
        }

        public Criteria andV_DES_DISTRITOLessThan(String value)
        {
            addCriterion("V_DES_DISTRITO <", value, "V_DES_DISTRITO");
            return this;
        }

        public Criteria andV_DES_DISTRITOLessThanOrEqualTo(String value)
        {
            addCriterion("V_DES_DISTRITO <=", value, "V_DES_DISTRITO");
            return this;
        }

        public Criteria andV_DES_DISTRITOLike(String value)
        {
            addCriterion("V_DES_DISTRITO like", value, "V_DES_DISTRITO");
            return this;
        }

        public Criteria andV_DES_DISTRITONotLike(String value)
        {
            addCriterion("V_DES_DISTRITO not like", value, "V_DES_DISTRITO");
            return this;
        }

        public Criteria andV_DES_DISTRITOIn(List values)
        {
            addCriterion("V_DES_DISTRITO in", values, "V_DES_DISTRITO");
            return this;
        }

        public Criteria andV_DES_DISTRITONotIn(List values)
        {
            addCriterion("V_DES_DISTRITO not in", values, "V_DES_DISTRITO");
            return this;
        }

        public Criteria andV_DES_DISTRITOBetween(String value1, String value2)
        {
            addCriterion("V_DES_DISTRITO between", value1, value2, "V_DES_DISTRITO");
            return this;
        }

        public Criteria andV_DES_DISTRITONotBetween(String value1, String value2)
        {
            addCriterion("V_DES_DISTRITO not between", value1, value2, "V_DES_DISTRITO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNOMB_JUZGA_SOLIC1IsNull()
        {
            criteriaWithoutValue.add("NOMB_JUZGA_SOLIC1 is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNOMB_JUZGA_SOLIC1IsNotNull()
        {
            criteriaWithoutValue.add("NOMB_JUZGA_SOLIC1 is not null");
            return this;
        }

        public Criteria andNOMB_JUZGA_SOLIC1EqualTo(String value)
        {
            addCriterion("NOMB_JUZGA_SOLIC1 =", value, "NOMB_JUZGA_SOLIC1");
            return this;
        }

        public Criteria andNOMB_JUZGA_SOLIC1NotEqualTo(String value)
        {
            addCriterion("NOMB_JUZGA_SOLIC1 <>", value, "NOMB_JUZGA_SOLIC1");
            return this;
        }

        public Criteria andNOMB_JUZGA_SOLIC1GreaterThan(String value)
        {
            addCriterion("NOMB_JUZGA_SOLIC1 >", value, "NOMB_JUZGA_SOLIC1");
            return this;
        }

        public Criteria andNOMB_JUZGA_SOLIC1GreaterThanOrEqualTo(String value)
        {
            addCriterion("NOMB_JUZGA_SOLIC1 >=", value, "NOMB_JUZGA_SOLIC1");
            return this;
        }

        public Criteria andNOMB_JUZGA_SOLIC1LessThan(String value)
        {
            addCriterion("NOMB_JUZGA_SOLIC1 <", value, "NOMB_JUZGA_SOLIC1");
            return this;
        }

        public Criteria andNOMB_JUZGA_SOLIC1LessThanOrEqualTo(String value)
        {
            addCriterion("NOMB_JUZGA_SOLIC1 <=", value, "NOMB_JUZGA_SOLIC1");
            return this;
        }

        public Criteria andNOMB_JUZGA_SOLIC1Like(String value)
        {
            addCriterion("NOMB_JUZGA_SOLIC1 like", value, "NOMB_JUZGA_SOLIC1");
            return this;
        }

        public Criteria andNOMB_JUZGA_SOLIC1NotLike(String value)
        {
            addCriterion("NOMB_JUZGA_SOLIC1 not like", value, "NOMB_JUZGA_SOLIC1");
            return this;
        }

        public Criteria andNOMB_JUZGA_SOLIC1In(List values)
        {
            addCriterion("NOMB_JUZGA_SOLIC1 in", values, "NOMB_JUZGA_SOLIC1");
            return this;
        }

        public Criteria andNOMB_JUZGA_SOLIC1NotIn(List values)
        {
            addCriterion("NOMB_JUZGA_SOLIC1 not in", values, "NOMB_JUZGA_SOLIC1");
            return this;
        }

        public Criteria andNOMB_JUZGA_SOLIC1Between(String value1, String value2)
        {
            addCriterion("NOMB_JUZGA_SOLIC1 between", value1, value2, "NOMB_JUZGA_SOLIC1");
            return this;
        }

        public Criteria andNOMB_JUZGA_SOLIC1NotBetween(String value1, String value2)
        {
            addCriterion("NOMB_JUZGA_SOLIC1 not between", value1, value2, "NOMB_JUZGA_SOLIC1");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_IMPRESIONIsNull()
        {
            criteriaWithoutValue.add("NUMR_IMPRESION is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_IMPRESIONIsNotNull()
        {
            criteriaWithoutValue.add("NUMR_IMPRESION is not null");
            return this;
        }

        public Criteria andNUMR_IMPRESIONEqualTo(Integer value)
        {
            addCriterion("NUMR_IMPRESION =", value, "NUMR_IMPRESION");
            return this;
        }

        public Criteria andNUMR_IMPRESIONNotEqualTo(Integer value)
        {
            addCriterion("NUMR_IMPRESION <>", value, "NUMR_IMPRESION");
            return this;
        }

        public Criteria andNUMR_IMPRESIONGreaterThan(Integer value)
        {
            addCriterion("NUMR_IMPRESION >", value, "NUMR_IMPRESION");
            return this;
        }

        public Criteria andNUMR_IMPRESIONGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("NUMR_IMPRESION >=", value, "NUMR_IMPRESION");
            return this;
        }

        public Criteria andNUMR_IMPRESIONLessThan(Integer value)
        {
            addCriterion("NUMR_IMPRESION <", value, "NUMR_IMPRESION");
            return this;
        }

        public Criteria andNUMR_IMPRESIONLessThanOrEqualTo(Integer value)
        {
            addCriterion("NUMR_IMPRESION <=", value, "NUMR_IMPRESION");
            return this;
        }

        public Criteria andNUMR_IMPRESIONIn(List values)
        {
            addCriterion("NUMR_IMPRESION in", values, "NUMR_IMPRESION");
            return this;
        }

        public Criteria andNUMR_IMPRESIONNotIn(List values)
        {
            addCriterion("NUMR_IMPRESION not in", values, "NUMR_IMPRESION");
            return this;
        }

        public Criteria andNUMR_IMPRESIONBetween(Integer value1, Integer value2)
        {
            addCriterion("NUMR_IMPRESION between", value1, value2, "NUMR_IMPRESION");
            return this;
        }

        public Criteria andNUMR_IMPRESIONNotBetween(Integer value1, Integer value2)
        {
            addCriterion("NUMR_IMPRESION not between", value1, value2, "NUMR_IMPRESION");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_USU_IMPRESIONIsNull()
        {
            criteriaWithoutValue.add("CODG_USU_IMPRESION is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_USU_IMPRESIONIsNotNull()
        {
            criteriaWithoutValue.add("CODG_USU_IMPRESION is not null");
            return this;
        }

        public Criteria andCODG_USU_IMPRESIONEqualTo(String value)
        {
            addCriterion("CODG_USU_IMPRESION =", value, "CODG_USU_IMPRESION");
            return this;
        }

        public Criteria andCODG_USU_IMPRESIONNotEqualTo(String value)
        {
            addCriterion("CODG_USU_IMPRESION <>", value, "CODG_USU_IMPRESION");
            return this;
        }

        public Criteria andCODG_USU_IMPRESIONGreaterThan(String value)
        {
            addCriterion("CODG_USU_IMPRESION >", value, "CODG_USU_IMPRESION");
            return this;
        }

        public Criteria andCODG_USU_IMPRESIONGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_USU_IMPRESION >=", value, "CODG_USU_IMPRESION");
            return this;
        }

        public Criteria andCODG_USU_IMPRESIONLessThan(String value)
        {
            addCriterion("CODG_USU_IMPRESION <", value, "CODG_USU_IMPRESION");
            return this;
        }

        public Criteria andCODG_USU_IMPRESIONLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_USU_IMPRESION <=", value, "CODG_USU_IMPRESION");
            return this;
        }

        public Criteria andCODG_USU_IMPRESIONLike(String value)
        {
            addCriterion("CODG_USU_IMPRESION like", value, "CODG_USU_IMPRESION");
            return this;
        }

        public Criteria andCODG_USU_IMPRESIONNotLike(String value)
        {
            addCriterion("CODG_USU_IMPRESION not like", value, "CODG_USU_IMPRESION");
            return this;
        }

        public Criteria andCODG_USU_IMPRESIONIn(List values)
        {
            addCriterion("CODG_USU_IMPRESION in", values, "CODG_USU_IMPRESION");
            return this;
        }

        public Criteria andCODG_USU_IMPRESIONNotIn(List values)
        {
            addCriterion("CODG_USU_IMPRESION not in", values, "CODG_USU_IMPRESION");
            return this;
        }

        public Criteria andCODG_USU_IMPRESIONBetween(String value1, String value2)
        {
            addCriterion("CODG_USU_IMPRESION between", value1, value2, "CODG_USU_IMPRESION");
            return this;
        }

        public Criteria andCODG_USU_IMPRESIONNotBetween(String value1, String value2)
        {
            addCriterion("CODG_USU_IMPRESION not between", value1, value2, "CODG_USU_IMPRESION");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andANIO_HOJAIsNull()
        {
            criteriaWithoutValue.add("ANIO_HOJA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andANIO_HOJAIsNotNull()
        {
            criteriaWithoutValue.add("ANIO_HOJA is not null");
            return this;
        }

        public Criteria andANIO_HOJAEqualTo(Integer value)
        {
            addCriterion("ANIO_HOJA =", value, "ANIO_HOJA");
            return this;
        }

        public Criteria andANIO_HOJANotEqualTo(Integer value)
        {
            addCriterion("ANIO_HOJA <>", value, "ANIO_HOJA");
            return this;
        }

        public Criteria andANIO_HOJAGreaterThan(Integer value)
        {
            addCriterion("ANIO_HOJA >", value, "ANIO_HOJA");
            return this;
        }

        public Criteria andANIO_HOJAGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("ANIO_HOJA >=", value, "ANIO_HOJA");
            return this;
        }

        public Criteria andANIO_HOJALessThan(Integer value)
        {
            addCriterion("ANIO_HOJA <", value, "ANIO_HOJA");
            return this;
        }

        public Criteria andANIO_HOJALessThanOrEqualTo(Integer value)
        {
            addCriterion("ANIO_HOJA <=", value, "ANIO_HOJA");
            return this;
        }

        public Criteria andANIO_HOJAIn(List values)
        {
            addCriterion("ANIO_HOJA in", values, "ANIO_HOJA");
            return this;
        }

        public Criteria andANIO_HOJANotIn(List values)
        {
            addCriterion("ANIO_HOJA not in", values, "ANIO_HOJA");
            return this;
        }

        public Criteria andANIO_HOJABetween(Integer value1, Integer value2)
        {
            addCriterion("ANIO_HOJA between", value1, value2, "ANIO_HOJA");
            return this;
        }

        public Criteria andANIO_HOJANotBetween(Integer value1, Integer value2)
        {
            addCriterion("ANIO_HOJA not between", value1, value2, "ANIO_HOJA");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_IMPRESIONIsNull()
        {
            criteriaWithoutValue.add("FECH_IMPRESION is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_IMPRESIONIsNotNull()
        {
            criteriaWithoutValue.add("FECH_IMPRESION is not null");
            return this;
        }

        public Criteria andFECH_IMPRESIONEqualTo(Date value)
        {
            addCriterion("FECH_IMPRESION =", value, "FECH_IMPRESION");
            return this;
        }

        public Criteria andFECH_IMPRESIONNotEqualTo(Date value)
        {
            addCriterion("FECH_IMPRESION <>", value, "FECH_IMPRESION");
            return this;
        }

        public Criteria andFECH_IMPRESIONGreaterThan(Date value)
        {
            addCriterion("FECH_IMPRESION >", value, "FECH_IMPRESION");
            return this;
        }

        public Criteria andFECH_IMPRESIONGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FECH_IMPRESION >=", value, "FECH_IMPRESION");
            return this;
        }

        public Criteria andFECH_IMPRESIONLessThan(Date value)
        {
            addCriterion("FECH_IMPRESION <", value, "FECH_IMPRESION");
            return this;
        }

        public Criteria andFECH_IMPRESIONLessThanOrEqualTo(Date value)
        {
            addCriterion("FECH_IMPRESION <=", value, "FECH_IMPRESION");
            return this;
        }

        public Criteria andFECH_IMPRESIONIn(List values)
        {
            addCriterion("FECH_IMPRESION in", values, "FECH_IMPRESION");
            return this;
        }

        public Criteria andFECH_IMPRESIONNotIn(List values)
        {
            addCriterion("FECH_IMPRESION not in", values, "FECH_IMPRESION");
            return this;
        }

        public Criteria andFECH_IMPRESIONBetween(Date value1, Date value2)
        {
            addCriterion("FECH_IMPRESION between", value1, value2, "FECH_IMPRESION");
            return this;
        }

        public Criteria andFECH_IMPRESIONNotBetween(Date value1, Date value2)
        {
            addCriterion("FECH_IMPRESION not between", value1, value2, "FECH_IMPRESION");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_FORM_ANTERIORIsNull()
        {
            criteriaWithoutValue.add("NUMR_FORM_ANTERIOR is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_FORM_ANTERIORIsNotNull()
        {
            criteriaWithoutValue.add("NUMR_FORM_ANTERIOR is not null");
            return this;
        }

        public Criteria andNUMR_FORM_ANTERIOREqualTo(String value)
        {
            addCriterion("NUMR_FORM_ANTERIOR =", value, "NUMR_FORM_ANTERIOR");
            return this;
        }

        public Criteria andNUMR_FORM_ANTERIORNotEqualTo(String value)
        {
            addCriterion("NUMR_FORM_ANTERIOR <>", value, "NUMR_FORM_ANTERIOR");
            return this;
        }

        public Criteria andNUMR_FORM_ANTERIORGreaterThan(String value)
        {
            addCriterion("NUMR_FORM_ANTERIOR >", value, "NUMR_FORM_ANTERIOR");
            return this;
        }

        public Criteria andNUMR_FORM_ANTERIORGreaterThanOrEqualTo(String value)
        {
            addCriterion("NUMR_FORM_ANTERIOR >=", value, "NUMR_FORM_ANTERIOR");
            return this;
        }

        public Criteria andNUMR_FORM_ANTERIORLessThan(String value)
        {
            addCriterion("NUMR_FORM_ANTERIOR <", value, "NUMR_FORM_ANTERIOR");
            return this;
        }

        public Criteria andNUMR_FORM_ANTERIORLessThanOrEqualTo(String value)
        {
            addCriterion("NUMR_FORM_ANTERIOR <=", value, "NUMR_FORM_ANTERIOR");
            return this;
        }

        public Criteria andNUMR_FORM_ANTERIORLike(String value)
        {
            addCriterion("NUMR_FORM_ANTERIOR like", value, "NUMR_FORM_ANTERIOR");
            return this;
        }

        public Criteria andNUMR_FORM_ANTERIORNotLike(String value)
        {
            addCriterion("NUMR_FORM_ANTERIOR not like", value, "NUMR_FORM_ANTERIOR");
            return this;
        }

        public Criteria andNUMR_FORM_ANTERIORIn(List values)
        {
            addCriterion("NUMR_FORM_ANTERIOR in", values, "NUMR_FORM_ANTERIOR");
            return this;
        }

        public Criteria andNUMR_FORM_ANTERIORNotIn(List values)
        {
            addCriterion("NUMR_FORM_ANTERIOR not in", values, "NUMR_FORM_ANTERIOR");
            return this;
        }

        public Criteria andNUMR_FORM_ANTERIORBetween(String value1, String value2)
        {
            addCriterion("NUMR_FORM_ANTERIOR between", value1, value2, "NUMR_FORM_ANTERIOR");
            return this;
        }

        public Criteria andNUMR_FORM_ANTERIORNotBetween(String value1, String value2)
        {
            addCriterion("NUMR_FORM_ANTERIOR not between", value1, value2, "NUMR_FORM_ANTERIOR");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_ENTREGAIsNull()
        {
            criteriaWithoutValue.add("FECH_ENTREGA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_ENTREGAIsNotNull()
        {
            criteriaWithoutValue.add("FECH_ENTREGA is not null");
            return this;
        }

        public Criteria andFECH_ENTREGAEqualTo(Date value)
        {
            addCriterion("FECH_ENTREGA =", value, "FECH_ENTREGA");
            return this;
        }

        public Criteria andFECH_ENTREGANotEqualTo(Date value)
        {
            addCriterion("FECH_ENTREGA <>", value, "FECH_ENTREGA");
            return this;
        }

        public Criteria andFECH_ENTREGAGreaterThan(Date value)
        {
            addCriterion("FECH_ENTREGA >", value, "FECH_ENTREGA");
            return this;
        }

        public Criteria andFECH_ENTREGAGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FECH_ENTREGA >=", value, "FECH_ENTREGA");
            return this;
        }

        public Criteria andFECH_ENTREGALessThan(Date value)
        {
            addCriterion("FECH_ENTREGA <", value, "FECH_ENTREGA");
            return this;
        }

        public Criteria andFECH_ENTREGALessThanOrEqualTo(Date value)
        {
            addCriterion("FECH_ENTREGA <=", value, "FECH_ENTREGA");
            return this;
        }

        public Criteria andFECH_ENTREGAIn(List values)
        {
            addCriterion("FECH_ENTREGA in", values, "FECH_ENTREGA");
            return this;
        }

        public Criteria andFECH_ENTREGANotIn(List values)
        {
            addCriterion("FECH_ENTREGA not in", values, "FECH_ENTREGA");
            return this;
        }

        public Criteria andFECH_ENTREGABetween(Date value1, Date value2)
        {
            addCriterion("FECH_ENTREGA between", value1, value2, "FECH_ENTREGA");
            return this;
        }

        public Criteria andFECH_ENTREGANotBetween(Date value1, Date value2)
        {
            addCriterion("FECH_ENTREGA not between", value1, value2, "FECH_ENTREGA");
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
        public Criteria andINDC_URGENTEIsNull()
        {
            criteriaWithoutValue.add("INDC_URGENTE is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_URGENTEIsNotNull()
        {
            criteriaWithoutValue.add("INDC_URGENTE is not null");
            return this;
        }

        public Criteria andINDC_URGENTEEqualTo(String value)
        {
            addCriterion("INDC_URGENTE =", value, "INDC_URGENTE");
            return this;
        }

        public Criteria andINDC_URGENTENotEqualTo(String value)
        {
            addCriterion("INDC_URGENTE <>", value, "INDC_URGENTE");
            return this;
        }

        public Criteria andINDC_URGENTEGreaterThan(String value)
        {
            addCriterion("INDC_URGENTE >", value, "INDC_URGENTE");
            return this;
        }

        public Criteria andINDC_URGENTEGreaterThanOrEqualTo(String value)
        {
            addCriterion("INDC_URGENTE >=", value, "INDC_URGENTE");
            return this;
        }

        public Criteria andINDC_URGENTELessThan(String value)
        {
            addCriterion("INDC_URGENTE <", value, "INDC_URGENTE");
            return this;
        }

        public Criteria andINDC_URGENTELessThanOrEqualTo(String value)
        {
            addCriterion("INDC_URGENTE <=", value, "INDC_URGENTE");
            return this;
        }

        public Criteria andINDC_URGENTELike(String value)
        {
            addCriterion("INDC_URGENTE like", value, "INDC_URGENTE");
            return this;
        }

        public Criteria andINDC_URGENTENotLike(String value)
        {
            addCriterion("INDC_URGENTE not like", value, "INDC_URGENTE");
            return this;
        }

        public Criteria andINDC_URGENTEIn(List values)
        {
            addCriterion("INDC_URGENTE in", values, "INDC_URGENTE");
            return this;
        }

        public Criteria andINDC_URGENTENotIn(List values)
        {
            addCriterion("INDC_URGENTE not in", values, "INDC_URGENTE");
            return this;
        }

        public Criteria andINDC_URGENTEBetween(String value1, String value2)
        {
            addCriterion("INDC_URGENTE between", value1, value2, "INDC_URGENTE");
            return this;
        }

        public Criteria andINDC_URGENTENotBetween(String value1, String value2)
        {
            addCriterion("INDC_URGENTE not between", value1, value2, "INDC_URGENTE");
            return this;
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
        public Criteria andX_CODG_LUGAR_NACIsNull()
        {
            criteriaWithoutValue.add("X_CODG_LUGAR_NAC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andX_CODG_LUGAR_NACIsNotNull()
        {
            criteriaWithoutValue.add("X_CODG_LUGAR_NAC is not null");
            return this;
        }

        public Criteria andX_CODG_LUGAR_NACEqualTo(String value)
        {
            addCriterion("X_CODG_LUGAR_NAC =", value, "X_CODG_LUGAR_NAC");
            return this;
        }

        public Criteria andX_CODG_LUGAR_NACNotEqualTo(String value)
        {
            addCriterion("X_CODG_LUGAR_NAC <>", value, "X_CODG_LUGAR_NAC");
            return this;
        }

        public Criteria andX_CODG_LUGAR_NACGreaterThan(String value)
        {
            addCriterion("X_CODG_LUGAR_NAC >", value, "X_CODG_LUGAR_NAC");
            return this;
        }

        public Criteria andX_CODG_LUGAR_NACGreaterThanOrEqualTo(String value)
        {
            addCriterion("X_CODG_LUGAR_NAC >=", value, "X_CODG_LUGAR_NAC");
            return this;
        }

        public Criteria andX_CODG_LUGAR_NACLessThan(String value)
        {
            addCriterion("X_CODG_LUGAR_NAC <", value, "X_CODG_LUGAR_NAC");
            return this;
        }

        public Criteria andX_CODG_LUGAR_NACLessThanOrEqualTo(String value)
        {
            addCriterion("X_CODG_LUGAR_NAC <=", value, "X_CODG_LUGAR_NAC");
            return this;
        }

        public Criteria andX_CODG_LUGAR_NACLike(String value)
        {
            addCriterion("X_CODG_LUGAR_NAC like", value, "X_CODG_LUGAR_NAC");
            return this;
        }

        public Criteria andX_CODG_LUGAR_NACNotLike(String value)
        {
            addCriterion("X_CODG_LUGAR_NAC not like", value, "X_CODG_LUGAR_NAC");
            return this;
        }

        public Criteria andX_CODG_LUGAR_NACIn(List values)
        {
            addCriterion("X_CODG_LUGAR_NAC in", values, "X_CODG_LUGAR_NAC");
            return this;
        }

        public Criteria andX_CODG_LUGAR_NACNotIn(List values)
        {
            addCriterion("X_CODG_LUGAR_NAC not in", values, "X_CODG_LUGAR_NAC");
            return this;
        }

        public Criteria andX_CODG_LUGAR_NACBetween(String value1, String value2)
        {
            addCriterion("X_CODG_LUGAR_NAC between", value1, value2, "X_CODG_LUGAR_NAC");
            return this;
        }

        public Criteria andX_CODG_LUGAR_NACNotBetween(String value1, String value2)
        {
            addCriterion("X_CODG_LUGAR_NAC not between", value1, value2, "X_CODG_LUGAR_NAC");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andSERIE_HOJAIsNull()
        {
            criteriaWithoutValue.add("SERIE_HOJA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andSERIE_HOJAIsNotNull()
        {
            criteriaWithoutValue.add("SERIE_HOJA is not null");
            return this;
        }

        public Criteria andSERIE_HOJAEqualTo(String value)
        {
            addCriterion("SERIE_HOJA =", value, "SERIE_HOJA");
            return this;
        }

        public Criteria andSERIE_HOJANotEqualTo(String value)
        {
            addCriterion("SERIE_HOJA <>", value, "SERIE_HOJA");
            return this;
        }

        public Criteria andSERIE_HOJAGreaterThan(String value)
        {
            addCriterion("SERIE_HOJA >", value, "SERIE_HOJA");
            return this;
        }

        public Criteria andSERIE_HOJAGreaterThanOrEqualTo(String value)
        {
            addCriterion("SERIE_HOJA >=", value, "SERIE_HOJA");
            return this;
        }

        public Criteria andSERIE_HOJALessThan(String value)
        {
            addCriterion("SERIE_HOJA <", value, "SERIE_HOJA");
            return this;
        }

        public Criteria andSERIE_HOJALessThanOrEqualTo(String value)
        {
            addCriterion("SERIE_HOJA <=", value, "SERIE_HOJA");
            return this;
        }

        public Criteria andSERIE_HOJALike(String value)
        {
            addCriterion("SERIE_HOJA like", value, "SERIE_HOJA");
            return this;
        }

        public Criteria andSERIE_HOJANotLike(String value)
        {
            addCriterion("SERIE_HOJA not like", value, "SERIE_HOJA");
            return this;
        }

        public Criteria andSERIE_HOJAIn(List values)
        {
            addCriterion("SERIE_HOJA in", values, "SERIE_HOJA");
            return this;
        }

        public Criteria andSERIE_HOJANotIn(List values)
        {
            addCriterion("SERIE_HOJA not in", values, "SERIE_HOJA");
            return this;
        }

        public Criteria andSERIE_HOJABetween(String value1, String value2)
        {
            addCriterion("SERIE_HOJA between", value1, value2, "SERIE_HOJA");
            return this;
        }

        public Criteria andSERIE_HOJANotBetween(String value1, String value2)
        {
            addCriterion("SERIE_HOJA not between", value1, value2, "SERIE_HOJA");
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
        public Criteria andVENTANILLAIsNull()
        {
            criteriaWithoutValue.add("VENTANILLA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andVENTANILLAIsNotNull()
        {
            criteriaWithoutValue.add("VENTANILLA is not null");
            return this;
        }

        public Criteria andVENTANILLAEqualTo(String value)
        {
            addCriterion("VENTANILLA =", value, "VENTANILLA");
            return this;
        }

        public Criteria andVENTANILLANotEqualTo(String value)
        {
            addCriterion("VENTANILLA <>", value, "VENTANILLA");
            return this;
        }

        public Criteria andVENTANILLAGreaterThan(String value)
        {
            addCriterion("VENTANILLA >", value, "VENTANILLA");
            return this;
        }

        public Criteria andVENTANILLAGreaterThanOrEqualTo(String value)
        {
            addCriterion("VENTANILLA >=", value, "VENTANILLA");
            return this;
        }

        public Criteria andVENTANILLALessThan(String value)
        {
            addCriterion("VENTANILLA <", value, "VENTANILLA");
            return this;
        }

        public Criteria andVENTANILLALessThanOrEqualTo(String value)
        {
            addCriterion("VENTANILLA <=", value, "VENTANILLA");
            return this;
        }

        public Criteria andVENTANILLALike(String value)
        {
            addCriterion("VENTANILLA like", value, "VENTANILLA");
            return this;
        }

        public Criteria andVENTANILLANotLike(String value)
        {
            addCriterion("VENTANILLA not like", value, "VENTANILLA");
            return this;
        }

        public Criteria andVENTANILLAIn(List values)
        {
            addCriterion("VENTANILLA in", values, "VENTANILLA");
            return this;
        }

        public Criteria andVENTANILLANotIn(List values)
        {
            addCriterion("VENTANILLA not in", values, "VENTANILLA");
            return this;
        }

        public Criteria andVENTANILLABetween(String value1, String value2)
        {
            addCriterion("VENTANILLA between", value1, value2, "VENTANILLA");
            return this;
        }

        public Criteria andVENTANILLANotBetween(String value1, String value2)
        {
            addCriterion("VENTANILLA not between", value1, value2, "VENTANILLA");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andL_INDC_OFICIOIsNull()
        {
            criteriaWithoutValue.add("L_INDC_OFICIO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andL_INDC_OFICIOIsNotNull()
        {
            criteriaWithoutValue.add("L_INDC_OFICIO is not null");
            return this;
        }

        public Criteria andL_INDC_OFICIOEqualTo(String value)
        {
            addCriterion("L_INDC_OFICIO =", value, "L_INDC_OFICIO");
            return this;
        }

        public Criteria andL_INDC_OFICIONotEqualTo(String value)
        {
            addCriterion("L_INDC_OFICIO <>", value, "L_INDC_OFICIO");
            return this;
        }

        public Criteria andL_INDC_OFICIOGreaterThan(String value)
        {
            addCriterion("L_INDC_OFICIO >", value, "L_INDC_OFICIO");
            return this;
        }

        public Criteria andL_INDC_OFICIOGreaterThanOrEqualTo(String value)
        {
            addCriterion("L_INDC_OFICIO >=", value, "L_INDC_OFICIO");
            return this;
        }

        public Criteria andL_INDC_OFICIOLessThan(String value)
        {
            addCriterion("L_INDC_OFICIO <", value, "L_INDC_OFICIO");
            return this;
        }

        public Criteria andL_INDC_OFICIOLessThanOrEqualTo(String value)
        {
            addCriterion("L_INDC_OFICIO <=", value, "L_INDC_OFICIO");
            return this;
        }

        public Criteria andL_INDC_OFICIOLike(String value)
        {
            addCriterion("L_INDC_OFICIO like", value, "L_INDC_OFICIO");
            return this;
        }

        public Criteria andL_INDC_OFICIONotLike(String value)
        {
            addCriterion("L_INDC_OFICIO not like", value, "L_INDC_OFICIO");
            return this;
        }

        public Criteria andL_INDC_OFICIOIn(List values)
        {
            addCriterion("L_INDC_OFICIO in", values, "L_INDC_OFICIO");
            return this;
        }

        public Criteria andL_INDC_OFICIONotIn(List values)
        {
            addCriterion("L_INDC_OFICIO not in", values, "L_INDC_OFICIO");
            return this;
        }

        public Criteria andL_INDC_OFICIOBetween(String value1, String value2)
        {
            addCriterion("L_INDC_OFICIO between", value1, value2, "L_INDC_OFICIO");
            return this;
        }

        public Criteria andL_INDC_OFICIONotBetween(String value1, String value2)
        {
            addCriterion("L_INDC_OFICIO not between", value1, value2, "L_INDC_OFICIO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andL_FEC_NACIsNull()
        {
            criteriaWithoutValue.add("L_FEC_NAC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andL_FEC_NACIsNotNull()
        {
            criteriaWithoutValue.add("L_FEC_NAC is not null");
            return this;
        }

        public Criteria andL_FEC_NACEqualTo(String value)
        {
            addCriterion("L_FEC_NAC =", value, "L_FEC_NAC");
            return this;
        }

        public Criteria andL_FEC_NACNotEqualTo(String value)
        {
            addCriterion("L_FEC_NAC <>", value, "L_FEC_NAC");
            return this;
        }

        public Criteria andL_FEC_NACGreaterThan(String value)
        {
            addCriterion("L_FEC_NAC >", value, "L_FEC_NAC");
            return this;
        }

        public Criteria andL_FEC_NACGreaterThanOrEqualTo(String value)
        {
            addCriterion("L_FEC_NAC >=", value, "L_FEC_NAC");
            return this;
        }

        public Criteria andL_FEC_NACLessThan(String value)
        {
            addCriterion("L_FEC_NAC <", value, "L_FEC_NAC");
            return this;
        }

        public Criteria andL_FEC_NACLessThanOrEqualTo(String value)
        {
            addCriterion("L_FEC_NAC <=", value, "L_FEC_NAC");
            return this;
        }

        public Criteria andL_FEC_NACLike(String value)
        {
            addCriterion("L_FEC_NAC like", value, "L_FEC_NAC");
            return this;
        }

        public Criteria andL_FEC_NACNotLike(String value)
        {
            addCriterion("L_FEC_NAC not like", value, "L_FEC_NAC");
            return this;
        }

        public Criteria andL_FEC_NACIn(List values)
        {
            addCriterion("L_FEC_NAC in", values, "L_FEC_NAC");
            return this;
        }

        public Criteria andL_FEC_NACNotIn(List values)
        {
            addCriterion("L_FEC_NAC not in", values, "L_FEC_NAC");
            return this;
        }

        public Criteria andL_FEC_NACBetween(String value1, String value2)
        {
            addCriterion("L_FEC_NAC between", value1, value2, "L_FEC_NAC");
            return this;
        }

        public Criteria andL_FEC_NACNotBetween(String value1, String value2)
        {
            addCriterion("L_FEC_NAC not between", value1, value2, "L_FEC_NAC");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andL_nro_modificaIsNull()
        {
            criteriaWithoutValue.add("l_nro_modifica is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andL_nro_modificaIsNotNull()
        {
            criteriaWithoutValue.add("l_nro_modifica is not null");
            return this;
        }

        public Criteria andL_nro_modificaEqualTo(Integer value)
        {
            addCriterion("l_nro_modifica =", value, "l_nro_modifica");
            return this;
        }

        public Criteria andL_nro_modificaNotEqualTo(Integer value)
        {
            addCriterion("l_nro_modifica <>", value, "l_nro_modifica");
            return this;
        }

        public Criteria andL_nro_modificaGreaterThan(Integer value)
        {
            addCriterion("l_nro_modifica >", value, "l_nro_modifica");
            return this;
        }

        public Criteria andL_nro_modificaGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("l_nro_modifica >=", value, "l_nro_modifica");
            return this;
        }

        public Criteria andL_nro_modificaLessThan(Integer value)
        {
            addCriterion("l_nro_modifica <", value, "l_nro_modifica");
            return this;
        }

        public Criteria andL_nro_modificaLessThanOrEqualTo(Integer value)
        {
            addCriterion("l_nro_modifica <=", value, "l_nro_modifica");
            return this;
        }

        public Criteria andL_nro_modificaIn(List values)
        {
            addCriterion("l_nro_modifica in", values, "l_nro_modifica");
            return this;
        }

        public Criteria andL_nro_modificaNotIn(List values)
        {
            addCriterion("l_nro_modifica not in", values, "l_nro_modifica");
            return this;
        }

        public Criteria andL_nro_modificaBetween(Integer value1, Integer value2)
        {
            addCriterion("l_nro_modifica between", value1, value2, "l_nro_modifica");
            return this;
        }

        public Criteria andL_nro_modificaNotBetween(Integer value1, Integer value2)
        {
            addCriterion("l_nro_modifica not between", value1, value2, "l_nro_modifica");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andPk_alternativoIsNull()
        {
            criteriaWithoutValue.add("pk_alternativo is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andPk_alternativoIsNotNull()
        {
            criteriaWithoutValue.add("pk_alternativo is not null");
            return this;
        }

        public Criteria andPk_alternativoEqualTo(String value)
        {
            addCriterion("pk_alternativo =", value, "pk_alternativo");
            return this;
        }

        public Criteria andPk_alternativoNotEqualTo(String value)
        {
            addCriterion("pk_alternativo <>", value, "pk_alternativo");
            return this;
        }

        public Criteria andPk_alternativoGreaterThan(String value)
        {
            addCriterion("pk_alternativo >", value, "pk_alternativo");
            return this;
        }

        public Criteria andPk_alternativoGreaterThanOrEqualTo(String value)
        {
            addCriterion("pk_alternativo >=", value, "pk_alternativo");
            return this;
        }

        public Criteria andPk_alternativoLessThan(String value)
        {
            addCriterion("pk_alternativo <", value, "pk_alternativo");
            return this;
        }

        public Criteria andPk_alternativoLessThanOrEqualTo(String value)
        {
            addCriterion("pk_alternativo <=", value, "pk_alternativo");
            return this;
        }

        public Criteria andPk_alternativoLike(String value)
        {
            addCriterion("pk_alternativo like", value, "pk_alternativo");
            return this;
        }

        public Criteria andPk_alternativoNotLike(String value)
        {
            addCriterion("pk_alternativo not like", value, "pk_alternativo");
            return this;
        }

        public Criteria andPk_alternativoIn(List values)
        {
            addCriterion("pk_alternativo in", values, "pk_alternativo");
            return this;
        }

        public Criteria andPk_alternativoNotIn(List values)
        {
            addCriterion("pk_alternativo not in", values, "pk_alternativo");
            return this;
        }

        public Criteria andPk_alternativoBetween(String value1, String value2)
        {
            addCriterion("pk_alternativo between", value1, value2, "pk_alternativo");
            return this;
        }

        public Criteria andPk_alternativoNotBetween(String value1, String value2)
        {
            addCriterion("pk_alternativo not between", value1, value2, "pk_alternativo");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_HOJA_FINIsNull()
        {
            criteriaWithoutValue.add("NUMR_HOJA_FIN is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUMR_HOJA_FINIsNotNull()
        {
            criteriaWithoutValue.add("NUMR_HOJA_FIN is not null");
            return this;
        }

        public Criteria andNUMR_HOJA_FINEqualTo(String value)
        {
            addCriterion("NUMR_HOJA_FIN =", value, "NUMR_HOJA_FIN");
            return this;
        }

        public Criteria andNUMR_HOJA_FINNotEqualTo(String value)
        {
            addCriterion("NUMR_HOJA_FIN <>", value, "NUMR_HOJA_FIN");
            return this;
        }

        public Criteria andNUMR_HOJA_FINGreaterThan(String value)
        {
            addCriterion("NUMR_HOJA_FIN >", value, "NUMR_HOJA_FIN");
            return this;
        }

        public Criteria andNUMR_HOJA_FINGreaterThanOrEqualTo(String value)
        {
            addCriterion("NUMR_HOJA_FIN >=", value, "NUMR_HOJA_FIN");
            return this;
        }

        public Criteria andNUMR_HOJA_FINLessThan(String value)
        {
            addCriterion("NUMR_HOJA_FIN <", value, "NUMR_HOJA_FIN");
            return this;
        }

        public Criteria andNUMR_HOJA_FINLessThanOrEqualTo(String value)
        {
            addCriterion("NUMR_HOJA_FIN <=", value, "NUMR_HOJA_FIN");
            return this;
        }

        public Criteria andNUMR_HOJA_FINLike(String value)
        {
            addCriterion("NUMR_HOJA_FIN like", value, "NUMR_HOJA_FIN");
            return this;
        }

        public Criteria andNUMR_HOJA_FINNotLike(String value)
        {
            addCriterion("NUMR_HOJA_FIN not like", value, "NUMR_HOJA_FIN");
            return this;
        }

        public Criteria andNUMR_HOJA_FINIn(List values)
        {
            addCriterion("NUMR_HOJA_FIN in", values, "NUMR_HOJA_FIN");
            return this;
        }

        public Criteria andNUMR_HOJA_FINNotIn(List values)
        {
            addCriterion("NUMR_HOJA_FIN not in", values, "NUMR_HOJA_FIN");
            return this;
        }

        public Criteria andNUMR_HOJA_FINBetween(String value1, String value2)
        {
            addCriterion("NUMR_HOJA_FIN between", value1, value2, "NUMR_HOJA_FIN");
            return this;
        }

        public Criteria andNUMR_HOJA_FINNotBetween(String value1, String value2)
        {
            addCriterion("NUMR_HOJA_FIN not between", value1, value2, "NUMR_HOJA_FIN");
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

        public Criteria andINDC_MAGISTRADOEqualTo(String value)
        {
            addCriterion("INDC_MAGISTRADO =", value, "INDC_MAGISTRADO");
            return this;
        }

        public Criteria andNombresLike(String nombre)
        {
        	//artificio para agregar: (nombre1 = x or nombre2 = x or nombre3=x)
        	StringBuffer sb = new StringBuffer();
        	sb.append("(NOM1_SOLIC LIKE '%").append(nombre).append("%' ");
        	sb.append("OR NOM2_SOLIC LIKE '%").append(nombre).append("%' ");
        	sb.append("OR NOM3_SOLIC LIKE '%").append(nombre).append("%') ");
        	criteriaSpecialConditions.add(sb.toString());
            return this;
        }

        public Criteria andSolicitudObservada() {
        	criteriaSpecialConditions.add(" (MARCA = 'S' OR L_INDC_OFICIO='S') ");
        	return this;
		}

        public Criteria andPendienteImpresion() {
        	criteriaSpecialConditions.add(" (CODG_ESTADO_SOLICITUD != 'IMP' AND CODG_ESTADO_SOLICITUD != 'ENT' )");
			return this;
		}

        private List criteriaWithoutValue;
        private List criteriaWithSingleValue;
        private List criteriaWithListValue;
        private List criteriaWithBetweenValue;
        private List criteriaSpecialConditions;

        private Criteria()
        {
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
            criteriaSpecialConditions = new ArrayList();
        }

    }


    public SolicitudExample()
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
