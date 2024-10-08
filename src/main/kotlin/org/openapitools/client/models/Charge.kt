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

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param account
 * @param active
 * @param allowedClientChargeCalculationType
 * @param allowedClientChargeTime
 * @param allowedLoanChargeTime
 * @param allowedSavingsChargeCalculationType
 * @param allowedSavingsChargeTime
 * @param amount
 * @param annualFee
 * @param chargeCalculation
 * @param chargePaymentMode
 * @param chargeTimeType
 * @param clientCharge
 * @param currencyCode
 * @param deleted
 * @param disbursementCharge
 * @param enableFreeWithdrawal
 * @param enablePaymentType
 * @param feeInterval
 * @param feeOnMonthDay
 * @param frequencyFreeWithdrawalCharge
 * @param id
 * @param incomeAccountId
 * @param loanCharge
 * @param maxCap
 * @param minCap
 * @param monthlyFee
 * @param name
 * @param new
 * @param overdueInstallment
 * @param paymentType
 * @param penalty
 * @param percentageOfApprovedAmount
 * @param percentageOfDisbursementAmount
 * @param restartFrequency
 * @param restartFrequencyEnum
 * @param savingsCharge
 * @param taxGroup
 */

@Serializable
data class Charge(

    val account: GLAccount? = null,

    val active: kotlin.Boolean? = null,

    val allowedClientChargeCalculationType: kotlin.Boolean? = null,

    val allowedClientChargeTime: kotlin.Boolean? = null,

    val allowedLoanChargeTime: kotlin.Boolean? = null,

    val allowedSavingsChargeCalculationType: kotlin.Boolean? = null,

    val allowedSavingsChargeTime: kotlin.Boolean? = null,

    @Contextual
    val amount: java.math.BigDecimal? = null,

    val annualFee: kotlin.Boolean? = null,

    val chargeCalculation: kotlin.Int? = null,

    val chargePaymentMode: kotlin.Int? = null,

    val chargeTimeType: kotlin.Int? = null,

    val clientCharge: kotlin.Boolean? = null,

    val currencyCode: kotlin.String? = null,

    val deleted: kotlin.Boolean? = null,

    val disbursementCharge: kotlin.Boolean? = null,

    val enableFreeWithdrawal: kotlin.Boolean? = null,

    val enablePaymentType: kotlin.Boolean? = null,

    val feeInterval: kotlin.Int? = null,

    val feeOnMonthDay: ChargeFeeOnMonthDay? = null,

    val frequencyFreeWithdrawalCharge: kotlin.Int? = null,

    val id: kotlin.Long? = null,

    val incomeAccountId: kotlin.Long? = null,

    val loanCharge: kotlin.Boolean? = null,

    @Contextual
    val maxCap: java.math.BigDecimal? = null,

    @Contextual
    val minCap: java.math.BigDecimal? = null,

    val monthlyFee: kotlin.Boolean? = null,

    val name: kotlin.String? = null,

    val new: kotlin.Boolean? = null,

    val overdueInstallment: kotlin.Boolean? = null,

    val paymentType: PaymentType? = null,

    val penalty: kotlin.Boolean? = null,

    val percentageOfApprovedAmount: kotlin.Boolean? = null,

    val percentageOfDisbursementAmount: kotlin.Boolean? = null,

    val restartFrequency: kotlin.Int? = null,

    val restartFrequencyEnum: kotlin.Int? = null,

    val savingsCharge: kotlin.Boolean? = null,

    val taxGroup: TaxGroup? = null

)

