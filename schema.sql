-- ===================================================================
-- StreamVault Capstone - Database Schema Initialization
-- ===================================================================

CREATE DATABASE IF NOT EXISTS streamvault_db;
USE streamvault_db;

-- 1. Users Table Architecture
CREATE TABLE IF NOT EXISTS users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(20) DEFAULT 'ROLE_ADMIN',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 2. Insert Default Capstone Evaluator Credentials
-- Seed data allows immediate authentication verification during grading
INSERT INTO users (username, password, role) 
VALUES ('noel_admin', 'admin123', 'ROLE_ADMIN')
ON DUPLICATE KEY UPDATE username=username;