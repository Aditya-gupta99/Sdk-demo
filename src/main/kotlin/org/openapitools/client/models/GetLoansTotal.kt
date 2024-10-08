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
 * @param amount
 * @param currencyCode
 * @param defaultName
 * @param digitsAfterDecimal
 * @param displaySymbol
 * @param displaySymbolValue
 * @param greaterThanZero
 * @param inMultiplesOf
 * @param nameCode
 * @param zero
 */

@Serializable
data class GetLoansTotal(

    val amount: kotlin.Float? = null,

    val currencyCode: kotlin.String? = null,

    val defaultName: kotlin.String? = null,

    val digitsAfterDecimal: kotlin.Int? = null,

    val displaySymbol: kotlin.String? = null,

    val displaySymbolValue: kotlin.String? = null,

    val greaterThanZero: kotlin.Boolean? = null,

    val inMultiplesOf: kotlin.Int? = null,

    val nameCode: kotlin.String? = null,

    val zero: kotlin.Boolean? = null

)

