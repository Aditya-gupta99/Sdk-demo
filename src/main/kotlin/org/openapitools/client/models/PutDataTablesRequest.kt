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
 * PutDataTablesRequest
 *
 * @param addColumns
 * @param apptableName
 * @param changeColumns
 * @param dropColumns
 */

@Serializable
data class PutDataTablesRequest(

    val addColumns: kotlin.collections.List<PutDataTablesRequestAddColumns>? = null,

    val apptableName: kotlin.String? = null,

    val changeColumns: kotlin.collections.List<PutDataTablesRequestChangeColumns>? = null,

    val dropColumns: kotlin.collections.List<PutDataTablesRequestDropColumns>? = null

)

