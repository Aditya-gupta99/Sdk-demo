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
 * @param code
 * @param indexed Defaults to false
 * @param mandatory
 * @param name
 * @param newCode
 * @param newName
 * @param unique
 */

@Serializable
data class PutDataTablesRequestChangeColumns(

    val code: kotlin.String? = null,

    val indexed: kotlin.Boolean? = null,

    val mandatory: kotlin.Boolean? = null,

    val name: kotlin.String? = null,

    val newCode: kotlin.String? = null,

    val newName: kotlin.String? = null,

    val unique: kotlin.Boolean? = null

)

