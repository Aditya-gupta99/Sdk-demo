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
 * @param columnName
 * @param columnType
 * @param columnValues
 * @param isColumnNullable
 * @param isColumnPrimaryKey
 */

@Serializable
data class GetRunReportColumnHeaders(

    val columnName: kotlin.String? = null,

    val columnType: kotlin.String? = null,

    val columnValues: kotlin.String? = null,

    val isColumnNullable: kotlin.Boolean? = null,

    val isColumnPrimaryKey: kotlin.Boolean? = null

)

