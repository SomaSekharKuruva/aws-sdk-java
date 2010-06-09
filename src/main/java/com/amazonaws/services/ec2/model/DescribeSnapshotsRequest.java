/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeSnapshots(DescribeSnapshotsRequest) DescribeSnapshots operation}.
 * <p>
 * Describes the indicated snapshots, or in lieu of that, all snapshots
 * owned by the caller.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeSnapshots(DescribeSnapshotsRequest)
 */
public class DescribeSnapshotsRequest extends AmazonWebServiceRequest {

    /**
     * The optional list of EBS snapshot IDs to describe.
     */
    private java.util.List<String> snapshotIds;

    /**
     * The optional list of EBS snapshot owners.
     */
    private java.util.List<String> ownerIds;

    /**
     * The optional list of users who have permission to create volumes from
     * the described EBS snapshots.
     */
    private java.util.List<String> restorableByUserIds;

    /**
     * The optional list of EBS snapshot IDs to describe.
     *
     * @return The optional list of EBS snapshot IDs to describe.
     */
    public java.util.List<String> getSnapshotIds() {
        if (snapshotIds == null) {
            snapshotIds = new java.util.ArrayList<String>();
        }
        return snapshotIds;
    }
    
    /**
     * The optional list of EBS snapshot IDs to describe.
     *
     * @param snapshotIds The optional list of EBS snapshot IDs to describe.
     */
    public void setSnapshotIds(java.util.Collection<String> snapshotIds) {
        java.util.List<String> snapshotIdsCopy = new java.util.ArrayList<String>();
        if (snapshotIds != null) {
            snapshotIdsCopy.addAll(snapshotIds);
        }
        this.snapshotIds = snapshotIdsCopy;
    }
    
    /**
     * The optional list of EBS snapshot IDs to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotIds The optional list of EBS snapshot IDs to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSnapshotsRequest withSnapshotIds(String... snapshotIds) {
        for (String value : snapshotIds) {
            getSnapshotIds().add(value);
        }
        return this;
    }
    
    /**
     * The optional list of EBS snapshot IDs to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotIds The optional list of EBS snapshot IDs to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSnapshotsRequest withSnapshotIds(java.util.Collection<String> snapshotIds) {
        java.util.List<String> snapshotIdsCopy = new java.util.ArrayList<String>();
        if (snapshotIds != null) {
            snapshotIdsCopy.addAll(snapshotIds);
        }
        this.snapshotIds = snapshotIdsCopy;

        return this;
    }
    
    /**
     * The optional list of EBS snapshot owners.
     *
     * @return The optional list of EBS snapshot owners.
     */
    public java.util.List<String> getOwnerIds() {
        if (ownerIds == null) {
            ownerIds = new java.util.ArrayList<String>();
        }
        return ownerIds;
    }
    
    /**
     * The optional list of EBS snapshot owners.
     *
     * @param ownerIds The optional list of EBS snapshot owners.
     */
    public void setOwnerIds(java.util.Collection<String> ownerIds) {
        java.util.List<String> ownerIdsCopy = new java.util.ArrayList<String>();
        if (ownerIds != null) {
            ownerIdsCopy.addAll(ownerIds);
        }
        this.ownerIds = ownerIdsCopy;
    }
    
    /**
     * The optional list of EBS snapshot owners.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerIds The optional list of EBS snapshot owners.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSnapshotsRequest withOwnerIds(String... ownerIds) {
        for (String value : ownerIds) {
            getOwnerIds().add(value);
        }
        return this;
    }
    
    /**
     * The optional list of EBS snapshot owners.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerIds The optional list of EBS snapshot owners.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSnapshotsRequest withOwnerIds(java.util.Collection<String> ownerIds) {
        java.util.List<String> ownerIdsCopy = new java.util.ArrayList<String>();
        if (ownerIds != null) {
            ownerIdsCopy.addAll(ownerIds);
        }
        this.ownerIds = ownerIdsCopy;

        return this;
    }
    
    /**
     * The optional list of users who have permission to create volumes from
     * the described EBS snapshots.
     *
     * @return The optional list of users who have permission to create volumes from
     *         the described EBS snapshots.
     */
    public java.util.List<String> getRestorableByUserIds() {
        if (restorableByUserIds == null) {
            restorableByUserIds = new java.util.ArrayList<String>();
        }
        return restorableByUserIds;
    }
    
    /**
     * The optional list of users who have permission to create volumes from
     * the described EBS snapshots.
     *
     * @param restorableByUserIds The optional list of users who have permission to create volumes from
     *         the described EBS snapshots.
     */
    public void setRestorableByUserIds(java.util.Collection<String> restorableByUserIds) {
        java.util.List<String> restorableByUserIdsCopy = new java.util.ArrayList<String>();
        if (restorableByUserIds != null) {
            restorableByUserIdsCopy.addAll(restorableByUserIds);
        }
        this.restorableByUserIds = restorableByUserIdsCopy;
    }
    
    /**
     * The optional list of users who have permission to create volumes from
     * the described EBS snapshots.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param restorableByUserIds The optional list of users who have permission to create volumes from
     *         the described EBS snapshots.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSnapshotsRequest withRestorableByUserIds(String... restorableByUserIds) {
        for (String value : restorableByUserIds) {
            getRestorableByUserIds().add(value);
        }
        return this;
    }
    
    /**
     * The optional list of users who have permission to create volumes from
     * the described EBS snapshots.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param restorableByUserIds The optional list of users who have permission to create volumes from
     *         the described EBS snapshots.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSnapshotsRequest withRestorableByUserIds(java.util.Collection<String> restorableByUserIds) {
        java.util.List<String> restorableByUserIdsCopy = new java.util.ArrayList<String>();
        if (restorableByUserIds != null) {
            restorableByUserIdsCopy.addAll(restorableByUserIds);
        }
        this.restorableByUserIds = restorableByUserIdsCopy;

        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("SnapshotIds: " + snapshotIds + ", ");
        sb.append("OwnerIds: " + ownerIds + ", ");
        sb.append("RestorableByUserIds: " + restorableByUserIds + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    