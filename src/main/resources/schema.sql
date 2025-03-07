-- Insert data into ElectroType
INSERT INTO ElectroType (name) VALUES ('Smartphone'), ('Laptop'), ('Tablet');

-- Insert data into ElectroItem
INSERT INTO ElectroItem (name, etypeId, price, count, archive, description) VALUES
                                                                                ('iPhone 13', 1, 70000, 10, FALSE, 'Apple smartphone'),
                                                                                ('MacBook Pro', 2, 150000, 5, FALSE, 'Apple laptop'),
                                                                                ('Samsung Galaxy Tab', 3, 50000, 8, FALSE, 'Samsung tablet');

-- Insert data into Shop
INSERT INTO Shop (name, address) VALUES ('TechStore', '123 Main St'), ('GadgetWorld', '456 High St');

-- Insert data into ElectroShop
INSERT INTO ElectroShop (shopId, electroItemId, count) VALUES (1, 1, 5), (1, 2, 2), (2, 3, 4);

-- Insert data into PositionType
INSERT INTO PositionType (name) VALUES ('Manager'), ('Salesperson');

-- Insert data into Employee
INSERT INTO Employee (lastName, firstName, patronymic, birthDate, positionId, shopId, gender) VALUES
                                                                                                  ('Ivanov', 'Ivan', 'Ivanovich', '1985-05-10', 1, 1, TRUE),
                                                                                                  ('Petrov', 'Petr', 'Petrovich', '1990-07-15', 2, 2, TRUE);

-- Insert data into ElectroEmployee
INSERT INTO ElectroEmployee (employeeId, electroTypeId) VALUES (1, 1), (2, 2);

-- Insert data into PurchaseType
INSERT INTO PurchaseType (name) VALUES ('Online'), ('In-store');

-- Insert data into Purchase
INSERT INTO Purchase (electroId, employeeId, purchaseDate, typeId, shopId) VALUES
                                                                               (1, 1, '2025-03-06 10:00:00', 1, 1),
                                                                               (2, 2, '2025-03-06 12:00:00', 2, 2);