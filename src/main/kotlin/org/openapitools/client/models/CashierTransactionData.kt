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
import java.math.BigDecimal
import java.time.LocalDate
import java.time.OffsetDateTime

/**
 *
 *
 * @param cashierData
 * @param cashierId
 * @param cashierName
 * @param createdDate
 * @param currencyOptions
 * @param endDate
 * @param entityId
 * @param entityType
 * @param id
 * @param officeId
 * @param officeName
 * @param startDate
 * @param tellerId
 * @param tellerName
 * @param txnAmount
 * @param txnDate
 * @param txnNote
 * @param txnType
 */

@Serializable
data class CashierTransactionData(

    val cashierData: CashierData? = null,

    val cashierId: kotlin.Long? = null,

    val cashierName: kotlin.String? = null,

    @Contextual
    val createdDate: OffsetDateTime? = null,

    val currencyOptions: kotlin.collections.List<CurrencyData>? = null,

    @Contextual
    val endDate: LocalDate? = null,

    val entityId: kotlin.Long? = null,

    val entityType: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val officeId: kotlin.Long? = null,

    val officeName: kotlin.String? = null,

    @Contextual
    val startDate: LocalDate? = null,

    val tellerId: kotlin.Long? = null,

    val tellerName: kotlin.String? = null,

    @Contextual
    val txnAmount: BigDecimal? = null,

    @Contextual
    val txnDate: LocalDate? = null,

    val txnNote: kotlin.String? = null,

    val txnType: CashierTxnType? = null

)

