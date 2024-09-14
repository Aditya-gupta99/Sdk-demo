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
 * PostSelfLoansRequest
 *
 * @param amortizationType
 * @param clientId
 * @param datatables
 * @param dateFormat
 * @param disbursementData
 * @param expectedDisbursementDate
 * @param fixedEmiAmount
 * @param interestCalculationPeriodType
 * @param interestRatePerPeriod
 * @param interestType
 * @param linkAccountId
 * @param loanTermFrequency
 * @param loanTermFrequencyType
 * @param loanType
 * @param locale
 * @param maxOutstandingLoanBalance
 * @param numberOfRepayments
 * @param principal
 * @param productId
 * @param repaymentEvery
 * @param repaymentFrequencyType
 * @param submittedOnDate
 * @param transactionProcessingStrategyCode
 */

@Serializable
data class PostSelfLoansRequest(

    val amortizationType: kotlin.Int? = null,

    val clientId: kotlin.Int? = null,

    val datatables: kotlin.collections.Set<PostSelfLoansDatatables>? = null,

    val dateFormat: kotlin.String? = null,

    val disbursementData: kotlin.collections.Set<PostSelfLoansDisbursementData>? = null,

    val expectedDisbursementDate: kotlin.String? = null,

    val fixedEmiAmount: kotlin.Int? = null,

    val interestCalculationPeriodType: kotlin.Int? = null,

    val interestRatePerPeriod: kotlin.Int? = null,

    val interestType: kotlin.Int? = null,

    val linkAccountId: kotlin.Int? = null,

    val loanTermFrequency: kotlin.Int? = null,

    val loanTermFrequencyType: kotlin.Int? = null,

    val loanType: kotlin.String? = null,

    val locale: kotlin.String? = null,

    val maxOutstandingLoanBalance: kotlin.Long? = null,

    val numberOfRepayments: kotlin.Int? = null,

    val principal: kotlin.Double? = null,

    val productId: kotlin.Int? = null,

    val repaymentEvery: kotlin.Int? = null,

    val repaymentFrequencyType: kotlin.Int? = null,

    val submittedOnDate: kotlin.String? = null,

    val transactionProcessingStrategyCode: kotlin.String? = null

)

