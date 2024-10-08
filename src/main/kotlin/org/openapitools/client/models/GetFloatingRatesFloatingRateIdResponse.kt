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
 * GetFloatingRatesFloatingRateIdResponse
 *
 * @param createdBy
 * @param createdOn
 * @param id
 * @param isActive
 * @param isBaseLendingRate
 * @param modifiedBy
 * @param modifiedOn
 * @param name
 * @param ratePeriods
 */

@Serializable
data class GetFloatingRatesFloatingRateIdResponse(

    val createdBy: kotlin.String? = null,

    val createdOn: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val isActive: kotlin.Boolean? = null,

    val isBaseLendingRate: kotlin.Boolean? = null,

    val modifiedBy: kotlin.String? = null,

    val modifiedOn: kotlin.String? = null,

    val name: kotlin.String? = null,

    val ratePeriods: kotlin.collections.Set<GetFloatingRatesRatePeriods>? = null

)

