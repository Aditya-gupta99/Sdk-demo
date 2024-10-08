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

import org.openapitools.client.models.CalendarData
import org.openapitools.client.models.CenterData
import org.openapitools.client.models.ClientData
import org.openapitools.client.models.CodeValueData
import org.openapitools.client.models.DatatableData
import org.openapitools.client.models.EnumOptionData
import org.openapitools.client.models.GroupRoleData
import org.openapitools.client.models.OfficeData
import org.openapitools.client.models.StaffData

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import java.time.LocalDate

/**
 * 
 *
 * @param accountNo 
 * @param activationDate 
 * @param active 
 * @param activeClientMembers 
 * @param availableRoles 
 * @param calendarsData 
 * @param centerId 
 * @param centerName 
 * @param centerOptions 
 * @param childGroup 
 * @param clientMembers 
 * @param clientOptions 
 * @param closureReasons 
 * @param collectionMeetingCalendar 
 * @param datatables 
 * @param dateFormat 
 * @param externalId 
 * @param groupLevel 
 * @param groupRoles 
 * @param hierarchy 
 * @param id 
 * @param locale 
 * @param name 
 * @param officeId 
 * @param officeName 
 * @param officeOptions 
 * @param parentId 
 * @param rowIndex 
 * @param selectedRole 
 * @param staffId 
 * @param staffName 
 * @param staffOptions 
 * @param status 
 * @param submittedOnDate 
 * @param timeline 
 */

@Serializable
data class GroupGeneralData (

    val accountNo: kotlin.String? = null,

    @Contextual
    val activationDate: LocalDate? = null,

    val active: kotlin.Boolean? = null,

    val activeClientMembers: kotlin.collections.List<ClientData>? = null,

    val availableRoles: kotlin.collections.List<CodeValueData>? = null,

    val calendarsData: kotlin.collections.List<CalendarData>? = null,

    val centerId: kotlin.Long? = null,

    val centerName: kotlin.String? = null,

    val centerOptions: kotlin.collections.List<CenterData>? = null,

    val childGroup: kotlin.Boolean? = null,

    val clientMembers: kotlin.collections.List<ClientData>? = null,

    val clientOptions: kotlin.collections.List<ClientData>? = null,

    val closureReasons: kotlin.collections.List<CodeValueData>? = null,

    val collectionMeetingCalendar: CalendarData? = null,

    val datatables: kotlin.collections.List<DatatableData>? = null,

    val dateFormat: kotlin.String? = null,

    val externalId: kotlin.String? = null,

    val groupLevel: kotlin.String? = null,

    val groupRoles: kotlin.collections.List<GroupRoleData>? = null,

    val hierarchy: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val locale: kotlin.String? = null,

    val name: kotlin.String? = null,

    val officeId: kotlin.Long? = null,

    val officeName: kotlin.String? = null,

    val officeOptions: kotlin.collections.List<OfficeData>? = null,

    val parentId: kotlin.Long? = null,

    val rowIndex: kotlin.Int? = null,

    val selectedRole: GroupRoleData? = null,

    val staffId: kotlin.Long? = null,

    val staffName: kotlin.String? = null,

    val staffOptions: kotlin.collections.List<StaffData>? = null,

    val status: EnumOptionData? = null,

    @Contextual
    val submittedOnDate: LocalDate? = null,

    @Contextual
    val timeline: Any? = null

) {


}

