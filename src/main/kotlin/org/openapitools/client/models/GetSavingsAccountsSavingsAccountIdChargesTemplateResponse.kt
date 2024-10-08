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
 * GetSavingsAccountsSavingsAccountIdChargesTemplateResponse
 *
 * @param amountPaid
 * @param amountWaived
 * @param amountWrittenOff
 * @param chargeOptions
 * @param penalty
 */

@Serializable
data class GetSavingsAccountsSavingsAccountIdChargesTemplateResponse(

    val amountPaid: kotlin.Float? = null,

    val amountWaived: kotlin.Float? = null,

    val amountWrittenOff: kotlin.Float? = null,

    val chargeOptions: kotlin.collections.Set<GetSavingsChargesOptions>? = null,

    val penalty: kotlin.Boolean? = null

)

