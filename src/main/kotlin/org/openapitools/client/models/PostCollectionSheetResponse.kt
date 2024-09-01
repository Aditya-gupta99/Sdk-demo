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

import org.openapitools.client.models.PostCollectionSheetChanges

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * PostCollectionSheetResponse
 *
 * @param changes 
 * @param groupId 
 * @param resourceId 
 */


data class PostCollectionSheetResponse (

    @Json(name = "changes")
    val changes: PostCollectionSheetChanges? = null,

    @Json(name = "groupId")
    val groupId: kotlin.Long? = null,

    @Json(name = "resourceId")
    val resourceId: kotlin.Long? = null

) {


}

