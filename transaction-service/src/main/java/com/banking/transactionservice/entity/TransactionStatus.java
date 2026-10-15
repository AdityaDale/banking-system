package com.banking.transactionservice.entity;

/**
 * Transaction Lifecycle Flow:
 *
 * PENDING -> PROCESSING -> COMPLETED (clean transaction)
 *                       -> PENDING_VERIFICATION (suspicious activity detected)
 *                              -> COMPLETED (verified)
 *                              -> FLAGGED (SAGA refund & account blocked)
 *                       -> FAILED
 *                       -> FLAGGED
 */

public enum TransactionStatus {
    PENDING,
    PROCESSING,
    PENDING_VERIFICATION,
    COMPLETED,
    FAILED,
    FLAGGED
}
