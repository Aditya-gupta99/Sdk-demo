package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.DeleteDataTablesDatatableAppTableIdDatatableIdResponse
import org.openapitools.client.models.DeleteDataTablesDatatableAppTableIdResponse
import org.openapitools.client.models.DeleteDataTablesResponse
import org.openapitools.client.models.GetDataTablesResponse
import org.openapitools.client.models.PagedLocalRequestAdvancedQueryData
import org.openapitools.client.models.PostDataTablesAppTableIdResponse
import org.openapitools.client.models.PostDataTablesRequest
import org.openapitools.client.models.PostDataTablesResponse
import org.openapitools.client.models.PutDataTablesAppTableIdDatatableIdResponse
import org.openapitools.client.models.PutDataTablesAppTableIdResponse
import org.openapitools.client.models.PutDataTablesRequest
import org.openapitools.client.models.PutDataTablesResponse

interface DataTablesApi {
    /**
     * Query Data Table values
     * Query values from a registered data table.
     * Responses:
     *  - 200: OK
     *
     * @param datatable datatable
     * @param pagedLocalRequestAdvancedQueryData  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/datatables/{datatable}/query")
    suspend fun advancedQuery(@Path("datatable") datatable: kotlin.String, @Body pagedLocalRequestAdvancedQueryData: PagedLocalRequestAdvancedQueryData? = null): Response<kotlin.String>

    /**
     * Create Data Table
     * Create a new data table and registers it with the Apache Fineract Core application table.  Field Descriptions  Mandatory - datatableName :   The name of the Data Table.  Mandatory - apptableName  Application table name. Must be one of the following:  m_client  m_group  m_loan  m_office  m_saving_account  m_product_loan  m_savings_product  Mandatory - columns   An array of columns in the new Data Table.  Optional - multiRow  Allows to create multiple entries in the Data Table. Optional, defaults to false. If this property is not provided Data Table will allow only one entry.  Field Descriptions - columns  Mandatory - name  Name of the created column. Can contain only alphanumeric characters, underscores and spaces, but cannot start with a number. Cannot start or end with an underscore or space.  Mandatory - type  Column type. Must be one of the following:  Boolean  Date  DateTime  Decimal  Dropdown   Number  String  Text  Mandatory [type &#x3D; Dropdown] - code  Used in Code description fields. Column name becomes: code_cd_name. Mandatory if using type Dropdown, otherwise an error is returned.  Optional - mandatory  Determines whether this column must have a value in every entry. Optional, defaults to false.  Mandatory [type &#x3D; String] - length  Length of the text field. Mandatory if type String is used, otherwise an error is returned.
     * Responses:
     *  - 200: OK
     *
     * @param postDataTablesRequest 
     * @return [PostDataTablesResponse]
     */
    @POST("v1/datatables")
    suspend fun createDatatable(@Body postDataTablesRequest: PostDataTablesRequest): Response<PostDataTablesResponse>

    /**
     * Create Entry in Data Table
     * Adds a row to the data table.  Note that the default datatable UI functionality converts any field name containing spaces to underscores when using the API. This means the field name \&quot;Business Description\&quot; is considered the same as \&quot;Business_Description\&quot;. So you shouldn&#39;t have both \&quot;versions\&quot; in any data table.
     * Responses:
     *  - 200: OK
     *
     * @param datatable datatable
     * @param apptableId apptableId
     * @param body {   \&quot;BusinessDescription\&quot;: \&quot;Livestock sales\&quot;,   \&quot;Comment\&quot;: \&quot;First comment made\&quot;,   \&quot;Education_cv\&quot;: \&quot;Primary\&quot;,   \&quot;Gender_cd\&quot;: 6,   \&quot;HighestRatePaid\&quot;: 8.5,   \&quot;NextVisit\&quot;: \&quot;01 October 2012\&quot;,   \&quot;YearsinBusiness\&quot;: 5,   \&quot;dateFormat\&quot;: \&quot;dd MMMM yyyy\&quot;,   \&quot;locale\&quot;: \&quot;en\&quot; }
     * @return [PostDataTablesAppTableIdResponse]
     */
    @POST("v1/datatables/{datatable}/{apptableId}")
    suspend fun createDatatableEntry(@Path("datatable") datatable: kotlin.String, @Path("apptableId") apptableId: kotlin.Long, @Body body: kotlin.String): Response<PostDataTablesAppTableIdResponse>

