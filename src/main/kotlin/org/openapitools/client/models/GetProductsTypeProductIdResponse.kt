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
 * GetProductsTypeProductIdResponse
 *
 * @param accountingMappingOptions
 * @param accountingMappings
 * @param accountingRule
 * @param allowDividendCalculationForInactiveClients
 * @param chargeOptions
 * @param charges
 * @param currency
 * @param currencyOptions
 * @param description
 * @param id
 * @param lockPeriodTypeEnum
 * @param lockinPeriod
 * @param lockinPeriodFrequencyTypeOptions
 * @param marketPrice
 * @param maximumShares
 * @param minimumActivePeriod
 * @param minimumActivePeriodForDividendsTypeEnum
 * @param minimumActivePeriodFrequencyTypeOptions
 * @param minimumShares
 * @param name
 * @param nominalShares
 * @param shareCapital
 * @param shortName
 * @param totalShares
 * @param totalSharesIssued
 * @param unitPrice
 */

@Serializable
data class GetProductsTypeProductIdResponse(

    val accountingMappingOptions: GetProductsAccountingMappingOptions? = null,

    val accountingMappings: GetProductsAccountingMappings? = null,

    val accountingRule: GetProductsAccountingRule? = null,

    val allowDividendCalculationForInactiveClients: kotlin.Boolean? = null,

    val chargeOptions: kotlin.collections.Set<GetProductsCharges>? = null,

    val charges: kotlin.collections.Set<GetProductsCharges>? = null,

    val currency: GetProductsCurrency? = null,

    val currencyOptions: kotlin.collections.Set<GetChargesCurrency>? = null,

    val description: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val lockPeriodTypeEnum: GetLockPeriodTypeEnum? = null,

    val lockinPeriod: kotlin.Int? = null,

    val lockinPeriodFrequencyTypeOptions: kotlin.collections.Set<GetProductsMinimumActivePeriodFrequencyTypeOptions>? = null,

    val marketPrice: kotlin.collections.Set<GetProductsMarketPrice>? = null,

    val maximumShares: kotlin.Int? = null,

    val minimumActivePeriod: kotlin.Int? = null,

    val minimumActivePeriodForDividendsTypeEnum: GetLockPeriodTypeEnum? = null,

    val minimumActivePeriodFrequencyTypeOptions: kotlin.collections.Set<GetProductsMinimumActivePeriodFrequencyTypeOptions>? = null,

    val minimumShares: kotlin.Int? = null,

    val name: kotlin.String? = null,

    val nominalShares: kotlin.Int? = null,

    val shareCapital: kotlin.Int? = null,

    val shortName: kotlin.String? = null,

    val totalShares: kotlin.Int? = null,

    val totalSharesIssued: kotlin.Int? = null,

    val unitPrice: kotlin.Int? = null

)

