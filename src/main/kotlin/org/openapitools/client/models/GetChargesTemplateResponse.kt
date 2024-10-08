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

import kotlinx.serialization.Serializable

/**
 * GetChargesTemplateResponse
 *
 * @param active
 * @param chargeAppliesToOptions
 * @param chargeCalculationTypeOptions
 * @param chargePaymentModeOptions
 * @param chargeTimeTypeOptions
 * @param currencyOptions
 * @param feeFrequencyOptions
 * @param loanChargeCalculationTypeOptions
 * @param loanChargeTimeTypeOptions
 * @param penalty
 * @param savingsChargeCalculationTypeOptions
 * @param savingsChargeTimeTypeOptions
 */

@Serializable
data class GetChargesTemplateResponse(

    val active: kotlin.Boolean? = null,

    val chargeAppliesToOptions: kotlin.collections.Set<GetChargesAppliesToResponse>? = null,

    val chargeCalculationTypeOptions: kotlin.collections.Set<GetChargesCalculationTypeResponse>? = null,

    val chargePaymentModeOptions: kotlin.collections.Set<GetChargesPaymentModeResponse>? = null,

    val chargeTimeTypeOptions: kotlin.collections.Set<GetChargesTimeTypeResponse>? = null,

    val currencyOptions: kotlin.collections.Set<GetChargesCurrencyResponse>? = null,

    val feeFrequencyOptions: kotlin.collections.Set<GetChargesTemplateFeeFrequencyOptions>? = null,

    val loanChargeCalculationTypeOptions: kotlin.collections.Set<GetChargesTemplateLoanChargeCalculationTypeOptions>? = null,

    val loanChargeTimeTypeOptions: kotlin.collections.Set<GetChargesTemplateLoanChargeTimeTypeOptions>? = null,

    val penalty: kotlin.Boolean? = null,

    val savingsChargeCalculationTypeOptions: kotlin.collections.Set<GetChargesTemplateLoanChargeCalculationTypeOptions>? = null,

    val savingsChargeTimeTypeOptions: kotlin.collections.Set<GetChargesTemplateLoanChargeTimeTypeOptions>? = null

)

