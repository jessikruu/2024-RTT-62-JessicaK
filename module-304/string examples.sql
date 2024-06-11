create database book_shop;

SELECT 
    *
FROM
    books;

desc books;

SELECT 
    CONCAT(author_fname, ' ', author_lname) AS full_name
FROM
    books;

SELECT 
    CONCAT_WS('--',
            title,
            author_fname,
            '  ',
            author_lname) AS info
FROM
    books;

SELECT SUBSTRING('hello world', 1, 4);
		-- ^string		^starting	^length, how far to go
        
SELECT SUBSTRING('hello world', 7);
-- 			^string, 	^starting position, goes to the end

SELECT SUBSTRING('hello world', - 3);
-- 					^string		^starts from the end, goes in, then gives everything after that

SELECT title, SUBSTRING(author_lname, 1, 1) AS author_initial;

SELECT 
    SUBSTR(title, 1, 10)
FROM
    books;

SELECT 
    CONCAT(SUBSTRING(title, 1, 10), '...') AS short_title
FROM
    books;
    
SELECT 
    CONCAT(SUBSTRING(author_fname, 1, 1),
            '.',
            SUBSTRING(author_lname, 1, 1),
            '.') AS initials
FROM
    books;
    
SELECT 
    REPLACE('cheese coffee milk baaka',
        ' ',
        ' and ');

SELECT 
    REPLACE(title, ' ', '_')
FROM
    books;

SELECT 
    REVERSE(title)
FROM
    books;

SELECT 
    CONCAT(title, ' | ', REVERSE(title))
FROM
    books;

SELECT 
    CONCAT(title, ' | ', REVERSE(title)) AS reversed_titles,
    CHAR_LENGTH(CONCAT(title, ' | ', REVERSE(title))) AS amt_of_chars
FROM
    books;

SELECT 
    UPPER(CONCAT(title, ' | ', REVERSE(title))) AS upper_reversed_titles,
    CHAR_LENGTH(CONCAT(title, ' | ', REVERSE(title))) AS amt_of_chars
FROM
    books;

SELECT 
    LOWER(CONCAT(title, ' | ', REVERSE(title))) AS upper_reversed_titles,
    CHAR_LENGTH(CONCAT(title, ' | ', REVERSE(title))) AS amt_of_chars
FROM
    books;

SELECT 
    UPPER(CONCAT('I love ', title, ' !!!'))
FROM
    books;

SELECT 
    INSERT(title, 1, 0, 'The title is ')
FROM
    books;
-- 					^pos, 	^chars to replace	^the text to insert

SELECT 
    CONCAT(LEFT(author_fname, 1),
            '. ',
            author_lname) AS first_initial_last_name
FROM
    books;

SELECT UPPER(REVERSE('Why does my cat look at me with such hatred?'));

SELECT 
    REPLACE(CONCAT('I', ' ', 'like', ' ', 'cats'),
        ' ',
        '-');

SELECT 
    REPLACE(title, ' ', '->') AS title
FROM
    books;

SELECT 
    author_lname AS forwards, REVERSE(author_lname) AS backwards
FROM
    books;

SELECT 
    UPPER(CONCAT(author_fname, ' ', author_lname)) AS 'full name in caps'
FROM
    books;
SELECT 
    CONCAT(title,
            ' was released in ',
            released_year) AS blurb
FROM
    books;

SELECT 
    title, CHAR_LENGTH(title) AS character_count
FROM
    books;

SELECT 
    CONCAT(SUBSTRING(title, 1, 10), '...') AS short_title,
    CONCAT(author_lname, ',', author_fname) AS author,
    CONCAT(stock_quantity, ' in stock') AS quantity
FROM
    books
ORDER BY short_title;