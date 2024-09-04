// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SolicitudExternaExample.java

package pe.gob.pj.rnc.model;

import java.util.*;

public class SolicitudExternaExample
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
		public Criteria andCODG_CERTI_EXTERNOIsNull()
        {
            criteriaWithoutValue.add("CODG_CERTI_EXTERNO is null");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andCODG_CERTI_EXTERNOIsNotNull()
        {
            criteriaWithoutValue.add("CODG_CERTI_EXTERNO is not null");
            return this;
        }

        public Criteria andCODG_CERTI_EXTERNOEqualTo(Integer value)
        {
            addCriterion("CODG_CERTI_EXTERNO =", value, "CODG_CERTI_EXTERNO");
            return this;
        }

        public Criteria andCODG_CERTI_EXTERNONotEqualTo(Integer value)
        {
            addCriterion("CODG_CERTI_EXTERNO <>", value, "CODG_CERTI_EXTERNO");
            return this;
        }

        public Criteria andCODG_CERTI_EXTERNOGreaterThan(Integer value)
        {
            addCriterion("CODG_CERTI_EXTERNO >", value, "CODG_CERTI_EXTERNO");
            return this;
        }

        public Criteria andCODG_CERTI_EXTERNOGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("CODG_CERTI_EXTERNO >=", value, "CODG_CERTI_EXTERNO");
            return this;
        }

        public Criteria andCODG_CERTI_EXTERNOLessThan(Integer value)
        {
            addCriterion("CODG_CERTI_EXTERNO <", value, "CODG_CERTI_EXTERNO");
            return this;
        }

        public Criteria andCODG_CERTI_EXTERNOLessThanOrEqualTo(Integer value)
        {
            addCriterion("CODG_CERTI_EXTERNO <=", value, "CODG_CERTI_EXTERNO");
            return this;
        }

        public Criteria andCODG_CERTI_EXTERNOIn(List values)
        {
            addCriterion("CODG_CERTI_EXTERNO in", values, "CODG_CERTI_EXTERNO");
            return this;
        }

        public Criteria andCODG_CERTI_EXTERNONotIn(List values)
        {
            addCriterion("CODG_CERTI_EXTERNO not in", values, "CODG_CERTI_EXTERNO");
            return this;
        }

        public Criteria andCODG_CERTI_EXTERNOBetween(Integer value1, Integer value2)
        {
            addCriterion("CODG_CERTI_EXTERNO between", value1, value2, "CODG_CERTI_EXTERNO");
            return this;
        }

        public Criteria andCODG_CERTI_EXTERNONotBetween(Integer value1, Integer value2)
        {
            addCriterion("CODG_CERTI_EXTERNO not between", value1, value2, "CODG_CERTI_EXTERNO");
            return this;
        }

        @SuppressWarnings("unchecked")
		public Criteria andCODG_ESTADOIsNull()
        {
            criteriaWithoutValue.add("CODG_ESTADO is null");
            return this;
        }

        @SuppressWarnings("unchecked")
        public Criteria andCODG_ESTADOIsNotNull()
        {
            criteriaWithoutValue.add("CODG_ESTADO is not null");
            return this;
        }

        public Criteria andCODG_ESTADOEqualTo(String value)
        {
            addCriterion("CODG_ESTADO =", value, "CODG_ESTADO");
            return this;
        }

        public Criteria andCODG_ESTADONotEqualTo(String value)
        {
            addCriterion("CODG_ESTADO <>", value, "CODG_ESTADO");
            return this;
        }

        public Criteria andCODG_ESTADOGreaterThan(String value)
        {
            addCriterion("CODG_ESTADO >", value, "CODG_ESTADO");
            return this;
        }

        public Criteria andCODG_ESTADOGreaterThanOrEqualTo(String value)
        {
            addCriterion("CODG_ESTADO >=", value, "CODG_ESTADO");
            return this;
        }

        public Criteria andCODG_ESTADOLessThan(String value)
        {
            addCriterion("CODG_ESTADO <", value, "CODG_ESTADO");
            return this;
        }

        public Criteria andCODG_ESTADOLessThanOrEqualTo(String value)
        {
            addCriterion("CODG_ESTADO <=", value, "CODG_ESTADO");
            return this;
        }

        public Criteria andCODG_ESTADOLike(String value)
        {
            addCriterion("CODG_ESTADO like", value, "CODG_ESTADO");
            return this;
        }

        public Criteria andCODG_ESTADONotLike(String value)
        {
            addCriterion("CODG_ESTADO not like", value, "CODG_ESTADO");
            return this;
        }

        public Criteria andCODG_ESTADOIn(List values)
        {
            addCriterion("CODG_ESTADO in", values, "CODG_ESTADO");
            return this;
        }

        public Criteria andCODG_ESTADONotIn(List values)
        {
            addCriterion("CODG_ESTADO not in", values, "CODG_ESTADO");
            return this;
        }

        public Criteria andCODG_ESTADOBetween(String value1, String value2)
        {
            addCriterion("CODG_ESTADO between", value1, value2, "CODG_ESTADO");
            return this;
        }

        public Criteria andCODG_ESTADONotBetween(String value1, String value2)
        {
            addCriterion("CODG_ESTADO not between", value1, value2, "CODG_ESTADO");
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
        public Criteria andV_OFI_RESPUESTA_AIsNull()
        {
            criteriaWithoutValue.add("V_OFI_RESPUESTA_A is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andV_OFI_RESPUESTA_AIsNotNull()
        {
            criteriaWithoutValue.add("V_OFI_RESPUESTA_A is not null");
            return this;
        }

        public Criteria andV_OFI_RESPUESTA_AEqualTo(String value)
        {
            addCriterion("V_OFI_RESPUESTA_A =", value, "V_OFI_RESPUESTA_A");
            return this;
        }

        public Criteria andV_OFI_RESPUESTA_ANotEqualTo(String value)
        {
            addCriterion("V_OFI_RESPUESTA_A <>", value, "V_OFI_RESPUESTA_A");
            return this;
        }

        public Criteria andV_OFI_RESPUESTA_AGreaterThan(String value)
        {
            addCriterion("V_OFI_RESPUESTA_A >", value, "V_OFI_RESPUESTA_A");
            return this;
        }

        public Criteria andV_OFI_RESPUESTA_AGreaterThanOrEqualTo(String value)
        {
            addCriterion("V_OFI_RESPUESTA_A >=", value, "V_OFI_RESPUESTA_A");
            return this;
        }

        public Criteria andV_OFI_RESPUESTA_ALessThan(String value)
        {
            addCriterion("V_OFI_RESPUESTA_A <", value, "V_OFI_RESPUESTA_A");
            return this;
        }

        public Criteria andV_OFI_RESPUESTA_ALessThanOrEqualTo(String value)
        {
            addCriterion("V_OFI_RESPUESTA_A <=", value, "V_OFI_RESPUESTA_A");
            return this;
        }

        public Criteria andV_OFI_RESPUESTA_ALike(String value)
        {
            addCriterion("V_OFI_RESPUESTA_A like", value, "V_OFI_RESPUESTA_A");
            return this;
        }

        public Criteria andV_OFI_RESPUESTA_ANotLike(String value)
        {
            addCriterion("V_OFI_RESPUESTA_A not like", value, "V_OFI_RESPUESTA_A");
            return this;
        }

        public Criteria andV_OFI_RESPUESTA_AIn(List values)
        {
            addCriterion("V_OFI_RESPUESTA_A in", values, "V_OFI_RESPUESTA_A");
            return this;
        }

        public Criteria andV_OFI_RESPUESTA_ANotIn(List values)
        {
            addCriterion("V_OFI_RESPUESTA_A not in", values, "V_OFI_RESPUESTA_A");
            return this;
        }

        public Criteria andV_OFI_RESPUESTA_ABetween(String value1, String value2)
        {
            addCriterion("V_OFI_RESPUESTA_A between", value1, value2, "V_OFI_RESPUESTA_A");
            return this;
        }

        public Criteria andV_OFI_RESPUESTA_ANotBetween(String value1, String value2)
        {
            addCriterion("V_OFI_RESPUESTA_A not between", value1, value2, "V_OFI_RESPUESTA_A");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andV_OFI_RESPUESTA_BIsNull()
        {
            criteriaWithoutValue.add("V_OFI_RESPUESTA_B is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andV_OFI_RESPUESTA_BIsNotNull()
        {
            criteriaWithoutValue.add("V_OFI_RESPUESTA_B is not null");
            return this;
        }

        public Criteria andV_OFI_RESPUESTA_BEqualTo(String value)
        {
            addCriterion("V_OFI_RESPUESTA_B =", value, "V_OFI_RESPUESTA_B");
            return this;
        }

        public Criteria andV_OFI_RESPUESTA_BNotEqualTo(String value)
        {
            addCriterion("V_OFI_RESPUESTA_B <>", value, "V_OFI_RESPUESTA_B");
            return this;
        }

        public Criteria andV_OFI_RESPUESTA_BGreaterThan(String value)
        {
            addCriterion("V_OFI_RESPUESTA_B >", value, "V_OFI_RESPUESTA_B");
            return this;
        }

        public Criteria andV_OFI_RESPUESTA_BGreaterThanOrEqualTo(String value)
        {
            addCriterion("V_OFI_RESPUESTA_B >=", value, "V_OFI_RESPUESTA_B");
            return this;
        }

        public Criteria andV_OFI_RESPUESTA_BLessThan(String value)
        {
            addCriterion("V_OFI_RESPUESTA_B <", value, "V_OFI_RESPUESTA_B");
            return this;
        }

        public Criteria andV_OFI_RESPUESTA_BLessThanOrEqualTo(String value)
        {
            addCriterion("V_OFI_RESPUESTA_B <=", value, "V_OFI_RESPUESTA_B");
            return this;
        }

        public Criteria andV_OFI_RESPUESTA_BLike(String value)
        {
            addCriterion("V_OFI_RESPUESTA_B like", value, "V_OFI_RESPUESTA_B");
            return this;
        }

        public Criteria andV_OFI_RESPUESTA_BNotLike(String value)
        {
            addCriterion("V_OFI_RESPUESTA_B not like", value, "V_OFI_RESPUESTA_B");
            return this;
        }

        public Criteria andV_OFI_RESPUESTA_BIn(List values)
        {
            addCriterion("V_OFI_RESPUESTA_B in", values, "V_OFI_RESPUESTA_B");
            return this;
        }

        public Criteria andV_OFI_RESPUESTA_BNotIn(List values)
        {
            addCriterion("V_OFI_RESPUESTA_B not in", values, "V_OFI_RESPUESTA_B");
            return this;
        }

        public Criteria andV_OFI_RESPUESTA_BBetween(String value1, String value2)
        {
            addCriterion("V_OFI_RESPUESTA_B between", value1, value2, "V_OFI_RESPUESTA_B");
            return this;
        }

        public Criteria andV_OFI_RESPUESTA_BNotBetween(String value1, String value2)
        {
            addCriterion("V_OFI_RESPUESTA_B not between", value1, value2, "V_OFI_RESPUESTA_B");
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
        public Criteria andFECH_ENVIOIsNull()
        {
            criteriaWithoutValue.add("FECH_ENVIO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_ENVIOIsNotNull()
        {
            criteriaWithoutValue.add("FECH_ENVIO is not null");
            return this;
        }

        public Criteria andFECH_ENVIOEqualTo(Date value)
        {
            addCriterion("FECH_ENVIO =", value, "FECH_ENVIO");
            return this;
        }

        public Criteria andFECH_ENVIONotEqualTo(Date value)
        {
            addCriterion("FECH_ENVIO <>", value, "FECH_ENVIO");
            return this;
        }

        public Criteria andFECH_ENVIOGreaterThan(Date value)
        {
            addCriterion("FECH_ENVIO >", value, "FECH_ENVIO");
            return this;
        }

        public Criteria andFECH_ENVIOGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FECH_ENVIO >=", value, "FECH_ENVIO");
            return this;
        }

        public Criteria andFECH_ENVIOLessThan(Date value)
        {
            addCriterion("FECH_ENVIO <", value, "FECH_ENVIO");
            return this;
        }

        public Criteria andFECH_ENVIOLessThanOrEqualTo(Date value)
        {
            addCriterion("FECH_ENVIO <=", value, "FECH_ENVIO");
            return this;
        }

        public Criteria andFECH_ENVIOIn(List values)
        {
            addCriterion("FECH_ENVIO in", values, "FECH_ENVIO");
            return this;
        }

        public Criteria andFECH_ENVIONotIn(List values)
        {
            addCriterion("FECH_ENVIO not in", values, "FECH_ENVIO");
            return this;
        }

        public Criteria andFECH_ENVIOBetween(Date value1, Date value2)
        {
            addCriterion("FECH_ENVIO between", value1, value2, "FECH_ENVIO");
            return this;
        }

        public Criteria andFECH_ENVIONotBetween(Date value1, Date value2)
        {
            addCriterion("FECH_ENVIO not between", value1, value2, "FECH_ENVIO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_ATENCIONIsNull()
        {
            criteriaWithoutValue.add("FECH_ATENCION is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andFECH_ATENCIONIsNotNull()
        {
            criteriaWithoutValue.add("FECH_ATENCION is not null");
            return this;
        }

        public Criteria andFECH_ATENCIONEqualTo(Date value)
        {
            addCriterion("FECH_ATENCION =", value, "FECH_ATENCION");
            return this;
        }

        public Criteria andFECH_ATENCIONNotEqualTo(Date value)
        {
            addCriterion("FECH_ATENCION <>", value, "FECH_ATENCION");
            return this;
        }

        public Criteria andFECH_ATENCIONGreaterThan(Date value)
        {
            addCriterion("FECH_ATENCION >", value, "FECH_ATENCION");
            return this;
        }

        public Criteria andFECH_ATENCIONGreaterThanOrEqualTo(Date value)
        {
            addCriterion("FECH_ATENCION >=", value, "FECH_ATENCION");
            return this;
        }

        public Criteria andFECH_ATENCIONLessThan(Date value)
        {
            addCriterion("FECH_ATENCION <", value, "FECH_ATENCION");
            return this;
        }

        public Criteria andFECH_ATENCIONLessThanOrEqualTo(Date value)
        {
            addCriterion("FECH_ATENCION <=", value, "FECH_ATENCION");
            return this;
        }

        public Criteria andFECH_ATENCIONIn(List values)
        {
            addCriterion("FECH_ATENCION in", values, "FECH_ATENCION");
            return this;
        }

        public Criteria andFECH_ATENCIONNotIn(List values)
        {
            addCriterion("FECH_ATENCION not in", values, "FECH_ATENCION");
            return this;
        }

        public Criteria andFECH_ATENCIONBetween(Date value1, Date value2)
        {
            addCriterion("FECH_ATENCION between", value1, value2, "FECH_ATENCION");
            return this;
        }

        public Criteria andFECH_ATENCIONNotBetween(Date value1, Date value2)
        {
            addCriterion("FECH_ATENCION not between", value1, value2, "FECH_ATENCION");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUM_VISTAS_OFI_RESPUESTA_AIsNull()
        {
            criteriaWithoutValue.add("NUM_VISTAS_OFI_RESPUESTA_A is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUM_VISTAS_OFI_RESPUESTA_AIsNotNull()
        {
            criteriaWithoutValue.add("NUM_VISTAS_OFI_RESPUESTA_A is not null");
            return this;
        }

        public Criteria andNUM_VISTAS_OFI_RESPUESTA_AEqualTo(Integer value)
        {
            addCriterion("NUM_VISTAS_OFI_RESPUESTA_A =", value, "NUM_VISTAS_OFI_RESPUESTA_A");
            return this;
        }

        public Criteria andNUM_VISTAS_OFI_RESPUESTA_ANotEqualTo(Integer value)
        {
            addCriterion("NUM_VISTAS_OFI_RESPUESTA_A <>", value, "NUM_VISTAS_OFI_RESPUESTA_A");
            return this;
        }

        public Criteria andNUM_VISTAS_OFI_RESPUESTA_AGreaterThan(Integer value)
        {
            addCriterion("NUM_VISTAS_OFI_RESPUESTA_A >", value, "NUM_VISTAS_OFI_RESPUESTA_A");
            return this;
        }

        public Criteria andNUM_VISTAS_OFI_RESPUESTA_AGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("NUM_VISTAS_OFI_RESPUESTA_A >=", value, "NUM_VISTAS_OFI_RESPUESTA_A");
            return this;
        }

        public Criteria andNUM_VISTAS_OFI_RESPUESTA_ALessThan(Integer value)
        {
            addCriterion("NUM_VISTAS_OFI_RESPUESTA_A <", value, "NUM_VISTAS_OFI_RESPUESTA_A");
            return this;
        }

        public Criteria andNUM_VISTAS_OFI_RESPUESTA_ALessThanOrEqualTo(Integer value)
        {
            addCriterion("NUM_VISTAS_OFI_RESPUESTA_A <=", value, "NUM_VISTAS_OFI_RESPUESTA_A");
            return this;
        }

        public Criteria andNUM_VISTAS_OFI_RESPUESTA_AIn(List values)
        {
            addCriterion("NUM_VISTAS_OFI_RESPUESTA_A in", values, "NUM_VISTAS_OFI_RESPUESTA_A");
            return this;
        }

        public Criteria andNUM_VISTAS_OFI_RESPUESTA_ANotIn(List values)
        {
            addCriterion("NUM_VISTAS_OFI_RESPUESTA_A not in", values, "NUM_VISTAS_OFI_RESPUESTA_A");
            return this;
        }

        public Criteria andNUM_VISTAS_OFI_RESPUESTA_ABetween(Integer value1, Integer value2)
        {
            addCriterion("NUM_VISTAS_OFI_RESPUESTA_A between", value1, value2, "NUM_VISTAS_OFI_RESPUESTA_A");
            return this;
        }

        public Criteria andNUM_VISTAS_OFI_RESPUESTA_ANotBetween(Integer value1, Integer value2)
        {
            addCriterion("NUM_VISTAS_OFI_RESPUESTA_A not between", value1, value2, "NUM_VISTAS_OFI_RESPUESTA_A");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUM_VISTAS_OFI_RESPUESTA_BIsNull()
        {
            criteriaWithoutValue.add("NUM_VISTAS_OFI_RESPUESTA_B is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUM_VISTAS_OFI_RESPUESTA_BIsNotNull()
        {
            criteriaWithoutValue.add("NUM_VISTAS_OFI_RESPUESTA_B is not null");
            return this;
        }

        public Criteria andNUM_VISTAS_OFI_RESPUESTA_BEqualTo(Integer value)
        {
            addCriterion("NUM_VISTAS_OFI_RESPUESTA_B =", value, "NUM_VISTAS_OFI_RESPUESTA_B");
            return this;
        }

        public Criteria andNUM_VISTAS_OFI_RESPUESTA_BNotEqualTo(Integer value)
        {
            addCriterion("NUM_VISTAS_OFI_RESPUESTA_B <>", value, "NUM_VISTAS_OFI_RESPUESTA_B");
            return this;
        }

        public Criteria andNUM_VISTAS_OFI_RESPUESTA_BGreaterThan(Integer value)
        {
            addCriterion("NUM_VISTAS_OFI_RESPUESTA_B >", value, "NUM_VISTAS_OFI_RESPUESTA_B");
            return this;
        }

        public Criteria andNUM_VISTAS_OFI_RESPUESTA_BGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("NUM_VISTAS_OFI_RESPUESTA_B >=", value, "NUM_VISTAS_OFI_RESPUESTA_B");
            return this;
        }

        public Criteria andNUM_VISTAS_OFI_RESPUESTA_BLessThan(Integer value)
        {
            addCriterion("NUM_VISTAS_OFI_RESPUESTA_B <", value, "NUM_VISTAS_OFI_RESPUESTA_B");
            return this;
        }

        public Criteria andNUM_VISTAS_OFI_RESPUESTA_BLessThanOrEqualTo(Integer value)
        {
            addCriterion("NUM_VISTAS_OFI_RESPUESTA_B <=", value, "NUM_VISTAS_OFI_RESPUESTA_B");
            return this;
        }

        public Criteria andNUM_VISTAS_OFI_RESPUESTA_BIn(List values)
        {
            addCriterion("NUM_VISTAS_OFI_RESPUESTA_B in", values, "NUM_VISTAS_OFI_RESPUESTA_B");
            return this;
        }

        public Criteria andNUM_VISTAS_OFI_RESPUESTA_BNotIn(List values)
        {
            addCriterion("NUM_VISTAS_OFI_RESPUESTA_B not in", values, "NUM_VISTAS_OFI_RESPUESTA_B");
            return this;
        }

        public Criteria andNUM_VISTAS_OFI_RESPUESTA_BBetween(Integer value1, Integer value2)
        {
            addCriterion("NUM_VISTAS_OFI_RESPUESTA_B between", value1, value2, "NUM_VISTAS_OFI_RESPUESTA_B");
            return this;
        }

        public Criteria andNUM_VISTAS_OFI_RESPUESTA_BNotBetween(Integer value1, Integer value2)
        {
            addCriterion("NUM_VISTAS_OFI_RESPUESTA_B not between", value1, value2, "NUM_VISTAS_OFI_RESPUESTA_B");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_REFERENCIAIsNull()
        {
            criteriaWithoutValue.add("DESC_REFERENCIA is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andDESC_REFERENCIAIsNotNull()
        {
            criteriaWithoutValue.add("DESC_REFERENCIA is not null");
            return this;
        }

        public Criteria andDESC_REFERENCIAEqualTo(String value)
        {
            addCriterion("DESC_REFERENCIA =", value, "DESC_REFERENCIA");
            return this;
        }

        public Criteria andDESC_REFERENCIANotEqualTo(String value)
        {
            addCriterion("DESC_REFERENCIA <>", value, "DESC_REFERENCIA");
            return this;
        }

        public Criteria andDESC_REFERENCIAGreaterThan(String value)
        {
            addCriterion("DESC_REFERENCIA >", value, "DESC_REFERENCIA");
            return this;
        }

        public Criteria andDESC_REFERENCIAGreaterThanOrEqualTo(String value)
        {
            addCriterion("DESC_REFERENCIA >=", value, "DESC_REFERENCIA");
            return this;
        }

        public Criteria andDESC_REFERENCIALessThan(String value)
        {
            addCriterion("DESC_REFERENCIA <", value, "DESC_REFERENCIA");
            return this;
        }

        public Criteria andDESC_REFERENCIALessThanOrEqualTo(String value)
        {
            addCriterion("DESC_REFERENCIA <=", value, "DESC_REFERENCIA");
            return this;
        }

        public Criteria andDESC_REFERENCIALike(String value)
        {
            addCriterion("DESC_REFERENCIA like", value, "DESC_REFERENCIA");
            return this;
        }

        public Criteria andDESC_REFERENCIANotLike(String value)
        {
            addCriterion("DESC_REFERENCIA not like", value, "DESC_REFERENCIA");
            return this;
        }

        public Criteria andDESC_REFERENCIAIn(List values)
        {
            addCriterion("DESC_REFERENCIA in", values, "DESC_REFERENCIA");
            return this;
        }

        public Criteria andDESC_REFERENCIANotIn(List values)
        {
            addCriterion("DESC_REFERENCIA not in", values, "DESC_REFERENCIA");
            return this;
        }

        public Criteria andDESC_REFERENCIABetween(String value1, String value2)
        {
            addCriterion("DESC_REFERENCIA between", value1, value2, "DESC_REFERENCIA");
            return this;
        }

        public Criteria andDESC_REFERENCIANotBetween(String value1, String value2)
        {
            addCriterion("DESC_REFERENCIA not between", value1, value2, "DESC_REFERENCIA");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUM_REGISTROS_ATENDIDOSIsNull()
        {
            criteriaWithoutValue.add("NUM_REGISTROS_ATENDIDOS is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUM_REGISTROS_ATENDIDOSIsNotNull()
        {
            criteriaWithoutValue.add("NUM_REGISTROS_ATENDIDOS is not null");
            return this;
        }

        public Criteria andNUM_REGISTROS_ATENDIDOSEqualTo(Integer value)
        {
            addCriterion("NUM_REGISTROS_ATENDIDOS =", value, "NUM_REGISTROS_ATENDIDOS");
            return this;
        }

        public Criteria andNUM_REGISTROS_ATENDIDOSNotEqualTo(Integer value)
        {
            addCriterion("NUM_REGISTROS_ATENDIDOS <>", value, "NUM_REGISTROS_ATENDIDOS");
            return this;
        }

        public Criteria andNUM_REGISTROS_ATENDIDOSGreaterThan(Integer value)
        {
            addCriterion("NUM_REGISTROS_ATENDIDOS >", value, "NUM_REGISTROS_ATENDIDOS");
            return this;
        }

        public Criteria andNUM_REGISTROS_ATENDIDOSGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("NUM_REGISTROS_ATENDIDOS >=", value, "NUM_REGISTROS_ATENDIDOS");
            return this;
        }

        public Criteria andNUM_REGISTROS_ATENDIDOSLessThan(Integer value)
        {
            addCriterion("NUM_REGISTROS_ATENDIDOS <", value, "NUM_REGISTROS_ATENDIDOS");
            return this;
        }

        public Criteria andNUM_REGISTROS_ATENDIDOSLessThanOrEqualTo(Integer value)
        {
            addCriterion("NUM_REGISTROS_ATENDIDOS <=", value, "NUM_REGISTROS_ATENDIDOS");
            return this;
        }

        public Criteria andNUM_REGISTROS_ATENDIDOSIn(List values)
        {
            addCriterion("NUM_REGISTROS_ATENDIDOS in", values, "NUM_REGISTROS_ATENDIDOS");
            return this;
        }

        public Criteria andNUM_REGISTROS_ATENDIDOSNotIn(List values)
        {
            addCriterion("NUM_REGISTROS_ATENDIDOS not in", values, "NUM_REGISTROS_ATENDIDOS");
            return this;
        }

        public Criteria andNUM_REGISTROS_ATENDIDOSBetween(Integer value1, Integer value2)
        {
            addCriterion("NUM_REGISTROS_ATENDIDOS between", value1, value2, "NUM_REGISTROS_ATENDIDOS");
            return this;
        }

        public Criteria andNUM_REGISTROS_ATENDIDOSNotBetween(Integer value1, Integer value2)
        {
            addCriterion("NUM_REGISTROS_ATENDIDOS not between", value1, value2, "NUM_REGISTROS_ATENDIDOS");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUM_REGISTROS_POR_ATENDERIsNull()
        {
            criteriaWithoutValue.add("NUM_REGISTROS_POR_ATENDER is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUM_REGISTROS_POR_ATENDERIsNotNull()
        {
            criteriaWithoutValue.add("NUM_REGISTROS_POR_ATENDER is not null");
            return this;
        }

        public Criteria andNUM_REGISTROS_POR_ATENDEREqualTo(Integer value)
        {
            addCriterion("NUM_REGISTROS_POR_ATENDER =", value, "NUM_REGISTROS_POR_ATENDER");
            return this;
        }

        public Criteria andNUM_REGISTROS_POR_ATENDERNotEqualTo(Integer value)
        {
            addCriterion("NUM_REGISTROS_POR_ATENDER <>", value, "NUM_REGISTROS_POR_ATENDER");
            return this;
        }

        public Criteria andNUM_REGISTROS_POR_ATENDERGreaterThan(Integer value)
        {
            addCriterion("NUM_REGISTROS_POR_ATENDER >", value, "NUM_REGISTROS_POR_ATENDER");
            return this;
        }

        public Criteria andNUM_REGISTROS_POR_ATENDERGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("NUM_REGISTROS_POR_ATENDER >=", value, "NUM_REGISTROS_POR_ATENDER");
            return this;
        }

        public Criteria andNUM_REGISTROS_POR_ATENDERLessThan(Integer value)
        {
            addCriterion("NUM_REGISTROS_POR_ATENDER <", value, "NUM_REGISTROS_POR_ATENDER");
            return this;
        }

        public Criteria andNUM_REGISTROS_POR_ATENDERLessThanOrEqualTo(Integer value)
        {
            addCriterion("NUM_REGISTROS_POR_ATENDER <=", value, "NUM_REGISTROS_POR_ATENDER");
            return this;
        }

        public Criteria andNUM_REGISTROS_POR_ATENDERIn(List values)
        {
            addCriterion("NUM_REGISTROS_POR_ATENDER in", values, "NUM_REGISTROS_POR_ATENDER");
            return this;
        }

        public Criteria andNUM_REGISTROS_POR_ATENDERNotIn(List values)
        {
            addCriterion("NUM_REGISTROS_POR_ATENDER not in", values, "NUM_REGISTROS_POR_ATENDER");
            return this;
        }

        public Criteria andNUM_REGISTROS_POR_ATENDERBetween(Integer value1, Integer value2)
        {
            addCriterion("NUM_REGISTROS_POR_ATENDER between", value1, value2, "NUM_REGISTROS_POR_ATENDER");
            return this;
        }

        public Criteria andNUM_REGISTROS_POR_ATENDERNotBetween(Integer value1, Integer value2)
        {
            addCriterion("NUM_REGISTROS_POR_ATENDER not between", value1, value2, "NUM_REGISTROS_POR_ATENDER");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUM_ANHOIsNull()
        {
            criteriaWithoutValue.add("NUM_ANHO is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUM_ANHOIsNotNull()
        {
            criteriaWithoutValue.add("NUM_ANHO is not null");
            return this;
        }

        public Criteria andNUM_ANHOEqualTo(String value)
        {
            addCriterion("NUM_ANHO =", value, "NUM_ANHO");
            return this;
        }

        public Criteria andNUM_ANHONotEqualTo(String value)
        {
            addCriterion("NUM_ANHO <>", value, "NUM_ANHO");
            return this;
        }

        public Criteria andNUM_ANHOGreaterThan(String value)
        {
            addCriterion("NUM_ANHO >", value, "NUM_ANHO");
            return this;
        }

        public Criteria andNUM_ANHOGreaterThanOrEqualTo(String value)
        {
            addCriterion("NUM_ANHO >=", value, "NUM_ANHO");
            return this;
        }

        public Criteria andNUM_ANHOLessThan(String value)
        {
            addCriterion("NUM_ANHO <", value, "NUM_ANHO");
            return this;
        }

        public Criteria andNUM_ANHOLessThanOrEqualTo(String value)
        {
            addCriterion("NUM_ANHO <=", value, "NUM_ANHO");
            return this;
        }

        public Criteria andNUM_ANHOLike(String value)
        {
            addCriterion("NUM_ANHO like", value, "NUM_ANHO");
            return this;
        }

        public Criteria andNUM_ANHONotLike(String value)
        {
            addCriterion("NUM_ANHO not like", value, "NUM_ANHO");
            return this;
        }

        public Criteria andNUM_ANHOIn(List values)
        {
            addCriterion("NUM_ANHO in", values, "NUM_ANHO");
            return this;
        }

        public Criteria andNUM_ANHONotIn(List values)
        {
            addCriterion("NUM_ANHO not in", values, "NUM_ANHO");
            return this;
        }

        public Criteria andNUM_ANHOBetween(String value1, String value2)
        {
            addCriterion("NUM_ANHO between", value1, value2, "NUM_ANHO");
            return this;
        }

        public Criteria andNUM_ANHONotBetween(String value1, String value2)
        {
            addCriterion("NUM_ANHO not between", value1, value2, "NUM_ANHO");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUM_CORRELATIVO_OFIIsNull()
        {
            criteriaWithoutValue.add("NUM_CORRELATIVO_OFI is null");
            return this;
        }
        @SuppressWarnings("unchecked")
        public Criteria andNUM_CORRELATIVO_OFIIsNotNull()
        {
            criteriaWithoutValue.add("NUM_CORRELATIVO_OFI is not null");
            return this;
        }

        public Criteria andNUM_CORRELATIVO_OFIEqualTo(Integer value)
        {
            addCriterion("NUM_CORRELATIVO_OFI =", value, "NUM_CORRELATIVO_OFI");
            return this;
        }

        public Criteria andNUM_CORRELATIVO_OFINotEqualTo(Integer value)
        {
            addCriterion("NUM_CORRELATIVO_OFI <>", value, "NUM_CORRELATIVO_OFI");
            return this;
        }

        public Criteria andNUM_CORRELATIVO_OFIGreaterThan(Integer value)
        {
            addCriterion("NUM_CORRELATIVO_OFI >", value, "NUM_CORRELATIVO_OFI");
            return this;
        }

        public Criteria andNUM_CORRELATIVO_OFIGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("NUM_CORRELATIVO_OFI >=", value, "NUM_CORRELATIVO_OFI");
            return this;
        }

        public Criteria andNUM_CORRELATIVO_OFILessThan(Integer value)
        {
            addCriterion("NUM_CORRELATIVO_OFI <", value, "NUM_CORRELATIVO_OFI");
            return this;
        }

        public Criteria andNUM_CORRELATIVO_OFILessThanOrEqualTo(Integer value)
        {
            addCriterion("NUM_CORRELATIVO_OFI <=", value, "NUM_CORRELATIVO_OFI");
            return this;
        }

        public Criteria andNUM_CORRELATIVO_OFIIn(List values)
        {
            addCriterion("NUM_CORRELATIVO_OFI in", values, "NUM_CORRELATIVO_OFI");
            return this;
        }

        public Criteria andNUM_CORRELATIVO_OFINotIn(List values)
        {
            addCriterion("NUM_CORRELATIVO_OFI not in", values, "NUM_CORRELATIVO_OFI");
            return this;
        }

        public Criteria andNUM_CORRELATIVO_OFIBetween(Integer value1, Integer value2)
        {
            addCriterion("NUM_CORRELATIVO_OFI between", value1, value2, "NUM_CORRELATIVO_OFI");
            return this;
        }

        public Criteria andNUM_CORRELATIVO_OFINotBetween(Integer value1, Integer value2)
        {
            addCriterion("NUM_CORRELATIVO_OFI not between", value1, value2, "NUM_CORRELATIVO_OFI");
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


    public SolicitudExternaExample()
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
