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
 * GetFixedDepositProductsResponse
 *
 * @param accountingRule
 * @param currency
 * @param description
 * @param id
 * @param interestCalculationDaysInYearType
 * @param interestCalculationType
 * @param interestCompoundingPeriodType
 * @param interestPostingPeriodType
 * @param maxDepositTerm
 * @param maxDepositTermType
 * @param minDepositTerm
 * @param minDepositTermType
 * @param name
 * @param nominalAnnualInterestRate
 * @param preClosurePenalApplicable
 * @param shortName
 */

@Serializable
data class GetFixedDepositProductsResponse(

    val accountingRule: GetFixedDepositProductsAccountingRule? = null,

    val currency: GetFixedDepositProductsCurrency? = null,

    val description: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val interestCalculationDaysInYearType: GetFixedDepositProductsInterestCalculationDaysInYearType? = null,

    val interestCalculationType: GetFixedDepositProductsInterestCalculationType? = null,

    val interestCompoundingPeriodType: GetFixedDepositProductsInterestCompoundingPeriodType? = null,

    val interestPostingPeriodType: GetFixedDepositProductsInterestPostingPeriodType? = null,

    val maxDepositTerm: kotlin.Int? = null,

    val maxDepositTermType: GetFixedDepositProductsMaxDepositTermType? = null,

    val minDepositTerm: kotlin.Int? = null,

    val minDepositTermType: GetFixedDepositProductsMinDepositTermType? = null,

    val name: kotlin.String? = null,

    val nominalAnnualInterestRate: kotlin.Double? = null,

    val preClosurePenalApplicable: kotlin.Boolean? = null,

    val shortName: kotlin.String? = null

)

