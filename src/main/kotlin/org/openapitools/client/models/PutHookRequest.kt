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

import org.openapitools.client.models.Event
import org.openapitools.client.models.Field

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * PutHookRequest
 *
 * @param config 
 * @param displayName 
 * @param events 
 * @param isActive 
 * @param name 
 * @param templateId 
 */


data class PutHookRequest (

    @Json(name = "config")
    val config: kotlin.collections.List<Field>? = null,

    @Json(name = "displayName")
    val displayName: kotlin.String? = null,

    @Json(name = "events")
    val events: kotlin.collections.List<Event>? = null,

    @Json(name = "isActive")
    val isActive: kotlin.Boolean? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "templateId")
    val templateId: kotlin.Long? = null

) {


}

