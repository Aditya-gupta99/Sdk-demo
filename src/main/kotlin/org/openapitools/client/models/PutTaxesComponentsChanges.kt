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
 * @param name
 * @param percentage
 * @param startDate
 */

@Serializable
data class PutTaxesComponentsChanges(

    val name: kotlin.String? = null,

    val percentage: kotlin.Float? = null,

    @Contextual
    val startDate: java.time.LocalDate? = null

)

