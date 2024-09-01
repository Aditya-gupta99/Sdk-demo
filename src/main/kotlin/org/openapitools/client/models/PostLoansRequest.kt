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

import org.openapitools.client.models.PostLoansDisbursementData

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * PostLoansRequest
 *
 * @param amortizationType 
 * @param clientId 
 * @param dateFormat 
 * @param daysInYearType 
 * @param disbursementData List of PostLoansDisbursementData
 * @param expectedDisbursementDate 
 * @param externalId 
 * @param fixedPrincipalPercentagePerInstallment 
 * @param graceOnArrearsAgeing 
 * @param graceOnInterestCharged 
 * @param graceOnInterestPayment 
 * @param graceOnPrincipalPayment 
 * @param interestCalculationPeriodType 
 * @param interestRatePerPeriod 
 * @param interestType 
 * @param loanScheduleProcessingType 
 * @param loanScheduleType 
 * @param loanTermFrequency 
 * @param loanTermFrequencyType 
 * @param loanType 
 * @param locale 
 * @param maxOutstandingLoanBalance Maximum allowed outstanding balance
 * @param numberOfRepayments 
 * @param principal 
 * @param productId 
 * @param repaymentEvery 
 * @param repaymentFrequencyType 
 * @param repaymentsStartingFromDate 
 * @param submittedOnDate 
 * @param transactionProcessingStrategyCode 
 */


data class PostLoansRequest (

    @Json(name = "amortizationType")
    val amortizationType: kotlin.Int? = null,

    @Json(name = "clientId")
    val clientId: kotlin.Long? = null,

    @Json(name = "dateFormat")
    val dateFormat: kotlin.String? = null,

    @Json(name = "daysInYearType")
    val daysInYearType: PostLoansRequest.DaysInYearType? = null,

    /* List of PostLoansDisbursementData */
    @Json(name = "disbursementData")
    val disbursementData: kotlin.collections.List<PostLoansDisbursementData>? = null,

    @Json(name = "expectedDisbursementDate")
    val expectedDisbursementDate: kotlin.String? = null,

    @Json(name = "externalId")
    val externalId: kotlin.String? = null,

    @Json(name = "fixedPrincipalPercentagePerInstallment")
    val fixedPrincipalPercentagePerInstallment: java.math.BigDecimal? = null,

    @Json(name = "graceOnArrearsAgeing")
    val graceOnArrearsAgeing: kotlin.Int? = null,

    @Json(name = "graceOnInterestCharged")
    val graceOnInterestCharged: kotlin.Int? = null,

    @Json(name = "graceOnInterestPayment")
    val graceOnInterestPayment: kotlin.Int? = null,

    @Json(name = "graceOnPrincipalPayment")
    val graceOnPrincipalPayment: kotlin.Int? = null,

    @Json(name = "interestCalculationPeriodType")
    val interestCalculationPeriodType: kotlin.Int? = null,

    @Json(name = "interestRatePerPeriod")
    val interestRatePerPeriod: java.math.BigDecimal? = null,

    @Json(name = "interestType")
    val interestType: kotlin.Int? = null,

    @Json(name = "loanScheduleProcessingType")
    val loanScheduleProcessingType: kotlin.String? = null,

    @Json(name = "loanScheduleType")
    val loanScheduleType: kotlin.String? = null,

    @Json(name = "loanTermFrequency")
    val loanTermFrequency: kotlin.Int? = null,

    @Json(name = "loanTermFrequencyType")
    val loanTermFrequencyType: kotlin.Int? = null,

    @Json(name = "loanType")
    val loanType: kotlin.String? = null,

    @Json(name = "locale")
    val locale: kotlin.String? = null,

    /* Maximum allowed outstanding balance */
    @Json(name = "maxOutstandingLoanBalance")
    val maxOutstandingLoanBalance: java.math.BigDecimal? = null,

    @Json(name = "numberOfRepayments")
    val numberOfRepayments: kotlin.Int? = null,

    @Json(name = "principal")
    val principal: java.math.BigDecimal? = null,

    @Json(name = "productId")
    val productId: kotlin.Long? = null,

    @Json(name = "repaymentEvery")
    val repaymentEvery: kotlin.Int? = null,

    @Json(name = "repaymentFrequencyType")
    val repaymentFrequencyType: kotlin.Int? = null,

    @Json(name = "repaymentsStartingFromDate")
    val repaymentsStartingFromDate: java.time.LocalDate? = null,

    @Json(name = "submittedOnDate")
    val submittedOnDate: kotlin.String? = null,

    @Json(name = "transactionProcessingStrategyCode")
    val transactionProcessingStrategyCode: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: `null`
     */
    @JsonClass(generateAdapter = false)
    enum class DaysInYearType(val value: kotlin.Int) {
        @Json(name = "null") `null`(null);
    }

}

