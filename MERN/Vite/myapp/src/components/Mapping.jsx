import React, { use } from 'react';

const list = [
    { id: 1, name: "Kaustubh", age: 22 },
    { id: 2, name: "Sean", age: 23 },
    { id: 3, name: "Nin", age: 24 },
];

export default function Maping() {
    return (
        <div>
            {list.map(user =>
                <li key={user.id}>
                    The name is {user.name} and the age is {user.age}
                </li>
            )}
        </div>
    )
}