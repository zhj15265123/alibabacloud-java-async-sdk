// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupPolicyResponseBody</p>
 */
public class DescribeBackupPolicyResponseBody extends TeaModel {
    @NameInMap("ArchiveBackupKeepCount")
    private String archiveBackupKeepCount;

    @NameInMap("ArchiveBackupKeepPolicy")
    private String archiveBackupKeepPolicy;

    @NameInMap("ArchiveBackupRetentionPeriod")
    private String archiveBackupRetentionPeriod;

    @NameInMap("BackupInterval")
    private String backupInterval;

    @NameInMap("BackupLog")
    private String backupLog;

    @NameInMap("BackupMethod")
    private String backupMethod;

    @NameInMap("BackupPriority")
    private Integer backupPriority;

    @NameInMap("BackupRetentionPeriod")
    private Integer backupRetentionPeriod;

    @NameInMap("Category")
    private String category;

    @NameInMap("CompressType")
    private String compressType;

    @NameInMap("EnableBackupLog")
    private String enableBackupLog;

    @NameInMap("EnableIncrementDataBackup")
    private Boolean enableIncrementDataBackup;

    @NameInMap("HighSpaceUsageProtection")
    private String highSpaceUsageProtection;

    @NameInMap("LocalLogRetentionHours")
    private Integer localLogRetentionHours;

    @NameInMap("LocalLogRetentionSpace")
    private String localLogRetentionSpace;

    @NameInMap("LogBackupFrequency")
    private String logBackupFrequency;

    @NameInMap("LogBackupLocalRetentionNumber")
    private Integer logBackupLocalRetentionNumber;

    @NameInMap("LogBackupRetentionPeriod")
    private Integer logBackupRetentionPeriod;

    @NameInMap("PreferredBackupPeriod")
    private String preferredBackupPeriod;

    @NameInMap("PreferredBackupTime")
    private String preferredBackupTime;

    @NameInMap("PreferredNextBackupTime")
    private String preferredNextBackupTime;

    @NameInMap("ReleasedKeepPolicy")
    private String releasedKeepPolicy;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SupportModifyBackupPriority")
    private Boolean supportModifyBackupPriority;

    @NameInMap("SupportReleasedKeep")
    private Integer supportReleasedKeep;

    @NameInMap("SupportVolumeShadowCopy")
    private Integer supportVolumeShadowCopy;

