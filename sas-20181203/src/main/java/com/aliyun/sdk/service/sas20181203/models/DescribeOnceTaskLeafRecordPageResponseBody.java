// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOnceTaskLeafRecordPageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOnceTaskLeafRecordPageResponseBody</p>
 */
public class DescribeOnceTaskLeafRecordPageResponseBody extends TeaModel {
    @NameInMap("OnceTasks")
    private java.util.List < OnceTasks> onceTasks;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeOnceTaskLeafRecordPageResponseBody(Builder builder) {
        this.onceTasks = builder.onceTasks;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOnceTaskLeafRecordPageResponseBody create() {
        return builder().build();
    }

    /**
     * @return onceTasks
     */
    public java.util.List < OnceTasks> getOnceTasks() {
        return this.onceTasks;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < OnceTasks> onceTasks; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The details of the sub-tasks.
         */
        public Builder onceTasks(java.util.List < OnceTasks> onceTasks) {
            this.onceTasks = onceTasks;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOnceTaskLeafRecordPageResponseBody build() {
            return new DescribeOnceTaskLeafRecordPageResponseBody(this);
        } 

    } 

    public static class TaskImageInfo extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("CostTimeInfo")
        private String costTimeInfo;

        @NameInMap("Digest")
        private String digest;

        @NameInMap("Image")
        private String image;

        @NameInMap("NodeInstanceId")
        private String nodeInstanceId;

        @NameInMap("NodeIp")
        private String nodeIp;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("Pod")
        private String pod;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RepoId")
        private String repoId;

        @NameInMap("RepoName")
        private String repoName;

        @NameInMap("RepoNamespace")
        private String repoNamespace;

        @NameInMap("RepoRegionId")
        private String repoRegionId;

        @NameInMap("Tag")
        private String tag;

        private TaskImageInfo(Builder builder) {
            this.appName = builder.appName;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.costTimeInfo = builder.costTimeInfo;
            this.digest = builder.digest;
            this.image = builder.image;
            this.nodeInstanceId = builder.nodeInstanceId;
            this.nodeIp = builder.nodeIp;
            this.nodeName = builder.nodeName;
            this.pod = builder.pod;
            this.regionId = builder.regionId;
            this.repoId = builder.repoId;
            this.repoName = builder.repoName;
            this.repoNamespace = builder.repoNamespace;
            this.repoRegionId = builder.repoRegionId;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskImageInfo create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return costTimeInfo
         */
        public String getCostTimeInfo() {
            return this.costTimeInfo;
        }

        /**
         * @return digest
         */
        public String getDigest() {
            return this.digest;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return nodeInstanceId
         */
        public String getNodeInstanceId() {
            return this.nodeInstanceId;
        }

        /**
         * @return nodeIp
         */
        public String getNodeIp() {
            return this.nodeIp;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return pod
         */
        public String getPod() {
            return this.pod;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return repoId
         */
        public String getRepoId() {
            return this.repoId;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return repoNamespace
         */
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        /**
         * @return repoRegionId
         */
        public String getRepoRegionId() {
            return this.repoRegionId;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String appName; 
            private String clusterId; 
            private String clusterName; 
            private String costTimeInfo; 
            private String digest; 
            private String image; 
            private String nodeInstanceId; 
            private String nodeIp; 
            private String nodeName; 
            private String pod; 
            private String regionId; 
            private String repoId; 
            private String repoName; 
            private String repoNamespace; 
            private String repoRegionId; 
            private String tag; 

            /**
             * The name of the application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The ID of the cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the cluster.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * CostTimeInfo.
             */
            public Builder costTimeInfo(String costTimeInfo) {
                this.costTimeInfo = costTimeInfo;
                return this;
            }

            /**
             * The digest of the image.
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * The image of the container.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * The instance ID of the node.
             */
            public Builder nodeInstanceId(String nodeInstanceId) {
                this.nodeInstanceId = nodeInstanceId;
                return this;
            }

            /**
             * The IP address of the node.
             */
            public Builder nodeIp(String nodeIp) {
                this.nodeIp = nodeIp;
                return this;
            }

            /**
             * The name of the node.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * The pod of the image.
             */
            public Builder pod(String pod) {
                this.pod = pod;
                return this;
            }

            /**
             * The region ID of the server image.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the image repository.
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * The name of the image repository.
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * The name of the namespace to which the image repository belongs.
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * The region ID of the image repository.
             */
            public Builder repoRegionId(String repoRegionId) {
                this.repoRegionId = repoRegionId;
                return this;
            }

            /**
             * The tag that is added to the image.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public TaskImageInfo build() {
                return new TaskImageInfo(this);
            } 

        } 

    }
    public static class OnceTasks extends TeaModel {
        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("Finish")
        private Integer finish;

        @NameInMap("FinishCount")
        private String finishCount;

        @NameInMap("Progress")
        private Long progress;

        @NameInMap("RealRunTime")
        private Long realRunTime;

        @NameInMap("ResultInfo")
        private String resultInfo;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusText")
        private String statusText;

        @NameInMap("Target")
        private String target;

        @NameInMap("TargetType")
        private String targetType;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskImageInfo")
        private TaskImageInfo taskImageInfo;

        @NameInMap("TaskName")
        private String taskName;

        @NameInMap("TaskType")
        private String taskType;

        @NameInMap("TotalCount")
        private String totalCount;

        private OnceTasks(Builder builder) {
            this.endTime = builder.endTime;
            this.finish = builder.finish;
            this.finishCount = builder.finishCount;
            this.progress = builder.progress;
            this.realRunTime = builder.realRunTime;
            this.resultInfo = builder.resultInfo;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusText = builder.statusText;
            this.target = builder.target;
            this.targetType = builder.targetType;
            this.taskId = builder.taskId;
            this.taskImageInfo = builder.taskImageInfo;
            this.taskName = builder.taskName;
            this.taskType = builder.taskType;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OnceTasks create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return finish
         */
        public Integer getFinish() {
            return this.finish;
        }

        /**
         * @return finishCount
         */
        public String getFinishCount() {
            return this.finishCount;
        }

        /**
         * @return progress
         */
        public Long getProgress() {
            return this.progress;
        }

        /**
         * @return realRunTime
         */
        public Long getRealRunTime() {
            return this.realRunTime;
        }

        /**
         * @return resultInfo
         */
        public String getResultInfo() {
            return this.resultInfo;
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
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusText
         */
        public String getStatusText() {
            return this.statusText;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskImageInfo
         */
        public TaskImageInfo getTaskImageInfo() {
            return this.taskImageInfo;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return totalCount
         */
        public String getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long endTime; 
            private Integer finish; 
            private String finishCount; 
            private Long progress; 
            private Long realRunTime; 
            private String resultInfo; 
            private Long startTime; 
            private String status; 
            private String statusText; 
            private String target; 
            private String targetType; 
            private String taskId; 
            private TaskImageInfo taskImageInfo; 
            private String taskName; 
            private String taskType; 
            private String totalCount; 

            /**
             * The time when the sub-task ends.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Indicates whether the sub-task is complete.
             * <p>
             * 
             * *   **0**: no
             * *   **1**: yes
             */
            public Builder finish(Integer finish) {
                this.finish = finish;
                return this;
            }

            /**
             * The number of the assets that are scanned.
             */
            public Builder finishCount(String finishCount) {
                this.finishCount = finishCount;
                return this;
            }

            /**
             * The progress percentage of the sub-task.
             */
            public Builder progress(Long progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The execution duration of the sub-task.
             */
            public Builder realRunTime(Long realRunTime) {
                this.realRunTime = realRunTime;
                return this;
            }

            /**
             * The execution result of the sub-task.
             */
            public Builder resultInfo(String resultInfo) {
                this.resultInfo = resultInfo;
                return this;
            }

            /**
             * The time when the sub-task starts.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The status of the sub-task. Valid values:
             * <p>
             * 
             * *   **INIT**: The sub-task is not started.
             * *   **START**: The sub-task is started.
             * *   **SUCCESS**: The sub-task is complete.
             * *   **TIMEOUT**: The task timed out.
             */
            public Builder statusText(String statusText) {
                this.statusText = statusText;
                return this;
            }

            /**
             * The objective of the sub-task.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * The type of the assets that are scanned.
             * <p>
             * 
             * *   **IMAGE_REPO**: image repository
             * *   **IMAGE**: image
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * The sub-task ID.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The information about the image scan.
             */
            public Builder taskImageInfo(TaskImageInfo taskImageInfo) {
                this.taskImageInfo = taskImageInfo;
                return this;
            }

            /**
             * The name of the sub-task.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * The type of the sub-task.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public OnceTasks build() {
                return new OnceTasks(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
