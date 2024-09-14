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
 * List of GetLoansLoanIdLoanInstallmentChargeData
 *
 * @param amount
 * @param amountAccrued
 * @param amountOutstanding
 * @param amountUnrecognized
 * @param amountWaived
 * @param dueDate
 * @param installmentNumber
 * @param paid
 * @param waived
 */

@Serializable
data class GetLoansLoanIdLoanInstallmentChargeData(

    val amount: kotlin.Double? = null,

    val amountAccrued: kotlin.Double? = null,

    val amountOutstanding: kotlin.Double? = null,

    val amountUnrecognized: kotlin.Double? = null,

    val amountWaived: kotlin.Double? = null,

    @Contextual
    val dueDate: java.time.LocalDate? = null,

    val installmentNumber: kotlin.Int? = null,

    val paid: kotlin.Boolean? = null,

    val waived: kotlin.Boolean? = null

)

