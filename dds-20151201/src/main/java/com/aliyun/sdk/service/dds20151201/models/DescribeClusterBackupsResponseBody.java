// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterBackupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterBackupsResponseBody</p>
 */
public class DescribeClusterBackupsResponseBody extends TeaModel {
    @NameInMap("ClusterBackups")
    private java.util.List < ClusterBackups> clusterBackups;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeClusterBackupsResponseBody(Builder builder) {
        this.clusterBackups = builder.clusterBackups;
        this.maxResults = builder.maxResults;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterBackupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterBackups
     */
    public java.util.List < ClusterBackups> getClusterBackups() {
        return this.clusterBackups;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ClusterBackups> clusterBackups; 
        private Integer maxResults; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 

        /**
         * ClusterBackups.
         */
        public Builder clusterBackups(java.util.List < ClusterBackups> clusterBackups) {
            this.clusterBackups = clusterBackups;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterBackupsResponseBody build() {
            return new DescribeClusterBackupsResponseBody(this);
        } 

    } 

    public static class Backups extends TeaModel {
        @NameInMap("BackupDownloadURL")
        private String backupDownloadURL;

        @NameInMap("BackupEndTime")
        private String backupEndTime;

        @NameInMap("BackupId")
        private String backupId;

        @NameInMap("BackupIntranetDownloadURL")
        private String backupIntranetDownloadURL;

        @NameInMap("BackupName")
        private String backupName;

        @NameInMap("BackupSize")
        private String backupSize;

        @NameInMap("BackupStartTime")
        private String backupStartTime;

        @NameInMap("BackupStatus")
        private String backupStatus;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("IsAvail")
        private String isAvail;

        private Backups(Builder builder) {
            this.backupDownloadURL = builder.backupDownloadURL;
            this.backupEndTime = builder.backupEndTime;
            this.backupId = builder.backupId;
            this.backupIntranetDownloadURL = builder.backupIntranetDownloadURL;
            this.backupName = builder.backupName;
            this.backupSize = builder.backupSize;
            this.backupStartTime = builder.backupStartTime;
            this.backupStatus = builder.backupStatus;
            this.instanceName = builder.instanceName;
            this.isAvail = builder.isAvail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Backups create() {
            return builder().build();
        }

        /**
         * @return backupDownloadURL
         */
        public String getBackupDownloadURL() {
            return this.backupDownloadURL;
        }

        /**
         * @return backupEndTime
         */
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        /**
         * @return backupId
         */
        public String getBackupId() {
            return this.backupId;
        }

        /**
         * @return backupIntranetDownloadURL
         */
        public String getBackupIntranetDownloadURL() {
            return this.backupIntranetDownloadURL;
        }

        /**
         * @return backupName
         */
        public String getBackupName() {
            return this.backupName;
        }

        /**
         * @return backupSize
         */
        public String getBackupSize() {
            return this.backupSize;
        }

        /**
         * @return backupStartTime
         */
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        /**
         * @return backupStatus
         */
        public String getBackupStatus() {
            return this.backupStatus;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return isAvail
         */
        public String getIsAvail() {
            return this.isAvail;
        }

        public static final class Builder {
            private String backupDownloadURL; 
            private String backupEndTime; 
            private String backupId; 
            private String backupIntranetDownloadURL; 
            private String backupName; 
            private String backupSize; 
            private String backupStartTime; 
            private String backupStatus; 
            private String instanceName; 
            private String isAvail; 

            /**
             * BackupDownloadURL.
             */
            public Builder backupDownloadURL(String backupDownloadURL) {
                this.backupDownloadURL = backupDownloadURL;
                return this;
            }

            /**
             * BackupEndTime.
             */
            public Builder backupEndTime(String backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * BackupId.
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * BackupIntranetDownloadURL.
             */
            public Builder backupIntranetDownloadURL(String backupIntranetDownloadURL) {
                this.backupIntranetDownloadURL = backupIntranetDownloadURL;
                return this;
            }

            /**
             * BackupName.
             */
            public Builder backupName(String backupName) {
                this.backupName = backupName;
                return this;
            }

            /**
             * BackupSize.
             */
            public Builder backupSize(String backupSize) {
                this.backupSize = backupSize;
                return this;
            }

            /**
             * BackupStartTime.
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * BackupStatus.
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * IsAvail.
             */
            public Builder isAvail(String isAvail) {
                this.isAvail = isAvail;
                return this;
            }

            public Backups build() {
                return new Backups(this);
            } 

        } 

    }
    public static class ExtraInfo extends TeaModel {
        @NameInMap("RegistryFromHistory")
        private String registryFromHistory;

        private ExtraInfo(Builder builder) {
            this.registryFromHistory = builder.registryFromHistory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtraInfo create() {
            return builder().build();
        }

        /**
         * @return registryFromHistory
         */
        public String getRegistryFromHistory() {
            return this.registryFromHistory;
        }

        public static final class Builder {
            private String registryFromHistory; 

            /**
             * RegistryFromHistory.
             */
            public Builder registryFromHistory(String registryFromHistory) {
                this.registryFromHistory = registryFromHistory;
                return this;
            }

            public ExtraInfo build() {
                return new ExtraInfo(this);
            } 

        } 

    }
    public static class ClusterBackups extends TeaModel {
        @NameInMap("Backups")
        private java.util.List < Backups> backups;

        @NameInMap("ClusterBackupEndTime")
        private String clusterBackupEndTime;

        @NameInMap("ClusterBackupId")
        private String clusterBackupId;

        @NameInMap("ClusterBackupMode")
        private String clusterBackupMode;

        @NameInMap("ClusterBackupSize")
        private String clusterBackupSize;

        @NameInMap("ClusterBackupStartTime")
        private String clusterBackupStartTime;

        @NameInMap("ClusterBackupStatus")
        private String clusterBackupStatus;

        @NameInMap("ExtraInfo")
        private ExtraInfo extraInfo;

        @NameInMap("IsAvail")
        private Integer isAvail;

        @NameInMap("Progress")
        private String progress;

        private ClusterBackups(Builder builder) {
            this.backups = builder.backups;
            this.clusterBackupEndTime = builder.clusterBackupEndTime;
            this.clusterBackupId = builder.clusterBackupId;
            this.clusterBackupMode = builder.clusterBackupMode;
            this.clusterBackupSize = builder.clusterBackupSize;
            this.clusterBackupStartTime = builder.clusterBackupStartTime;
            this.clusterBackupStatus = builder.clusterBackupStatus;
            this.extraInfo = builder.extraInfo;
            this.isAvail = builder.isAvail;
            this.progress = builder.progress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterBackups create() {
            return builder().build();
        }

        /**
         * @return backups
         */
        public java.util.List < Backups> getBackups() {
            return this.backups;
        }

        /**
         * @return clusterBackupEndTime
         */
        public String getClusterBackupEndTime() {
            return this.clusterBackupEndTime;
        }

        /**
         * @return clusterBackupId
         */
        public String getClusterBackupId() {
            return this.clusterBackupId;
        }

        /**
         * @return clusterBackupMode
         */
        public String getClusterBackupMode() {
            return this.clusterBackupMode;
        }

        /**
         * @return clusterBackupSize
         */
        public String getClusterBackupSize() {
            return this.clusterBackupSize;
        }

        /**
         * @return clusterBackupStartTime
         */
        public String getClusterBackupStartTime() {
            return this.clusterBackupStartTime;
        }

        /**
         * @return clusterBackupStatus
         */
        public String getClusterBackupStatus() {
            return this.clusterBackupStatus;
        }

        /**
         * @return extraInfo
         */
        public ExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return isAvail
         */
        public Integer getIsAvail() {
            return this.isAvail;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        public static final class Builder {
            private java.util.List < Backups> backups; 
            private String clusterBackupEndTime; 
            private String clusterBackupId; 
            private String clusterBackupMode; 
            private String clusterBackupSize; 
            private String clusterBackupStartTime; 
            private String clusterBackupStatus; 
            private ExtraInfo extraInfo; 
            private Integer isAvail; 
            private String progress; 

            /**
             * Backups.
             */
            public Builder backups(java.util.List < Backups> backups) {
                this.backups = backups;
                return this;
            }

            /**
             * ClusterBackupEndTime.
             */
            public Builder clusterBackupEndTime(String clusterBackupEndTime) {
                this.clusterBackupEndTime = clusterBackupEndTime;
                return this;
            }

            /**
             * ClusterBackupId.
             */
            public Builder clusterBackupId(String clusterBackupId) {
                this.clusterBackupId = clusterBackupId;
                return this;
            }

            /**
             * ClusterBackupMode.
             */
            public Builder clusterBackupMode(String clusterBackupMode) {
                this.clusterBackupMode = clusterBackupMode;
                return this;
            }

            /**
             * ClusterBackupSize.
             */
            public Builder clusterBackupSize(String clusterBackupSize) {
                this.clusterBackupSize = clusterBackupSize;
                return this;
            }

            /**
             * ClusterBackupStartTime.
             */
            public Builder clusterBackupStartTime(String clusterBackupStartTime) {
                this.clusterBackupStartTime = clusterBackupStartTime;
                return this;
            }

            /**
             * ClusterBackupStatus.
             */
            public Builder clusterBackupStatus(String clusterBackupStatus) {
                this.clusterBackupStatus = clusterBackupStatus;
                return this;
            }

            /**
             * ExtraInfo.
             */
            public Builder extraInfo(ExtraInfo extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * IsAvail.
             */
            public Builder isAvail(Integer isAvail) {
                this.isAvail = isAvail;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            public ClusterBackups build() {
                return new ClusterBackups(this);
            } 

        } 

    }
}