    /**
     * Delete Data Table
     * Deletes a data table and deregisters it from the Apache Fineract Core application table.
     * Responses:
     *  - 200: OK
     *
     * @param datatableName datatableName
     * @return [DeleteDataTablesResponse]
     */
    @DELETE("v1/datatables/{datatableName}")
    suspend fun deleteDatatable(@Path("datatableName") datatableName: kotlin.String): Response<DeleteDataTablesResponse>

    /**
     * Delete Entry(s) in Data Table
     * Deletes the entry (if it exists) for data tables that are one-to-one with the application table.  Deletes the entries (if they exist) for data tables that are one-to-many with the application table.
     * Responses:
     *  - 200: OK
     *
     * @param datatable datatable
     * @param apptableId apptableId
     * @return [DeleteDataTablesDatatableAppTableIdResponse]
     */
    @DELETE("v1/datatables/{datatable}/{apptableId}")
    suspend fun deleteDatatableEntries(@Path("datatable") datatable: kotlin.String, @Path("apptableId") apptableId: kotlin.Long): Response<DeleteDataTablesDatatableAppTableIdResponse>

    /**
     * Delete Entry in Datatable (One to Many)
     * Deletes the entry (if it exists) for data tables that are one to many with the application table.  
     * Responses:
     *  - 200: OK
     *
     * @param datatable datatable
     * @param apptableId apptableId
     * @param datatableId datatableId
     * @return [DeleteDataTablesDatatableAppTableIdDatatableIdResponse]
     */
    @DELETE("v1/datatables/{datatable}/{apptableId}/{datatableId}")
    suspend fun deleteDatatableEntry(@Path("datatable") datatable: kotlin.String, @Path("apptableId") apptableId: kotlin.Long, @Path("datatableId") datatableId: kotlin.Long): Response<DeleteDataTablesDatatableAppTableIdDatatableIdResponse>

    /**
     * Deregister Data Table
     * Deregisters a data table. It will no longer be available through the API.
     * Responses:
     *  - 200: OK
     *
     * @param datatable datatable
     * @return [PutDataTablesResponse]
     */
    @POST("v1/datatables/deregister/{datatable}")
    suspend fun deregisterDatatable(@Path("datatable") datatable: kotlin.String): Response<PutDataTablesResponse>

    /**
     * Retrieve Data Table Details
     * Lists a registered data table details and the Apache Fineract Core application table they are registered to.
     * Responses:
     *  - 200: OK
     *
     * @param datatable datatable
     * @return [GetDataTablesResponse]
     */
    @GET("v1/datatables/{datatable}")
    suspend fun getDatatable(@Path("datatable") datatable: kotlin.String): Response<GetDataTablesResponse>

    /**
     * Retrieve Entry(s) from Data Table
     * Gets the entry (if it exists) for data tables that are one to one with the application table.  Gets the entries (if they exist) for data tables that are one to many with the application table.  Note: The &#39;fields&#39; parameter is not available for datatables.  ARGUMENTS orderoptional Specifies the order in which data is returned.genericResultSetoptional, defaults to false If &#39;true&#39; an optimised JSON format is returned suitable for tabular display of data. This format is used by the default data tables UI functionality. Example Requests:  datatables/extra_client_details/1   datatables/extra_family_details/1?order&#x3D;&#x60;Date of Birth&#x60; desc   datatables/extra_client_details/1?genericResultSet&#x3D;true
     * Responses:
     *  - 200: OK
     *
     * @param datatable datatable
     * @param apptableId apptableId
     * @param order order (optional)
     * @return [kotlin.String]
     */
    @GET("v1/datatables/{datatable}/{apptableId}")
    suspend fun getDatatable1(@Path("datatable") datatable: kotlin.String, @Path("apptableId") apptableId: kotlin.Long, @Query("order") order: kotlin.String? = null): Response<kotlin.String>

