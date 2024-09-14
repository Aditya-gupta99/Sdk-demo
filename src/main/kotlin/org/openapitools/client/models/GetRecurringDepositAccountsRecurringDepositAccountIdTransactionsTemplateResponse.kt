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
 * GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse
 *
 * @param accountId
 * @param accountNo
 * @param amount
 * @param currency
 * @param date
 * @param id
 * @param paymentTypeOptions
 * @param reversed
 * @param transactionType
 */

@Serializable
data class GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse(

    val accountId: kotlin.Long? = null,

    val accountNo: kotlin.String? = null,

    @Contextual
    val amount: java.math.BigDecimal? = null,

    val currency: GetRecurringCurrency? = null,

    @Contextual
    val date: java.time.LocalDate? = null,

    val id: kotlin.Long? = null,

    val paymentTypeOptions: kotlin.collections.List<kotlin.Int>? = null,

    val reversed: kotlin.Boolean? = null,

    val transactionType: GetRecurringTransactionType? = null

)

