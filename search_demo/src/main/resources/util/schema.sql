
DROP TABLE IF EXISTS supplier;

CREATE TABLE supplier (
    supplier_id INT AUTO_INCREMENT PRIMARY KEY,
    company_name VARCHAR(255) NOT NULL,
    website VARCHAR(255),
    location VARCHAR(100),
    nature_of_business ENUM('small_scale', 'medium_scale', 'large_scale'),
    manufacturing_processes SET('moulding', '3d_printing', 'casting', 'coating')
);
