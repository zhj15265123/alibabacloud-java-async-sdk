// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.csas20230120.models.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    CompletableFuture<AttachApplication2ConnectorResponse> attachApplication2Connector(AttachApplication2ConnectorRequest request);

    CompletableFuture<CreateDynamicRouteResponse> createDynamicRoute(CreateDynamicRouteRequest request);

    CompletableFuture<CreatePrivateAccessApplicationResponse> createPrivateAccessApplication(CreatePrivateAccessApplicationRequest request);

    CompletableFuture<CreatePrivateAccessPolicyResponse> createPrivateAccessPolicy(CreatePrivateAccessPolicyRequest request);

    CompletableFuture<CreatePrivateAccessTagResponse> createPrivateAccessTag(CreatePrivateAccessTagRequest request);

    CompletableFuture<CreateRegistrationPolicyResponse> createRegistrationPolicy(CreateRegistrationPolicyRequest request);

    CompletableFuture<CreateUserGroupResponse> createUserGroup(CreateUserGroupRequest request);

    CompletableFuture<DeleteDynamicRouteResponse> deleteDynamicRoute(DeleteDynamicRouteRequest request);

    CompletableFuture<DeletePrivateAccessApplicationResponse> deletePrivateAccessApplication(DeletePrivateAccessApplicationRequest request);

    CompletableFuture<DeletePrivateAccessPolicyResponse> deletePrivateAccessPolicy(DeletePrivateAccessPolicyRequest request);

    CompletableFuture<DeletePrivateAccessTagResponse> deletePrivateAccessTag(DeletePrivateAccessTagRequest request);

    CompletableFuture<DeleteRegistrationPoliciesResponse> deleteRegistrationPolicies(DeleteRegistrationPoliciesRequest request);

    CompletableFuture<DeleteUserGroupResponse> deleteUserGroup(DeleteUserGroupRequest request);

    CompletableFuture<DetachApplication2ConnectorResponse> detachApplication2Connector(DetachApplication2ConnectorRequest request);

    CompletableFuture<GetDynamicRouteResponse> getDynamicRoute(GetDynamicRouteRequest request);

    CompletableFuture<GetPrivateAccessApplicationResponse> getPrivateAccessApplication(GetPrivateAccessApplicationRequest request);

    CompletableFuture<GetPrivateAccessPolicyResponse> getPrivateAccessPolicy(GetPrivateAccessPolicyRequest request);

    CompletableFuture<GetRegistrationPolicyResponse> getRegistrationPolicy(GetRegistrationPolicyRequest request);

    CompletableFuture<GetUserDeviceResponse> getUserDevice(GetUserDeviceRequest request);

    CompletableFuture<GetUserGroupResponse> getUserGroup(GetUserGroupRequest request);

    CompletableFuture<ListApplicationsForPrivateAccessPolicyResponse> listApplicationsForPrivateAccessPolicy(ListApplicationsForPrivateAccessPolicyRequest request);

    CompletableFuture<ListApplicationsForPrivateAccessTagResponse> listApplicationsForPrivateAccessTag(ListApplicationsForPrivateAccessTagRequest request);

    CompletableFuture<ListConnectorsResponse> listConnectors(ListConnectorsRequest request);

    CompletableFuture<ListDynamicRouteRegionsResponse> listDynamicRouteRegions(ListDynamicRouteRegionsRequest request);

    CompletableFuture<ListDynamicRoutesResponse> listDynamicRoutes(ListDynamicRoutesRequest request);

    CompletableFuture<ListExcessiveDeviceRegistrationApplicationsResponse> listExcessiveDeviceRegistrationApplications(ListExcessiveDeviceRegistrationApplicationsRequest request);

    CompletableFuture<ListPolicesForPrivateAccessApplicationResponse> listPolicesForPrivateAccessApplication(ListPolicesForPrivateAccessApplicationRequest request);

    CompletableFuture<ListPolicesForPrivateAccessTagResponse> listPolicesForPrivateAccessTag(ListPolicesForPrivateAccessTagRequest request);

    CompletableFuture<ListPolicesForUserGroupResponse> listPolicesForUserGroup(ListPolicesForUserGroupRequest request);

    CompletableFuture<ListPrivateAccessApplicationsResponse> listPrivateAccessApplications(ListPrivateAccessApplicationsRequest request);

    CompletableFuture<ListPrivateAccessApplicationsForDynamicRouteResponse> listPrivateAccessApplicationsForDynamicRoute(ListPrivateAccessApplicationsForDynamicRouteRequest request);

    CompletableFuture<ListPrivateAccessPolicesResponse> listPrivateAccessPolices(ListPrivateAccessPolicesRequest request);

    CompletableFuture<ListPrivateAccessTagsResponse> listPrivateAccessTags(ListPrivateAccessTagsRequest request);

    CompletableFuture<ListPrivateAccessTagsForDynamicRouteResponse> listPrivateAccessTagsForDynamicRoute(ListPrivateAccessTagsForDynamicRouteRequest request);

    CompletableFuture<ListRegistrationPoliciesResponse> listRegistrationPolicies(ListRegistrationPoliciesRequest request);

    CompletableFuture<ListRegistrationPoliciesForUserGroupResponse> listRegistrationPoliciesForUserGroup(ListRegistrationPoliciesForUserGroupRequest request);

    CompletableFuture<ListSoftwareForUserDeviceResponse> listSoftwareForUserDevice(ListSoftwareForUserDeviceRequest request);

    CompletableFuture<ListTagsForPrivateAccessApplicationResponse> listTagsForPrivateAccessApplication(ListTagsForPrivateAccessApplicationRequest request);

    CompletableFuture<ListTagsForPrivateAccessPolicyResponse> listTagsForPrivateAccessPolicy(ListTagsForPrivateAccessPolicyRequest request);

    CompletableFuture<ListUserDevicesResponse> listUserDevices(ListUserDevicesRequest request);

    CompletableFuture<ListUserGroupsResponse> listUserGroups(ListUserGroupsRequest request);

    CompletableFuture<ListUserGroupsForPrivateAccessPolicyResponse> listUserGroupsForPrivateAccessPolicy(ListUserGroupsForPrivateAccessPolicyRequest request);

    CompletableFuture<ListUserGroupsForRegistrationPolicyResponse> listUserGroupsForRegistrationPolicy(ListUserGroupsForRegistrationPolicyRequest request);

    CompletableFuture<UpdateDynamicRouteResponse> updateDynamicRoute(UpdateDynamicRouteRequest request);

    CompletableFuture<UpdateExcessiveDeviceRegistrationApplicationsStatusResponse> updateExcessiveDeviceRegistrationApplicationsStatus(UpdateExcessiveDeviceRegistrationApplicationsStatusRequest request);

    CompletableFuture<UpdatePrivateAccessApplicationResponse> updatePrivateAccessApplication(UpdatePrivateAccessApplicationRequest request);

    CompletableFuture<UpdatePrivateAccessPolicyResponse> updatePrivateAccessPolicy(UpdatePrivateAccessPolicyRequest request);

    CompletableFuture<UpdateRegistrationPolicyResponse> updateRegistrationPolicy(UpdateRegistrationPolicyRequest request);

    CompletableFuture<UpdateUserDevicesSharingStatusResponse> updateUserDevicesSharingStatus(UpdateUserDevicesSharingStatusRequest request);

    CompletableFuture<UpdateUserDevicesStatusResponse> updateUserDevicesStatus(UpdateUserDevicesStatusRequest request);

    CompletableFuture<UpdateUserGroupResponse> updateUserGroup(UpdateUserGroupRequest request);

}
