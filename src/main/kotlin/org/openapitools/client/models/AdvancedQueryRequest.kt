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
 * @param baseQuery
 * @param datatableQueries
 */

@Serializable
data class AdvancedQueryRequest(

    val baseQuery: AdvancedQueryData? = null,

    val datatableQueries: kotlin.collections.List<TableQueryData>? = null

)

