// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   DistritoJudicialExample.java

package pe.gob.pj.rnc.model;

import java.util.*;

public class DistritoJudicialExample
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
        public Criteria andDESC_DISTRITO_JUDICIALIsNull()
        {
            criteriaWithoutValue.add("DESC_DISTRITO_JUDICIAL is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_DISTRITO_JUDICIALIsNotNull()
        {
            criteriaWithoutValue.add("DESC_DISTRITO_JUDICIAL is not null");
            return this;
        }

        public Criteria andDESC_DISTRITO_JUDICIALEqualTo(String value)
        {
            addCriterion("DESC_DISTRITO_JUDICIAL =", value, "DESC_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andDESC_DISTRITO_JUDICIALNotEqualTo(String value)
        {
            addCriterion("DESC_DISTRITO_JUDICIAL <>", value, "DESC_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andDESC_DISTRITO_JUDICIALGreaterThan(String value)
        {
            addCriterion("DESC_DISTRITO_JUDICIAL >", value, "DESC_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andDESC_DISTRITO_JUDICIALGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_DISTRITO_JUDICIAL >=", value, "DESC_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andDESC_DISTRITO_JUDICIALLessThan(String value)
        {
            addCriterion("DESC_DISTRITO_JUDICIAL <", value, "DESC_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andDESC_DISTRITO_JUDICIALLessThanOrEqualTo(String value)
        {
            addCriterion("DESC_DISTRITO_JUDICIAL <=", value, "DESC_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andDESC_DISTRITO_JUDICIALLike(String value)
        {
            addCriterion("DESC_DISTRITO_JUDICIAL like", value, "DESC_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andDESC_DISTRITO_JUDICIALNotLike(String value)
        {
            addCriterion("DESC_DISTRITO_JUDICIAL not like", value, "DESC_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andDESC_DISTRITO_JUDICIALIn(List values)
        {
            addCriterion("DESC_DISTRITO_JUDICIAL in", values, "DESC_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andDESC_DISTRITO_JUDICIALNotIn(List values)
        {
            addCriterion("DESC_DISTRITO_JUDICIAL not in", values, "DESC_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andDESC_DISTRITO_JUDICIALBetween(String value1, String value2)
        {
            addCriterion("DESC_DISTRITO_JUDICIAL between", value1, value2, "DESC_DISTRITO_JUDICIAL");
            return this;
        }

        public Criteria andDESC_DISTRITO_JUDICIALNotBetween(String value1, String value2)
        {
            addCriterion("DESC_DISTRITO_JUDICIAL not between", value1, value2, "DESC_DISTRITO_JUDICIAL");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_LOCALIsNull()
        {
            criteriaWithoutValue.add("INDC_LOCAL is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_LOCALIsNotNull()
        {
            criteriaWithoutValue.add("INDC_LOCAL is not null");
            return this;
        }

        public Criteria andINDC_LOCALEqualTo(String value)
        {
            addCriterion("INDC_LOCAL =", value, "INDC_LOCAL");
            return this;
        }

        public Criteria andINDC_LOCALNotEqualTo(String value)
        {
            addCriterion("INDC_LOCAL <>", value, "INDC_LOCAL");
            return this;
        }

        public Criteria andINDC_LOCALGreaterThan(String value)
        {
            addCriterion("INDC_LOCAL >", value, "INDC_LOCAL");
            return this;
        }

        public Criteria andINDC_LOCALGreaterThanOrEqualTo(String value)
        {
            addCriterion("INDC_LOCAL >=", value, "INDC_LOCAL");
            return this;
        }

        public Criteria andINDC_LOCALLessThan(String value)
        {
            addCriterion("INDC_LOCAL <", value, "INDC_LOCAL");
            return this;
        }

        public Criteria andINDC_LOCALLessThanOrEqualTo(String value)
        {
            addCriterion("INDC_LOCAL <=", value, "INDC_LOCAL");
            return this;
        }

        public Criteria andINDC_LOCALLike(String value)
        {
            addCriterion("INDC_LOCAL like", value, "INDC_LOCAL");
            return this;
        }

        public Criteria andINDC_LOCALNotLike(String value)
        {
            addCriterion("INDC_LOCAL not like", value, "INDC_LOCAL");
            return this;
        }

        public Criteria andINDC_LOCALIn(List values)
        {
            addCriterion("INDC_LOCAL in", values, "INDC_LOCAL");
            return this;
        }

        public Criteria andINDC_LOCALNotIn(List values)
        {
            addCriterion("INDC_LOCAL not in", values, "INDC_LOCAL");
            return this;
        }

        public Criteria andINDC_LOCALBetween(String value1, String value2)
        {
            addCriterion("INDC_LOCAL between", value1, value2, "INDC_LOCAL");
            return this;
        }

        public Criteria andINDC_LOCALNotBetween(String value1, String value2)
        {
            addCriterion("INDC_LOCAL not between", value1, value2, "INDC_LOCAL");
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
        public Criteria andCODG_LUGAR_DJIsNull()
        {
            criteriaWithoutValue.add("CODG_LUGAR_DJ is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andCODG_LUGAR_DJIsNotNull()
        {
            criteriaWithoutValue.add("CODG_LUGAR_DJ is not null");
            return this;
        }

        public Criteria andCODG_LUGAR_DJEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_DJ =", value, "CODG_LUGAR_DJ");
            return this;
        }

        public Criteria andCODG_LUGAR_DJNotEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_DJ <>", value, "CODG_LUGAR_DJ");
            return this;
        }

        public Criteria andCODG_LUGAR_DJGreaterThan(String value)
        {
            addCriterion("CODG_LUGAR_DJ >", value, "CODG_LUGAR_DJ");
            return this;
        }

        public Criteria andCODG_LUGAR_DJGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_DJ >=", value, "CODG_LUGAR_DJ");
            return this;
        }

        public Criteria andCODG_LUGAR_DJLessThan(String value)
        {
            addCriterion("CODG_LUGAR_DJ <", value, "CODG_LUGAR_DJ");
            return this;
        }

        public Criteria andCODG_LUGAR_DJLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_LUGAR_DJ <=", value, "CODG_LUGAR_DJ");
            return this;
        }

        public Criteria andCODG_LUGAR_DJLike(String value)
        {
            addCriterion("CODG_LUGAR_DJ like", value, "CODG_LUGAR_DJ");
            return this;
        }

        public Criteria andCODG_LUGAR_DJNotLike(String value)
        {
            addCriterion("CODG_LUGAR_DJ not like", value, "CODG_LUGAR_DJ");
            return this;
        }

        public Criteria andCODG_LUGAR_DJIn(List values)
        {
            addCriterion("CODG_LUGAR_DJ in", values, "CODG_LUGAR_DJ");
            return this;
        }

        public Criteria andCODG_LUGAR_DJNotIn(List values)
        {
            addCriterion("CODG_LUGAR_DJ not in", values, "CODG_LUGAR_DJ");
            return this;
        }

        public Criteria andCODG_LUGAR_DJBetween(String value1, String value2)
        {
            addCriterion("CODG_LUGAR_DJ between", value1, value2, "CODG_LUGAR_DJ");
            return this;
        }

        public Criteria andCODG_LUGAR_DJNotBetween(String value1, String value2)
        {
            addCriterion("CODG_LUGAR_DJ not between", value1, value2, "CODG_LUGAR_DJ");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_SISTEMA_RDCIsNull()
        {
            criteriaWithoutValue.add("INDC_SISTEMA_RDC is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andINDC_SISTEMA_RDCIsNotNull()
        {
            criteriaWithoutValue.add("INDC_SISTEMA_RDC is not null");
            return this;
        }

        public Criteria andINDC_SISTEMA_RDCEqualTo(String value)
        {
            addCriterion("INDC_SISTEMA_RDC =", value, "INDC_SISTEMA_RDC");
            return this;
        }

        public Criteria andINDC_SISTEMA_RDCNotEqualTo(String value)
        {
            addCriterion("INDC_SISTEMA_RDC <>", value, "INDC_SISTEMA_RDC");
            return this;
        }

        public Criteria andINDC_SISTEMA_RDCGreaterThan(String value)
        {
            addCriterion("INDC_SISTEMA_RDC >", value, "INDC_SISTEMA_RDC");
            return this;
        }

        public Criteria andINDC_SISTEMA_RDCGreaterThanOrEqualTo(String value)
        {
            addCriterion("INDC_SISTEMA_RDC >=", value, "INDC_SISTEMA_RDC");
            return this;
        }

        public Criteria andINDC_SISTEMA_RDCLessThan(String value)
        {
            addCriterion("INDC_SISTEMA_RDC <", value, "INDC_SISTEMA_RDC");
            return this;
        }

        public Criteria andINDC_SISTEMA_RDCLessThanOrEqualTo(String value)
        {
            addCriterion("INDC_SISTEMA_RDC <=", value, "INDC_SISTEMA_RDC");
            return this;
        }

        public Criteria andINDC_SISTEMA_RDCLike(String value)
        {
            addCriterion("INDC_SISTEMA_RDC like", value, "INDC_SISTEMA_RDC");
            return this;
        }

        public Criteria andINDC_SISTEMA_RDCNotLike(String value)
        {
            addCriterion("INDC_SISTEMA_RDC not like", value, "INDC_SISTEMA_RDC");
            return this;
        }

        public Criteria andINDC_SISTEMA_RDCIn(List values)
        {
            addCriterion("INDC_SISTEMA_RDC in", values, "INDC_SISTEMA_RDC");
            return this;
        }

        public Criteria andINDC_SISTEMA_RDCNotIn(List values)
        {
            addCriterion("INDC_SISTEMA_RDC not in", values, "INDC_SISTEMA_RDC");
            return this;
        }

        public Criteria andINDC_SISTEMA_RDCBetween(String value1, String value2)
        {
            addCriterion("INDC_SISTEMA_RDC between", value1, value2, "INDC_SISTEMA_RDC");
            return this;
        }

        public Criteria andINDC_SISTEMA_RDCNotBetween(String value1, String value2)
        {
            addCriterion("INDC_SISTEMA_RDC not between", value1, value2, "INDC_SISTEMA_RDC");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andRUTA_PRODUCCIONIsNull()
        {
            criteriaWithoutValue.add("RUTA_PRODUCCION is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andRUTA_PRODUCCIONIsNotNull()
        {
            criteriaWithoutValue.add("RUTA_PRODUCCION is not null");
            return this;
        }

        public Criteria andRUTA_PRODUCCIONEqualTo(String value)
        {
            addCriterion("RUTA_PRODUCCION =", value, "RUTA_PRODUCCION");
            return this;
        }

        public Criteria andRUTA_PRODUCCIONNotEqualTo(String value)
        {
            addCriterion("RUTA_PRODUCCION <>", value, "RUTA_PRODUCCION");
            return this;
        }

        public Criteria andRUTA_PRODUCCIONGreaterThan(String value)
        {
            addCriterion("RUTA_PRODUCCION >", value, "RUTA_PRODUCCION");
            return this;
        }

        public Criteria andRUTA_PRODUCCIONGreaterThanOrEqualTo(String value)
        {
            addCriterion("RUTA_PRODUCCION >=", value, "RUTA_PRODUCCION");
            return this;
        }

        public Criteria andRUTA_PRODUCCIONLessThan(String value)
        {
            addCriterion("RUTA_PRODUCCION <", value, "RUTA_PRODUCCION");
            return this;
        }

        public Criteria andRUTA_PRODUCCIONLessThanOrEqualTo(String value)
        {
            addCriterion("RUTA_PRODUCCION <=", value, "RUTA_PRODUCCION");
            return this;
        }

        public Criteria andRUTA_PRODUCCIONLike(String value)
        {
            addCriterion("RUTA_PRODUCCION like", value, "RUTA_PRODUCCION");
            return this;
        }

        public Criteria andRUTA_PRODUCCIONNotLike(String value)
        {
            addCriterion("RUTA_PRODUCCION not like", value, "RUTA_PRODUCCION");
            return this;
        }

        public Criteria andRUTA_PRODUCCIONIn(List values)
        {
            addCriterion("RUTA_PRODUCCION in", values, "RUTA_PRODUCCION");
            return this;
        }

        public Criteria andRUTA_PRODUCCIONNotIn(List values)
        {
            addCriterion("RUTA_PRODUCCION not in", values, "RUTA_PRODUCCION");
            return this;
        }

        public Criteria andRUTA_PRODUCCIONBetween(String value1, String value2)
        {
            addCriterion("RUTA_PRODUCCION between", value1, value2, "RUTA_PRODUCCION");
            return this;
        }

        public Criteria andRUTA_PRODUCCIONNotBetween(String value1, String value2)
        {
            addCriterion("RUTA_PRODUCCION not between", value1, value2, "RUTA_PRODUCCION");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andRUTA_APLICACIONIsNull()
        {
            criteriaWithoutValue.add("RUTA_APLICACION is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andRUTA_APLICACIONIsNotNull()
        {
            criteriaWithoutValue.add("RUTA_APLICACION is not null");
            return this;
        }

        public Criteria andRUTA_APLICACIONEqualTo(String value)
        {
            addCriterion("RUTA_APLICACION =", value, "RUTA_APLICACION");
            return this;
        }

        public Criteria andRUTA_APLICACIONNotEqualTo(String value)
        {
            addCriterion("RUTA_APLICACION <>", value, "RUTA_APLICACION");
            return this;
        }

        public Criteria andRUTA_APLICACIONGreaterThan(String value)
        {
            addCriterion("RUTA_APLICACION >", value, "RUTA_APLICACION");
            return this;
        }

        public Criteria andRUTA_APLICACIONGreaterThanOrEqualTo(String value)
        {
            addCriterion("RUTA_APLICACION >=", value, "RUTA_APLICACION");
            return this;
        }

        public Criteria andRUTA_APLICACIONLessThan(String value)
        {
            addCriterion("RUTA_APLICACION <", value, "RUTA_APLICACION");
            return this;
        }

        public Criteria andRUTA_APLICACIONLessThanOrEqualTo(String value)
        {
            addCriterion("RUTA_APLICACION <=", value, "RUTA_APLICACION");
            return this;
        }

        public Criteria andRUTA_APLICACIONLike(String value)
        {
            addCriterion("RUTA_APLICACION like", value, "RUTA_APLICACION");
            return this;
        }

        public Criteria andRUTA_APLICACIONNotLike(String value)
        {
            addCriterion("RUTA_APLICACION not like", value, "RUTA_APLICACION");
            return this;
        }

        public Criteria andRUTA_APLICACIONIn(List values)
        {
            addCriterion("RUTA_APLICACION in", values, "RUTA_APLICACION");
            return this;
        }

        public Criteria andRUTA_APLICACIONNotIn(List values)
        {
            addCriterion("RUTA_APLICACION not in", values, "RUTA_APLICACION");
            return this;
        }

        public Criteria andRUTA_APLICACIONBetween(String value1, String value2)
        {
            addCriterion("RUTA_APLICACION between", value1, value2, "RUTA_APLICACION");
            return this;
        }

        public Criteria andRUTA_APLICACIONNotBetween(String value1, String value2)
        {
            addCriterion("RUTA_APLICACION not between", value1, value2, "RUTA_APLICACION");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andRUTA_AYUDAIsNull()
        {
            criteriaWithoutValue.add("RUTA_AYUDA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andRUTA_AYUDAIsNotNull()
        {
            criteriaWithoutValue.add("RUTA_AYUDA is not null");
            return this;
        }

        public Criteria andRUTA_AYUDAEqualTo(String value)
        {
            addCriterion("RUTA_AYUDA =", value, "RUTA_AYUDA");
            return this;
        }

        public Criteria andRUTA_AYUDANotEqualTo(String value)
        {
            addCriterion("RUTA_AYUDA <>", value, "RUTA_AYUDA");
            return this;
        }

        public Criteria andRUTA_AYUDAGreaterThan(String value)
        {
            addCriterion("RUTA_AYUDA >", value, "RUTA_AYUDA");
            return this;
        }

        public Criteria andRUTA_AYUDAGreaterThanOrEqualTo(String value)
        {
            addCriterion("RUTA_AYUDA >=", value, "RUTA_AYUDA");
            return this;
        }

        public Criteria andRUTA_AYUDALessThan(String value)
        {
            addCriterion("RUTA_AYUDA <", value, "RUTA_AYUDA");
            return this;
        }

        public Criteria andRUTA_AYUDALessThanOrEqualTo(String value)
        {
            addCriterion("RUTA_AYUDA <=", value, "RUTA_AYUDA");
            return this;
        }

        public Criteria andRUTA_AYUDALike(String value)
        {
            addCriterion("RUTA_AYUDA like", value, "RUTA_AYUDA");
            return this;
        }

        public Criteria andRUTA_AYUDANotLike(String value)
        {
            addCriterion("RUTA_AYUDA not like", value, "RUTA_AYUDA");
            return this;
        }

        public Criteria andRUTA_AYUDAIn(List values)
        {
            addCriterion("RUTA_AYUDA in", values, "RUTA_AYUDA");
            return this;
        }

        public Criteria andRUTA_AYUDANotIn(List values)
        {
            addCriterion("RUTA_AYUDA not in", values, "RUTA_AYUDA");
            return this;
        }

        public Criteria andRUTA_AYUDABetween(String value1, String value2)
        {
            addCriterion("RUTA_AYUDA between", value1, value2, "RUTA_AYUDA");
            return this;
        }

        public Criteria andRUTA_AYUDANotBetween(String value1, String value2)
        {
            addCriterion("RUTA_AYUDA not between", value1, value2, "RUTA_AYUDA");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andRUTA_CAMARAIsNull()
        {
            criteriaWithoutValue.add("RUTA_CAMARA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andRUTA_CAMARAIsNotNull()
        {
            criteriaWithoutValue.add("RUTA_CAMARA is not null");
            return this;
        }

        public Criteria andRUTA_CAMARAEqualTo(String value)
        {
            addCriterion("RUTA_CAMARA =", value, "RUTA_CAMARA");
            return this;
        }

        public Criteria andRUTA_CAMARANotEqualTo(String value)
        {
            addCriterion("RUTA_CAMARA <>", value, "RUTA_CAMARA");
            return this;
        }

        public Criteria andRUTA_CAMARAGreaterThan(String value)
        {
            addCriterion("RUTA_CAMARA >", value, "RUTA_CAMARA");
            return this;
        }

        public Criteria andRUTA_CAMARAGreaterThanOrEqualTo(String value)
        {
            addCriterion("RUTA_CAMARA >=", value, "RUTA_CAMARA");
            return this;
        }

        public Criteria andRUTA_CAMARALessThan(String value)
        {
            addCriterion("RUTA_CAMARA <", value, "RUTA_CAMARA");
            return this;
        }

        public Criteria andRUTA_CAMARALessThanOrEqualTo(String value)
        {
            addCriterion("RUTA_CAMARA <=", value, "RUTA_CAMARA");
            return this;
        }

        public Criteria andRUTA_CAMARALike(String value)
        {
            addCriterion("RUTA_CAMARA like", value, "RUTA_CAMARA");
            return this;
        }

        public Criteria andRUTA_CAMARANotLike(String value)
        {
            addCriterion("RUTA_CAMARA not like", value, "RUTA_CAMARA");
            return this;
        }

        public Criteria andRUTA_CAMARAIn(List values)
        {
            addCriterion("RUTA_CAMARA in", values, "RUTA_CAMARA");
            return this;
        }

        public Criteria andRUTA_CAMARANotIn(List values)
        {
            addCriterion("RUTA_CAMARA not in", values, "RUTA_CAMARA");
            return this;
        }

        public Criteria andRUTA_CAMARABetween(String value1, String value2)
        {
            addCriterion("RUTA_CAMARA between", value1, value2, "RUTA_CAMARA");
            return this;
        }

        public Criteria andRUTA_CAMARANotBetween(String value1, String value2)
        {
            addCriterion("RUTA_CAMARA not between", value1, value2, "RUTA_CAMARA");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andRUTA_ESCANERIsNull()
        {
            criteriaWithoutValue.add("RUTA_ESCANER is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andRUTA_ESCANERIsNotNull()
        {
            criteriaWithoutValue.add("RUTA_ESCANER is not null");
            return this;
        }

        public Criteria andRUTA_ESCANEREqualTo(String value)
        {
            addCriterion("RUTA_ESCANER =", value, "RUTA_ESCANER");
            return this;
        }

        public Criteria andRUTA_ESCANERNotEqualTo(String value)
        {
            addCriterion("RUTA_ESCANER <>", value, "RUTA_ESCANER");
            return this;
        }

        public Criteria andRUTA_ESCANERGreaterThan(String value)
        {
            addCriterion("RUTA_ESCANER >", value, "RUTA_ESCANER");
            return this;
        }

        public Criteria andRUTA_ESCANERGreaterThanOrEqualTo(String value)
        {
            addCriterion("RUTA_ESCANER >=", value, "RUTA_ESCANER");
            return this;
        }

        public Criteria andRUTA_ESCANERLessThan(String value)
        {
            addCriterion("RUTA_ESCANER <", value, "RUTA_ESCANER");
            return this;
        }

        public Criteria andRUTA_ESCANERLessThanOrEqualTo(String value)
        {
            addCriterion("RUTA_ESCANER <=", value, "RUTA_ESCANER");
            return this;
        }

        public Criteria andRUTA_ESCANERLike(String value)
        {
            addCriterion("RUTA_ESCANER like", value, "RUTA_ESCANER");
            return this;
        }

        public Criteria andRUTA_ESCANERNotLike(String value)
        {
            addCriterion("RUTA_ESCANER not like", value, "RUTA_ESCANER");
            return this;
        }

        public Criteria andRUTA_ESCANERIn(List values)
        {
            addCriterion("RUTA_ESCANER in", values, "RUTA_ESCANER");
            return this;
        }

        public Criteria andRUTA_ESCANERNotIn(List values)
        {
            addCriterion("RUTA_ESCANER not in", values, "RUTA_ESCANER");
            return this;
        }

        public Criteria andRUTA_ESCANERBetween(String value1, String value2)
        {
            addCriterion("RUTA_ESCANER between", value1, value2, "RUTA_ESCANER");
            return this;
        }

        public Criteria andRUTA_ESCANERNotBetween(String value1, String value2)
        {
            addCriterion("RUTA_ESCANER not between", value1, value2, "RUTA_ESCANER");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andRUTA_BMPSIsNull()
        {
            criteriaWithoutValue.add("RUTA_BMPS is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andRUTA_BMPSIsNotNull()
        {
            criteriaWithoutValue.add("RUTA_BMPS is not null");
            return this;
        }

        public Criteria andRUTA_BMPSEqualTo(String value)
        {
            addCriterion("RUTA_BMPS =", value, "RUTA_BMPS");
            return this;
        }

        public Criteria andRUTA_BMPSNotEqualTo(String value)
        {
            addCriterion("RUTA_BMPS <>", value, "RUTA_BMPS");
            return this;
        }

        public Criteria andRUTA_BMPSGreaterThan(String value)
        {
            addCriterion("RUTA_BMPS >", value, "RUTA_BMPS");
            return this;
        }

        public Criteria andRUTA_BMPSGreaterThanOrEqualTo(String value)
        {
            addCriterion("RUTA_BMPS >=", value, "RUTA_BMPS");
            return this;
        }

        public Criteria andRUTA_BMPSLessThan(String value)
        {
            addCriterion("RUTA_BMPS <", value, "RUTA_BMPS");
            return this;
        }

        public Criteria andRUTA_BMPSLessThanOrEqualTo(String value)
        {
            addCriterion("RUTA_BMPS <=", value, "RUTA_BMPS");
            return this;
        }

        public Criteria andRUTA_BMPSLike(String value)
        {
            addCriterion("RUTA_BMPS like", value, "RUTA_BMPS");
            return this;
        }

        public Criteria andRUTA_BMPSNotLike(String value)
        {
            addCriterion("RUTA_BMPS not like", value, "RUTA_BMPS");
            return this;
        }

        public Criteria andRUTA_BMPSIn(List values)
        {
            addCriterion("RUTA_BMPS in", values, "RUTA_BMPS");
            return this;
        }

        public Criteria andRUTA_BMPSNotIn(List values)
        {
            addCriterion("RUTA_BMPS not in", values, "RUTA_BMPS");
            return this;
        }

        public Criteria andRUTA_BMPSBetween(String value1, String value2)
        {
            addCriterion("RUTA_BMPS between", value1, value2, "RUTA_BMPS");
            return this;
        }

        public Criteria andRUTA_BMPSNotBetween(String value1, String value2)
        {
            addCriterion("RUTA_BMPS not between", value1, value2, "RUTA_BMPS");
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
        @SuppressWarnings("unchecked")
        public Criteria andALERTA_PAPELIsNull()
        {
            criteriaWithoutValue.add("ALERTA_PAPEL is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andALERTA_PAPELIsNotNull()
        {
            criteriaWithoutValue.add("ALERTA_PAPEL is not null");
            return this;
        }

        public Criteria andALERTA_PAPELEqualTo(String value)
        {
            addCriterion("ALERTA_PAPEL =", value, "ALERTA_PAPEL");
            return this;
        }

        public Criteria andALERTA_PAPELNotEqualTo(String value)
        {
            addCriterion("ALERTA_PAPEL <>", value, "ALERTA_PAPEL");
            return this;
        }

        public Criteria andALERTA_PAPELGreaterThan(String value)
        {
            addCriterion("ALERTA_PAPEL >", value, "ALERTA_PAPEL");
            return this;
        }

        public Criteria andALERTA_PAPELGreaterThanOrEqualTo(String value)
        {
            addCriterion("ALERTA_PAPEL >=", value, "ALERTA_PAPEL");
            return this;
        }

        public Criteria andALERTA_PAPELLessThan(String value)
        {
            addCriterion("ALERTA_PAPEL <", value, "ALERTA_PAPEL");
            return this;
        }

        public Criteria andALERTA_PAPELLessThanOrEqualTo(String value)
        {
            addCriterion("ALERTA_PAPEL <=", value, "ALERTA_PAPEL");
            return this;
        }

        public Criteria andALERTA_PAPELLike(String value)
        {
            addCriterion("ALERTA_PAPEL like", value, "ALERTA_PAPEL");
            return this;
        }

        public Criteria andALERTA_PAPELNotLike(String value)
        {
            addCriterion("ALERTA_PAPEL not like", value, "ALERTA_PAPEL");
            return this;
        }

        public Criteria andALERTA_PAPELIn(List values)
        {
            addCriterion("ALERTA_PAPEL in", values, "ALERTA_PAPEL");
            return this;
        }

        public Criteria andALERTA_PAPELNotIn(List values)
        {
            addCriterion("ALERTA_PAPEL not in", values, "ALERTA_PAPEL");
            return this;
        }

        public Criteria andALERTA_PAPELBetween(String value1, String value2)
        {
            addCriterion("ALERTA_PAPEL between", value1, value2, "ALERTA_PAPEL");
            return this;
        }

        public Criteria andC_CONVENIOSIsNull()
        {
            criteriaWithoutValue.add("C_CONVENIOS is null");
            return this;
        }

        public Criteria andC_CONVENIOSEqualTo(String value)
        {
        	addCriterion("C_CONVENIOS =", value, "C_CONVENIOS");
            return this;
        }
        
        public Criteria andALERTA_PAPELNotBetween(String value1, String value2)
        {
            addCriterion("ALERTA_PAPEL not between", value1, value2, "ALERTA_PAPEL");
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


    public DistritoJudicialExample()
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
