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


import com.squareup.moshi.Json

/**
 *
 *
 * @param amortizationType
 * @param graceOnArrearsAgeing
 * @param graceOnPrincipalAndInterestPayment
 * @param inArrearsTolerance
 * @param interestCalculationPeriodType
 * @param interestType
 * @param repaymentEvery
 * @param transactionProcessingStrategyCode
 */


data class AllowAttributeOverrides(

    @Json(name = "amortizationType")
    val amortizationType: Boolean? = null,

    @Json(name = "graceOnArrearsAgeing")
    val graceOnArrearsAgeing: Boolean? = null,

    @Json(name = "graceOnPrincipalAndInterestPayment")
    val graceOnPrincipalAndInterestPayment: Boolean? = null,

    @Json(name = "inArrearsTolerance")
    val inArrearsTolerance: Boolean? = null,

    @Json(name = "interestCalculationPeriodType")
    val interestCalculationPeriodType: Boolean? = null,

    @Json(name = "interestType")
    val interestType: Boolean? = null,

    @Json(name = "repaymentEvery")
    val repaymentEvery: Boolean? = null,

    @Json(name = "transactionProcessingStrategyCode")
    val transactionProcessingStrategyCode: Boolean? = null

)

