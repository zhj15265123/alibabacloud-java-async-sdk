// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVirusScanMachineEventRequest} extends {@link RequestModel}
 *
 * <p>ListVirusScanMachineEventRequest</p>
 */
public class ListVirusScanMachineEventRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Integer currentPage;

    @Query
    @NameInMap("OperateTaskId")
    private String operateTaskId;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("Uuid")
    private String uuid;

    private ListVirusScanMachineEventRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.operateTaskId = builder.operateTaskId;
        this.pageSize = builder.pageSize;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirusScanMachineEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return operateTaskId
     */
    public String getOperateTaskId() {
        return this.operateTaskId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ListVirusScanMachineEventRequest, Builder> {
        private Integer currentPage; 
        private String operateTaskId; 
        private Integer pageSize; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ListVirusScanMachineEventRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.operateTaskId = request.operateTaskId;
            this.pageSize = request.pageSize;
            this.uuid = request.uuid;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * OperateTaskId.
         */
        public Builder operateTaskId(String operateTaskId) {
            this.putQueryParameter("OperateTaskId", operateTaskId);
            this.operateTaskId = operateTaskId;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ListVirusScanMachineEventRequest build() {
            return new ListVirusScanMachineEventRequest(this);
        } 

    } 

}
