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
import java.math.BigDecimal
import java.time.LocalDate

/**
 *
 *
 * @param currency
 * @param fromAccount
 * @param fromAccountOptions
 * @param fromAccountType
 * @param fromAccountTypeOptions
 * @param fromClient
 * @param fromClientOptions
 * @param fromOffice
 * @param fromOfficeOptions
 * @param id
 * @param reversed
 * @param toAccount
 * @param toAccountOptions
 * @param toAccountType
 * @param toAccountTypeOptions
 * @param toClient
 * @param toClientOptions
 * @param toOffice
 * @param toOfficeOptions
 * @param transferAmount
 * @param transferDate
 * @param transferDescription
 */

@Serializable
data class AccountTransferData(

    val currency: CurrencyData? = null,

    val fromAccount: PortfolioAccountData? = null,

    val fromAccountOptions: kotlin.collections.List<PortfolioAccountData>? = null,

    val fromAccountType: EnumOptionData? = null,

    val fromAccountTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val fromClient: ClientData? = null,

    val fromClientOptions: kotlin.collections.List<ClientData>? = null,

    val fromOffice: OfficeData? = null,

    val fromOfficeOptions: kotlin.collections.List<OfficeData>? = null,

    val id: kotlin.Long? = null,

    val reversed: kotlin.Boolean? = null,

    val toAccount: PortfolioAccountData? = null,

    val toAccountOptions: kotlin.collections.List<PortfolioAccountData>? = null,

    val toAccountType: EnumOptionData? = null,

    val toAccountTypeOptions: kotlin.collections.List<EnumOptionData>? = null,

    val toClient: ClientData? = null,

    val toClientOptions: kotlin.collections.List<ClientData>? = null,

    val toOffice: OfficeData? = null,

    val toOfficeOptions: kotlin.collections.List<OfficeData>? = null,

    @Contextual
    val transferAmount: BigDecimal? = null,

    @Contextual
    val transferDate: LocalDate? = null,

    val transferDescription: kotlin.String? = null

)

