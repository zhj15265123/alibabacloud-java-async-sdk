// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVirusScanTaskRequest} extends {@link RequestModel}
 *
 * <p>ListVirusScanTaskRequest</p>
 */
public class ListVirusScanTaskRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("InternetIp")
    private String internetIp;

    @Query
    @NameInMap("IntranetIp")
    private String intranetIp;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("MachineName")
    private String machineName;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RootTask")
    private Boolean rootTask;

    @Query
    @NameInMap("RootTaskId")
    private String rootTaskId;

    @Query
    @NameInMap("ScanType")
    private String scanType;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    @Query
    @NameInMap("Status")
    private Integer status;

    @Query
    @NameInMap("StatusList")
    private java.util.List < Integer > statusList;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    private ListVirusScanTaskRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.internetIp = builder.internetIp;
        this.intranetIp = builder.intranetIp;
        this.lang = builder.lang;
        this.machineName = builder.machineName;
        this.pageSize = builder.pageSize;
        this.rootTask = builder.rootTask;
        this.rootTaskId = builder.rootTaskId;
        this.scanType = builder.scanType;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.statusList = builder.statusList;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirusScanTaskRequest create() {
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
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return internetIp
     */
    public String getInternetIp() {
        return this.internetIp;
    }

    /**
     * @return intranetIp
     */
    public String getIntranetIp() {
        return this.intranetIp;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return machineName
     */
    public String getMachineName() {
        return this.machineName;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return rootTask
     */
    public Boolean getRootTask() {
        return this.rootTask;
    }

    /**
     * @return rootTaskId
     */
    public String getRootTaskId() {
        return this.rootTaskId;
    }

    /**
     * @return scanType
     */
    public String getScanType() {
        return this.scanType;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return statusList
     */
    public java.util.List < Integer > getStatusList() {
        return this.statusList;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<ListVirusScanTaskRequest, Builder> {
        private Integer currentPage; 
        private Long endTime; 
        private String internetIp; 
        private String intranetIp; 
        private String lang; 
        private String machineName; 
        private Integer pageSize; 
        private Boolean rootTask; 
        private String rootTaskId; 
        private String scanType; 
        private Long startTime; 
        private Integer status; 
        private java.util.List < Integer > statusList; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(ListVirusScanTaskRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.internetIp = request.internetIp;
            this.intranetIp = request.intranetIp;
            this.lang = request.lang;
            this.machineName = request.machineName;
            this.pageSize = request.pageSize;
            this.rootTask = request.rootTask;
            this.rootTaskId = request.rootTaskId;
            this.scanType = request.scanType;
            this.startTime = request.startTime;
            this.status = request.status;
            this.statusList = request.statusList;
            this.taskId = request.taskId;
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
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * InternetIp.
         */
        public Builder internetIp(String internetIp) {
            this.putQueryParameter("InternetIp", internetIp);
            this.internetIp = internetIp;
            return this;
        }

        /**
         * IntranetIp.
         */
        public Builder intranetIp(String intranetIp) {
            this.putQueryParameter("IntranetIp", intranetIp);
            this.intranetIp = intranetIp;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * MachineName.
         */
        public Builder machineName(String machineName) {
            this.putQueryParameter("MachineName", machineName);
            this.machineName = machineName;
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
         * RootTask.
         */
        public Builder rootTask(Boolean rootTask) {
            this.putQueryParameter("RootTask", rootTask);
            this.rootTask = rootTask;
            return this;
        }

        /**
         * RootTaskId.
         */
        public Builder rootTaskId(String rootTaskId) {
            this.putQueryParameter("RootTaskId", rootTaskId);
            this.rootTaskId = rootTaskId;
            return this;
        }

        /**
         * ScanType.
         */
        public Builder scanType(String scanType) {
            this.putQueryParameter("ScanType", scanType);
            this.scanType = scanType;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * StatusList.
         */
        public Builder statusList(java.util.List < Integer > statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public ListVirusScanTaskRequest build() {
            return new ListVirusScanTaskRequest(this);
        } 

    } 

}
