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
 * PutTemplatesTemplateIdRequest
 *
 * @param entity
 * @param id
 * @param mappers
 * @param name
 * @param text
 * @param type
 */

@Serializable
data class PutTemplatesTemplateIdRequest(

    val entity: kotlin.Long? = null,

    val id: kotlin.Long? = null,

    val mappers: kotlin.collections.List<TemplateMapper>? = null,

    val name: kotlin.String? = null,

    val text: kotlin.String? = null,

    val type: kotlin.Long? = null

)

