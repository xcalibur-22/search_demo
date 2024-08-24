
USE search_demo_db;

CREATE TABLE supplier (
    supplier_id INT AUTO_INCREMENT PRIMARY KEY,
    company_name VARCHAR(255) NOT NULL,
    website VARCHAR(255),
    location VARCHAR(100),
    nature_of_business ENUM('small_scale', 'medium_scale', 'large_scale'),
    manufacturing_processes SET('moulding', '3d_printing', 'casting', 'coating')
);
USE search_demo_db;

INSERT INTO supplier (company_name, website, location, nature_of_business, manufacturing_processes) VALUES
('Alpha Industries', 'http://alphaindustries.com', 'Mumbai', 'small_scale', 'moulding,casting'),
('Beta Manufacturing', 'http://betamanufacturing.com', 'Delhi', 'medium_scale', '3d_printing,coating'),
('Gamma Corp', 'http://gammacorp.com', 'Bangalore', 'large_scale', 'casting,coating'),
('Delta Works', 'http://deltaworks.com', 'Chennai', 'small_scale', 'moulding'),
('Epsilon Products', 'http://epsilonproducts.com', 'Hyderabad', 'medium_scale', '3d_printing,moulding'),
('Zeta Systems', 'http://zetasystems.com', 'Pune', 'large_scale', 'coating'),
('Eta Engineering', 'http://etaengineering.com', 'Kolkata', 'small_scale', 'casting,3d_printing'),
('Theta Solutions', 'http://thetasolutions.com', 'Jaipur', 'medium_scale', 'moulding,coating'),
('Iota Enterprises', 'http://iotaenterprises.com', 'Mumbai', 'large_scale', '3d_printing,casting'),
('Kappa Manufacturing', 'http://kappamanufacturing.com', 'Delhi', 'small_scale', 'moulding,3d_printing'),
('Lambda Works', 'http://lambdaworks.com', 'Bangalore', 'medium_scale', 'coating,casting'),
('Mu Productions', 'http://muproductions.com', 'Chennai', 'large_scale', 'moulding,3d_printing'),
('Nu Technologies', 'http://nutechnologies.com', 'Hyderabad', 'small_scale', 'casting,coating'),
('Xi Systems', 'http://xisystems.com', 'Pune', 'medium_scale', '3d_printing'),
('Omicron Corp', 'http://omicroncorp.com', 'Kolkata', 'large_scale', 'moulding,casting'),
('Pi Engineering', 'http://piengineering.com', 'Jaipur', 'small_scale', '3d_printing,coating'),
('Rho Industries', 'http://rhoindustries.com', 'Mumbai', 'medium_scale', 'casting'),
('Sigma Manufacturing', 'http://sigmamanufacturing.com', 'Delhi', 'large_scale', 'coating,3d_printing'),
('Tau Works', 'http://tauworks.com', 'Bangalore', 'small_scale', 'moulding,casting'),
('Upsilon Enterprises', 'http://upsilonenterprises.com', 'Chennai', 'medium_scale', '3d_printing,coating');
