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

import org.openapitools.client.models.PutDataTablesRequestAddColumns
import org.openapitools.client.models.PutDataTablesRequestChangeColumns
import org.openapitools.client.models.PutDataTablesRequestDropColumns

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * PutDataTablesRequest
 *
 * @param addColumns 
 * @param apptableName 
 * @param changeColumns 
 * @param dropColumns 
 */


data class PutDataTablesRequest (

    @Json(name = "addColumns")
    val addColumns: kotlin.collections.List<PutDataTablesRequestAddColumns>? = null,

    @Json(name = "apptableName")
    val apptableName: kotlin.String? = null,

    @Json(name = "changeColumns")
    val changeColumns: kotlin.collections.List<PutDataTablesRequestChangeColumns>? = null,

    @Json(name = "dropColumns")
    val dropColumns: kotlin.collections.List<PutDataTablesRequestDropColumns>? = null

) {


}