    /**
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param datatable 
     * @param apptableId 
     * @param datatableId 
     * @param order  (optional)
     * @param genericResultSet Optional flag to format the response (optional, default to false)
     * @return [kotlin.String]
     */
    @GET("v1/datatables/{datatable}/{apptableId}/{datatableId}")
    suspend fun getDatatableManyEntry(@Path("datatable") datatable: kotlin.String, @Path("apptableId") apptableId: kotlin.Long, @Path("datatableId") datatableId: kotlin.Long, @Query("order") order: kotlin.String? = null, @Query("genericResultSet") genericResultSet: kotlin.Boolean? = false): Response<kotlin.String>

    /**
     * List Data Tables
     * Lists registered data tables and the Apache Fineract Core application table they are registered to.  ARGUMENTS  apptable  - optional The Apache Fineract core application table.  Example Requests:  datatables?apptable&#x3D;m_client   datatables
     * Responses:
     *  - 200: OK
     *
     * @param apptable apptable (optional)
     * @return [kotlin.collections.List<GetDataTablesResponse>]
     */
    @GET("v1/datatables")
    suspend fun getDatatables(@Query("apptable") apptable: kotlin.String? = null): Response<kotlin.collections.List<GetDataTablesResponse>>

    /**
     * Query Data Table values
     * Query values from a registered data table.
     * Responses:
     *  - 200: OK
     *
     * @param datatable datatable
     * @param columnFilter columnFilter (optional)
     * @param valueFilter valueFilter (optional)
     * @param resultColumns resultColumns (optional)
     * @return [kotlin.String]
     */
    @GET("v1/datatables/{datatable}/query")
    suspend fun queryValues(@Path("datatable") datatable: kotlin.String, @Query("columnFilter") columnFilter: kotlin.String? = null, @Query("valueFilter") valueFilter: kotlin.String? = null, @Query("resultColumns") resultColumns: kotlin.String? = null): Response<kotlin.String>

    /**
     * Register Data Table
     * Registers a data table with the Apache Fineract Core application table. This allows the data table to be maintained through the API. In case the datatable is a PPI (survey table), a parameter category should be pass along with the request. The API currently support one category (200)
     * Responses:
     *  - 200: OK
     *
     * @param datatable datatable
     * @param apptable apptable
     * @param body  (optional)
     * @return [PutDataTablesResponse]
     */
    @POST("v1/datatables/register/{datatable}/{apptable}")
    suspend fun registerDatatable(@Path("datatable") datatable: kotlin.String, @Path("apptable") apptable: kotlin.String, @Body body: kotlin.Any? = null): Response<PutDataTablesResponse>

    /**
     * Update Data Table
     * Modifies fields of a data table. If the apptableName parameter is passed, data table is deregistered and registered with the new application table.
     * Responses:
     *  - 200: OK
     *
     * @param datatableName datatableName
     * @param putDataTablesRequest 
     * @return [PutDataTablesResponse]
     */
    @PUT("v1/datatables/{datatableName}")
    suspend fun updateDatatable(@Path("datatableName") datatableName: kotlin.String, @Body putDataTablesRequest: PutDataTablesRequest): Response<PutDataTablesResponse>

    /**
     * Update Entry in Data Table (One to Many)
     * Updates the row (if it exists) of the data table.
     * Responses:
     *  - 200: OK
     *
     * @param datatable datatable
     * @param apptableId apptableId
     * @param datatableId datatableId
     * @param body 
     * @return [PutDataTablesAppTableIdDatatableIdResponse]
     */
    @PUT("v1/datatables/{datatable}/{apptableId}/{datatableId}")
    suspend fun updateDatatableEntryOneToMany(@Path("datatable") datatable: kotlin.String, @Path("apptableId") apptableId: kotlin.Long, @Path("datatableId") datatableId: kotlin.Long, @Body body: kotlin.String): Response<PutDataTablesAppTableIdDatatableIdResponse>

    /**
     * Update Entry in Data Table (One to One)
     * Updates the row (if it exists) of the data table.
     * Responses:
     *  - 200: OK
     *
     * @param datatable datatable
     * @param apptableId apptableId
     * @param body 
     * @return [PutDataTablesAppTableIdResponse]
     */
    @PUT("v1/datatables/{datatable}/{apptableId}")
    suspend fun updateDatatableEntryOnetoOne(@Path("datatable") datatable: kotlin.String, @Path("apptableId") apptableId: kotlin.Long, @Body body: kotlin.String): Response<PutDataTablesAppTableIdResponse>

}
