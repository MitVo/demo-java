module.exports = {
  extends: ['gitmoji'],
  rules: {
    'subject-empty': [2, 'never'],
    'type-empty': [2, 'always'],
    'type-enum': [
      2,
      'always',
      [
        ':sparkles:',  // New feature
        ':bug:',       // Bug fix
        ':memo:',      // Docs update
        ':hammer:',
        ':customemoji:' // Your custom emoji
      ]
    ],
  },
};