/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.GetClientChargeCalculationType
import org.openapitools.client.models.GetClientChargeCurrency
import org.openapitools.client.models.GetClientChargeTimeType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param amount 
 * @param amountOutstanding 
 * @param amountPaid 
 * @param amountWaived 
 * @param amountWrittenOff 
 * @param chargeCalculationType 
 * @param chargeId 
 * @param chargeTimeType 
 * @param clientId 
 * @param currency 
 * @param dueDate 
 * @param id 
 * @param isActive 
 * @param isPaid 
 * @param isWaived 
 * @param name 
 * @param penalty 
 */


data class GetClientsChargesPageItems (

    @Json(name = "amount")
    val amount: java.math.BigDecimal? = null,

    @Json(name = "amountOutstanding")
    val amountOutstanding: java.math.BigDecimal? = null,

    @Json(name = "amountPaid")
    val amountPaid: java.math.BigDecimal? = null,

    @Json(name = "amountWaived")
    val amountWaived: java.math.BigDecimal? = null,

    @Json(name = "amountWrittenOff")
    val amountWrittenOff: java.math.BigDecimal? = null,

    @Json(name = "chargeCalculationType")
    val chargeCalculationType: GetClientChargeCalculationType? = null,

    @Json(name = "chargeId")
    val chargeId: kotlin.Long? = null,

    @Json(name = "chargeTimeType")
    val chargeTimeType: GetClientChargeTimeType? = null,

    @Json(name = "clientId")
    val clientId: kotlin.Long? = null,

    @Json(name = "currency")
    val currency: GetClientChargeCurrency? = null,

    @Json(name = "dueDate")
    val dueDate: java.time.LocalDate? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "isActive")
    val isActive: kotlin.Boolean? = null,

    @Json(name = "isPaid")
    val isPaid: kotlin.Boolean? = null,

    @Json(name = "isWaived")
    val isWaived: kotlin.Boolean? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "penalty")
    val penalty: kotlin.Boolean? = null

) {


}

