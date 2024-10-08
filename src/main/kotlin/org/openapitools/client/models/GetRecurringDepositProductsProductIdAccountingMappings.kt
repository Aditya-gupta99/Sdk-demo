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
 *
 *
 * @param incomeFromFeeAccount
 * @param incomeFromPenaltyAccount
 * @param interestOnSavingsAccount
 * @param savingsControlAccount
 * @param savingsReferenceAccount
 * @param transfersInSuspenseAccount
 */

@Serializable
data class GetRecurringDepositProductsProductIdAccountingMappings(

    val incomeFromFeeAccount: GetRecurringDepositProductsProductIdIncomeFromFeeAccount? = null,

    val incomeFromPenaltyAccount: GetRecurringDepositProductsProductIdIncomeFromPenaltyAccount? = null,

    val interestOnSavingsAccount: GetRecurringDepositProductsProductIdInterestOnSavingsAccount? = null,

    val savingsControlAccount: GetRecurringDepositProductsProductIdSavingsControlAccount? = null,

    val savingsReferenceAccount: GetRecurringDepositProductsProductIdSavingsReferenceAccount? = null,

    val transfersInSuspenseAccount: GetRecurringDepositProductsProductIdTransfersInSuspenseAccount? = null

)

