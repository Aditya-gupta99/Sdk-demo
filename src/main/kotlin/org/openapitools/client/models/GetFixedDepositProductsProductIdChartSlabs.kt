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
 * @param annualInterestRate
 * @param currency
 * @param description
 * @param fromPeriod
 * @param id
 * @param periodType
 * @param toPeriod
 */

@Serializable
data class GetFixedDepositProductsProductIdChartSlabs(

    val annualInterestRate: kotlin.Double? = null,

    val currency: GetFixedDepositProductsProductIdCurrency? = null,

    val description: kotlin.String? = null,

    val fromPeriod: kotlin.Int? = null,

    val id: kotlin.Long? = null,

    val periodType: GetFixedDepositProductsProductIdPeriodType? = null,

    val toPeriod: kotlin.Int? = null

)