    private DescribeBackupPolicyResponseBody(Builder builder) {
        this.archiveBackupKeepCount = builder.archiveBackupKeepCount;
        this.archiveBackupKeepPolicy = builder.archiveBackupKeepPolicy;
        this.archiveBackupRetentionPeriod = builder.archiveBackupRetentionPeriod;
        this.backupInterval = builder.backupInterval;
        this.backupLog = builder.backupLog;
        this.backupMethod = builder.backupMethod;
        this.backupPriority = builder.backupPriority;
        this.backupRetentionPeriod = builder.backupRetentionPeriod;
        this.category = builder.category;
        this.compressType = builder.compressType;
        this.enableBackupLog = builder.enableBackupLog;
        this.enableIncrementDataBackup = builder.enableIncrementDataBackup;
        this.highSpaceUsageProtection = builder.highSpaceUsageProtection;
        this.localLogRetentionHours = builder.localLogRetentionHours;
        this.localLogRetentionSpace = builder.localLogRetentionSpace;
        this.logBackupFrequency = builder.logBackupFrequency;
        this.logBackupLocalRetentionNumber = builder.logBackupLocalRetentionNumber;
        this.logBackupRetentionPeriod = builder.logBackupRetentionPeriod;
        this.preferredBackupPeriod = builder.preferredBackupPeriod;
        this.preferredBackupTime = builder.preferredBackupTime;
        this.preferredNextBackupTime = builder.preferredNextBackupTime;
        this.releasedKeepPolicy = builder.releasedKeepPolicy;
        this.requestId = builder.requestId;
        this.supportModifyBackupPriority = builder.supportModifyBackupPriority;
        this.supportReleasedKeep = builder.supportReleasedKeep;
        this.supportVolumeShadowCopy = builder.supportVolumeShadowCopy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return archiveBackupKeepCount
     */
    public String getArchiveBackupKeepCount() {
        return this.archiveBackupKeepCount;
    }

    /**
     * @return archiveBackupKeepPolicy
     */
    public String getArchiveBackupKeepPolicy() {
        return this.archiveBackupKeepPolicy;
    }

    /**
     * @return archiveBackupRetentionPeriod
     */
    public String getArchiveBackupRetentionPeriod() {
        return this.archiveBackupRetentionPeriod;
    }

    /**
     * @return backupInterval
     */
    public String getBackupInterval() {
        return this.backupInterval;
    }

    /**
     * @return backupLog
     */
    public String getBackupLog() {
        return this.backupLog;
    }

    /**
     * @return backupMethod
     */
    public String getBackupMethod() {
        return this.backupMethod;
    }

    /**
     * @return backupPriority
     */
    public Integer getBackupPriority() {
        return this.backupPriority;
    }

    /**
     * @return backupRetentionPeriod
     */
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return compressType
     */
    public String getCompressType() {
        return this.compressType;
    }

    /**
     * @return enableBackupLog
     */
    public String getEnableBackupLog() {
        return this.enableBackupLog;
    }

    /**
     * @return enableIncrementDataBackup
     */
    public Boolean getEnableIncrementDataBackup() {
        return this.enableIncrementDataBackup;
    }

    /**
     * @return highSpaceUsageProtection
     */
    public String getHighSpaceUsageProtection() {
        return this.highSpaceUsageProtection;
    }

    /**
     * @return localLogRetentionHours
     */
    public Integer getLocalLogRetentionHours() {
        return this.localLogRetentionHours;
    }

    /**
     * @return localLogRetentionSpace
     */
    public String getLocalLogRetentionSpace() {
        return this.localLogRetentionSpace;
    }

    /**
     * @return logBackupFrequency
     */
    public String getLogBackupFrequency() {
        return this.logBackupFrequency;
    }

    /**
     * @return logBackupLocalRetentionNumber
     */
    public Integer getLogBackupLocalRetentionNumber() {
        return this.logBackupLocalRetentionNumber;
    }

    /**
     * @return logBackupRetentionPeriod
     */
    public Integer getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    /**
     * @return preferredBackupPeriod
     */
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    /**
     * @return preferredBackupTime
     */
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    /**
     * @return preferredNextBackupTime
     */
    public String getPreferredNextBackupTime() {
        return this.preferredNextBackupTime;
    }

    /**
     * @return releasedKeepPolicy
     */
    public String getReleasedKeepPolicy() {
        return this.releasedKeepPolicy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return supportModifyBackupPriority
     */
    public Boolean getSupportModifyBackupPriority() {
        return this.supportModifyBackupPriority;
    }

    /**
     * @return supportReleasedKeep
     */
    public Integer getSupportReleasedKeep() {
        return this.supportReleasedKeep;
    }

    /**
     * @return supportVolumeShadowCopy
     */
    public Integer getSupportVolumeShadowCopy() {
        return this.supportVolumeShadowCopy;
    }

    public static final class Builder {
        private String archiveBackupKeepCount; 
        private String archiveBackupKeepPolicy; 
        private String archiveBackupRetentionPeriod; 
        private String backupInterval; 
        private String backupLog; 
        private String backupMethod; 
        private Integer backupPriority; 
        private Integer backupRetentionPeriod; 
        private String category; 
        private String compressType; 
        private String enableBackupLog; 
        private Boolean enableIncrementDataBackup; 
        private String highSpaceUsageProtection; 
        private Integer localLogRetentionHours; 
        private String localLogRetentionSpace; 
        private String logBackupFrequency; 
        private Integer logBackupLocalRetentionNumber; 
        private Integer logBackupRetentionPeriod; 
        private String preferredBackupPeriod; 
        private String preferredBackupTime; 
        private String preferredNextBackupTime; 
        private String releasedKeepPolicy; 
        private String requestId; 
        private Boolean supportModifyBackupPriority; 
        private Integer supportReleasedKeep; 
        private Integer supportVolumeShadowCopy; 

        /**
         * The number of archived backup files that are retained.
         */
        public Builder archiveBackupKeepCount(String archiveBackupKeepCount) {
            this.archiveBackupKeepCount = archiveBackupKeepCount;
            return this;
        }

        /**
         * The cycle based on which archived backup files are retained.
         */
        public Builder archiveBackupKeepPolicy(String archiveBackupKeepPolicy) {
            this.archiveBackupKeepPolicy = archiveBackupKeepPolicy;
            return this;
        }

        /**
         * The number of days for which archived backup files are retained.
         */
        public Builder archiveBackupRetentionPeriod(String archiveBackupRetentionPeriod) {
            this.archiveBackupRetentionPeriod = archiveBackupRetentionPeriod;
            return this;
        }

        /**
         * The backup interval. Unit: minutes.
         * <p>
         * 
         * *   If the instance runs MySQL, the interval is the same as the value of the Snapshot Backup Start Time parameter rather than the Snapshot Backup Period parameter in the ApsaraDB RDS console. For more information, see [Back up an ApsaraDB RDS for MySQL instance](~~98818~~).
         * *   If the instance runs SQL Server, the interval is the same as the log backup frequency.
         */
        public Builder backupInterval(String backupInterval) {
            this.backupInterval = backupInterval;
            return this;
        }

        /**
         * Indicates whether the log backup feature is enabled. Valid values:
         * <p>
         * 
         * *   **Enable**
         * *   **Disabled**
         */
        public Builder backupLog(String backupLog) {
            this.backupLog = backupLog;
            return this;
        }

        /**
         * The backup method of the instance. Valid values:
         * <p>
         * 
         * *   **Physical**: physical backup
         * *   **Snapshot**: snapshot backup
         * 
         * > This parameter is returned only when the instance runs SQL Server and uses cloud disks.
         */
        public Builder backupMethod(String backupMethod) {
            this.backupMethod = backupMethod;
            return this;
        }

        /**
         * The backup settings of the secondary instance. Valid values:
         * <p>
         * 
         * *   **1**: Secondary instance preferred
         * *   **2**: Primary instance preferred
         * 
         * > This parameter is valid only when the instance runs SQL Server on RDS Cluster Edition. This parameter is returned only when SupportModifyBackupPriority is set to True.
         */
        public Builder backupPriority(Integer backupPriority) {
            this.backupPriority = backupPriority;
            return this;
        }

        /**
         * The number of days for which data backup files are retained.
         */
        public Builder backupRetentionPeriod(Integer backupRetentionPeriod) {
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * Indicates whether to enable the single-digit second backup feature. This feature allows ApsaraDB RDS to complete a backup within single-digit seconds. Valid values:
         * <p>
         * 
         * *   **Flash**: The single-digit second backup feature is enabled.
         * *   **Standard**: The single-digit second backup feature is disabled.
         * 
         * > This parameter takes effect only when you set the **BackupPolicyMode** parameter to **DataBackupPolicy**.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * The method that is used to compress backup data. Valid values:
         * <p>
         * 
         * *   **0**: Backup data is not compressed.
         * *   **1**: Backup data is compressed by using zlib.
         * *   **2**: Backup data is compressed by using zlib that invokes more than one thread in parallel for each backup.
         * *   **4**: Backup data is compressed by using QuickLZ and can be used to restore individual databases and tables.
         * *   **8**: Backup data is compressed by using QuickLZ but cannot be used to restore individual databases or tables. This value is available only when the instance runs MySQL 8.0.
         */
        public Builder compressType(String compressType) {
            this.compressType = compressType;
            return this;
        }

        /**
         * Indicates whether the log backup feature is enabled. Valid values:
         * <p>
         * 
         * *   **1**: The log backup feature is enabled.
         * *   **0**: The log backup feature is disabled.
         */
        public Builder enableBackupLog(String enableBackupLog) {
            this.enableBackupLog = enableBackupLog;
            return this;
        }

        /**
         * Indicates whether incremental backup is enabled. Valid values:
         * <p>
         * 
         * *   **True**: Incremental backup is enabled.
         * *   **False**: Incremental backup is disabled.
         */
        public Builder enableIncrementDataBackup(Boolean enableIncrementDataBackup) {
            this.enableIncrementDataBackup = enableIncrementDataBackup;
            return this;
        }

        /**
         * Indicates whether the log backup deletion feature is enabled. If the disk usage exceeds 80% or the remaining disk space is less than 5 GB on the instance, this feature deletes binary log files. Valid values:
         * <p>
         * 
         * *   **Disable**
         * *   **Enable**
         */
        public Builder highSpaceUsageProtection(String highSpaceUsageProtection) {
            this.highSpaceUsageProtection = highSpaceUsageProtection;
            return this;
        }

        /**
         * The number of hours for which log backup files are retained on the instance.
         */
        public Builder localLogRetentionHours(Integer localLogRetentionHours) {
            this.localLogRetentionHours = localLogRetentionHours;
            return this;
        }

        /**
         * The maximum storage usage that is allowed for log files on the instance.
         */
        public Builder localLogRetentionSpace(String localLogRetentionSpace) {
            this.localLogRetentionSpace = localLogRetentionSpace;
            return this;
        }

        /**
         * The backup frequency of logs. Valid values:
         * <p>
         * 
         * *   **LogInterval**: Log backups are performed every 30 minutes.
         * *   Default value: same as the value of the **PreferredBackupPeriod** parameter.
         * 
         * > The **LogBackupFrequency** parameter is supported only when the instance runs **SQL Server**.
         */
        public Builder logBackupFrequency(String logBackupFrequency) {
            this.logBackupFrequency = logBackupFrequency;
            return this;
        }

        /**
         * The number of binary log files that you want to retain on the instance.
         */
        public Builder logBackupLocalRetentionNumber(Integer logBackupLocalRetentionNumber) {
            this.logBackupLocalRetentionNumber = logBackupLocalRetentionNumber;
            return this;
        }

        /**
         * The number of days for which log backup files are retained.
         */
        public Builder logBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
            this.logBackupRetentionPeriod = logBackupRetentionPeriod;
            return this;
        }

        /**
         * The cycle based on which you want to perform a backup. Separate multiple values with commas (,). Valid values:
         * <p>
         * 
         * *   **Monday**
         * *   **Tuesday**
         * *   **Wednesday**
         * *   **Thursday**
         * *   **Friday**
         * *   **Saturday**
         * *   **Sunday**
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * The time when a data backup is performed. The time follows the ISO 8601 standard in the *HH:mm*Z-*HH:mm*Z format. The time is displayed in UTC.
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * The time when the next backup is performed. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC.
         */
        public Builder preferredNextBackupTime(String preferredNextBackupTime) {
            this.preferredNextBackupTime = preferredNextBackupTime;
            return this;
        }

        /**
         * The policy that is used to retain archived backup files if the instance is released. Valid values:
         * <p>
         * 
         * *   **None**: No archived backup files are retained.
         * *   **Lastest**: Only the last archived backup file is retained.
         * *   **All**: All archived backup files are retained.
         */
        public Builder releasedKeepPolicy(String releasedKeepPolicy) {
            this.releasedKeepPolicy = releasedKeepPolicy;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the backup settings of a secondary instance can be modified. Valid values:
         * <p>
         * 
         * *   **True**
         * *   **False**
         */
        public Builder supportModifyBackupPriority(Boolean supportModifyBackupPriority) {
            this.supportModifyBackupPriority = supportModifyBackupPriority;
            return this;
        }

        /**
         * A reserved parameter.
         */
        public Builder supportReleasedKeep(Integer supportReleasedKeep) {
            this.supportReleasedKeep = supportReleasedKeep;
            return this;
        }

        /**
         * Indicates whether the instance supports snapshot backups. Valid values:
         * <p>
         * 
         * *   **1**: The instance supports snapshot backups.
         * *   **0**: The instance does not support snapshot backups.
         * 
         * > This parameter is returned only when the instance runs SQL Server.
         */
        public Builder supportVolumeShadowCopy(Integer supportVolumeShadowCopy) {
            this.supportVolumeShadowCopy = supportVolumeShadowCopy;
            return this;
        }

        public DescribeBackupPolicyResponseBody build() {
            return new DescribeBackupPolicyResponseBody(this);
        } 

    } 

}
