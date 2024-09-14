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
 * @param amount
 * @param amountOutstanding
 * @param amountPaid
 * @param amountWaived
 * @param amountWrittenOff
 * @param chargeCalculationType
 * @param chargeId
 * @param chargeTimeType
 * @param clientId
 * @param currency
 * @param dueDate
 * @param id
 * @param isActive
 * @param isPaid
 * @param isWaived
 * @param name
 * @param penalty
 */

@Serializable
data class GetSelfClientsChargesPageItems(

    val amount: kotlin.Float? = null,

    val amountOutstanding: kotlin.Float? = null,

    val amountPaid: kotlin.Float? = null,

    val amountWaived: kotlin.Float? = null,

    val amountWrittenOff: kotlin.Float? = null,

    val chargeCalculationType: GetSelfClientsChargeCalculationType? = null,

    val chargeId: kotlin.Int? = null,

    val chargeTimeType: GetSelfClientsChargeTimeType? = null,

    val clientId: kotlin.Int? = null,

    val currency: GetSelfClientsSavingsAccountsCurrency? = null,

    @Contextual
    val dueDate: java.time.LocalDate? = null,

    val id: kotlin.Int? = null,

    val isActive: kotlin.Boolean? = null,

    val isPaid: kotlin.Boolean? = null,

    val isWaived: kotlin.Boolean? = null,

    val name: kotlin.String? = null,

    val penalty: kotlin.Boolean? = null

)

